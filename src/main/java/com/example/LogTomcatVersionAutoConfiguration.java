package com.example;

import org.apache.catalina.startup.Tomcat;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

/**
 * Created by nikhilagrawal on 11/09/16.
 */
@Configuration
@ConditionalOnClass(Tomcat.class)
@ConditionalOnProperty(name = "log-tomcat-version",matchIfMissing = true)
public class LogTomcatVersionAutoConfiguration {

    private static Log logger= LogFactory.getLog(LogTomcatVersionAutoConfiguration.class);

    @PostConstruct
    public void logTomcatVersion(){
        logger.info("\n\n\n Tomcat v "+Tomcat.class.getPackage().getImplementationVersion()+"\n\n");
    }
}
