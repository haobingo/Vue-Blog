package space.haobin.service.impl;

import space.haobin.entity.Blog;
import space.haobin.mapper.BlogMapper;
import space.haobin.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
