package com.example.project8.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.project8.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    //Request atau Event
    private val _mahasiswaStateUI = MutableStateFlow(Mahasiswa())

    //Response atau State
    val mahasiswaUIState:
            StateFlow<Mahasiswa> =
        _mahasiswaStateUI.asStateFlow()

    fun saveDataMahasiswa(ls: MutableList<String>) {
        _mahasiswaStateUI.update { statusSaatIni ->
            statusSaatIni.copy(
                NIM = ls[0],
                Nama = ls[1],
                Email = ls[2]
            )
        }
    }
}

