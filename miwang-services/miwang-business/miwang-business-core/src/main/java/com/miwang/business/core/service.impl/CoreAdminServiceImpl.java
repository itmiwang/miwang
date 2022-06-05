package com.miwang.business.core.service.impl;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.miwang.business.core.service.ICoreAdminService;
import com.miwang.commons.base.BaseServiceImpl;
import com.miwang.commons.exceptions.BusinessException;
import com.miwang.commons.response.ResponseCode;
import com.miwang.repository.core.constant.UserStatus;
import com.miwang.repository.core.domain.CoreAdmin;
import com.miwang.repository.core.mapper.CoreAdminMapper;
import org.springframework.stereotype.Service;

/**
 * 管理员表服务实现类
 *
 * @author guozq
 * @date 2020-05-31-4:52 下午
 */
@Service
public class CoreAdminServiceImpl extends BaseServiceImpl<CoreAdminMapper, CoreAdmin> implements ICoreAdminService {

	/**
	 * 检查字段：账号
	 */
	private static final String USERNAME = "username";

	/**
	 * 检查字段：昵称
	 */
	private static final String NICKNAME = "nickname";

	/**
	 * 检查字段：邮箱
	 */
	private static final String EMAIL = "email";

	@Override
	public boolean create(CoreAdmin coreAdmin) {
		if (!checkUsername(coreAdmin.getUsername()) && !checkNickname(coreAdmin.getNickname())
				&& !checkEmail(coreAdmin.getEmail())) {
			coreAdmin.setStatus(UserStatus.CLOSED);
			coreAdmin.setDeleted(false);
			return super.save(coreAdmin);
		}
		return false;
	}

	@Override
	public IPage<CoreAdmin> page(int current, int size, CoreAdmin coreAdmin) {
		Page<CoreAdmin> page = new Page<>(current, size);

		// 查询条件
		LambdaQueryWrapper<CoreAdmin> wrapper = new LambdaQueryWrapper<>();
		wrapper.eq(StringUtils.isNotBlank(String.valueOf(coreAdmin.getId())), CoreAdmin::getId, coreAdmin.getId()).or()
				.like(StringUtils.isNotBlank(coreAdmin.getUsername()), CoreAdmin::getUsername, coreAdmin.getUsername())
				.or()
				.like(StringUtils.isNotBlank(coreAdmin.getNickname()), CoreAdmin::getNickname, coreAdmin.getNickname())
				.or().like(StringUtils.isNotBlank(coreAdmin.getEmail()), CoreAdmin::getEmail, coreAdmin.getEmail());
		return super.page(page, wrapper);
	}

	/**
	 * 检查账号是否存在
	 * @param username {@code String} 账号
	 * @return {@code boolean} 账号已存在则抛出异常
	 */
	private boolean checkUsername(String username) {
		if (checkUniqueness(USERNAME, username)) {
			throw new BusinessException(ResponseCode.USER_HAS_EXISTED);
		}
		return false;
	}

	/**
	 * 检查昵称是否存在
	 * @param nickname {@code String} 昵称
	 * @return {@code boolean} 昵称已存在则抛出异常
	 */
	private boolean checkNickname(String nickname) {
		if (checkUniqueness(NICKNAME, nickname)) {
			throw new BusinessException(ResponseCode.USER_NICK_HAS_EXISTED);
		}
		return false;
	}

	/**
	 * 检查邮箱是否存在
	 * @param email {@code String} 邮箱
	 * @return {@code boolean} 邮箱已存在则抛出异常
	 */
	private boolean checkEmail(String email) {
		if (checkUniqueness(EMAIL, email)) {
			throw new BusinessException(ResponseCode.USER_EMAIL_HAS_EXISTED);
		}
		return false;
	}

}
