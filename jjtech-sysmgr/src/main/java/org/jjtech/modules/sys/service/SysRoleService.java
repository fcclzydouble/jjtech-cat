package org.jjtech.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import org.jjtech.common.utils.PageUtils;
import org.jjtech.modules.sys.entity.SysRoleEntity;

import java.util.Map;

/**
 * Created by Administrator on 2018/3/22.
 */
public interface SysRoleService extends IService<SysRoleEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void save(SysRoleEntity role);

    void update(SysRoleEntity role);

    void deleteBatch(Long[] roleIds);

}
