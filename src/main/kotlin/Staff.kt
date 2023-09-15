open class Staff: Person() {
    val Emp_ID: String = "";
    val Emp_Role:String = "";
    val Emp_Dept: String = "";
    val Salary: Float = 0.0F;
    val Emp_Experience: Int = 0;

    public fun Attend(duty: String): String{
        return "You successfully attended the $duty duty";
    }



}