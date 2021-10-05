class Employee constructor(var employeeName: String,
                           var employeeNumber: Int,
                           var employeeShift: Int
                           ) {
    init {
        println("New Employee added: $employeeName")
    }




    fun printAll(){
        println("Employee Name: $employeeName\nEmployee Number: $employeeNumber\nEmployee Shift: $employeeShift\n")
    }
}