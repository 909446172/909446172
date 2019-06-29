package com.example.demo;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.net.URL;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() throws IOException, MyException {
		String resource = this.getClass().getClassLoader().getResource("fastdfs.conf").getPath();
		System.out.println(resource);
			ClientGlobal.init(resource);
		TrackerServer connection = new TrackerClient().getConnection();
		StorageClient storageClient = new StorageClient(connection,null);
		String image = "E://image/girl.jpg";
		String[] ipgs = storageClient.upload_file(image, "jpg", null);
		for (String ipg : ipgs) {
			System.out.print(ipg);
		}


	}

}
