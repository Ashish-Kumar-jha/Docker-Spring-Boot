package com.WebProject.WebSPringAPi.CONTROLLER;
import com.WebProject.WebSPringAPi.DAO.DataDao;
import com.WebProject.WebSPringAPi.ENTITY.Data;
import com.WebProject.WebSPringAPi.SERVICE.DataInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DataControler {

    @Autowired
    DataDao dataDao;
    @Autowired
    DataInter dataInter;
    @GetMapping("/")
    public String indexpage(Model model){
        List<Data> data=(List<Data>)this.dataInter.showData();
        model.addAttribute("dataStr",data);
        return "index";
    }

@RequestMapping("/Retrive")
      public String retrivedata(Model model){
        Data data=new Data();
        model.addAttribute("dataStr",data);
        return "retrive";
}
    @PostMapping("/Register")
    public String addUser(Data data){
//        this.dataInter.addUser(data);
        dataDao.save(data);
        return "redirect:/";
    }
}
