package com.areesgod.individualplan;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.areesgod.individualplan.model.*;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.CMYKColor;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class PdfGenerator {
    public void generate(List <BehaviorData> behaviorDataList, List<ScienceData> scienceDataList, List<EducationData> educationDataList, List<EduMethData> eduMethDataList, List<PublicWorkData> publicWorkDataList,List<KPIData> kpiDataList, HttpServletResponse response) throws DocumentException, IOException {
        // Creating the Object of Document
        Document document = new Document(PageSize.A4);
        // Getting instance of PdfWriter
        PdfWriter.getInstance(document, response.getOutputStream());
        // Opening the created document to change it
        document.open();
        // Creating font
        // Setting font style and size
        Font fontTiltle = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        fontTiltle.setSize(20);
        //New Table
        Paragraph paragraph2 = new Paragraph("List of the Educational Table", fontTiltle);
        paragraph2.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(paragraph2);
        PdfPTable tableEducation = new PdfPTable(6);
        tableEducation.setWidths(new int[] {3,3,3,3,3,3});
        tableEducation.setSpacingBefore(10);

        PdfPCell cell2 = new PdfPCell();

        cell2.setPadding(10);

        Font font = FontFactory.getFont(FontFactory.TIMES_ROMAN);
        font.setColor(CMYKColor.BLACK);

        cell2.setPhrase(new Phrase("Name", font));
        tableEducation.addCell(cell2);
        cell2.setPhrase(new Phrase("Course", font));
        tableEducation.addCell(cell2);
        cell2.setPhrase(new Phrase("Trimester", font));
        tableEducation.addCell(cell2);
        cell2.setPhrase(new Phrase("Group", font));
        tableEducation.addCell(cell2);
        cell2.setPhrase(new Phrase("PLecture", font));
        tableEducation.addCell(cell2);
        cell2.setPhrase(new Phrase("POffice", font));
        tableEducation.addCell(cell2);

        for (EducationData educationData: educationDataList) {

            tableEducation.addCell(educationData.getDis());
            tableEducation.addCell(educationData.getCourse());
            tableEducation.addCell(educationData.getTrimester());
            tableEducation.addCell(educationData.getGrou());
            tableEducation.addCell(educationData.getPlecture());
            tableEducation.addCell(educationData.getPoffice());

        }
        document.add(tableEducation);



        Paragraph paragraph1 = new Paragraph("List of the Behavior Table", fontTiltle);
        // Aligning the paragraph in the document
        paragraph1.setAlignment(Paragraph.ALIGN_CENTER);
        // Adding the created paragraph in the document
        document.add(paragraph1);

        // Creating a table of the 4 columns
        PdfPTable tableBehavior = new PdfPTable(3);
        // Setting width of the table, its columns and spacing

        tableBehavior.setWidths(new int[] {3,3,3});
        tableBehavior.setSpacingBefore(10);
        // Create Table Cells for the table header
        PdfPCell cell = new PdfPCell();
        // Setting the background color and padding of the table cell
        cell.setPadding(10);
        // Creating font
        // Setting font style and size
        // Adding headings in the created table cell or  header
        // Adding Cell to table
        cell.setPhrase(new Phrase("Work", font));
        tableBehavior.addCell(cell);
        cell.setPhrase(new Phrase("Date", font));
        tableBehavior.addCell(cell);
        cell.setPhrase(new Phrase("Res", font));
        tableBehavior.addCell(cell);
        // Iterating the list of students
        for (BehaviorData behaviorData: behaviorDataList) {
            // Adding student id
            tableBehavior.addCell(String.valueOf(behaviorData.getWork()));
            // Adding student name
            tableBehavior.addCell(behaviorData.getDate());
            // Adding student email
            tableBehavior.addCell(behaviorData.getRes());
            // Adding student mobile
        }
        // Adding the created table to the document
        document.add(tableBehavior);




        Paragraph paragraph3 = new Paragraph("List of the Science", fontTiltle);
        // Aligning the paragraph in the document
        paragraph3.setAlignment(Paragraph.ALIGN_CENTER);
        // Adding the created paragraph in the document
        document.add(paragraph3);
        // Creating a table of the 4 columns
        PdfPTable tableScience = new PdfPTable(3);
        // Setting width of the table, its columns and spacing

        tableBehavior.setWidths(new int[] {3,3,3});
        tableBehavior.setSpacingBefore(20);
        // Create Table Cells for the table header
        PdfPCell cell3 = new PdfPCell();
        // Setting the background color and padding of the table cell
        cell3.setPadding(10);
        // Creating font
        // Setting font style and size
        // Adding headings in the created table cell or  header
        // Adding Cell to table
        cell3.setPhrase(new Phrase("Work", font));
        tableScience.addCell(cell3);
        cell3.setPhrase(new Phrase("Date", font));
        tableScience.addCell(cell3);
        cell3.setPhrase(new Phrase("Res", font));
        tableScience.addCell(cell3);
        // Iterating the list of students
        for (ScienceData scienceData: scienceDataList) {
            // Adding student id
            tableScience.addCell(String.valueOf(scienceData.getWork()));
            // Adding student name
            tableScience.addCell(scienceData.getDate());
            // Adding student email
            tableScience.addCell(scienceData.getRes());
            // Adding student mobile
        }
        // Adding the created table to the document
        document.add(tableScience);
        // Closing the document

    Paragraph paragraph4 = new Paragraph("List of the Education-Methodical", fontTiltle);
    // Aligning the paragraph in the document
        paragraph4.setAlignment(Paragraph.ALIGN_CENTER);
    // Adding the created paragraph in the document
        document.add(paragraph4);
    // Creating a table of the 4 columns
    PdfPTable tableEduMeth = new PdfPTable(3);
    // Setting width of the table, its columns and spacing

        tableEduMeth.setWidths(new int[] {3,3,3});
        tableEduMeth.setSpacingBefore(20);
    // Create Table Cells for the table header
    PdfPCell cell4 = new PdfPCell();
    // Setting the background color and padding of the table cell
        cell4.setPadding(10);
    // Creating font
    // Setting font style and size
    // Adding headings in the created table cell or  header
    // Adding Cell to table
        cell4.setPhrase(new Phrase("Work", font));
        tableEduMeth.addCell(cell4);
        cell4.setPhrase(new Phrase("Date", font));
        tableEduMeth.addCell(cell4);
        cell4.setPhrase(new Phrase("Discipline", font));
        tableEduMeth.addCell(cell4);
    // Iterating the list of students
        for (EduMethData eduMethData: eduMethDataList) {
        // Adding student id
            tableEduMeth.addCell(eduMethData.getWork());
        // Adding student name
            tableEduMeth.addCell(eduMethData.getDate());
        // Adding student email
            tableEduMeth.addCell(eduMethData.getDis());
        // Adding student mobile
    }
        document.add(tableEduMeth);





        Paragraph paragraph5 = new Paragraph("List of the Public Work", fontTiltle);
        // Aligning the paragraph in the document
        paragraph5.setAlignment(Paragraph.ALIGN_CENTER);
        // Adding the created paragraph in the document
        document.add(paragraph5);
        // Creating a table of the 4 columns
        PdfPTable publicWork = new PdfPTable(3);
        // Setting width of the table, its columns and spacing

        publicWork.setWidths(new int[] {3,3,3});
        publicWork.setSpacingBefore(20);
        // Create Table Cells for the table header
        PdfPCell cell5 = new PdfPCell();
        // Setting the background color and padding of the table cell
        cell5.setPadding(10);
        // Creating font
        // Setting font style and size
        // Adding headings in the created table cell or  header
        // Adding Cell to table
        cell5.setPhrase(new Phrase("Work", font));
        publicWork.addCell(cell5);
        cell5.setPhrase(new Phrase("Date", font));
        publicWork.addCell(cell5);
        cell5.setPhrase(new Phrase("Res", font));
        publicWork.addCell(cell5);
        // Iterating the list of students
        for (PublicWorkData publicWorkData: publicWorkDataList) {
            // Adding student id
            publicWork.addCell(publicWorkData.getWork());
            // Adding student name
            publicWork.addCell(publicWorkData.getDate());
            // Adding student email
            publicWork.addCell(publicWorkData.getRes());
            // Adding student mobile
        }
        // Adding the created table to the document
        document.add(publicWork);


        Paragraph paragraph6 = new Paragraph("List of the KPI", fontTiltle);
        // Aligning the paragraph in the document
        paragraph6.setAlignment(Paragraph.ALIGN_CENTER);
        // Adding the created paragraph in the document
        document.add(paragraph6);
        // Creating a table of the 4 columns
        PdfPTable KPI = new PdfPTable(3);
        // Setting width of the table, its columns and spacing

        KPI.setWidths(new int[] {3,3,3});
        KPI.setSpacingBefore(20);
        // Create Table Cells for the table header
        PdfPCell cell6 = new PdfPCell();
        // Setting the background color and padding of the table cell
        cell6.setPadding(10);
        // Creating font
        // Setting font style and size
        // Adding headings in the created table cell or  header
        // Adding Cell to table
        cell6.setPhrase(new Phrase("Work", font));
        KPI.addCell(cell6);
        cell6.setPhrase(new Phrase("Date", font));
        KPI.addCell(cell6);
        cell6.setPhrase(new Phrase("Res", font));
        KPI.addCell(cell6);
        // Iterating the list of students
        for (KPIData kpiData: kpiDataList) {
            // Adding student id
            KPI.addCell(kpiData.getWork());
            // Adding student name
            KPI.addCell(kpiData.getDate());
            // Adding student email
            KPI.addCell(kpiData.getRes());
            // Adding student mobile
        }
        // Adding the created table to the document
        document.add(KPI);
        document.close();
}
}
