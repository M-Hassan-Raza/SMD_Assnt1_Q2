open class Student(
    val Student_ID: String,
    val Major: String,
    val Year: Int,
    val Semester: Int,
    val College: String,
    val grade: Int
) : Person() {

    override fun Register(UID: Int): String {
        return "You are registered as Student with UID: $UID"
    }

    fun getGrade(course: Int): Int {
        return grade
    }

    fun Attend(course_class: Int): String {
        return "You attended course class $course_class successfully."
    }

    fun Learn(): String {
        return "You successfully learned another concept!"
    }
}