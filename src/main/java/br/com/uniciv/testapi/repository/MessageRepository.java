package br.com.uniciv.testapi.repository;

import br.com.uniciv.testapi.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MessageRepository  extends MongoRepository<Message, UUID> {
}
