package org.project.structural.adapter;

public class RunAdapter{


    public static void main (String[] args){
        File xml = new XmlFile();
        File json = new JsonAdapter(new JsonFile());
        File pdf = new PdfAdapter(new PdfFile());
        xml.execute();  
        json.execute();
        pdf.execute();

    }
    
    




}
