package de.kyzrfranz.opentime.be.models;

import java.util.Map;

/**
 * Created by kaiserfranz on 07/01/2017.
 */
public class OTClient {


    private final long id;
    private String clientName;
    private Map<String, String> clientMeta;


    public OTClient(long id, String clientName) {
        this.id = id;
        this.clientName = clientName;
    }

    public Map<String, String> getClientMeta() {
        return clientMeta;
    }

    public void setClientMeta(Map<String, String> clientMeta) {
        this.clientMeta = clientMeta;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientName() {
        return clientName;
    }

    public long getId() {
        return id;
    }
}
