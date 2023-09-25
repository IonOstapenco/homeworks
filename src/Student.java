/*create 2 classes. 1 st Student with attributes: nr ticket, name, surname, year, avg math,
avg economics. 2 st student test - create 3 objects student, show avg for all objects*/
public class Student {
    int ticket, year;
    String Name;
    String Surname;
    double avg_math, avg_economics, avg_language;
    double total_avg = ((avg_economics+avg_language+avg_math)/3);
}
