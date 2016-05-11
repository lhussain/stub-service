package com.lh;

import java.util.ArrayList;
import java.util.List;

public class TestStreams {

    public static void main (String[] args) {
        List<Provider> items = new ArrayList<>();
        items.add(new Provider().providerName("British Gas").providerId(12).elctricityId(007).gasId(187));
        items.add(new Provider().providerName("E.on").providerId(13).elctricityId(333).gasId(487));
        items.add(new Provider().providerName("npOWER").providerId(14).elctricityId(207).gasId(953));
        items.add(new Provider().providerName("Scottish-Power").providerId(15).elctricityId(107).gasId(287));

        Provider myprovider = items.stream()
                .filter(p -> p.getProviderName().equalsIgnoreCase("E.on"))
                .findFirst()
                .get();

        System.out.println(myprovider.getElctricityId());
        System.out.println(myprovider.getGasId());
    }
}

class Provider {
    private String providerName;
    private int providerId;
    private int gasId;
    private int elctricityId;

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public int getGasId() {
        return gasId;
    }

    public void setGasId(int gasId) {
        this.gasId = gasId;
    }

    public int getElctricityId() {
        return elctricityId;
    }

    public void setElctricityId(int elctricityId) {
        this.elctricityId = elctricityId;
    }

    public Provider providerName(String providerName) {
        this.providerName = providerName;
        return this;
    }

    public Provider providerId(int providerId) {
        this.providerId = providerId;
        return this;
    }

    public Provider gasId(int gasId) {
        this.gasId = gasId;
        return this;
    }

    public Provider elctricityId(int elctricityId) {
        this.elctricityId = elctricityId;
        return this;
    }
}

