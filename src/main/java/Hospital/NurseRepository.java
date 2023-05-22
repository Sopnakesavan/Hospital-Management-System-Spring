package Hospital;


import java.util.List;
import java.util.HashMap;
 //service class - class to manipulate the data,example giving the base cases.
//repository class - is basically a data access object (DAO).

// this is the class to store the database - hashMap, or sql
//here i have used hashMap;

import org.springframework.stereotype.Repository;

@Repository
public class NurseRepository {
    HashMap<Integer, Nurse> nurseDb = new HashMap<>();

    public String addNurse(Nurse nurse) {
        int key = nurse.getNurseId();
        nurseDb.put(key, nurse);
        return "Nurse added successfully";
    }

    public List<Nurse> getAllNurses() {
        return nurseDb.values().stream().toList();

    }
}


