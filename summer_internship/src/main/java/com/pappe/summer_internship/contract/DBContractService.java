package com.pappe.summer_internship.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("DBContractService")
public class DBContractService implements ContractService {

    private ContractRepository contractRepository;

    @Autowired
    public DBContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public Contract saveContract(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public List<Contract> findAllContracts() {
        return contractRepository.findAll();
    }

    @Override
    public Contract findContractById(Integer id) {
        Optional<Contract> optionalContract = contractRepository.findById(id);
        return optionalContract.orElseThrow(() -> new RuntimeException("Contract not found with id " + id));
    }

    @Override
    public Contract updateContract(Integer id, Contract contract) {
        if (!contractRepository.existsById(id)) {
            throw new RuntimeException("Contract not found with id " + contract.getId());
        }
        contract.setId(id);
        return contractRepository.save(contract);
    }

    @Override
    public void deleteContractById(Integer id) {
        if (!contractRepository.existsById(id)) {
            throw new RuntimeException("Contract not found with id " + id);
        }
        contractRepository.deleteById(id);
    }
}
