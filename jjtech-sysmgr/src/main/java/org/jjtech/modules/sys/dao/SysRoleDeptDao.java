package org.jjtech.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.jjtech.modules.sys.entity.SysRoleDeptEntity;

import java.util.List;

/**
 * 角色与部门对应关系
 * Created by fcclzydouble on 2018/3/22.
 */
public interface SysRoleDeptDao extends BaseMapper<SysRoleDeptEntity> {

    /**
     * 根据角色ID，获取部门ID列表
     */
    List<Long> queryDeptIdList(Long[] roleIds);

    /**
     * 根据角色ID数组，批量删除
     */
    int deleteBatch(Long[] roleIds);
}
