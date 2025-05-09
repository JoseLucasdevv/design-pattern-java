package org.project.structural.adapter;

public class PdfAdapter implements File {
    private final PdfFile pdfFile;

    PdfAdapter(PdfFile pdfFile){
        this.pdfFile = pdfFile;
    }



    @Override
    public void execute() {
        pdfFile.convert();
    }
    
}
