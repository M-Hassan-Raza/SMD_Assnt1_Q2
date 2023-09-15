open class Student: Person() {
    val grade: String = "";
    override fun Register(UID: Int) {
        System.out.println("Your Registered for Student: $UID");
    }
    public fun getGrade(course: Int): String{
        return grade;
    }

    public fun Attend(course_class: Int){
        System.out.println("You successfully attended: $course_class")
    }

    public


}