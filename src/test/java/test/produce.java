package test;


import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * 
 * @author lirui
 * @date  2018年12月5日
 *
 */
public class produce {


	@Test
	public void testGenerator() {
		GlobalConfig config = new GlobalConfig();
		config.setActiveRecord(false) 
				.setAuthor("LiRui")
				.setOutputDir("E:\\workspace02\\BigShopping\\src\\main\\java")
				.setFileOverride(true) 
				.setIdType(IdType.AUTO) 
				.setServiceName("%sService")
				.setBaseResultMap(true)
				.setBaseColumnList(true);

	    DataSourceConfig  dsConfig  = new DataSourceConfig();
		dsConfig.setDbType(DbType.MYSQL)  
						.setDriverName("com.mysql.cj.jdbc.Driver")
						.setUrl("jdbc:mysql://127.0.0.1:3306/big_shopping?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=utf8")
						.setUsername("root")
						.setPassword("110120");

		StrategyConfig stConfig = new StrategyConfig();
				stConfig.setCapitalMode(true) 
								.setDbColumnUnderline(true)
								.setNaming(NamingStrategy.nochange)
								.setTablePrefix("shop_")
								.setInclude("shop_cateloge");

				PackageConfig pkConfig = new PackageConfig();
				pkConfig.setParent("com.bigshopping")
								.setMapper("mapper")
								.setService("service")
								.setController("web")
								.setEntity("bean");

				AutoGenerator  ag = new AutoGenerator();
				ag.setGlobalConfig(config)
						  .setDataSource(dsConfig)
						  .setStrategy(stConfig)
						  .setPackageInfo(pkConfig);
				ag.execute();

	}

}