package org.project.structural.adapter;

public class JsonAdapter implements File{

    private final JsonFile jsonFile;

    protected JsonAdapter(JsonFile jsonFile){
        this.jsonFile = jsonFile;
    }


    @Override
    public void execute() {
        jsonFile.convert();
    }


}