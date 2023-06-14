package com.turling.demo.utils;


import com.turling.demo.annotation.TableName;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class EntityUtils {

    /**
     * 获取Table名称
     * @param entityClass
     * @return
     */
    public static String getTableName(Class<?> entityClass){
//        ParameterizedType parametrizedType = null;
//        while (parametrizedType == null) {
//            if ((genericSuperClass instanceof ParameterizedType)) {
//                parametrizedType = (ParameterizedType) genericSuperClass;
//            } else {
//                genericSuperClass = ((Class<?>) genericSuperClass).getGenericSuperclass();
//            }
//        }
//
//        Class<?> entityClass = (Class<?>)parametrizedType.getActualTypeArguments()[0];

        for(Annotation annotation : entityClass.getAnnotations()){
            if(annotation.annotationType().getName().equals("com.turling.demo.annotation.TableName")){
                return ((TableName)annotation).value();
            }
        }
        return null;
    }
}
