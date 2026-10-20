package PACKAGE_NAME.lms.model;

public class DVD extends Libaryitem {
    private int durationMinutes;
    public DVD(String id, String title, int durationMinutes) {
        // TODO: call super(...) then store durationMinutes
    }
    // TODO: getDurationMinutes()

    public double calculateLateFee(int daysLate) {
        // TODO: DVDs cost 25.0 per day late
        return 0;
    }
}
