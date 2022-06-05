package com.miwang.commons.base;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 通用领域模型
 *
 * @author guozq
 * @date 2022-06-04-11:05 上午
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public abstract class BaseDomain implements Serializable {

	private static final long serialVersionUID = -3385108361394535434L;

	/**
	 * 主键 <br>
	 * 生成策略：ASSIGN_ID
	 */
	@TableId(value = "id", type = IdType.ASSIGN_ID)
	private Long id;

	/**
	 * 逻辑删除：1(已删除) 0(未删除)
	 */
	@TableField(value = "is_deleted", fill = FieldFill.INSERT)
	private Boolean deleted;

	/**
	 * 创建时间
	 */
	@TableField(value = "create_time", fill = FieldFill.INSERT)
	private LocalDateTime createTime;

	/**
	 * 修改时间
	 */
	@TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
	private LocalDateTime updateTime;

}
