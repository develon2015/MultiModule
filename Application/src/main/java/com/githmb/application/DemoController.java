package com.githmb.application;

import develon.spring.Init;
import develon.spring.process.Shell;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/sh")
    public String sh(@RequestParam String cmd) {
        return new Shell().ready().run(cmd, 2000, 100);
    }
}
