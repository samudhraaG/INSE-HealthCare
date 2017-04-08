package com.inse.dao;

import com.inse.com.model.Bundle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdk.nashorn.internal.scripts.JD;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;

public class BundleDAOImpl implements BundleDAO{
    private JdbcTemplate jdbcTemplate;

    public BundleDAOImpl(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Bundle bundle){
        if(bundle.getBundleNo() >0){
            String sql = "UPDATE bundle SET BundleNo=? WHERE bundleNo=?";
            jdbcTemplate.update(sql, bundle.getBundleNo());
        }else{
            String insertQuery = "";
            jdbcTemplate.update(insertQuery, bundle.getBundleNo());
        }

    }

    @Override
    public List<Bundle> listBundles() {
       /* String listQuery = "SELECT * FROM Bundle";
        List<Bundle> listOfBundles = jdbcTemplate.query(listQuery, new RowMapper<Bundle>() {
            @Override
            public Bundle mapRow(ResultSet resultSet, int i) throws SQLException {
                Bundle b = new Bundle();
                b.setBundleNo(resultSet.getInt("BundleNo"));

                return b;
            }
        }) ;*/
        Bundle mockBundle = new Bundle(1,null, 100.00);
        List<Bundle> mockBundleList = new ArrayList<Bundle>();
        mockBundleList.add(mockBundle);
        return mockBundleList;
        //return listOfBundles;
    }
}
