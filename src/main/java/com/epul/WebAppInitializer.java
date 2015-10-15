package com.epul;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

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

            servletContext.addListener(new ContextLoaderListener(appContext));
        }
}
