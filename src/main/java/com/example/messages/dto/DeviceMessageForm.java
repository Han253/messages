package com.example.messages.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.example.messages.document.DeviceMessage;


@Data
@NoArgsConstructor
public class DeviceMessageForm {

    @NotNull(message = "Tag doesn't be null.")
    @NotEmpty(message = "Tag doesn't be empty.")
    private String tag;

    @NotNull(message = "Tag doesn't be null.")
    @NotEmpty(message = "Tag doesn't be empty.")
    private String topic;

    private String created_date;

    private List<String> keys;

    private List<String> values;


    public DeviceMessage getEntity(){
        DeviceMessage message = new DeviceMessage();
        setEntity(message);
        return message;        
    }
    
    public void setEntity(DeviceMessage message){
        message.setTag(tag);
        message.setTopic(topic);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        message.setCreatedDate(dtf.format(now));

        message.setKeys(keys);
        message.setValues(values);
    }

}
