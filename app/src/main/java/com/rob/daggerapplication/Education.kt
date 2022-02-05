package com.rob.daggerapplication

class Student {}
class University {
    fun priceOfStudy() = 14500
}

class Faculty {
    val department: String = ""

}

class Education(
    val student: Student,
    val university: University,
    val faculty: Faculty
) {
    fun checkUniversity() = university
    fun checkOfFacultyStudyPrice() =
        if (faculty.department == "technical") university.priceOfStudy()
        else university.priceOfStudy() - 1500
}




class Education_1 {

    val student: Student = Student()
    val university: University = University()
    val faculty: Faculty = Faculty()
}