package fr.itv95.frontcontroller;

/**
 * Created by Luc on 17/10/2016.
 */
public class Dispatcher {

    private StudentView studentView;
    private HomeView homeView;

    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
    }

    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
            studentView.show();
        }
        else homeView.show();
    }

}
