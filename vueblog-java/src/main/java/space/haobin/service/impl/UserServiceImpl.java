package space.haobin.service.impl;

import space.haobin.entity.User;
import space.haobin.mapper.UserMapper;
import space.haobin.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
