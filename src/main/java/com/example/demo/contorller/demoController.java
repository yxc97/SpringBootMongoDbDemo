package com.example.demo.contorller;

import com.example.demo.dao.DemoDao;
import com.example.demo.domain.DemoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author yxc
 * @Date 2021/5/11 0:20
 */
@RestController
public class demoController {

    @Autowired
    private DemoDao demoDao;

    @GetMapping("/test")
    public String test(){
        return "OK！";
    }

    @GetMapping("/saveDemoTest")
    public void saveDemoTest() {
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB");
        demoEntity.setDescription("关注公众号，搜云库，专注于开发技术的研究与知识分享");
        demoEntity.setBy("souyunku");
        demoEntity.setUrl("http://www.souyunku.com");

        demoDao.saveDemo(demoEntity);

        demoEntity = new DemoEntity();
        demoEntity.setId(2L);
        demoEntity.setTitle("Spring Boot 中使用 MongoDB");
        demoEntity.setDescription("关注公众号，搜云库，专注于开发技术的研究与知识分享");
        demoEntity.setBy("souyunku");
        demoEntity.setUrl("http://www.souyunku.com");

        demoDao.saveDemo(demoEntity);
    }

    @GetMapping("/removeDemoTest")
    public void removeDemoTest() {
        demoDao.removeDemo(2L);
    }

    @GetMapping("/updateDemoTest")
    public void updateDemoTest() {

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(1L);
        demoEntity.setTitle("Spring Boot 中修改 MongoDB 更新数据");
        demoEntity.setDescription("关注公众号，搜云库，专注于开发技术的研究与知识分享");
        demoEntity.setBy("souyunku");
        demoEntity.setUrl("http://www.souyunku.com");

        demoDao.updateDemo(demoEntity);
    }

    @GetMapping("/findDemoByIdTest")
    public String findDemoByIdTest() {

        DemoEntity demoEntity = demoDao.findDemoById(1L);

        System.out.println(demoEntity.toString());
        return demoEntity.toString();
    }
}
