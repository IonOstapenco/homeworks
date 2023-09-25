public class Student_test {
    public static void main(String[] args) {

        Student st = new Student();
        st.ticket=45;
        st.Name = "Ion";
        st.Surname = "Stanciu";
        st.year=3;
        st.avg_economics=4.4;
        st.avg_language=5;
        st.avg_math = 4;

        double total_avg1 = (st.avg_economics+st.avg_math+ st.avg_language)/3;

        Student st2 = new Student();
        st2.ticket=3;
        st2.Name="Pavel";
        st2.Surname="Olaru";
        st2.year=3;
        st2.avg_math=4.5;
        st2.avg_language=3;
        st2.avg_economics=4.5;
        double total_avg2 = (st2.avg_economics+st2.avg_math+ st2.avg_language)/3;

        Student st3= new Student();
        st3.ticket = 2;
        st3.Name = "Vasile";
        st3.Surname="Corneliuc";
        st3.year=4;
        st3.avg_math=5;
        st3.avg_economics=5;
        st3.avg_language=5;
        double total_avg3 = (st3.avg_economics+st3.avg_math+ st3.avg_language)/3;


        //System.out.println("total average is "+ (st.avg_economics + st.avg_language + st.avg_math)/3);
        System.out.println("student1 is "+" "+ st.Name+" "+st.Surname+" "+st.ticket+ " " +total_avg1);
        System.out.println("student2 is "+" "+ st2.Name+" "+st2.Surname+" "+st2.ticket+ " " +total_avg2);
        System.out.println("student3 is "+" "+ st3.Name+" "+st3.Surname+" "+st3.ticket+ " " +total_avg3);



    }
}
