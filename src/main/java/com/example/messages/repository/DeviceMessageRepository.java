package com.example.messages.repository;

import com.example.messages.document.DeviceMessage;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DeviceMessageRepository  extends MongoRepository<DeviceMessage, String>{  

    Long deleteMessagesByTag(String tag);

}
