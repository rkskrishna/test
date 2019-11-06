package com.occ.invoice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.occ.invoice.model.Client;
import com.occ.invoice.model.PagerModel;
import com.occ.invoice.repository.ClientRepository;

@Controller
public class ClientController {
	private static final int BUTTONS_TO_SHOW = 3;
	private static final int INITIAL_PAGE = 0;
	private static final int INITIAL_PAGE_SIZE = 5;
	private static final int[] PAGE_SIZES = { 5, 10};
	@Autowired
    ClientRepository clientRepository;
	
	@RequestMapping("/getclientlist")
    public String viewClients(Model model) {
    	model.addAttribute("users",clientRepository.findAll());
        return "clientlist";
    }
	
	//@PostMapping("/save")
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String save(Client c) {
		System.out.println(c.toString());
		clientRepository.save(c);
		return "redirect:/pageview";
	}
	
	@GetMapping("/delete")
	public String deleteClient(Long clientId) {
		clientRepository.deleteById(clientId);
		return "redirect:/pageview";
	}
	
	
	  @GetMapping("/findone")
	  
	  @ResponseBody public Optional<Client> findClient(Long clientId) {
	  
	  return  clientRepository.findById(clientId);
}
	 
	  
	  @GetMapping("/pageview")
		public ModelAndView homepage(@RequestParam("pageSize") Optional<Integer> pageSize,
				@RequestParam("page") Optional<Integer> page){
			
			if(clientRepository.count()!=0){
				;//pass
		} /*
			 * else{ addtorepository(); }
			 */
			
			ModelAndView modelAndView = new ModelAndView("testview");
			//
			// Evaluate page size. If requested parameter is null, return initial
			// page size
			int evalPageSize = pageSize.orElse(INITIAL_PAGE_SIZE);
			// Evaluate page. If requested parameter is null or less than 0 (to
			// prevent exception), return initial size. Otherwise, return value of
			// param. decreased by 1.
			int evalPage = (page.orElse(0) < 1) ? INITIAL_PAGE : page.get() - 1;
			// print repo
			System.out.println("here is client repo " + clientRepository.findAll());
			Page<Client> clientlist = clientRepository.findAll(new PageRequest(evalPage, evalPageSize));
			System.out.println("client list get total pages" + clientlist.getTotalPages() + "client list get number " + clientlist.getNumber());
			PagerModel pager = new PagerModel(clientlist.getTotalPages(),clientlist.getNumber(),BUTTONS_TO_SHOW);
			// add clientmodel
			modelAndView.addObject("clientlist",clientlist);
			// evaluate page size
			modelAndView.addObject("selectedPageSize", evalPageSize);
			// add page sizes
			modelAndView.addObject("pageSizes", PAGE_SIZES);
			// add pager
			modelAndView.addObject("pager", pager);
			modelAndView.addObject("client", new Client());
			return modelAndView;
			
		}
	  
}
