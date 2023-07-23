package ua.hillel.lesson10_1;

public class PatientTest {
    public static void main(String[] args) {
        new Patient().setPatientStatus(PatientStatus.NON_PATIENT);
        new Patient().setPatientStatus(123);
    }
}
