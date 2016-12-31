/**
 * SAM io.vilya.sam.controller.view
 */
package io.vilya.sam.web.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Vilya
 *
 */

@Controller
@RequestMapping("/")
public class CommonController {
	
	@RequestMapping("test")
	public @ResponseBody String test() {
		return "test";
	}
	
	@RequestMapping("freemarker")
	public String freemarker() {
		return "index";
	}
	
}
