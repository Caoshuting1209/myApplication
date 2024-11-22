package com.shuting.myapplication.Controller;

import com.shuting.myapplication.Common.Constants;
import com.shuting.myapplication.Common.Result;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Tag(name = "test module", description = "test API")
public class TestController {
    @GetMapping("/test")
    @Operation(summary = "Get all users")
    public Result<?> test(@RequestParam Integer id) {
        if(id == 1){
            return new Result<>("hello world", Constants.SUCCESS);
        }else{
            return new Result<>(Constants.ERROR, "param error");
        }
    }
}
//http://localhost:8801/swagger-ui/index.html#/
