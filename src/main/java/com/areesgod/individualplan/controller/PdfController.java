package com.areesgod.individualplan.controller;

import com.areesgod.individualplan.PdfGenerator;
import com.areesgod.individualplan.model.*;
import com.areesgod.individualplan.service.*;
import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.lowagie.text.DocumentException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/pdf")
@CrossOrigin
public class PdfController {
    @Autowired
    private TableServiceImpl tableService;
    @Autowired
    private ScienceDataServiceImpl scienceDataService;
    @Autowired
    private EducationDataServiceImpl educationDataService;
    @Autowired
    private EduMethDataServiceImpl eduMethDataService;
    @Autowired
    private PublicWorkDataServiceImpl publicWorkDataService;
    @Autowired
    private KPIDataServiceImpl kpiDataService;
    @GetMapping("/export/{user_id}")
    public void generatePdfFile(HttpServletResponse response, @PathVariable Integer user_id) throws DocumentException, IOException{
        response.setContentType("application/pdf");
        DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD:HH:MM:SS");
        String currentDateTime = dateFormat.format(new Date());
        String headerkey = "Content-Disposition";
        String headervalue = "attachment; filename=student" + user_id + ".pdf";
        response.setHeader(headerkey,headervalue);
        List<BehaviorData> behaviorDataList = tableService.findbyUserId(user_id);
        List<ScienceData> scienceDataList = scienceDataService.findbyUserId(user_id);
        List<EducationData> educationDataList = educationDataService.findbyUserId(user_id);
        List<EduMethData> eduMethDataList = eduMethDataService.findbyUserId(user_id);
        List<PublicWorkData> publicWorkDataList = publicWorkDataService.findbyUserId(user_id);
        List<KPIData> kpiDataList = kpiDataService.findbyUserId(user_id);
        PdfGenerator generator = new PdfGenerator();
        generator.generate(behaviorDataList,scienceDataList,educationDataList,eduMethDataList,publicWorkDataList,kpiDataList,response);
    }
}
