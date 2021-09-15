package ru.andreikud.diggingintodagger2.di

import android.app.Application

class MyApp : Application() {

    val appComponent = DaggerMyAppComponent.create()

}
