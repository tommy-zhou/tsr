package generatecode;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MyBatisCodeGenerator {
	public static void main(String[] args) throws Exception{
		System.out.println("+++++++++generate begin++++++++++");
		  List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		  // String url = MyBatisCodeGenerator.class.getResource("").getPath()+"../MBG_configuration.xml";
		   String url = "E:\\项目文档\\tsr\\source_code\\tsr\\tsr-core\\src\\test\\resources\\MBG_configuration.xml";
		   File configFile = new File(url);
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
			System.out.println("+++++++++generate end+++++++++++");
	}
}
