package com.pappe.summer_internship.contract;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryContractService implements ContractService {

    private final InMemoryContractDao contractDao;

    public InMemoryContractService(InMemoryContractDao contractDao) {
        this.contractDao = contractDao;
    }

    @Override
    public Contract saveContract(Contract contract) {
        return contractDao.save(contract);
    }

    @Override
    public List<Contract> findAllContracts() {
        return contractDao.findAllContracts();
    }

    @Override
    public Contract findContractById(Integer id) {
        return contractDao.findContractById(id);
    }

    @Override
    public Contract updateContract(Integer id, Contract contract) {
        return contractDao.updateContract(id, contract);
    }

    @Override
    public void deleteContractById(Integer id) {
        contractDao.deleteContractById(id);
    }
}
