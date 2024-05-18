package com.kbw0226.managerpg.domain.account.entitiy;

import com.kbw0226.managerpg.global.entitiy.BaseTime;
import com.kbw0226.managerpg.global.entitiy.UuidIdentifiedEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Builder
@Getter
@Document(collection = "accounts")
public class Account extends BaseTime {

    private String name;
}
