package com.zql.testFun.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//标注restController的返回就是json格式

import com.zql.testFun.Entity.SystemUser;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping(value="sysUser/v1")
public class TestController {
	
	//RequestMethod.GET POST PUT DELETE 对应相应的方法 
	@ApiOperation(value="获取系统用户信息",notes="可以根据id获取,不传id的话就默认0000")
	@ApiImplicitParam(name="requestId" ,value="xitrong",required=false,dataType="String")
	@RequestMapping(value={"/getUser/{pid}"},method=RequestMethod.GET)
	public SystemUser getSystemUser(@PathVariable String pid,@RequestParam(value="requestId",defaultValue="0000",required=false) String requestId){
		SystemUser s = new SystemUser();
		s.setLoginId("000111");
		s.setUserName("chenqianyuan");
		return s;
	}
}
