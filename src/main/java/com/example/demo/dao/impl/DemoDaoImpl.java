package com.example.demo.dao.impl;

import com.example.demo.dao.DemoDao;
import com.example.demo.domain.DemoEntity;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author yxc
 * @Date 2021/5/10 23:26
 */
@Component
public class DemoDaoImpl implements DemoDao {
    /*
     测试新增
       */
    @Resource
    private MongoTemplate mongoTemplate;
    @Override
    public void saveDemo(DemoEntity demoEntity) {
        mongoTemplate.save(demoEntity);
    }
    /*
       测试删除
        */
    @Override
    public void removeDemo(Long id) {
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(id);
        mongoTemplate.remove(demoEntity);
    }
    /*
       测试修改
        */
    @Override
    public void updateDemo(DemoEntity demoEntity) {
        Query query = new Query(Criteria.where("id").is(demoEntity.getId()));

        Update update = new Update();
        update.set("title", demoEntity.getTitle());
        update.set("description", demoEntity.getDescription());
        update.set("by", demoEntity.getBy());
        update.set("url", demoEntity.getUrl());

        mongoTemplate.updateFirst(query, update, DemoEntity.class);
    }
    /*
        测试查询
         */
    @Override
    public DemoEntity findDemoById(Long id) {
        Query query = new Query(Criteria.where("id").is(id));
        DemoEntity demoEntity = mongoTemplate.findOne(query, DemoEntity.class);
        return demoEntity;
    }
}
