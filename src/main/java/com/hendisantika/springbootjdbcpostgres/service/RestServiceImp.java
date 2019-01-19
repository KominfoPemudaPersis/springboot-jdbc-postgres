package com.hendisantika.springbootjdbcpostgres.service;

import com.hendisantika.springbootjdbcpostgres.dao.RestDao;
import com.hendisantika.springbootjdbcpostgres.model.Rest;
import com.hendisantika.springbootjdbcpostgres.model.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jdbc-postgres
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-20
 * Time: 06:51
 * To change this template use File | Settings | File Templates.
 */
@Service
public class RestServiceImp implements RestService {

    @Autowired
    private RestDao restDao;

    @Override
    public List<RestResult> getAll() {
        return restDao.getAll();
    }

    @Override
    public RestResult getRestById(int id) {
        return restDao.getRestById(id);
    }

    @Override
    public void addRest(Rest rest) {
        restDao.addRest(rest);
    }

    @Override
    public void updateRest(Rest rest, int id) {
        restDao.updateRest(rest, id);
    }

    @Override
    public void deleteRestById(int id) {
        restDao.deleteRestById(id);
    }

    @Override
    public int latestInput() {
        return restDao.latestInput();
    }

}