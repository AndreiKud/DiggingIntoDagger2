package ru.andreikud.diggingintodagger2.di

import dagger.Module
import dagger.Provides
import ru.andreikud.diggingintodagger2.data.Computer
import ru.andreikud.diggingintodagger2.data.RAM

@Module
object AppModule {

    @Provides
    fun provideRAM(): RAM = RAM()

    @Provides
    fun provideComputer(
        ram: RAM
    ): Computer = Computer(ram)

}