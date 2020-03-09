package com.udemycourses.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import springfox.documentation.service.VendorExtension;

@RestController
public class FilteringController {

	// show all fields
	@GetMapping("/filtering")
	public SomeBean retrieveSomeBean() {
		return new SomeBean("Field1", "Field2", "Field3");
	}

	// show all field1 and field2
	@GetMapping("/filtering-1")
	public MappingJacksonValue retrieveSomeBean1() {
		SomeBean someBean = new SomeBean("Field1", "Field2", "Field3");

		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");

		FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter);

		MappingJacksonValue mapping = new MappingJacksonValue(someBean);

		mapping.setFilters(filters);

		return mapping;
	}

	// show all field2 and field3
	@GetMapping("/filtering-2")
	public MappingJacksonValue retrieveSomeBean2() {
		List<SomeBean> list = Arrays.asList(new SomeBean("Field11", "Field12", "Field13"),
				new SomeBean("Field21", "Field22", "Field23"));

		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");

		FilterProvider filters = new SimpleFilterProvider().addFilter("someBeanFilter", filter);

		MappingJacksonValue mapping = new MappingJacksonValue(list);

		mapping.setFilters(filters);

		return mapping;
	}

}
