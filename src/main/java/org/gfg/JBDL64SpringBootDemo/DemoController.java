package org.gfg.JBDL64SpringBootDemo;

import org.eclipse.jetty.ee10.servlets.IncludeExcludeBasedFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    private static final Logger LOG = LoggerFactory.getLogger(DemoController.class);

    // Get mapping for API.--> get some data from server---POST for insert some data
    //server will map to the path provided
    @GetMapping("/test/{name}")
    //server will not understand so we use ResponseBody-->it will serialize(object convert to JSON) and passed into HTTPResponse Object
    @ResponseBody
    public String getTest(@PathVariable("name") String name){ //@PathVariable to add some parameter in GET method with path
         LOG.error("this is error");
        LOG.debug("this debug error");
        LOG.trace("this trace error");
        return name;
    }

    @GetMapping("/test2")
    //server will not understand so we use ResponseBody
    @ResponseBody
    public String getTest2(@RequestParam("name") String name){ //@RequestParam to add some parameter in GET method with request
        //we need to pass like test2?name=ujjwal
        return name;
    }

//    @PostMapping("/postmapping")
//    @PutMapping("/putmapping")

    //------------------------- MVC-----------------------
    @GetMapping("/dynamic-content")
    public ModelAndView getData(){
        ModelAndView modelAndView=new ModelAndView("dynamicData.html");
        modelAndView.getModelMap().addAttribute("name","leaving");
        return modelAndView;
    }
}
