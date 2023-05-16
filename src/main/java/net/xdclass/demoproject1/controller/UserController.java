package net.xdclass.demoproject1.controller;

import net.xdclass.demoproject1.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  测试 jsp、freemarker、thymeleaf 三者共存的操作类
 *  模板引擎的优先级为：freemarker > jsp；freemarker > thymeleaf；thymeleaf > jsp；且有 thymeleaf 的情况下，无法使用 jsp
 *  但是有 jsp 的情况下，可以使用 thymeleaf
 * </p>
 *
 * @author menglingtao
 * @since 2022年04月21日 10:15:10
 */

@Controller
public class UserController{
    @RequestMapping("/showUser")
    public String showUser(Model model){
        List<User> list = new ArrayList<User>();
        list.add(new User(1,"张三",20));
        list.add(new User(2,"张三",20));
        list.add(new User(3,"张三",20));
        model.addAttribute("list",list);
        return "userList";
    }
    @RequestMapping("/showUserList")
    public String showUserFtl(Model model){
        List<User> list = new ArrayList<User>();
        list.add(new User(1,"张三",20));
        list.add(new User(2,"张三",20));
        list.add(new User(3,"张三",20));
        model.addAttribute("list",list);
        return "index";
        // return "userList";
    }
}
