package com.example.messages.service;

import java.util.ArrayList;
import java.util.List;

import com.example.messages.document.DeviceMessage;
import com.example.messages.dto.DeviceMessageDetails;
import com.example.messages.dto.DeviceMessageForm;
import com.example.messages.repository.DeviceMessageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeviceMessageServiceImpl implements DeviceMessageService{

    @Autowired
    private DeviceMessageRepository repository;

    @Override
    public List<DeviceMessageDetails> findAll(){
        List<DeviceMessageDetails> list_details = new ArrayList<>();

        Iterable<DeviceMessage> list_messages = repository.findAll();

        list_messages.forEach(message->{
            DeviceMessageDetails details = new DeviceMessageDetails();
            details.setEntity(message);
            list_details.add(details);
        });
        

        return list_details;
    }

    @Override
    public DeviceMessageDetails create(DeviceMessageForm formData){

        DeviceMessage message = formData.getEntity();
        DeviceMessageDetails details = new DeviceMessageDetails();
        details.setEntity(repository.save(message));
        return details;
    }

    @Override
    public void deleteByDeviceTag(String tag){
        repository.deleteMessagesByTag(tag);
    }
    
}
