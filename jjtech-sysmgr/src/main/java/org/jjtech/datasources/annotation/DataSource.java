package org.jjtech.datasources.annotation;

import java.lang.annotation.*;

/**
 * 多数据据源
 * Created by fcclzydouble on 2018/3/22.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
    String name() default "";
}

