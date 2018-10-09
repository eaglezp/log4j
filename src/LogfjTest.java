import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogfjTest {

    static Logger logger = Logger.getLogger(LogfjTest.class);
    public static void main(String[] args){
        PropertyConfigurator.configure("D:\\Java\\workspace\\logfj\\src\\log4j.properties");
        //PropertyConfigurator.configure("D:\\Java\\workspace\\logfj\\src\\logfj.xml");
        for (int i = 0; i < 10; i++) {
            logger.trace("跟踪信息");
            logger.debug("调试信息");
            logger.info("输出信息");
            logger.warn("警告信息");
            logger.error("错误信息");
            logger.fatal("致命信息");
        }
    }
}