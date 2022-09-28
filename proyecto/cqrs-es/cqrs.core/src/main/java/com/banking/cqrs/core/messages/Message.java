package com.banking.cqrs.core.messages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
//Genera constructor sin parametros
@NoArgsConstructor
//Genera constructor para recibir id
@AllArgsConstructor
@SuperBuilder
public abstract class Message {

    private String id;

}
