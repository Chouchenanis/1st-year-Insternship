package com.pappe.summer_internship.contract;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryContractDao {

    private List<Contract> contracts = new ArrayList<>();

    public Contract save(Contract contract) {
        contracts.add(contract);
        return contract;
    }

    public List<Contract> findAllContracts() {
        return contracts;
    }

    public Contract findContractById(Integer id) {
        return contracts.stream()
                .filter(contract -> contract.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Contract updateContract(Integer id, Contract contract) {
        var contractIndex = IntStream.range(0, contracts.size())
                .filter(i -> contracts.get(i).getId().equals(id))
                .findFirst()
                .orElse(-1);
        if (contractIndex > -1) {
            contract.setId(id);
            Contract updatedContract = contracts.get(contractIndex);
            updatedContract.setActivated(contract.getActivated());
            updatedContract.setProductId(contract.getProductId());
            updatedContract.setDealerId(contract.getDealerId());
            updatedContract.setCustomerId(contract.getCustomerId());
            updatedContract.setValidFrom(contract.getValidFrom());
            updatedContract.setType(contract.getType());
            updatedContract.setStatusValid(contract.isStatusValid());
            updatedContract.setExpiryDate(contract.getExpiryDate());
            updatedContract.setDescription(contract.getDescription());
            updatedContract.setStatus(contract.getStatus());
            return updatedContract;
        }
        return null;
    }

    public void deleteContractById(Integer id) {
        var contract = findContractById(id);
        if (contract != null) {
            contracts.remove(contract);
        }
    }
}
