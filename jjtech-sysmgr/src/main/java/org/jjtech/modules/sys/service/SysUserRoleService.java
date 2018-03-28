package org.jjtech.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import org.jjtech.modules.sys.entity.SysUserRoleEntity;

import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
public interface SysUserRoleService extends IService<SysUserRoleEntity> {

    void saveOrUpdate(Long userId, List<Long> roleIdList);

    /**
     * 根据用户ID，获取角色ID列表
     */
    List<Long> queryRoleIdList(Long userId);

    /**
     * 根据角色ID数组，批量删除
     */
    int deleteBatch(Long[] roleIds);
}
