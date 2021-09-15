package ru.andreikud.diggingintodagger2.di

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import ru.andreikud.diggingintodagger2.data.SomeApi

@Module
class MyModule {

    @Provides
    fun provideSomeApi(): SomeApi = Retrofit.Builder()
        .baseUrl("")
        .build()
        .create(SomeApi::class.java)

}