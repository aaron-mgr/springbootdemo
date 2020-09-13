package com.aaron.springbootdemo.cotroller;

import com.aaron.springbootdemo.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class ControllerWithParameters {

    @Autowired
    private FirstService firstService;

    @RequestMapping(value = "/base/one/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getOne(@PathVariable("id") long id) {
        return "getOne with parameter:" + id;
    }

    @PostMapping(value = "/content/json", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public JsonOutput postResponseJsonContent(
            @RequestBody JsonInput requestInput) {
        System.out.println("request:" + requestInput);
        return new JsonOutput("JSON Content!" + firstService.processRequest(requestInput.getId(), requestInput.getName()));
    }

}
