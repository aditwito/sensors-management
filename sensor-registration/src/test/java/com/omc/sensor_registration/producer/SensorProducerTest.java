package com.omc.sensor_registration.producer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.test.context.EmbeddedKafka;

import com.omc.sensor_registration.datatypes.Face;
import com.omc.sensor_registration.datatypes.SensorData;


@SpringBootTest
@EmbeddedKafka(partitions = 1, topics = {"sensor-topic"})
public class SensorProducerTest {

//	@Autowired
//    private KafkaTemplate<String, SensorData> kafkaTemplate;
//	
//	@Autowired
//    private SimpleSensorDataHandler sensorDataHandler;
//
//	
//	@Test
//    public void testProduceAndHandleSensorData() {
//        SensorData sensorData = new SensorData(); 
//        sensorData.setFace(Face.EAST);
//        sensorData.setSensorId(123);
//        sensorData.setTemperature(23.5);
//        sensorData.setTimestamp(System.currentTimeMillis());
//      
//        kafkaTemplate.send("sensor-topic", sensorData);
//
//        sensorDataHandler.handleSensorData(sensorData);
//
//        assertEquals(1, sensorDataHandler.getProcessedDataQueue().size());
//        assertEquals(sensorData, sensorDataHandler.getProcessedDataQueue().poll());
//    }
}
