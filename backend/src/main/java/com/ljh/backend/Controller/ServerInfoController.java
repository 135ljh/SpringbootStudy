package com.ljh.backend.Controller;

import com.ljh.backend.Dto.ServerInfoDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerInfoController {
    @Value("${message}")
    private String msg;

    @GetMapping("/server_info")
    ServerInfoDto serverInfo() {
        ServerInfoDto info = new ServerInfoDto();
        info.setMessage(msg);
        return info;
    }

}
