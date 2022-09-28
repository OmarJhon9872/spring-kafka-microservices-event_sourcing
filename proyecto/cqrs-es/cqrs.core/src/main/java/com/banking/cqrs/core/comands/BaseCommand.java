package com.banking.cqrs.core.comands;

import com.banking.cqrs.core.messages.Message;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//Se agregara a la lista de dependencias en BA/account.cmd
//para poder usar esta clase dentro del proyecto BA
public abstract class BaseCommand extends Message {
    public BaseCommand(String id){
        //Para enviar el id a la clase base
        super(id);
    }
}
