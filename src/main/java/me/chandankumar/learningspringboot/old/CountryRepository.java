package me.chandankumar.learningspringboot.old;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class CountryRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Country> getAllCountry(){

        List<Country> countries = new ArrayList<>();

        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from countries");

        //maps.stream().forEach(System.out::println);

        for(Map<String, Object> e : maps){

            int id = (int) e.get("ID");
            String name = (String) e.get("NAME");
            countries.add(new Country(id, name));

        }

        return countries;
    }

}
