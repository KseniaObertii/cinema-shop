package mate.academy.spring.config;

import mate.academy.spring.model.Role;
import mate.academy.spring.model.RoleName;
import mate.academy.spring.model.User;
import mate.academy.spring.service.RoleService;
import mate.academy.spring.service.UserService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setName(RoleName.ADMIN);
        Set<Role> adminRoles = new HashSet();
        adminRoles.add(adminRole);
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setName(RoleName.USER);
        Set<Role> userRoles = new HashSet();
        adminRoles.add(userRole);
        roleService.add(userRole);
        User admin = new User();
        admin.setEmail("admin@i.ua");
        admin.setPassword("admin123");
        admin.setRoles(adminRoles);
        userService.add(admin);
        User user = new User();
        user.setEmail("user@i.ua");
        user.setPassword("user123");
        user.setRoles(userRoles);
        userService.add(user);
    }
}
