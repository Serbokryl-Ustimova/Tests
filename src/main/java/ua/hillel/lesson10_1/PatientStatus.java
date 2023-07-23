package ua.hillel.lesson10_1;

public enum PatientStatus {
    NEW("New"),   // ("New") то, что храниться за значением NEW
    ACTIVE("Active"),
    NON_PATIENT("Non-Patient"),
    DUPLICATE("Duplicate");

    // поле, которое будет контейнером для значения String status из конструктора
    private String status;

// переопределяем дефолтный приватный конструктор

    private PatientStatus(String status) {
        this.status = status;
    }

// так как поле String status приватное, для него нужен getter

    public String getPatientStatus() {
        return this.status;
    }

}


