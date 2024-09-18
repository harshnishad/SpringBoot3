package org.harshnishad.harshnishad;

import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
   // kisi bhi class ko call karne ke liye function banana hota hai but hume isme nhi banana with help of ioc->inversion of control
   //servlet ke pass req ja rhi hai and polish hoke rest ke pas arhi hai

    @RequestMapping("m")
    public static String myMethod(){
        return "<h1>Harsh Nishad</h1>"; //json /xml/text
    }
    @PostMapping("process-form")
    public static String getData(@RequestParam int num1,@RequestParam int num2){
        int res = num1+num2;
        return "Result = "+res;
    }
}
