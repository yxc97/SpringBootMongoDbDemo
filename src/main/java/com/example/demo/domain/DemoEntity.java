package com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @Description: 测试实体类
 * @Author yxc
 * @Date 2021/5/10 23:21
 */
/*
@Id - 文档的唯一标识，在mongodb中为ObjectId，它是唯一的，通过时间戳+机器标识+进程ID+自增计数器（确保同一秒内产生的Id不会冲突）构成。
@Document - 把一个java类声明为mongodb的文档，可以通过collection参数指定这个类对应的文档。@Document(collection=“mongodb”) mongodb对应表
@DBRef - 声明类似于关系数据库的关联关系。ps：暂不支持级联的保存功能，当你在本实例中修改了DERef对象里面的值时，单独保存本实例并不能保存DERef引用的对象，它要另外保存，如下面例子的Person和Account。
@Indexed - 声明该字段需要索引，建索引可以大大的提高查询效率。
@CompoundIndex - 复合索引的声明，建复合索引可以有效地提高多字段的查询效率。
@GeoSpatialIndexed - 声明该字段为地理信息的索引。
@Transient - 映射忽略的字段，该字段不会保存到mongodb。
@PersistenceConstructor - 声明构造函数，作用是把从数据库取出的数据实例化为对象。该构造函数传入的值为从DBObject中取出的数据
 */
@Document(collection = "demo_collection")
public class DemoEntity  implements Serializable {

        @Id
        private Long id;

        private String title;

        private String description;

        private String by;

        private String url;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DemoEntity(Long id, String title, String description, String by, String url) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.by = by;
        this.url = url;
    }

    public DemoEntity() {
    }

    @Override
    public String toString() {
        return "DemoEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", by='" + by + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}



