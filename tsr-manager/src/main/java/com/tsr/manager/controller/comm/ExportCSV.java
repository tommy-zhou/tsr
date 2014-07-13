//package com.tsr.manager.controller.comm;
//
//
//import java.io.FileNotFoundException;
//
//import java.io.PrintWriter;
//import java.util.Date;
//
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import com.rsos.comm.util.DateTimeUtils;
//import com.rsos.web.controller.BaseController;
//
//
//
//
//
//
//@Controller
//@RequestMapping("csv")
//public class ExportCSV  extends BaseController{
//	
//	
//	 /** 
//     * 导出为CSV文件 
//     *  
//     */
//	public void csv(HttpServletRequest request,HttpServletResponse response, StringBuffer sb) throws Exception{
//		
//		String fileName = "";
//		String dateStr = DateTimeUtils.format(new Date(),DateTimeUtils.dateTimeString4FileName);
//		fileName = "items"+dateStr+".csv";
//		PrintWriter printer = initPrintWriter(fileName, response);
//		
//		writeData(printer, sb.toString(), true);
//		
//	}
//
//	 /** 
//     * 导出为CSV文件 
//     *  
//     * @param response 
//     * @param exportData 
//     * @param propertyNames 
//     * @param fileName 
//     * @param outputPath 
//     * @throws FileNotFoundException 
//     * @return File
//     */  
//	
//	public void exportItems (HttpServletRequest request,HttpServletResponse response){
//		String fileName = "";
//		try{
//			String dateStr = DateTimeUtils.format(new Date(),DateTimeUtils.dateTimeString4FileName);
//			fileName = "items"+dateStr+".csv";
//			PrintWriter printer = initPrintWriter(fileName, response);
//			StringBuilder sb = new StringBuilder();
//			sb.append("a").append(",").append("b").append(",").append("c").append("\n")
//			  .append("a1").append(",").append("b1").append(",").append("c1").append("\n")
//			  .append("a2").append(",").append("b2").append(",").append("c2").append("\n")
//			  .append("a3涓枃").append(",").append("b3").append(",").append("c3").append("\n");
//			//鍙互500琛屽乏鍙宠皟涓 杩欎釜鏂规硶锛屾渶鍚庝竴娆″氨isend true
//			writeData(printer, sb.toString(), true);
//		}catch(Exception e){
//			
//		}
//	}
//
//  
//        
////	  /** 
////	     * 导出为CVS文件 
////	     *  
////	     * @param exportData 
////	     */  
////		@RequestMapping("list.htm")
////	    public static void main(String[] args) {
////	      
////			List<Map<String,String>> exportData = new ArrayList<Map<String,String>>();
////	        Map<String, String> row1 = new LinkedHashMap<String, String>();
////	        row1.put("1", "11");
////	        row1.put("2", "12");
////	        row1.put("3", "13");
////	        row1.put("4", "14");
////	        exportData.add(row1);
////	        row1 = new LinkedHashMap<String, String>();
////	        row1.put("1", "21");
////	        row1.put("2", "22");
////	        row1.put("3", "23");
////	        row1.put("4", "24");
////	        exportData.add(row1);
////	    //    List propertyNames = new ArrayList();
////	        LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
////	        map.put("1", "第一列");
////	        map.put("2", "第二列");
////	        map.put("3", "第三列");
////	        map.put("4", "第四列");
////	        createCSVFile(exportData, map, "d:/cash/","尼玛");
////	    }
//}  
//
//
