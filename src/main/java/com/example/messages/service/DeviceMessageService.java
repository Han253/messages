package com.example.messages.service;

import java.util.List;

import com.example.messages.dto.DeviceMessageDetails;
import com.example.messages.dto.DeviceMessageForm;

public interface DeviceMessageService {

    /**
     * 
     * Return list of devices tag messsages
     * @return {@link DeviceMesssageDetail}
     */
    List<DeviceMessageDetails> findAll();

    /**
     * 
     * Saves a new device message in mongodb
     */
    DeviceMessageDetails create(DeviceMessageForm formData);

    /**
     * 
     */
    void deleteByDeviceTag(String tag);
    
}
