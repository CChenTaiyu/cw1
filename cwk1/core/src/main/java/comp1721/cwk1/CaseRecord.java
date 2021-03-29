package comp1721.cwk1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CaseRecord {
	private LocalDate date;
	private int staffCases;
	private int studentCases;
	private int otherCases;
	private LocalDate datee;
	private int staffnum;
	private int studentnum;
	private int othernum;
	private int totalnum;
	private String string;
  // TODO: Write stub for constructor
	public CaseRecord(){
	}
	public CaseRecord(LocalDate date, int staffCases, int studentCases, int otherCases)
	{
		this.datee = date;
		this.staffnum = staffCases;
		this.studentnum = studentCases;
		this.othernum = otherCases;
	}
  // TODO: Write stubs for four getter methods
	public LocalDate getDate(){
		return datee;
	}
	public int getStaffCases() {
		return staffnum;
	}
	public int getStudentCases() {
		return studentnum;
	}
	public int getOtherCases() {
		return othernum;
	}
  // TODO: Write stub for totalCases()
	public int totalCases() {
		totalnum = staffnum + studentnum + othernum;
		return totalnum;
	}
  // TODO: Write stub for toString()
	public String toString() {
		Integer.toString(staffnum);
		Integer.toString(studentnum);
		Integer.toString(othernum);
		string = datee + ": " + staffnum + "staff, " + studentnum + "students, " + othernum + "other";
		return string;
	}
	public static void main(String[] args){
		CaseRecord oneday = new CaseRecord();
		oneday.getDate();
		oneday.getStaffCases();
		oneday.getStudentCases();
		oneday.getOtherCases();
	}
}