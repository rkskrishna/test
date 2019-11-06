package com.occ.invoice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.occ.invoice.model.Client;
import com.occ.invoice.model.ClientModel;
import com.occ.invoice.model.DataModel;
import com.occ.invoice.model.WorkEntity;
import com.occ.invoice.repository.ClientRepository;
import com.occ.invoice.repository.WorkRepository;

@Controller
public class HomeController {
 
	@Autowired
    ClientRepository clientRepository;
	
	@Autowired
	WorkRepository workRepository;
	
	@Autowired private ApplicationContext appContext;
	
	  @RequestMapping(value="/") public String home() { return "home"; }
	  
	  @RequestMapping(value="/about") public String about() { return "about"; }
	 
	
	/*
	 * @RequestMapping("/") public String viewHome(Model model) {
	 * model.addAttribute("users",clientRepository.findAll());
	 * 
	 * ClientModel client = new ClientModel(); model.addAttribute("client", client);
	 * return "client"; }
	 * 
	 */
    @SuppressWarnings("deprecation")
	@RequestMapping("/test")
    public String viewClient(Model model,@RequestParam(defaultValue="0") int page) {
    	model.addAttribute("users",clientRepository.
    			findAll(new PageRequest(page, 5)));
    	model.addAttribute("client", new Client());	
    	model.addAttribute("currentPage",page);
		
		 // ClientModel client = new ClientModel(); 
		//  model.addAttribute("client", client);		 
        return "test";
    }

    
    
    @RequestMapping("/index")
    public String viewHomeindex() {
        return "index";
    }
    
    
    @RequestMapping("/dash")
	public String Dash(Model model) {
		model.addAttribute("users", clientRepository.findAll());

		ClientModel client = new ClientModel();
		model.addAttribute("client", client);
		return "dashboard";
	}
    
    @RequestMapping(value="/addClient.html",method = RequestMethod.POST)
    public String addClient(@ModelAttribute ClientModel client,Model model) {
    	System.out.println("add client name"+client.getClient_name()+"client id:::::"+client.getClient_id());
    	Client cl=new Client();
    	cl.setClient_name(client.getClient_name());
    	cl.setClient_address(client.getClient_address());
    	cl.setClient_mobile(client.getClient_mobile());
    	cl.setClient_landline(client.getClient_landline());
    	cl.setClient_fax(client.getClient_fax());
    	cl.setClient_email(client.getClient_email());
    	cl.setClient_gstin_uin(client.getClient_gstin_uin());   	
    	if (("").equals(client.getClient_id())||client.getClient_id().isEmpty()) {
    		//System.out.println("empty");
    		clientRepository.save(cl);
    	}else {
    		System.out.println("contains data");
    		cl.setClient_id(Long.parseLong(client.getClient_id()));
    		clientRepository.save(cl);
    	}
		//clientRepository.save(cl);
		model.addAttribute("users",clientRepository.findAll());	
		model.addAttribute("client", new ClientModel());
		//model.addAttribute("client", client);
    	//System.out.println("inside add client");
        return "client";
    }
    
    @RequestMapping("/editClient.html/{client_id}")
    //public String deleteOcc(@ModelAttribute ClientModel client,Model model) {
    public String editClient(@PathVariable long client_id,Model model) {
    	System.out.println("inside edit::::"+client_id);
    	
    	DataModel data = new DataModel();
    	data.setRecord(clientRepository.findById(client_id).get());
    	System.out.println("getting data by id:::::"+((Client) data.getRecord()).getClient_name());
    	ClientModel climod = new ClientModel();
    	climod.setClient_name(((Client) data.getRecord()).getClient_name());
    	climod.setClient_address(((Client) data.getRecord()).getClient_address());
    	climod.setClient_mobile(((Client) data.getRecord()).getClient_mobile());
    	climod.setClient_landline(((Client) data.getRecord()).getClient_landline());
    	climod.setClient_fax(((Client) data.getRecord()).getClient_fax());
    	climod.setClient_email(((Client) data.getRecord()).getClient_email());
    	climod.setClient_gstin_uin(((Client) data.getRecord()).getClient_gstin_uin());
    	climod.setClient_id(String.valueOf(client_id));
    	
    	
    	//clientRepository.deleteById(id);
    	model.addAttribute("users",clientRepository.findAll());	    	 
		model.addAttribute("client", climod);	
        return "client";
    }
    
    @RequestMapping("/deleteOcc.html/{id}")
    //public String deleteOcc(@ModelAttribute ClientModel client,Model model) {
    public String deleteOcc(@PathVariable long id,Model model) {
    	System.out.println("inside delete::::"+id);
    	clientRepository.deleteById(id);
    	model.addAttribute("users",clientRepository.findAll());	    	 
		model.addAttribute("client", new ClientModel());	
        return "client";
    }
    
    @RequestMapping("/works")
    public String works(Model model) {
    	//model.addAttribute("users",clientRepository.findAll());
		
		  WorkEntity work = new WorkEntity(); 
		  model.addAttribute("work", work);	
		  model.addAttribute("users",workRepository.findAll());
        return "works";
    }
    @RequestMapping(value="/addWorks.html",method = RequestMethod.POST)
    public String addWorks(@ModelAttribute WorkEntity work,Model model) {    	
    	
		/*
		 * if (("").equals(work.getId())||work.getId().isEmpty()) {
		 * //System.out.println("empty"); workRepository.save(work); }else {
		 * //System.out.println("contains data");
		 * cl.setClient_id(Long.parseLong(client.getClient_id()));
		 * clientRepository.save(cl); }
		 */
    	workRepository.save(work);
		model.addAttribute("work", new WorkEntity());
		model.addAttribute("users",workRepository.findAll());
    	//System.out.println("inside add client");
        return "works";
    }
    @RequestMapping("/deleteWorks.html/{work_id}")
    //public String deleteOcc(@ModelAttribute ClientModel client,Model model) {
    public String deleteWorks(@PathVariable long work_id,Model model) {
    	System.out.println("inside delete::::"+work_id);
    	workRepository.deleteById(work_id);
    	model.addAttribute("users",workRepository.findAll());	    	 
		model.addAttribute("work", new WorkEntity());	
        return "works";
    }
    @RequestMapping("/editWorks.html/{work_id}")
    //public String deleteOcc(@ModelAttribute ClientModel client,Model model) {
    public String editWork(@PathVariable long work_id,Model model) {
    	System.out.println("inside edit::::"+work_id);
    	
    	DataModel data = new DataModel();
    	data.setRecord(workRepository.findById(work_id).get());
    	System.out.println("getting data by id:::::"+((WorkEntity) data.getRecord()).getWork_name());
    	WorkEntity workmod = new WorkEntity();
    	workmod.setWork_name(((WorkEntity) data.getRecord()).getWork_name());
    	workmod.setWork_address(((WorkEntity) data.getRecord()).getWork_address());    	
    	workmod.setId(work_id);
    	model.addAttribute("users",workRepository.findAll());	    	 
		model.addAttribute("work", workmod);	
        return "works";
    }
    
  
	
	/*
	 * @RequestMapping("/report") private ModelAndView generateReport(String
	 * templateUrl, Map<String, Object> params) { JasperReportsPdfView view = new
	 * JasperReportsPdfView(); view.setUrl(compileReportAndGetUrl(templateUrl));
	 * view.setApplicationContext(appContext); return new ModelAndView(view,params);
	 * }
	 */
    
    }
    