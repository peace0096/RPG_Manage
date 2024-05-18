package com.kbw0226.managerpg.global.entitiy;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Setter
@Getter
public abstract class UuidIdentifiedEntity {
    @Id
    private UUID id;

}
