package com.capg.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.entity.Hall;
import com.capg.exception.HallNotFoundException;
import com.capg.repository.HallRepository;

@Service
public class HallServiceImpl implements HallService {
 
 @Autowired
 private HallRepository hallRepository;
 
 @Override
 public Hall addHall(Hall hall) {
   return hallRepository.save(hall);
 }
 
 @Override
 public Hall updateHall(Hall hall) {
   return hallRepository.save(hall);
 }
 
 @Override
 public void deleteHall(long id) {
   hallRepository.deleteById(id);
 }
 
 @Override
 public Hall getHallById(long id) throws HallNotFoundException{
 Hall hall;
 if(hallRepository.findById(id).isEmpty()) {
     throw new HallNotFoundException();
 }
 else {
     hall=hallRepository.findById(id).get();
 }
 return hall;
 }

 
 @Override
 public List<Hall> getAllHalls() {
   return hallRepository.findAll();
 }
}


