package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    void main(){

        List<?> myObjs = new ArrayList<Object>();
        List<Integer> myNumbers = new ArrayList<Integer>();
        myObjs = myNumbers;

    }
}
