/*
 * Copyright 2019-2029 geekidea(https://github.com/geekidea)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.geekidea.springbootplus.system.service;

import io.geekidea.springbootplus.system.entity.SysPermission;
import io.geekidea.springbootplus.common.service.BaseService;
import io.geekidea.springbootplus.system.param.SysPermissionQueryParam;
import io.geekidea.springbootplus.system.vo.SysPermissionQueryVo;
import io.geekidea.springbootplus.common.vo.Paging;

import java.io.Serializable;
import java.util.List;

/**
 * <pre>
 * 系统权限 服务类
 * </pre>
 *
 * @author geekidea
 * @since 2019-10-24
 */
public interface SysPermissionService extends BaseService<SysPermission> {

    /**
     * 保存
     *
     * @param sysPermission
     * @return
     * @throws Exception
     */
    boolean saveSysPermission(SysPermission sysPermission) throws Exception;

    /**
     * 修改
     *
     * @param sysPermission
     * @return
     * @throws Exception
     */
    boolean updateSysPermission(SysPermission sysPermission) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteSysPermission(Long id) throws Exception;

    /**
     * 根据ID获取查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    SysPermissionQueryVo getSysPermissionById(Serializable id) throws Exception;

    /**
     * 获取分页对象
     *
     * @param sysPermissionQueryParam
     * @return
     * @throws Exception
     */
    Paging<SysPermissionQueryVo> getSysPermissionPageList(SysPermissionQueryParam sysPermissionQueryParam) throws Exception;

    /**
     * 判断权限id是否存在
     *
     * @param permissionIds
     * @return
     */
    boolean isExistsByPermissionIds(List<Long> permissionIds);
}
