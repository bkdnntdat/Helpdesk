package com.backend.helpdesk.controller;

import com.backend.helpdesk.DTO.RequestTypeDTO;
import com.backend.helpdesk.service.RequestTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/request-types")
@CrossOrigin(origins = "http://localhost:4200")
public class RequestTypeController {
    @Autowired
    private RequestTypeService requestTypeService;

    @GetMapping("/{id}")
    public RequestTypeDTO getRequestTypeById(@PathVariable int id){
        return requestTypeService.getRequestTypeById(id);
    }

    @GetMapping
    public List<RequestTypeDTO> getAllRequestType(){
        return requestTypeService.getAllRequestType();
    }

    @Secured("ROLE_ADMIN")
    @PostMapping
    public RequestTypeDTO addRequestType(@RequestBody String nameRequestType){
        return requestTypeService.addRequestType(nameRequestType);
    }

    @Secured("ROLE_ADMIN")
    @PutMapping
    public List<RequestTypeDTO> updateRequestType(@RequestBody RequestTypeDTO requestType){
        return requestTypeService.updateRequestType(requestType);
    }

    @Secured("ROLE_ADMIN")
    @DeleteMapping("/{id}")
    public void deleteRequestType(@PathVariable int id){
        requestTypeService.deleteRequestType(id);
    }
}
