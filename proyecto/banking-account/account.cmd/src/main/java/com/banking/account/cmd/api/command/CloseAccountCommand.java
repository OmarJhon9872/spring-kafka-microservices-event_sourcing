package com.banking.account.cmd.api.command;

import com.banking.cqrs.core.comands.BaseCommand;

public class CloseAccountCommand extends BaseCommand {
    //Mandamos el id de la cuenta para identificarla
    public CloseAccountCommand(String id){
        super(id);
    }
}
