package com.hendisantika.springbootjdbcpostgres.dao;

import com.hendisantika.springbootjdbcpostgres.model.Rest;
import com.hendisantika.springbootjdbcpostgres.model.RestResult;

import java.util.List;

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
public interface RestDao {
    List<RestResult> getAll();

    RestResult getRestById(int id);

    void addRest(Rest rest);

    void updateRest(Rest rest, int id);

    void deleteRestById(int id);

    int latestInput();

}
