/**
 * @(#)DemoConfig.java V1.2.0 16-2-2 
 * Copyright (c) 2014-2016 The inspur Software Foundation.All rights reserved 
 */
package com.demo;
import com.jfinal.config.*;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.render.ViewType;

/**
 * @author Chen Hao
 * @version V1.2.0 16-2-2
 */
public class DemoConfig extends JFinalConfig{
    @Override
    public void configConstant(Constants me) {

    }

    @Override
    public void configRoute(Routes me) {
        me.add("/hello", HelloController.class);
        me.add("/", IndexController.class);

    }

    @Override
    public void configPlugin(Plugins me) {

    }

    @Override
    public void configInterceptor(Interceptors me) {

    }

    @Override
    public void configHandler(Handlers me) {

    }
}
