package com.pappe.summer_internship.contract;

import java.util.List;

public interface ContractService {

    Contract saveContract(Contract contract);

    List<Contract> findAllContracts();

    Contract findContractById(Integer id);

    Contract updateContract(Integer id, Contract contract);

    void deleteContractById(Integer id);
}
