/**
 * FileName: TestController
 * Author: WP
 * Date: 2019/3/24 17:11
 * Description:
 * History:
 **/
package cn.wp.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class TestController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "helloWorld";
    }
}
