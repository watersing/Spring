package com.itheima.datasouce;

/**
 * DruidDatasource  class
 *
 * @author lst
 * @version 1.0
 * @date 2022/4/22 21:40
 */

public class DruidDatasource {

    private  String jdbcUserName;
    private String jdbcUrl;

    public void setJdbcUserName(String jdbcUserName) {
        this.jdbcUserName = jdbcUserName;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }
}
