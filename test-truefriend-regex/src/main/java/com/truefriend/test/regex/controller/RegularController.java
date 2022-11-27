package com.truefriend.test.regex.controller;


import com.truefriend.test.common.CommonSuccessResponse;
import com.truefriend.test.regex.service.RegularService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class RegularController {

    private final RegularService regularService;

    @GetMapping("/regex/{text}")
    public CommonSuccessResponse<String> regex(@PathVariable("text") String address){

        return new CommonSuccessResponse<>(regularService.convert(address));
    }

}
