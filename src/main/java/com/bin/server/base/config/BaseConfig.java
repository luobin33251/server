package com.bin.server.base.config;

import com.bin.server.base.controller.IndexController;
import com.jfinal.config.*;
import com.jfinal.template.Engine;

public class BaseConfig extends JFinalConfig{
    public void configConstant(Constants constants) {

    }

    public void configRoute(Routes routes) {
        routes.add("/", IndexController.class);
    }

    public void configEngine(Engine engine) {

    }

    public void configPlugin(Plugins plugins) {
    }

    public void configInterceptor(Interceptors interceptors) {

    }

    public void configHandler(Handlers handlers) {

    }
}
