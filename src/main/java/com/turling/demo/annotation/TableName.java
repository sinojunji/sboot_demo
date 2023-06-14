package com.turling.demo.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target(value={java.lang.annotation.ElementType.TYPE})
@Retention(value=java.lang.annotation.RetentionPolicy.RUNTIME)
@Documented
public @interface TableName {
    String value() default "";
}

