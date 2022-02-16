package com.eryi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZouJiaNan
 * @version 1.0
 * @description
 * @date 2022/2/16 22:36
 */
@RestController
public class testController {
    @RequestMapping("test")
    public void test(){
        try {
            ClashPreventUtils.check();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
