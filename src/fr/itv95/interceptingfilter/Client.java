package fr.itv95.interceptingfilter;

/**
 * Created by Luc on 17/10/2016.
 */
public class Client {

    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }

}
