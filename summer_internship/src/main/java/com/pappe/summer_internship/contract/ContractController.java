package com.pappe.summer_internship.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contracts")
public class ContractController {

    private final ContractService contractService;

    @Autowired
    public ContractController(@Qualifier("DBContractService") ContractService contractService) {
        this.contractService = contractService;
    }

    @PostMapping("/saveContract")
    public Contract saveContract(@RequestBody Contract contract){
        return contractService.saveContract(contract);
    }

    @GetMapping("/findAllContracts")
    public List<Contract> findAllContracts(){
        return contractService.findAllContracts();
    }

    @GetMapping("/{id}")
    public Contract findContractById(@PathVariable Integer id){
        return contractService.findContractById(id);
    }

    @PutMapping("/updateContract/{id}")
    public Contract updateContract(@PathVariable Integer id, @RequestBody Contract contract){
        return contractService.updateContract(id, contract);
    }

    @DeleteMapping("/deleteContract/{id}")
    public void deleteContractById(@PathVariable Integer id){
        contractService.deleteContractById(id);
    }
}
