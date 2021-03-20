package edu.pucmm.eict;

import io.javalin.Javalin;
import io.javalin.plugin.rendering.JavalinRenderer;
import io.javalin.plugin.rendering.template.JavalinThymeleaf;

public class main {

    public static void main(String[] args){


        Javalin app = Javalin.create(config -> {
            //set configs
            config.addStaticFiles("/");

        }).start(7000);

        JavalinRenderer.register(JavalinThymeleaf.INSTANCE, ".html");
        ///Primera vista de la página

    }

}