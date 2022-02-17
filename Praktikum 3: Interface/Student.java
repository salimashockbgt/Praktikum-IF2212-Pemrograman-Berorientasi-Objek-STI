public interface Student {
    public long getStudentID();
    public double getOverallGPA();
    public double getGrade();
    public String getMajor();
    public boolean applyMajor(String mjr);
    public void applyScholarship(String sch);
    public void promoteGrade(double gr);
    public void payTuition(boolean b, String s);
}
