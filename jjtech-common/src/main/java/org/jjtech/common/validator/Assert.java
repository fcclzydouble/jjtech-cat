package org.jjtech.common.validator;

import org.apache.commons.lang.StringUtils;
import org.jjtech.common.exception.RRException;

/**
 * 数据校验
 * Created by fcclzydouble on 2018/3/22.
 */
public abstract class Assert {

    public static void isBlank(String str, String message) {
        if (StringUtils.isBlank(str)) {
            throw new RRException(message);
        }
    }

    public static void isNull(Object object, String message) {
        if (object == null) {
            throw new RRException(message);
        }
    }
}
