package org.yufan.admin.test;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.yufan.admin.mapper.UserMapper;
import org.yufan.core.bean.User;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value="classpath:spring/applicationContext.xml")
public class TestUserMapper {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void Insert() {
        User user = new User("sccs","sd");
        userMapper.insertSelective(user);
        System.out.println(user);
    }

    @Test
    public void Update() {
        User user = new User("svvss","sd");
        user.setId(1);
        userMapper.updateByPrimaryKeySelective(user);
        System.out.println(user);
    }

    @Test
    public void Select() {

        System.out.println(userMapper.selectByPrimaryKey(1));

    }

    @Test
    public void Delete() {

//       userMapper.deleteByPrimaryKey(1);
//        System.out.println("111");
    }

    @Test
    public void queryAll() {
        // 设置开始序号和分页大小
        // PageHelper.offsetPage(2,2);
        PageHelper.startPage(1,2);
        List<User> list = userMapper.selectAll();

        // 封装分页信息
        PageInfo<User> pageInfo = new PageInfo<>(list);
        System.out.println(pageInfo);

    }

}
