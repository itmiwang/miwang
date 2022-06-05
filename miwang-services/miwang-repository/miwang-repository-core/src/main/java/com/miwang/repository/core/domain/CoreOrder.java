package com.miwang.repository.core.domain;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.miwang.commons.base.BaseDomain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author guozq
 * @since 2022-06-04
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class CoreOrder extends BaseDomain {

	private static final long serialVersionUID = -6898286605275085554L;

	/**
	 * 订单名称
	 */
	@NotBlank(message = "订单名称为必填项")
	private String name;

	/**
	 * 管理员ID
	 */
	@NotBlank(message = "管理员ID为必填项")
	private String adminId;

	/**
	 * 订单状态：0（待审核） 1（审核成功）
	 */
	private String status;

}