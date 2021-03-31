package comp1721.cwk1;
import java.time.LocalDate;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class CovidDataset {
	private static CaseRecord oneset[] = new CaseRecord[100];
	private int count = 0;
	private CaseRecord onecase = new CaseRecord();
	private int countt;
	private int a;
	public CovidDataset() {
	}
  // TODO: Write stub for size()
	int size() {
		return count;
}
  // TODO: Write stub for getRecord()
	CaseRecord getRecord(int index) {
		if (index >= 0 && index <= count - 1)
		{
			for (int i = 0;i <= count;i++)
			{
				if (i == index)
				onecase = oneset[i];
			}
			return onecase;
		}
		else
		{
			throw new DatasetException("The index is invalid!");
		}
	}
  // TODO: Write stub for addRecord()
	void addRecord(CaseRecord rec) {
			for (int i = 0;i <= count;i++)
			{
				if (i == count)
				{
							oneset[i] = rec;
				}
			}
			count += 1;
}
  // TODO: Write stub for dailyCasesOn()
	CaseRecord dailyCasesOn(LocalDate day) {
		for (int i = 0;i <= count;)
		{
			if ((oneset[i].getDate()).equals(day))
			{
				onecase = oneset[i];
				break;
			}
			i++;
			if (i == count)
			{
				throw new DatasetException("There is no CaseRecord for the given date!");
			}
		}
		return onecase;
	}
  // TODO: Write stub for readDailyCases()
	void readDailyCases(String filename) throws NumberFormatException, IOException {
		count = 0;
		countt = 0;
		a = 0;
		String sr[] = null;
		String srd[] = null;
		String s;
		LocalDate date;
		BufferedReader fr = new BufferedReader(new FileReader(filename));
		while ((s = fr.readLine()) != null)
			{
				if (countt >= 1)
				{
				sr = s.split(",");
				if (sr.length < 4)
				{
					throw new DatasetException("A column is missing!");
				}
				srd = sr[0].split("-");
				date = LocalDate.of(Integer.parseInt(srd[0]), Integer.parseInt(srd[1]), Integer.parseInt(srd[2]));
				onecase = new CaseRecord(date, Integer.parseInt(sr[1]), Integer.parseInt(sr[2]), Integer.parseInt(sr[3]));
				addRecord(onecase);
				a += 1;
				}
				countt += 1;
			}
		fr.close();
	}
  // TODO: Write stub for writeActiveCases()
	void writeActiveCases(String filename) throws IOException {
		int staffnum = 0;
		int studentnum = 0;
		int othernum = 0;
		int day1 = 9;
		int day2 = 0;
		BufferedWriter fw = new BufferedWriter(new FileWriter(filename));
		fw.write("Date,");
		fw.write("Staff,");
		fw.write("Students,");
		fw.write("Other\n");
		for (int i = 0;i < size();i++)
		{
			if (day1 >= size())
			{
				throw new DatasetException("There is no enough number!");
			}
			staffnum += oneset[i].getStaffCases();
			studentnum += oneset[i].getStudentCases();
			othernum += oneset[i].getOtherCases();
			if (i == day1)
			{
				fw.write(oneset[i].getDate().toString() + ',');
				fw.write(Integer.toString(staffnum) + ',');
				fw.write(Integer.toString(studentnum) + ',');
				fw.write(Integer.toString(othernum) + "\n");
				fw.flush();
				day1 += 1;
				i = day2 - 1;
				day2 += 1;
				staffnum = 0;
				studentnum = 0;
				othernum = 0;
			}
		}
		fw.close();
	}
	public static void main(String[] args){
		for(int i=0;i<oneset.length;i++) 
		{
			oneset[i] = new CaseRecord();
		}
	}
}
