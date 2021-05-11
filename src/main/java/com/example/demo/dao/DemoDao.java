package com.example.demo.dao;

import com.example.demo.domain.DemoEntity;

/**
 * @Description:
 * @Author yxc
 * @Date 2021/5/10 23:25
 */
public interface DemoDao {
   /*
    测试新增
    */
    void saveDemo(DemoEntity demoEntity);

    /*
    测试删除
     */
    void removeDemo(Long id);

    /*
    测试修改
     */
    void updateDemo(DemoEntity demoEntity);

    /*
    测试查询
     */
    DemoEntity findDemoById(Long id);

}
