package de.kyzrfranz.opentime.be.models;

import java.util.Date;
import java.util.Map;

/**
 * Created by kaiserfranz on 07/01/2017.
 */
public class OTContract {


    private final long id;
    private Map<String, String> contractMeta;
    private final OTUser contractor;
    private final OTClient client;

    private final int hoursVolume;
    private final int hourlyRateOnSite;
    private int hourlyRateRemote;
    private Date deliveryDate;

    public OTContract(long id, OTUser contractor, OTClient client, int hoursVolume, int hourlyRateOnSite) {
        this.id = id;
        this.contractor = contractor;
        this.client = client;
        this.hoursVolume = hoursVolume;
        this.hourlyRateOnSite = hourlyRateOnSite;
    }

    public long getId() {
        return id;
    }

    public Map<String, String> getContractMeta() {
        return contractMeta;
    }

    public void setContractMeta(Map<String, String> contractMeta) {
        this.contractMeta = contractMeta;
    }

    public OTUser getContractor() {
        return contractor;
    }

    public OTClient getClient() {
        return client;
    }

    public int getHoursVolume() {
        return hoursVolume;
    }

    public int getHourlyRateOnSite() {
        return hourlyRateOnSite;
    }

    public int getHourlyRateRemote() {
        return hourlyRateRemote;
    }

    public void setHourlyRateRemote(int hourlyRateRemote) {
        this.hourlyRateRemote = hourlyRateRemote;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
