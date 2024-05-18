package com.kbw0226.managerpg.global.repository;

import com.kbw0226.managerpg.global.entitiy.UuidIdentifiedEntity;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.mongodb.repository.support.SimpleMongoRepository;

import java.util.UUID;

public class CustomMongoRespositoryImpl<T extends UuidIdentifiedEntity>
        extends SimpleMongoRepository<T, UUID> implements CustomMongoRepository<T> {

    public CustomMongoRespositoryImpl(MongoEntityInformation<T, UUID> metadata, MongoOperations mongoOperations) {
        super(metadata, mongoOperations);
    }

    @Override
    public <S extends T> S save(S entity) {
        generateId(entity);
        return super.save(entity);
    }

    private void generateId(T entity) {
        entity.setId(UUID.randomUUID());
    }
}
