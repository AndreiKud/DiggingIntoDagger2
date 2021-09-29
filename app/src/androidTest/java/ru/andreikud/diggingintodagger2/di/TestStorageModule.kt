package ru.andreikud.diggingintodagger2.di

import dagger.Binds
import dagger.Module
import ru.andreikud.diggingintodagger2.storage.Storage
import ru.andreikud.diggingintodagger2.FakeStorage

@Module
abstract class TestStorageModule {

    @Binds
    abstract fun provideStorage(storage: FakeStorage): Storage
}