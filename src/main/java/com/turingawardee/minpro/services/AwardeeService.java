package com.turingawardee.minpro.services;

import com.turingawardee.minpro.dao.AwardeeRepository;
import com.turingawardee.minpro.entities.AwardWinner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AwardeeService {

    @Autowired
    public AwardeeRepository awardeeRepository;

    public List<AwardWinner> getAllWinners() {

        List<AwardWinner> allWinners = (List<AwardWinner>) awardeeRepository.findAll();

        return allWinners;
    }
}