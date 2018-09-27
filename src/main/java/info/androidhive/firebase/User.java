package info.androidhive.firebase;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {

    private String name;
    private String designation;
    private String userid;
    private boolean canEditReport;
    private boolean canSubmitReport;
    private String unitNumber;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public boolean isCanEditReport() {
        return canEditReport;
    }

    public void setCanEditReport(boolean canEditReport) {
        this.canEditReport = canEditReport;
    }

    public boolean isCanSubmitReport() {
        return canSubmitReport;
    }

    public void setCanSubmitReport(boolean canSubmitReport) {
        this.canSubmitReport = canSubmitReport;
    }

    public String getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(String unitNumber) {
        this.unitNumber = unitNumber;
    }

    public String getUnitLocation() {
        return unitLocation;
    }

    public void setUnitLocation(String unitLocation) {
        this.unitLocation = unitLocation;
    }

    private String unitLocation;


    // Default constructor required for calls to
    // DataSnapshot.getValue(User.class)
    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
