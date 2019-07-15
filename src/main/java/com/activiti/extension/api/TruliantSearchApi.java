package com.activiti.extension.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Tapan on 5/23/18.
 */
@RestController
@RequestMapping(value = "/enterprise", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = { "truliant" }, description = "Truliant API")
public class TruliantSearchApi {

	private static final Logger logger = LoggerFactory.getLogger(TruliantSearchApi.class);

    @ApiOperation(value = "Query historic tasks")
	@RequestMapping(value = "/truliant/search/historic-tasks/query", method = RequestMethod.POST)
	public String search() {
		return "This is another Test API.";
	}
}