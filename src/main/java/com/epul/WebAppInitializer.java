package com.epul;

import com.thetransactioncompany.cors.CORSFilter;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Dimitri on 13/10/2015.
 *
 * @version 1.0
 */
public class WebAppInitializer implements WebApplicationInitializer {

        @Override
        public void onStartup(ServletContext servletContext) throws ServletException {
            XmlWebApplicationContext appContext = new XmlWebApplicationContext();
            appContext.setConfigLocations("classpath*:applicationContext.xml");

            ServletRegistration.Dynamic dispatcher = servletContext.addServlet("dispatcher", new DispatcherServlet(appContext));
            dispatcher.setLoadOnStartup(1);
            dispatcher.addMapping("/*");


            FilterRegistration corsFilter = servletContext.addFilter("cors", CORSFilter.class);
            corsFilter.addMappingForUrlPatterns(null, false, "/*");
        /*corsFilter.setInitParameter("cors.allowOrigin", "http://localhost:4991");*/
            corsFilter.setInitParameter("cors.allowOrigin", "*");
            corsFilter.setInitParameter("cors.supportedMethods", "OPTIONS, GET, POST, PUT, DELETE, HEAD");
            corsFilter.setInitParameter("cors.supportedHeaders", "Accept, Content-Type");

            servletContext.addListener(new ContextLoaderListener(appContext));
        }
}
