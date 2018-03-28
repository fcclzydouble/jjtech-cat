package org.jjtech.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.jjtech.modules.sys.entity.SysConfigEntity;

/**
 * 系统配置信息
 * Created by fcclzydouble on 2018/3/22.
 */
public interface SysConfigDao extends BaseMapper<SysConfigEntity> {

    /**
     * 根据key，查询value
     */
    SysConfigEntity queryByKey(String paramKey);

    /**
     * 根据key，更新value
     */
    int updateValueByKey(@Param("key") String key, @Param("value") String value);

}