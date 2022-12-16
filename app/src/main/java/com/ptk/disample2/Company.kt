package com.ptk.disample2

class Company constructor(val employee: Employee, val companyName: String = "eTag RFID") {
    fun showEmployeeName(): String {
        return "Employee ${employee.name} is from the ${companyName} Company"
    }
}