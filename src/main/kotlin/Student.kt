open class Student: Person() {
    val Student_ID: String = "";
    val Major: String = "";
    val Year: Int = 0;
    val Semester: Int = 0;
    val College: String = "";
    val grade: Int = 0;

    override fun Register(UID: Int): String{
       return "Your Registered for Student: $UID";
    }
    public fun getGrade(course: Int): Int{
        return grade;
    }

    public fun Attend(course_class: Int): String{
        return "You successfully attended: $course_class"
    }

    public fun Learn(): String{
        return "You successfully another concept!";
    }


}