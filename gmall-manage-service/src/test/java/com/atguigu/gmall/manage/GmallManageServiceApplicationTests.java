package com.atguigu.gmall.manage;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.manage.service.impl.SkuServiceImpl;
import com.atguigu.gmall.service.SkuService;
import com.atguigu.gmall.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallManageServiceApplicationTests {

	@Reference
	SkuService skuService;

	@Autowired
	RedisUtil redisUtil;

	@Test
	public void contextLoads() {
		Jedis jedis = redisUtil.getJedis();

		System.out.println(jedis);
	}

}
