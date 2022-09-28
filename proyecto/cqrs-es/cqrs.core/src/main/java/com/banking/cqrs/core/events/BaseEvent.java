package com.banking.cqrs.core.events;

import com.banking.cqrs.core.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class BaseEvent extends Message {
    //Cada que se vuelva a ejecutar el evento se
    //necesitara recrear el estado del aggregate
    private int version;
}
