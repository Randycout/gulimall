package com.chen.gulimall.thirdparty;

import com.aliyun.oss.OSS;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest
class GulimallThirdPartyApplicationTests {

    @Resource
    OSS ossClient;
    @Test
    void contextLoads() {
    }
    @Test
    public void testUpload() throws FileNotFoundException, FileNotFoundException {
        FileInputStream inputStream = new FileInputStream("D:\\资源\\图片\\壁纸\\idea\\bg.jpg");
        // 参数1位bucket  参数2位最终名字
        ossClient.putObject("gulimall-randy","bg.jpg",inputStream);
        ossClient.shutdown();
        System.out.println("第三方上传照片成功--------");
    }
}
