package me.chandankumar.learningspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class CountryController {

    @Autowired
    CountryRepository countryRepository;

    @GetMapping("/countries")
    public List<Country> getAllCountry(){
        return countryRepository.getAllCountry();
    }
}
