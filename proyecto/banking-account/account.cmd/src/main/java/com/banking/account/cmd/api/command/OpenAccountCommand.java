package com.banking.account.cmd.api.command;

import com.banking.account.common.dto.AccountType;
import com.banking.cqrs.core.comands.BaseCommand;
import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    //Nombre persona a guardar
    private String accountHolder;

    //Esta dependencia viende de account.common,
    //para poder hacer referencia a ella se debe de
    //importar en el pom de este proyecto
    private AccountType accountType;
    private Double openingBalance;
}
