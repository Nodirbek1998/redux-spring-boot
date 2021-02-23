package cas.projecttask.controller;

import cas.projecttask.peyload.ReqData;
import cas.projecttask.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/api/data")
@CrossOrigin("*")
public class DataController {

    @Autowired
    private DataService dataService;

    @PostMapping
    public HttpEntity<?> addData(@RequestBody @Valid ReqData reqData){
        ResponseEntity<?> responseEntity = dataService.addData(reqData);
        return ResponseEntity.ok(responseEntity);
    }
    @GetMapping("/{id}")
    public HttpEntity<?> getData(@PathVariable Integer id){
        ResponseEntity<?> data = dataService.getData(id);
        return ResponseEntity.ok(data);
    }

    @GetMapping
    public HttpEntity<?> getAllData(){
        return ResponseEntity.ok(dataService.getAllData());
    }

    @PutMapping("/{id}")
    public HttpEntity<?> editData(@RequestBody ReqData reqData, @PathVariable Integer id){
       return ResponseEntity.ok( dataService.editData(reqData, id));
    }
    @DeleteMapping("/{id}")
    public HttpEntity<?> deleteData(@PathVariable Integer id){
        return ResponseEntity.ok(dataService.deleteAllData(id));
    }
}
