package com.example.statussaver4wa.viewmodels.factories

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.statussaver4wa.data.StatusRepo
import com.example.statussaver4wa.viewmodels.StatusViewModel

class StatusViewModelFactory(private val repo: StatusRepo): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return StatusViewModel(repo) as T
    }
}