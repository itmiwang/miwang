package com.miwang.repository.core.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.miwang.repository.core.domain.CoreOrder;
import com.miwang.repository.core.dto.CoreOrderDTO;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 订单表 Mapper 接口
 * </p>
 *
 * @author guozq
 * @since 2022-06-04
 */
public interface CoreOrderMapper extends BaseMapper<CoreOrder> {

	IPage<CoreOrderDTO> listByQuery(IPage<CoreOrderDTO> page, @Param(Constants.WRAPPER) Wrapper<CoreOrderDTO> wrapper);

}
