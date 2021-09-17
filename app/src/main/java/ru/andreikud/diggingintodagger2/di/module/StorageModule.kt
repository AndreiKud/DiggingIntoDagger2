package ru.andreikud.diggingintodagger2.di.module

import dagger.Binds
import dagger.Module
import ru.andreikud.diggingintodagger2.storage.SharedPreferencesStorage
import ru.andreikud.diggingintodagger2.storage.Storage

@Module
abstract class StorageModule {

    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage): Storage

}