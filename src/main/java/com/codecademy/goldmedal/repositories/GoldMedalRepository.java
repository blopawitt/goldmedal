package com.codecademy.goldmedal.repositories;

import com.codecademy.goldmedal.model.GoldMedal;
import org.springframework.data.repository.CrudRepository;

public interface GoldMedalRepository extends CrudRepository<GoldMedal, Integer> {

}
