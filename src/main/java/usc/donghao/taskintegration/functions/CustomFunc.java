package usc.donghao.taskintegration.functions;

import org.quartz.JobDataMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class CustomFunc {
    private static final Logger appLogger = LoggerFactory.getLogger(CustomFunc.class);
    public void helloWorld(JobDataMap paramMap){
        System.out.println("Hello World");
    }

    public void add(JobDataMap paramMap){
        Map<String,String> funcParamMap = (Map<String, String>) paramMap.get("funcParamMap");
        Integer a = Integer.parseInt(funcParamMap.get("a"));
        Integer b = Integer.parseInt(funcParamMap.get("b"));
        //paramMap.put("sum", a + b);
        System.out.println(a + "+" + b + "=" + (a + b));
    }

//    public void calculateAve(JobDataMap paramMap){
//        Map<String, Object> dataSources = (Map<String, Object>)paramMap.get("dataSources");
//        JdbcTemplate jdbcTemPlate = (JdbcTemplate) dataSources.get("mysql");
//        jdbcTemPlate.execute();
//    }
}
