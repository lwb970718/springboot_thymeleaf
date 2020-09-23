package com.offcn;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lwb
 * @create 2020-09-23  19:17
 */
@Controller
public class firstController {
    @RequestMapping("/index")
    public String toIndex(Model model){
        String message = "粉肤色!";
        model.addAttribute("message",message);
        return "index";
    }

    //对象
    @RequestMapping("/user")
    public String toIndex2(Model model){
        User user = new User(1,"梁伟冰");
        model.addAttribute("user",user);
        return "index";
    }

    //list
    @RequestMapping("/list")
    public String toIndex3(Model model){
        User user1 = new User(1, "哈哈");
        User user2 = new User(2, "嘻嘻");
        User user3 = new User(3, "略略");
        User user4 = new User(4, "嘤嘤");
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        model.addAttribute("users",users);

        return "index2";
    }
    @RequestMapping("/setValue")
    public String setValue(Model model){
        model.addAttribute("username","张三");
        return "index3";
    }

}
