package com.miwang.controller.dashboard.core;

import com.miwang.business.core.service.ICoreAdminService;
import com.miwang.commons.base.BaseController;
import com.miwang.repository.core.domain.CoreAdmin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 管理员
 *
 * @author guozq
 * @date 2020-05-31-8:02 下午
 */
@RestController
@RequestMapping("core/admin")
public class CoreAdminController extends BaseController<CoreAdmin, ICoreAdminService> {

}
