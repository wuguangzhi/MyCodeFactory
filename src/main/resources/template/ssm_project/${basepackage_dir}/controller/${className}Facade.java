<#include "/java_copyright.include">
<#assign className = table.className>   
<#assign classNameLower = className?uncap_first> 
package ${basepackage}.controller;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ${basepackage}.service.*;
<#include "/java_imports.include">

@RequestMapping(value = "/${classNameLower}Facade")
@RestController
public class ${className}Facade {
	@Autowired
	protected I${className}Service service;
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public Map<String,Object> listAllStadiums() throws Exception{
		Map<String,Object> result = new TreeMap<String,Object>();
		List<${className}> list = service.findAll(null);
		result.put("success",true);
		result.put("data",list);
		return result;
	}
	
	@RequestMapping(value = "/findById/{id}", method = RequestMethod.GET)
	public Map<String,Object> findById(@PathVariable long id) throws Exception{
		Map<String,Object> result = new TreeMap<String,Object>();
		${className} ${classNameLower} = service.findById(id);
		result.put("success",true);
		result.put("data",${classNameLower});
		return result;
	}
	
	
	@RequestMapping(value = "/deleteById", method = RequestMethod.POST)
	public Map<String,Object> deleteById(@RequestParam(value = "ids", required = true) long ids) throws Exception{
		Map<String,Object> result = new TreeMap<String,Object>();
		service.deleteById(ids);
		result.put("success",true);
		result.put("data",null);
		return result;
	}
}

