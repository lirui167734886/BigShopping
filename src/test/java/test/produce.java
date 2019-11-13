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
 * @author lirui
 * @date 2018年12月5日
 */
public class produce {


    @Test
    public void testGenerator() {
        // 1.全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(false) // 是否开启AR模式
                .setAuthor("LiRui")
                .setOutputDir("E:\\workspace02\\BigShopping\\src\\main\\java")
                .setFileOverride(true) // 指定文件覆盖
                .setIdType(IdType.AUTO) // 设置主键自增策略
                .setServiceName("%sService")// 设置生成的services接口的名字的首字母是否为I
                .setBaseResultMap(true) // 基本的字段映射
                .setBaseColumnList(true);// 基本的sql片段

        // 2.配置数据源
        DataSourceConfig dsConfig = new DataSourceConfig();
        dsConfig.setDbType(DbType.MYSQL)// 设置数据库类型
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://192.168.0.31:3306/big_shopping?serverTimezone=UTC&useSSL=false&useUnicode=true&characterEncoding=utf8")
                .setUsername("root")
                .setPassword("110120");

        // 3.策略配置
        StrategyConfig stConfig = new StrategyConfig();
        stConfig.setCapitalMode(true)//全局大写命名
                .setDbColumnUnderline(true)// 指定表名和字段名是否使用了下划线
                .setNaming(NamingStrategy.underline_to_camel)// 数据库字段下划线转驼峰命令策略
                .setTablePrefix("")// 设置表前缀
                .setInclude("shop_cateloge");// 设置需要生成的表

        // 4.包名策略配置
        PackageConfig pkConfig = new PackageConfig();
        pkConfig.setParent("com.bigshopping") // 设置父包
                .setMapper("mapper")
                .setService("service")
                .setController("web")
                .setEntity("bean");

        // 5. 开始生成代码
        AutoGenerator ag = new AutoGenerator();
        ag.setGlobalConfig(config)
                .setDataSource(dsConfig)
                .setStrategy(stConfig)
                .setPackageInfo(pkConfig);
        ag.execute();

    }

}