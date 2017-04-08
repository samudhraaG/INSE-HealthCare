package com.inse.controller;

import com.inse.com.model.Bundle;
import com.inse.dao.BundleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ssamudhraa on 4/7/2017.
 */
@Controller
public class HomeController {
   /* @Autowired
    private BundleDAO bundleDAO;*/

    /*@RequestMapping(value = "/")
    public String home(){
        return "test";
    }*/

    @RequestMapping(value = "/")
    public ModelAndView listBundles(ModelAndView model) throws IOException{

        Bundle mockBundle = new Bundle(1,null, 100.00);
        List<Bundle> mockBundleList = new ArrayList<Bundle>();
        mockBundleList.add(mockBundle);

        List<Bundle> listBundles = mockBundleList;
        System.out.println("list bundles >>>> "+listBundles);
        model.addObject("listBundles", listBundles);
        model.setViewName("index");

        return model;
    }
}
