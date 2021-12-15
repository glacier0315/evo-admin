package com.glacier.evo.web.sys;

import com.glacier.component.dto.page.PageRequest;
import com.glacier.evo.app.sys.service.UserService;
import com.glacier.evo.domain.sys.model.dto.user.UserQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * date 2021-08-08 14:48
 *
 * @author glacier
 * @version 1.0
 */
@RequestMapping("/sys/user")
@Controller
public class UserController {
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	private final UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	
	/**
	 *
	 * @param userQuery
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "list")
	public String list(UserQuery userQuery, Model model) {
		model.addAttribute("page", userService.findPage(new PageRequest<>(userQuery)));
		return "sys/user/userList";
	}
}
