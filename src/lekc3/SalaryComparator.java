package lekc3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Worker_Comparable> {

    @Override
    public int compare(Worker_Comparable o1, Worker_Comparable o2) {
        return Integer.compare(o1.salary, o2.salary);
    }
}
