package com.hendisantika.springbootjdbcpostgres.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jdbc-postgres
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-20
 * Time: 06:48
 * To change this template use File | Settings | File Templates.
 */
public class RestMapper implements RowMapper<RestResult> {
    @Override
    public RestResult mapRow(ResultSet rs, int rowNum) throws SQLException {
        Rest rest = new Rest();
        rest.setId(rs.getInt("id"));
        rest.setKey(rs.getString("key"));
        rest.setValue(rs.getString("value"));

        RestResult restResult = new RestResult();
        restResult.setId(rs.getInt("id"));
        restResult.setRand(rs.getInt("rand"));
        return restResult;
    }
}