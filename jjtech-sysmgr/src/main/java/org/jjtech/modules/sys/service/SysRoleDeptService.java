package org.jjtech.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import org.jjtech.modules.sys.entity.SysRoleDeptEntity;

import java.util.List;

/**
 * Created by Administrator on 2018/3/22.
 */
public interface SysRoleDeptService extends IService<SysRoleDeptEntity> {

    void saveOrUpdate(Long roleId, List<Long> deptIdList);

    /**
     * 根据角色ID，获取部门ID列表
     */
    List<Long> queryDeptIdList(Long[] roleIds) ;

    /**
     * 根据角色ID数组，批量删除
     */
    int deleteBatch(Long[] roleIds);
}
