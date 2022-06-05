package com.miwang.commons.exceptions;

import com.miwang.commons.response.ResponseCode;

/**
 * 全局业务异常
 *
 * @author guozq
 * @date 2020-06-22-5:06 上午
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = -367238456027893635L;

	private Integer code;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public BusinessException() {
	}

	public BusinessException(String message) {
		super(message);
		this.code = -1;
	}

	public BusinessException(ResponseCode status) {
		super(status.message());
		this.code = status.code();
	}

}
