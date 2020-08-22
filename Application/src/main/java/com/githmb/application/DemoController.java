package com.githmb.application;

import develon.spring.Init;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

class DemoMessage {
    public String library, version, author;

    public DemoMessage(String version, String authorName) {
        this.library = "MySpringBoot";
        this.version = version;
        this.author = authorName;
    }
}

@RestController
public class DemoController {
    private Init mySpringBoot = new Init();

    @RequestMapping("/**")
    public DemoMessage test() {
        return new DemoMessage(mySpringBoot.getVersion(), mySpringBoot.getAuthorName());
    }
}
