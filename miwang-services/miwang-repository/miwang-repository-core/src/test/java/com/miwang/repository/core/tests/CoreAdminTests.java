package com.miwang.repository.core.tests;

import com.miwang.repository.core.CoreRepositoryApplication;
import com.miwang.repository.core.mapper.CoreAdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author guozq
 * @date 2020-05-31-4:20 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CoreRepositoryApplication.class)
public class CoreAdminTests {

	@Resource
	private CoreAdminMapper coreAdminMapper;

	@Test
	public void testConnection() {
		coreAdminMapper.selectCount(null);
	}

}
