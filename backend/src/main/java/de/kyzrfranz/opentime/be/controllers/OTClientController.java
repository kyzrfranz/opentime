package de.kyzrfranz.opentime.be.controllers;

import de.kyzrfranz.opentime.be.models.OTClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kaiserfranz on 07/01/2017.
 */
@RestController
public class OTClientController {


    @RequestMapping(path = "/client/{id}", method = RequestMethod.GET)
    public OTClient getClient(@PathVariable long id){
        return new OTClient(id, "Muster Mann");
    }

}
