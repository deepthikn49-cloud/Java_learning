import java.sql.Connection;
import java.sql.DriverManager;
import java.net.URL;
import java.io.File;
import java.net.URLClassLoader;
import java.sql.Driver;
import java.util.Properties;

public class DatabaseConnection {
    public static Connection getConnection() {
        try {
            // Load MySQL JDBC driver dynamically
            File jarFile = new File("../lib/mysql-connector-j-9.6.0.jar");
            if (jarFile.exists()) {
                URL[] urls = {jarFile.toURI().toURL()};
                URLClassLoader loader = new URLClassLoader(urls, ClassLoader.getSystemClassLoader());
                Thread.currentThread().setContextClassLoader(loader);
                Class<?> driverClass = loader.loadClass("com.mysql.cj.jdbc.Driver");
                Driver driver = (Driver) driverClass.getDeclaredConstructor().newInstance();
                
                Properties props = new Properties();
                props.setProperty("user", "root");
                props.setProperty("password", "Deepthikn2806");
                Connection con = driver.connect("jdbc:mysql://localhost:3306/school1", props);
                
                return con;
            } else {
                System.out.println("JAR not found");
                return null;
            }
        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
            return null;
        }
    }
}