public class Main {
    public static void main(String[] args) {
        //Teacher(String firstName, String lastName, String email,
        //                   String username, String password, int absences, int ptoDays)
        Teacher gojo = new Teacher("Gojo", "Satoru", "gojoSatoru6@gmail.com", "SGojo",
                "jj" ,9 , 10 );

        Admin oracle = new Admin("Futaba", "Sakura", "M3DJ3D@merlin.io", "Oracle",
                "991X.G1H031!R(2569013", 0, 20);
        System.out.println(gojo.getFirstName() + " has been absent for " + gojo.getAbsences());
        System.out.println(oracle.getFirstName() + " has been absent for " + oracle.getAbsences());
        gojo.absentDays(0);
        oracle.absentDays(4);
        System.out.println(gojo.getFirstName() + " has been absent for " + gojo.getAbsences());
        System.out.println(oracle.getFirstName() + " has been absent for " + oracle.getAbsences());



    }
}
