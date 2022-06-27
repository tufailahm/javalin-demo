package com.training;
import io.javalin.Javalin;

import io.javalin.Javalin;

public class Demo1 {

    public static void main(String[] args) {

                Javalin app = Javalin.create().start(7070);
                app.get("/", ctx -> ctx.result("Hello Revature"));
             app.get("/sayhello", ctx -> ctx.result("Hello Say Hello"));


    }
}
