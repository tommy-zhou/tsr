package com.tsr.comm.util;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.Token;
import org.apache.lucene.analysis.TokenStream;

import com.tsr.comm.analyzer.CustomAnalyzer;

public class TermFrequencyUtil {
	
	public static double compareText(String textA, String textB){
		double score = 0d;
		if(textA == null || textB == null ){
			return score;
		}
		Map<String, Integer> termFrequencyMapA = TermFrequencyUtil
				.buildTermFrequencyMap(textA);
		Map<String, Integer> termFrequencyMapB = TermFrequencyUtil
				.buildTermFrequencyMap(textB);
		Set<String> termsA = termFrequencyMapA.keySet();
		Set<String> termsB = termFrequencyMapB.keySet();
		int termCount = termsA.size();
		Set<String> allTerms = new java.util.HashSet<String>();
		allTerms.addAll(termsA);
		for(String key : termsB){
			if(!termsA.contains(key)){
				termCount++ ;
				allTerms.add(key);
			}
		}
		if(termCount != 0d){
			for(String key : allTerms){
				Integer termAFrequency = termFrequencyMapA.get(key);
				Integer termBFrequency = termFrequencyMapB.get(key);
				if(termAFrequency != null && termBFrequency != null){
					if(termAFrequency.intValue() > termBFrequency.intValue()){
						score += termBFrequency.doubleValue()/termAFrequency.doubleValue()/(double)termCount;
					}else{
						score += termAFrequency.doubleValue()/termBFrequency.doubleValue()/(double)termCount;
					}					
				}
			}
		}
		return score;
	}

    public static Map<String, Integer> buildTermFrequencyMap(String text) {

        Analyzer analyzer = new CustomAnalyzer();
        TokenStream tokenStream = analyzer.tokenStream("content", new StringReader(text));

        Map<String, Integer> termFrequencyMap = new HashMap<String, Integer>();        

        boolean hasTokens = true;
        try {
            while (hasTokens) {
                Token t = tokenStream.next();
                if (t == null) {
                    hasTokens = false;
                } else {
                    String term = new String(t.termBuffer(), 0, t.termLength());
                    Integer frequency = termFrequencyMap.get(term);
                    if( frequency == null ) {
                        termFrequencyMap.put(term, 1);
                    }
                    else {
                        termFrequencyMap.put(term, frequency + 1);
                    }
                }
            }
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }
        
       return termFrequencyMap;
    }
    
    public static Map<String, Integer> getTopNTermFrequencies(
            Map<String, Integer> termFrequencyMap, int topN) {

        List<Map.Entry<String, Integer>> terms = 
            new ArrayList<Map.Entry<String, Integer>>(termFrequencyMap.entrySet());

        // Different terms can have the same frequency.
        Collections.sort(terms, 
                new Comparator<Map.Entry<String, Integer>>() {
                    public int compare(Map.Entry<String, Integer> e1, 
                            Map.Entry<String, Integer> e2) { 
                        int result = 0;
                        if( e1.getValue() < e2.getValue() ) {
                            result = 1; // reverse order
                        }
                        else if( e1.getValue() > e2.getValue() ) {
                            result = -1;
                        }
                        else {
                            result = 0;
                        }
                        return result;
                    }
                }
       );
        
       Map<String, Integer> topNTermsFrequencyMap = new HashMap<String, Integer>();
       for(Map.Entry<String, Integer> term : terms) {
           topNTermsFrequencyMap.put(term.getKey(), term.getValue());
           if( topNTermsFrequencyMap.size() >= topN ) {
               break;
           }
       }
      
       return topNTermsFrequencyMap;
    }
	
}
