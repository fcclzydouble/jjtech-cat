package org.jjtech.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.jjtech.modules.sys.entity.SysUserRoleEntity;

import java.util.List;

/**
 * 用户与角色对应关系
 * Created by fcclzydouble on 2018/3/22.
 */
public interface SysUserRoleDao extends BaseMapper<SysUserRoleEntity> {

    /**
     * 根据用户ID，获取角色ID列表
     */
    List<Long> queryRoleIdList(Long userId);

    /**
     * 根据角色ID数组，批量删除
     */
    int deleteBatch(Long[] roleIds);
}

