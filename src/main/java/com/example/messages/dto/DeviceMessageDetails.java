package com.example.messages.dto;

import java.util.List;

import com.example.messages.document.DeviceMessage;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DeviceMessageDetails {

    private String tag;

    private String topic;

    private String createdDate;

    private List<String> keys;

    private List<String> values;

    public void setEntity(DeviceMessage message){
        tag = message.getTag();
        topic = message.getTopic();
        createdDate = message.getCreatedDate();
        keys = message.getKeys();
        values = message.getValues();
    }
    
}
