package com.banking.cqrs.core.infraestructure;

import com.banking.cqrs.core.comands.BaseCommand;
import com.banking.cqrs.core.comands.CommandHandlerMethod;

//Esta interfaz sera la declaracion del mediator en la implementacion
//de patron mediator, esta registrara los handlers y enviara los
//objetos commands

//Paso 1: Se crea la interfaz para manejo de mediator,
//posterior se crea la implementacion en BA/account.cmd/.../infraestructure/AccountCommandDispatcher

//Paso 2: BA/account.cmd/.../infraestructure/AccountCommandDispatcher
public interface CommandDispatcher {
    <T extends BaseCommand> void registerHandler(Class<T> type, CommandHandlerMethod<T> handler);
    void send(BaseCommand command);

}
