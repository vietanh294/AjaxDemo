package APIFullstack.websachcu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("demo")
public class DemoController {
    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "demo/demo";
    }

}
