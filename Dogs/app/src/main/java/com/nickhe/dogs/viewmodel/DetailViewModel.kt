package com.nickhe.dogs.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.nickhe.dogs.model.DogBreed
import com.nickhe.dogs.model.DogDatabase
import kotlinx.coroutines.launch

class DetailViewModel(application: Application) : BaseViewModel(application) {

    val dog = MutableLiveData<DogBreed>()

    fun fetch(dogUuid: Int){
       launch {
           val result = DogDatabase(getApplication()).dogDao().getDog(dogUuid)
           dog.value = result
       }
    }
}