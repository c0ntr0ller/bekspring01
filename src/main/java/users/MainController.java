package users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/userorg")
public class MainController {
    @Autowired
    private UsergroupRepository usergroupRepository;

    @GetMapping(path = "/add")
    public @ResponseBody String addNewUsergroup(@RequestParam Integer groupCode,
                                                @RequestParam String roleName,
                                                @RequestParam String groupName){

        Usergroup usergroup = new Usergroup();
        usergroup.setGroupCode(groupCode);
        usergroup.setRoleName(roleName);
        usergroup.setGroupName(groupName);
        usergroupRepository.save(usergroup);
        return "Saved!";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Usergroup> getAllUsergroup(){
        return usergroupRepository.findAll();
    }
}
