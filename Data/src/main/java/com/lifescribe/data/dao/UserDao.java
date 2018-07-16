package com.lifescribe.data.dao;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

public interface UserDao {

    @SqlUpdate("INSERT INTO users (first_name, last_name, email) VALUES (:first_name, :last_name, :email)")
    void insert(@Bind("first_name") String firstName, @Bind("last_name") String lastName, @Bind("email") String email);

    @SqlQuery("SELECT COUNT(id) FROM users")
    int numOfUsers();
}
