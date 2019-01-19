package com.hendisantika.springbootjdbcpostgres.model;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-jdbc-postgres
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-01-20
 * Time: 06:47
 * To change this template use File | Settings | File Templates.
 */
public class RestResult {
    private int id, rand;
    // getter dan setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRand() {
        return rand;
    }

    public void setRand(int rand) {
        this.rand = rand;
    }
}
