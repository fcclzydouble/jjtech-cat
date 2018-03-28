package org.jjtech.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import org.jjtech.common.utils.PageUtils;
import org.jjtech.modules.sys.entity.SysLogEntity;

import java.util.Map;

/**
 * Created by Administrator on 2018/3/22.
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
