package org.simpleframework.mvc.annotation;

import org.simpleframework.mvc.type.RequestMethod;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @description:
 * @author: ZKP
 * @time: 2022/10/25
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface RequestMapping {
    //请求路径
    String value() default  "";
    RequestMethod method() default RequestMethod.GET;
}
