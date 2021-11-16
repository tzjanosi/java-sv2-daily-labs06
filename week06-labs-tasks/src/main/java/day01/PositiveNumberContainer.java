package day01;

import java.util.ArrayList;
import java.util.List;

public class PositiveNumberContainer {
    List<Double> positiveNumberList = new ArrayList<>();

    public boolean add(Double inputDouble){
        if(inputDouble>0){
            positiveNumberList.add(inputDouble);
            return true;
        }
        return false;
    }

    public List<Double> getPositiveNumberList() {
        return positiveNumberList;
    }
}
