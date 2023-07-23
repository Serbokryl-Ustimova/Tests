package ua.hillel.lesson10_1;

public class Patient {
    private final static LoggerTry MY_LOGGER = new LoggerTry();

    public void setPatientStatus(int status) {
//        MY_LOGGER.warn(LoggerTry.LogLevel.WARN);

    }

    public void setPatientStatus(PatientStatus status) {
        MY_LOGGER.info(LoggerTry.LogLevel.INFO);
        System.out.println(status.getPatientStatus()); //получим переопределнное значение в перечеслении из enum
        System.out.println(status);  //получим значение в enum


    }
}
