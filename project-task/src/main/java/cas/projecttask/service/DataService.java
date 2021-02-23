package cas.projecttask.service;

import cas.projecttask.entity.Data;
import cas.projecttask.peyload.ReqData;
import cas.projecttask.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DataService {

    @Autowired
    private DataRepository dataRepository;

    public ResponseEntity<?> addData(ReqData reqData){
        Data data = new Data();
        data.setSummary(reqData.getSummary());
        data.setAcceptanceCriteria(reqData.getAcceptanceCriteria());
        data.setStatus(reqData.getStatus());
        dataRepository.save(data);
        return ResponseEntity.ok("data saved");
    }

    public ResponseEntity<?> getAllData(){
        return ResponseEntity.ok(dataRepository.findAll());
    }

    public ResponseEntity<?> editData(ReqData reqData, Integer id){
        Optional<Data> byId = dataRepository.findById(id);
        if (byId.isPresent()){
            Data data = byId.get();
            data.setSummary(reqData.getSummary());
            data.setAcceptanceCriteria(reqData.getAcceptanceCriteria());
            data.setStatus(reqData.getStatus());
            dataRepository.save(data);
            return ResponseEntity.ok("data saved");
        }
        return ResponseEntity.ok("Not found id");
    }
    public ResponseEntity<?> deleteAllData(Integer id){
        dataRepository.deleteById(id);
        return ResponseEntity.ok("Data deleted");
    }

    public ResponseEntity<?> getData(Integer id){
        Optional<Data> byId = dataRepository.findById(id);
        if (byId.isPresent()){
            Data data = byId.get();
            return ResponseEntity.ok(data);
        }else {
            return ResponseEntity.ok("Id not found");
        }
    }
}
