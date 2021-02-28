package br.com.uniciv.testapi.controller;

import br.com.uniciv.testapi.model.Message;
import br.com.uniciv.testapi.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class MessageController {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageController(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Message> getAll(){

        return messageRepository.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Message message){
        message.setId(UUID.randomUUID());

        messageRepository.save(message);
    }
}
