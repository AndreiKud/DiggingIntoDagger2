package ru.andreikud.diggingintodagger2.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MyRepository @Inject constructor(
    private val mySource: MySource
) {
}