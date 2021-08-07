package com.example.messages.document;
import java.util.List;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document
public class DeviceMessage {
    
    public String tag;

    public String topic;

    @CreatedDate
    private String createdDate;

    private List<String> keys;

    private List<String> values;


}
