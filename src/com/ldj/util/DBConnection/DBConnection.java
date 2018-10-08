package ldj.util.DBConnection;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.commons.dbcp.BasicDataSource;

public class DBConnection {
    public static DataSource getDataSource(){
        //创建mysql的datasource接口的实现类BasicDataSourece
        BasicDataSource bs=new BasicDataSource();
        //静态代码块,实现必要参数设置
        InputStream ins = DBConnection.class.getResourceAsStream("db.properties");//
        Properties ps = new Properties();
        try {
            ps.load(ins);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
				/*String driver=ps.getProperty("driver");
				String url=ps.getProperty("url");
				String username=ps.getProperty("username");
				String password=ps.getProperty("password");
				System.out.println(driver+" "+url+" "+username+" "+password);*/
        bs.setDriverClassName(ps.getProperty("driver"));
        bs.setUrl(ps.getProperty("url"));
        bs.setUsername(ps.getProperty("username"));
        bs.setPassword(ps.getProperty("password"));
        bs.setMaxActive(Integer.parseInt(ps.getProperty("MaxActive")));//得到String转化为Int
        bs.setMaxIdle(Integer.parseInt(ps.getProperty("MaxIdle")));
        bs.setMinIdle(Integer.parseInt(ps.getProperty("MinIdle")));
        bs.setInitialSize(Integer.parseInt(ps.getProperty("InitialSize")));
        //System.out.println(Integer.parseInt(ps.getProperty("InitialSize")));
        return bs;
    }
}
