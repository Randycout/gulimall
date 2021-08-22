package com.chen.gulimall.product;


//import com.aliyun.oss.OSS;
import com.chen.gulimall.product.entity.BrandEntity;
import com.chen.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.junit4.statements.SpringRepeat;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
//    @Resource
//    OSS ossClient;
    @Test
    void contextLoads() {
        BrandEntity brandEntity=new BrandEntity();
       /* brandEntity.setName("华为");
        brandEntity.setDescript("这是测试用的");
        brandService.save(brandEntity);
        System.out.println("保存成功");*/
        brandEntity.setDescript("修改测试");
        brandEntity.setBrandId(13L);
        brandService.updateById(brandEntity);
    }
  //  @Test
//    public void testUpload() throws FileNotFoundException {
//        // Endpoint以上海为例，其它Region请按实际情况填写。
//       // String endpoint = "oss-cn-shanghai.aliyuncs.com";
//     // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，
//        // 创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//       // String accessKeyId = "LTAI5tB5ne7EvHC2sRurmkZL";
//      //  String accessKeySecret = "NIyxEQ1gLBCFTqCjCPs0Y39dYl81yT";
//       // 创建OSSClient实例。
//       // OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);
//         // 上传文件流。
//        InputStream inputStream = new FileInputStream("D:\\资源\\图片\\壁纸\\idea\\bg.jpg");
//
//        ossClient.putObject("gulimall-randy", "bg.jpg", inputStream);
//        // 关闭OSSClient。
//        ossClient.shutdown();
//        System.out.println("bg.jpg上传成功-----------------");
//
//    }

}
