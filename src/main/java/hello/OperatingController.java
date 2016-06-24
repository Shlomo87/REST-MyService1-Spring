package main.java.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by klevshin on 6/24/2016.
 */

@RestController
public class OperatingController {
    @RequestMapping("/operating")
    public Operating operating(@RequestParam( value = "operation") String operation, @RequestParam( value = "value1") int value1,
                               @RequestParam( value = "value2") int value2) {
        return new Operating(operation, value1, value2);
    }


}