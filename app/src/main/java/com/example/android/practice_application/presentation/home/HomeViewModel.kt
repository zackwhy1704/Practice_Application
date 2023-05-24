package com.example.android.practice_application.presentation.home

import android.app.Activity
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.practice_application.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val repository: Repository) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Welcome to Practice_Application. " +
                "This is the HomePage"
    }
    val text: LiveData<String> get() = _text
}