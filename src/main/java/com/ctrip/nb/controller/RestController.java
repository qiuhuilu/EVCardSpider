package com.ctrip.nb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by qiuhl on 2017/5/8.
 */

@Controller
@RequestMapping("/list")
public class RestController {
    @RequestMapping(value = "/all/{shopid}", method = RequestMethod.POST)
    public String getCars(@PathVariable("shopid") int shopid){
        return "/list";
    }

    @RequestMapping(value = "/{vehicleNo}", method = RequestMethod.POST)
    public String getSuzhouCars(@PathVariable("vehicleNo") String vehicleNo){
        return "/list";
    }
}
