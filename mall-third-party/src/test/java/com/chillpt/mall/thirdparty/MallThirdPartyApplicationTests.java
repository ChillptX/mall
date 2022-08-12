package com.chillpt.mall.thirdparty;


import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.InputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MallThirdPartyApplicationTests {

	@Autowired
	OSSClient ossClient;

	@Test
	public void testUpload() throws Exception{

//		// Endpoint以华东1（杭州）为例，其它Region请按实际情况填写。
//		String endpoint = "oss-cn-guangzhou.aliyuncs.com";
//		// 阿里云账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM用户进行API访问或日常运维，请登录RAM控制台创建RAM用户。
//		String accessKeyId = "LTAI5tQfvDUtQh2Kjs8ofQUs";
//		String accessKeySecret = "HdhaRoibuUeSskzdoMXAdyz1oZ8b3E";

			// 创建OSSClient实例。
//		OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

			//上传文件流
			InputStream inputStream = new FileInputStream("D:\\chillptX.jpg");
			ossClient.putObject("mall-chillpt", "hhh.jpg", inputStream);

			//关闭OSSClient
			ossClient.shutdown();

			System.out.println("上传完成..");

		}
	}

