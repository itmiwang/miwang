package com.miwang.business.core.tests;

import com.miwang.business.core.CoreBusinessApplication;
import com.miwang.business.core.service.ICoreAdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author guozq
 * @date 2020-05-31-5:12 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = CoreBusinessApplication.class)
public class CoreAdminServiceTests {

	@Resource
	private ICoreAdminService coreAdminService;

	@Test
	public void testConnection() {
		coreAdminService.count();
	}

}
