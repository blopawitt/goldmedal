package com.codecademy.goldmedal.repositories;

import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Integer> {
    List<GoldMedal> getByCountryOrderByYearAsc(String country);
    List<GoldMedal> getByCountryOrderByYearDesc(String country);
    List<GoldMedal> getByCountryOrderBySeasonAsc(String season);
    List<GoldMedal> getByCountryOrderBySeasonDesc(String season);
    List<GoldMedal> getByCountryOrderByCityAsc(String city);
    List<GoldMedal> getByCountryOrderByCityDesc(String city);
    List<GoldMedal> getByCountryOrderByNameAsc(String name);
    List<GoldMedal> getByCountryOrderByNameDesc(String name);
    List<GoldMedal> getByCountryOrderByEventAsc(String event);
    List<GoldMedal> getByCountryOrderByEventDesc(String event);
}
