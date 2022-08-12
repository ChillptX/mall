package com.chillpt.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chillpt.mall.product.entity.BrandEntity;
import com.chillpt.mall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;
/*
	1、引入oss-starter
	2、配置key，endpoint相关信息即可
	3、使用OSSClient进行相关操作
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class MallProductApplicationTests {

	@Autowired
	BrandService brandService;



	@Test
	public void contextLoads() {

		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setBrandId(1L);
		brandEntity.setDescript("靓仔先");

		brandEntity.setName("靓仔先");
		brandService.save(brandEntity);
		log.info("保存成功");

		brandService.updateById(brandEntity);

		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
		list.forEach((item)->{
			System.out.println(item);
		});

	}

}
