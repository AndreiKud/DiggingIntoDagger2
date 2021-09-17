package ru.andreikud.diggingintodagger2.di.subcomponent

import dagger.Module

@Module(subcomponents = [
    RegistrationComponent::class,
    LoginComponent::class,
    UserComponent::class,
])
class AppSubcomponents