/**
 * 
 */
package com.hiresmart.init;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;


@Configuration
@ComponentScan(basePackages = {"com.hiresmart"})
@ContextConfiguration(locations = {
"classpath:/WEB-INF/config/sdnext-servlet.xml"})
public class AppConfig {
	
}
