package com.activiti.extension.api;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tapan Thakkar
 *         Created on 6/27/19.
 */
@RestController
@RequestMapping(value = "/enterprise/demo", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = { "demo" }, description = "Demo API")
public class DemoAPI {

    @ApiOperation(value = "Demo API")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String sampleTestApi() {
        return "Demo API Response";
    }

}
