package org.jjtech.common.annotation;

import java.lang.annotation.*;

/**
 * 系统日志注解
 * Created by fcclzydouble on 2018/3/22.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SysLog {

    String value() default "";
}
