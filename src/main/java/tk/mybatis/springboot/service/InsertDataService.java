package tk.mybatis.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.model.BaseEntity;

/**
 * Created by zrc on 17/3/31.
 */
@Service
public class InsertDataService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert(BaseEntity baseEntity) {
        jdbcTemplate.update("insert into city(id,name, state) values(?, ?,?)", "1000", "2", "100");
    }
}
