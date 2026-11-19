public class StudentReportGenerator {
    public static final int DEFAULT_YEAR = 2026;
    public static void generateReport() {
        String reportTitle = "Student report. Year: " + DEFAULT_YEAR;
        System.out.println(reportTitle);
    }
    public static void main(String[] args) {
        generateReport();
    }
}