package com.ljh.backend.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerInfoController {
    @Value("${message}")
    private String msg;
    @GetMapping("/server_info")
    String serverInfo() {
        return "{\"message\": \"" + msg + "\"}";
    }

}
