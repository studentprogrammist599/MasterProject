package com.example.masterproject.ui.mainactivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.masterproject.App
import com.example.masterproject.domain.GetTestDataUseCase

class MainViewModel() : ViewModel() {

    private val getTestDataUseCase: GetTestDataUseCase = App.instance.getTestDataUseCase

    private val _result = MutableLiveData<String>()
    val result: LiveData<String> = _result

    fun getData() {
        _result.value = getTestDataUseCase.execute()
    }
}