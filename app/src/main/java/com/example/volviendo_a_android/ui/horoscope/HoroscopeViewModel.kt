package com.example.volviendo_a_android.ui.horoscope

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.volviendo_a_android.data.providers.HoroscopeProvider
import com.example.volviendo_a_android.domain.model.HoroscopeInfo
import com.example.volviendo_a_android.domain.model.HoroscopeInfo.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(horoscopeProvider: HoroscopeProvider) : ViewModel() {
    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horoscope

    init {
        _horoscope.value = horoscopeProvider.getHoroscopes()
    }

    fun test() {

    }

}