package cn.com.fhz.elasticsearch;

import cn.com.fhz.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by hzfang on 2018/1/26.
 */
@Component
public class ElasticsearchPool {

    @Autowired
    MyConfig config;

}