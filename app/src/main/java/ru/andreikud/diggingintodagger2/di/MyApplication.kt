package ru.andreikud.diggingintodagger2.di

import android.app.Application
import android.os.UserManager
import ru.andreikud.diggingintodagger2.storage.SharedPreferencesStorage

open class MyApplication : Application() {

    val appComponent: AppComponent by lazy(LazyThreadSafetyMode.NONE) {
        DaggerAppComponent.factory().create(applicationContext)
    }

}