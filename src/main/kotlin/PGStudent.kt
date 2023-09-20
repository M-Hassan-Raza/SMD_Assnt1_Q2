class PGStudent(
    Roll_No: String,
    Specialization: String,
    Student_ID: String,
    Major: String,
    Year: Int,
    Semester: Int,
    College: String,
    grade: Int
) : Student(Student_ID, Major, Year, Semester, College, grade) {

    private val rollNo: String = Roll_No
    private val specialization: String = Specialization

    public fun SubmitThesis(){
        System.out.println(("Your thesis was submitted successfully"))
    }
}
