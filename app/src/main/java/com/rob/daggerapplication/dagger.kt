package com.rob.daggerapplication

import dagger.Component
import dagger.Module
import dagger.Provides


@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)

    fun education(): Education
}

@Module
object AppModule {
    @Provides
    fun provideEducation(
        student: Student,
        university: University,
        faculty: Faculty
    ): Education {
        return Education(student, university, faculty)
    }

    @Provides
    fun provideStudent(): Student {
        return Student()
    }

    @Provides
    fun provideUniversity(): University {
        return University()
    }

    @Provides
    fun provideFaculty(): Faculty {
        return Faculty()
    }


}