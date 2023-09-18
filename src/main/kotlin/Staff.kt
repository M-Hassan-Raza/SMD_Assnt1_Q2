open class Staff(
    val Emp_ID: String,
    val Emp_Role: String,
    val Emp_Dept: String,
    val Salary: Float,
    val Emp_Experience: Int
) : Person() {

    fun Attend(duty: String): String {
        return "You successfully attended the $duty duty"
    }

    fun getPromotion(): String {
        return "Congrats! You are now promoted <3"
    }

    fun getSalary(): Float {
        return Salary
    }
}