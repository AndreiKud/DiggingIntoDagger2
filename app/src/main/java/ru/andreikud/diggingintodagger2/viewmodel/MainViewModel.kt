package ru.andreikud.diggingintodagger2.viewmodel

import androidx.lifecycle.ViewModel
import ru.andreikud.diggingintodagger2.data.MyRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainViewModel @Inject constructor(
    private val myRepository: MyRepository
): ViewModel() {
}