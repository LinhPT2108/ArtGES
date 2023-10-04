package com.art.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.art.DAO.Product.CategoryDAO;
import com.art.DAO.Product.ManufacturerDAO;
import com.art.Entities.Product.Category;
import com.art.Entities.Product.Manufacturer;

@Controller
@RequestMapping("/admin")
public class productController {
	@Autowired
	CategoryDAO caDAO;
	@Autowired
	ManufacturerDAO mnDAO;

	@GetMapping("/product")
	public String product(Model model) {
		List<Category> listCate = caDAO.findAll();
		List<Manufacturer> listManu = mnDAO.findAll();
		
		model.addAttribute("views", "product-form");
		model.addAttribute("title", "Quản lí sản phẩm");
		
		model.addAttribute("categories", listCate);
		model.addAttribute("manufacturer", listManu);
		return "admin/index";
	}
}
