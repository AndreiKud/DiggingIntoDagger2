package ru.andreikud.diggingintodagger2.di.subcomponent

import dagger.Subcomponent
import ru.andreikud.diggingintodagger2.di.scope.ActivityScope
import ru.andreikud.diggingintodagger2.registration.RegistrationActivity
import ru.andreikud.diggingintodagger2.registration.enterdetails.EnterDetailsFragment
import ru.andreikud.diggingintodagger2.registration.termsandconditions.TermsAndConditionsFragment

@ActivityScope
@Subcomponent
interface RegistrationComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): RegistrationComponent
    }

    fun inject(fragment: EnterDetailsFragment)
    fun inject(fragment: TermsAndConditionsFragment)
    fun inject(activity: RegistrationActivity)

}