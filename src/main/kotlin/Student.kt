open class Student: Person() {
    val grade: String = "";
    override fun Register(UID: Int): String{
       return "Your Registered for Student: $UID";
    }
    public fun getGrade(course: Int): String{
        return grade;
    }

    public fun Attend(course_class: Int): String{
        return "You successfully attended: $course_class"
    }

    public fun Learn(): String{
        return "You successfully another concept!";
    }


}