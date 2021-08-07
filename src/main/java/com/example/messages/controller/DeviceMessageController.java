package com.example.messages.controller;

import java.util.List;

import javax.validation.Valid;

import com.example.messages.dto.DeviceMessageDetails;
import com.example.messages.dto.DeviceMessageForm;
import com.example.messages.service.DeviceMessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("device")
public class DeviceMessageController {

    @Autowired
    private DeviceMessageService service;

    @GetMapping
    public List<DeviceMessageDetails> list(){
        return service.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public DeviceMessageDetails create(@RequestBody @Valid DeviceMessageForm data){
        return service.create(data);
    }

    @DeleteMapping("tag/{tag}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public boolean deleteMessagesByTag(@PathVariable String tag){
        service.deleteByDeviceTag(tag);
        return true;
    }






    
}
