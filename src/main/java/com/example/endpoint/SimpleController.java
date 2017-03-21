package com.example.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class SimpleController {

    @RequestMapping(method = RequestMethod.GET)
    public Map<String, String> test() {
        Map<String, String> result = new LinkedHashMap<>();
        result.put("a", "1");
        return result;
    }
}
