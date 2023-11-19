package space.haobin.controller;


import space.haobin.common.lang.Result;
import space.haobin.entity.User;
import space.haobin.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequiresAuthentication
    @GetMapping("/index")
    public Object index() {
        User user = userService.getById(1L);;
        return Result.succ(user);
    }


    /**
     * 测试实体校验
     * @param user
     * @return
     */
    @PostMapping("/save")
    public Object save(@Validated @RequestBody User user) {

        return Result.succ(user);
    }

}
