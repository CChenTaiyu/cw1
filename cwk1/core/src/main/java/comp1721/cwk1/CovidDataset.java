package comp1721.cwk1;
import java.time.LocalDate;

public class CovidDataset {
	public CovidDataset() {
		
	}
  // TODO: Write stub for size()
	int size() {
		return 0;
}
  // TODO: Write stub for getRecord()
	CaseRecord getRecord(int index) {
		return null;
	}
  // TODO: Write stub for addRecord()
	void addRecord(CaseRecord rec) {
	}
  // TODO: Write stub for dailyCasesOn()
	CaseRecord dailyCasesOn(LocalDate day) {
		return null;
	}
  // TODO: Write stub for readDailyCases()
	void readDailyCases(String filename) {
	}
  // TODO: Write stub for writeActiveCases()
	void writeActiveCases(String filename) {
	}
	public static void main(String[] args){
		CovidDataset ref[] = new CovidDataset[100];
		for(int i=0;i<ref.length;i++) 
		{
			ref[i] = new CovidDataset();
		}
	}
}
