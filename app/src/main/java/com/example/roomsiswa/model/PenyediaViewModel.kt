package com.example.roomsiswa.model

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.roomsiswa.AplikasiSiswa

/**
 * Fungsi ekstensi query untuk objek [Application] dan mengembalikan sebuah instance dari [AplikasiSiswa].
 */
fun CreationExtras.aplikasiSiswa(): AplikasiSiswa = (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiSiswa)