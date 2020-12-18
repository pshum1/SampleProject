package com.example.sampleproject.ui.viewmodels

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sampleproject.data.repositories.MainRepository
import com.google.firebase.database.FirebaseDatabase
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    var database: FirebaseDatabase,
    private var mainRepository: MainRepository,
) : ViewModel() {

    private var ids = ArrayList<String>()

    fun getId() = viewModelScope.launch {
        ids = mainRepository.getId()
    }


}