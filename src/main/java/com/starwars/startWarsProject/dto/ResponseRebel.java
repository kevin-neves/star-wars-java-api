package com.starwars.startWarsProject.dto;

import com.starwars.startWarsProject.model.Gender;
import com.starwars.startWarsProject.model.Items;
import com.starwars.startWarsProject.model.Location;
import com.starwars.startWarsProject.model.Rebel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;

@Getter @Setter
@AllArgsConstructor
public class ResponseRebel {
    private String name;
    private Number age;
    private Gender gender;
    private Location location;
    private List<Items> inventory;

    public ResponseRebel(Rebel rebel){
        this.name = rebel.getName();
        this.age = rebel.getAge();
        this.gender = rebel.getGender();
        this.location = rebel.getLocation();
        this.inventory = rebel.getInventory();
    }

    public static List<ResponseRebel> toResponse(List<Rebel> rebels){
        return rebels.stream().map(ResponseRebel::new).collect(Collectors.toList());
    }


}