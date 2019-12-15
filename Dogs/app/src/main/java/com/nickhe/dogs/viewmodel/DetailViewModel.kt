package com.nickhe.dogs.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nickhe.dogs.model.DogBreed

class DetailViewModel : ViewModel() {

    val dog = MutableLiveData<DogBreed>()

    fun fetch(){
        val dog1 = DogBreed("1", "Corgi", "15 years", "breedGroup", "Just a pet", "Mild", "")

        dog.value = dog1
    }
}