package controllers;

/**
 * Created by Holysoul on 4/18/16.
 */
public class PublicationFactory {
    public Publication getExecution(String execution){
        if(execution == null){
            return null;
        }
        if(execution.equalsIgnoreCase("publicationRegistration")){
            return new publicationRegistration();
        }

    return null;
    }


}


