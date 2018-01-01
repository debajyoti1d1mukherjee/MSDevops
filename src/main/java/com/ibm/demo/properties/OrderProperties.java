package com.ibm.demo.properties;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
 

@ConfigurationProperties(prefix = "OrderService")
@Component
public class OrderProperties {
	private String OrderServiceUrl;
    private String OrderServicePort;
 
    @Override
    public String toString() {
 
        return "OrderServiceUrl: "+ this.OrderServiceUrl+"\n"
                + "OrderServicePort: "+this.OrderServicePort+"\n";
    }
 
    public String getResourceUrl() {
        return OrderServiceUrl;
    }
    public void setResourceUrl(String OrderServiceUrl) {
        this.OrderServiceUrl = OrderServiceUrl;
    }
    public String getResourcePort() {
        return OrderServicePort;
    }
    public void setResourcePort(String OrderServicePort) {
        this.OrderServicePort = OrderServicePort;
    }
}