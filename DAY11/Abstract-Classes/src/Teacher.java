public class Teacher extends User {
    private int ptoDays = 10;
    public Teacher(String firstName, String lastName, String email,
                   String username, String password, int absences, int ptoDays) {
        super(firstName, lastName, email, username, password, absences);
        this.ptoDays = ptoDays;
    }


    public int getPtoDays() {
        return ptoDays;
    }

    public void setPtoDays(int ptoDays) {
        this.ptoDays = ptoDays;
    }

    @Override
    public void absentDays(int daysAbsent) {
        ptoDays -= daysAbsent;
       setAbsences(getAbsences() + daysAbsent);

        System.out.println(getFirstName() + " " + getLastName() + " has " + ptoDays
                + " left and has been absent for " + getAbsences() + " day.");

    }
}
