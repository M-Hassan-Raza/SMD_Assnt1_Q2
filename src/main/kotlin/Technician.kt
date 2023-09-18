class Technician (Tech_Type: String,
Emp_ID: String,
Emp_Role: String,
Emp_Dept: String,
Salary: Float,
Emp_Experience: Int): Staff(Emp_ID,
Emp_Role,
Emp_Dept,
Salary,
Emp_Experience) {

    public fun Maintain(Lab: String): String{
        return "You Successfully performed maintenance on $Lab lab"
    }
}