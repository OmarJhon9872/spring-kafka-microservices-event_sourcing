package com.banking.cqrs.core.comands;

//Es una interfaz que solo dispone de un metodo abstracto para implementar
@FunctionalInterface
public interface CommandHandlerMethod<T extends BaseCommand>{
    void handle(T command);
}
