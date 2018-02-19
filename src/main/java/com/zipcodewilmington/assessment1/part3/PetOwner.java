package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    protected String name;
    protected Pet[] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if (pets == null){
            this.pets = new Pet[0];
        } else {
            this.pets = pets;
            for (Pet onePet:this.pets) {
                onePet.owner = this;
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        ArrayList<Pet> petList = new ArrayList<>();
            for (Pet extantPet : this.pets) {
                petList.add(extantPet);
            }
        petList.add(pet);
        Pet[] newPetArray = new Pet[petList.size()];
        for (int i = 0; i < newPetArray.length; i++){
            newPetArray[i] = petList.get(i);
        }
        this.pets = newPetArray;
        for (Pet onePet:this.pets) {
            onePet.owner = this;
        }
    }

    /**
     * @param removalPet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet removalPet) {
        ArrayList<Pet> petList = new ArrayList<>();
        for (Pet extantPet : this.pets) {
            if (!(extantPet.equals(removalPet)))
            petList.add(extantPet);
        }
        petList.toArray(this.pets);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (Pet currentPet : this.pets){
            if (currentPet.equals(pet)) return true;
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer lowestAge = Integer.MAX_VALUE;
        for (Pet currentPet: this.pets) {
            if (currentPet.getAge() < lowestAge){
                lowestAge = currentPet.getAge();
            }
        }
        return lowestAge;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer highestAge = 0;
        for (Pet currentPet: this.pets) {
            if (currentPet.getAge() > highestAge){
                highestAge = currentPet.getAge();
            }
        }
        return highestAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Integer totalAge = 0;
        for (Pet currentPet: this.pets) {
            totalAge += currentPet.getAge();
        }
        Float answer = totalAge/(float)this.pets.length;
        return answer;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return this.pets.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }
}
