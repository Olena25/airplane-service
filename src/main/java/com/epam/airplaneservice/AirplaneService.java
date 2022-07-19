package com.epam.airplaneservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AirplaneService {
    @Value("${airplanes}")
    private String [] airplanes;

    public int countSpecificAirplanes(String companyName){
        int counter = 0;
        for (int i =0; i < airplanes.length; i ++){
            if (airplanes[i].contains(companyName)){
                counter ++;
            }
        }
        return counter;
    }


    public List<String> findAllAirplanes(){
        return Arrays.asList(airplanes);
    }

    public String findAirplane(String airplaneName){
        for (int i =0; i < airplanes.length; i ++){
            if (airplanes[i].equals(airplaneName)){
                return airplanes[i];
            }
        }
        throw new NoAirplaneException("Airplane is not found");
    }

}
