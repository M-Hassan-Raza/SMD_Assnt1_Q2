class Faculty(Faculty_Specialization: String,
              Section: String,
              No_Of_Students: String,
              Qualification: String,
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
            return "You just maintained the Lab: $Lab"
        }

}
