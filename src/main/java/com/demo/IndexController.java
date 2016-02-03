/**
 * @(#)IndexController.java V1.2.0 16-2-2 
 * Copyright (c) 2014-2016 The inspur Software Foundation.All rights reserved 
 */
package com.demo;

import com.jfinal.core.Controller;

/**
 * @author Chen Hao
 * @version V1.2.0 16-2-2
 */
public class IndexController extends Controller{
    public void index(){
        renderText("tomcat index");
    }
}
