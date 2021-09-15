package ru.andreikud.diggingintodagger2.di

import dagger.Component
import dagger.Provides
import retrofit2.Retrofit
import ru.andreikud.diggingintodagger2.data.SomeApi
import ru.andreikud.diggingintodagger2.ui.MainActivity
import javax.inject.Singleton

@Singleton
@Component(modules = [MyModule::class])
interface MyAppComponent {

    fun inject(mainActivity: MainActivity)

}