### **Exercise: Student and Course System**

**Task:** Create a simple student-course management system using Java OOP concepts.

1. **Class `Student`**

   * Attributes: `name` (String), `id` (int)
   * Methods:

     * `getName()`, `getId()`
     * `toString()` — returns a readable representation of the student

2. **Class `Course`**

   * Attributes: `courseName` (String), `students` (ArrayList of Student)
   * Methods:

     * `addStudent(Student s)` — adds a student to the course
     * `removeStudent(int studentId)` — removes a student by ID
     * `printStudents()` — prints all enrolled students

3. **Main Method**

   * Create at least 2 courses and 5 students
   * Assign students to courses
   * Remove a student from a course
   * Print students of each course

**Optional Challenge:**

* Prevent adding the same student twice to the same course.
* Sort students alphabetically when printing.
