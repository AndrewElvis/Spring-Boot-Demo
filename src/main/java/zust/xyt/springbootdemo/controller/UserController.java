package zust.xyt.springbootdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zust.xyt.springbootdemo.model.dto.UserDto;

import java.util.HashSet;

/**
 * @author AndrewElvis
 * @date 2020-03-23-15:24
 */
@Api(tags = "用户管理模块接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation("获取用户")
    @RequestMapping("/{id}")
    public UserDto getUser(@ApiParam("用户ID") @PathVariable Integer id) {
        return new UserDto(id, "谢源涛");
    }

    /*@ApiOperation("用户名字")
    @RequestMapping("/{name}")
    public List<UserDto> getAllUser(@PathVariable String name) {
        return null;
    }*/
}
