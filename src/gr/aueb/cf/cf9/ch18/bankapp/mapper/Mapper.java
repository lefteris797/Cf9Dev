package gr.aueb.cf.cf9.ch18.bankapp.mapper;

import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.ch18.bankapp.dto.AccountReadOnlyDto;
import gr.aueb.cf.cf9.ch18.bankapp.model.Account;

public class Mapper {

    /**
     * No instancesof this class should be avaiable
     *
     */

    public Mapper(){

    }

    public static Account mapToModelEntity(AccountInsertDTO dto){
        return new Account(dto.iban(), dto.balance());
    }
    public static AccountReadOnlyDto mapTOReadOnlyDTO (Account account){
        return new AccountReadOnlyDto(account.getIban(), account.getBalance());
    }


}
