package com.miwang.controller.dashboard.core;

import com.miwang.business.core.service.ICoreOrderService;
import com.miwang.repository.core.domain.CoreOrder;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.miwang.commons.base.BaseController;

/**
 * <p>
 * 订单表 前端控制器
 * </p>
 *
 * @author guozq
 * @since 2022-06-04
 */
@RestController
@RequestMapping("/core/order")
public class CoreOrderController extends BaseController<CoreOrder, ICoreOrderService> {

}
