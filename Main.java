import java.util.ArrayList;
import java.util.Comparator;

class sortRoll implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.rollno > s2.rollno){
			return 0;
		}
		else {
			return 1;
		}
	}
	
}

class sorter {
	public ArrayList<Student> mergeSort(ArrayList<Student> s1, ArrayList<Student> s2) {
		if(s1.size() != 1) {
			ArrayList<Student> news1 = (ArrayList<Student>) s1.subList(0, s1.size()/2);
			ArrayList<Student> news2 = (ArrayList<Student>) s1.subList(s1.size()/2, s1.size());
			return mergeSort(news1, news2);
		}
		if(s2.size() != 1) {
			ArrayList<Student> news1 = (ArrayList<Student>) s2.subList(0, s2.size()/2);
			ArrayList<Student> news2 = (ArrayList<Student>) s2.subList(s2.size()/2, s2.size());
			return mergeSort(news1, news2);
		}
		sortRoll s = new sortRoll();
		ArrayList<Student> sorted = new ArrayList<Student>();
		if(s.compare(s1.get(0), s2.get(0)) == 0) {
			sorted.add(s2.get(0));
			sorted.add(s1.get(0));
		}
		else {
			sorted.add(s1.get(0));
			sorted.add(s2.get(0));
		}
		return sorted;
		
	}
}
