package com.miwang.repository.core.dto;

import com.miwang.repository.core.domain.CoreOrder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author guozq
 * @date 2022-06-04-1:09 下午
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CoreOrderDTO extends CoreOrder {

	private static final long serialVersionUID = -3911690979955583505L;

	/**
	 * 生成订单管理员账号
	 */
	private String username;

}
