package com.blackcoffer.repository;

import com.blackcoffer.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface DataRepository extends JpaRepository<Data, Integer> {
    @Query("SELECT t.country, SUM(t.intensity) \n" +
            "FROM Data t  \n" +
            "WHERE t.country IS NOT NULL AND t.country <> ''" +
            "GROUP BY t.country")
    List<Object[]> findSumOfIntensity();

    @Query("SELECT d.sector, AVG(d.likelihood) AS avgLikelihood\n" +
            "FROM Data d\n" +
            "GROUP BY d.sector\n")
    List<Object[]> findLikelihoodAvg();


}
