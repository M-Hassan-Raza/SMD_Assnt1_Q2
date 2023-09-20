fun main() {
    // Creating instances of the derived classes
    val technician = Technician(
        Tech_Type = "Hardware",
        Emp_ID = "E456",
        Emp_Role = "Technician",
        Emp_Dept = "IT Support",
        Salary = 60000f,
        Emp_Experience = 5
    )

    val faculty = Faculty(
        Faculty_Specialization = "Computer Science",
        Section = "A",
        No_Of_Students = "30",
        Qualification = "Ph.D. in Computer Science",
        Emp_ID = "E123",
        Emp_Role = "Professor",
        Emp_Dept = "Computer Science",
        Salary = 95000f,
        Emp_Experience = 10
    )

    val pgStudent = PGStudent(
        Roll_No = "PG123",
        Specialization = "Computer Science",
        Student_ID = "S123456",
        Major = "Computer Science",
        Year = 2,
        Semester = 1,
        College = "XYZ College",
        grade = 85
    )

    // Assigning derived class instances to base class variables
    val staff1: Staff = technician
    val staff2: Staff = faculty
    val student: Student = pgStudent

    // Polymorphic behavior: calling overridden methods on base class variables
    println("Details for Technician:")
    println("Attend message: ${staff1.Attend(duty = "maintenance")}")
    println("Promotion message: ${staff1.getPromotion()}")
    println("Maintenance message: ${(staff1 as? Technician)?.Maintain(Lab = "Computer Lab 1")}")
    println()

    println("Details for Faculty:")
    println("Attend message: ${staff2.Attend(duty = "lecture")}")
    println("Maintain message: ${(staff2 as? Faculty)?.Maintain(Lab = "Computer Lab 1")}")
    println("Promotion message: ${staff2.getPromotion()}")
    println()

    println("Details for PG Student:")
    println("Registration message: ${student.Register(123)}")
    println("Grade for a course: ${student.getGrade(course = 1)}")
    println("Learn message: ${student.Learn()}")
    println("Submitting thesis:")
    (student as? PGStudent)?.SubmitThesis()
}
