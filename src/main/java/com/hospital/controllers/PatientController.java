package com.hospital.controllers;

import com.hospital.models.Drug;
import com.hospital.models.Patient;
import com.hospital.services.DrugService;
import com.hospital.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by kinyua on 5/5/15.
 */

@Controller
public class PatientController {
    @Autowired
    PatientService patientService;
    @Autowired
    DrugService drugService;

    @RequestMapping("/welcome")
    public String hello(Model model){

        model.addAttribute("message","HELLO WORLD");
        return "patient";
    }

    @RequestMapping("/patient")
    public ModelAndView hello1(){

        ModelAndView model = new ModelAndView();
        model.addObject("msg","WELCOME TO KINYUA EMR");
        model.setViewName("patient");

        return model;
    }
    @RequestMapping("/create")
    public ModelAndView create(@RequestParam(value = "fname", required = false) String fname,
                       @RequestParam(value = "lname", required = false) String lname,
                       @RequestParam(value = "dob", required = false) String dob){
        ModelAndView model = new ModelAndView();

            Patient patient = new Patient();
            patient.setFname(fname);
            patient.setLast_name(lname);
            patient.setDob(dob);
            patientService.insertRow(patient);
        
        model.setViewName("patient");
        return model;
    }


    @RequestMapping("/enterDrug")
    public ModelAndView enterDrug(@RequestParam(value = "pname", required = false) String pname,
                                  @RequestParam(value = "dname", required = false) String dname){
        ModelAndView model = new ModelAndView();

        Drug drug = new Drug();
        drug.setPid(Integer.parseInt(pname));
        drug.setDName(dname);
        drugService.insertRowD(drug);

        model.setViewName("drug");
        return model;
    }
    @RequestMapping("/drug")
    public ModelAndView list()
    {
        ModelAndView model = new ModelAndView();
        model.addObject("msg", "WELCOME TO KINYUA EMR DRUGS SECTION");
        List<Patient> patientList =  patientService.getList();
        model.addObject("patientList", patientList);
        model.setViewName("drug");
        return model;

    }
    @RequestMapping("/listPatients")
    public ModelAndView listDrugs()
    {
        ModelAndView model = new ModelAndView();
        model.addObject("msg", "WELCOME TO KINYUA EMR VIEW LIST");
        List<Patient> patientList =  patientService.getList();
        model.addObject("patientList", patientList);
        model.setViewName("listPatients");
        return model;

    }
    @RequestMapping("/list")
    public ModelAndView listD()

    {
        ModelAndView model = new ModelAndView();
        List<Drug> drugList = drugService.getList();
        model.addObject("drugList", drugList);
        model.setViewName("display");
        return model;
    }

}
