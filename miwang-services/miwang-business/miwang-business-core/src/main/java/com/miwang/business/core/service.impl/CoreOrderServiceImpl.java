package com.miwang.business.core.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.miwang.repository.core.domain.CoreOrder;
import com.miwang.repository.core.dto.CoreOrderDTO;
import com.miwang.repository.core.mapper.CoreOrderMapper;
import com.miwang.business.core.service.ICoreOrderService;
import com.miwang.commons.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author guozq
 * @since 2022-06-04
 */
@Service
public class CoreOrderServiceImpl extends BaseServiceImpl<CoreOrderMapper, CoreOrder> implements ICoreOrderService {

	@Override
	public IPage<CoreOrderDTO> page(int current, int size, CoreOrder coreOrder) {
		Page<CoreOrderDTO> page = new Page<>(current, size);

		LambdaQueryWrapper<CoreOrderDTO> wrapper = new LambdaQueryWrapper<>();
		wrapper.like(StringUtils.isNotBlank(coreOrder.getName()), CoreOrderDTO::getName, coreOrder.getName());
		// .and(StringUtils.isNotBlank(String.valueOf(coreOrder.getStatus())),
		// i->i.eq(CoreOrderDTO::getStatus, coreOrder.getStatus()));
		wrapper.orderByDesc(CoreOrder::getCreateTime);

		return super.baseMapper.listByQuery(page, wrapper);
	}

}
