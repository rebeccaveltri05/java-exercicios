package model;

import java.util.Date;

public class Match {

    private Team home;
    private Team visitor;
    private int homeScore;
    private int visitorScore;
    private Date date;

    public Team getHome() {
        return this.home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getVisitor() {
        return this.visitor;
    }

    public void setVisitor(Team visitor) {
        this.visitor = visitor;
    }

    public int getHomeScore() {
        return this.homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getVisitorScore() {
        return this.visitorScore;
    }

    public void setVisitorScore(int visitorScore) {
        this.visitorScore = visitorScore;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }   

    public Team getResult(){
        if(homeScore > visitorScore){
            return home;
        }
        else if(visitorScore > homeScore){
            return visitor;
        }
        else{
            return null;
        }
    }

    public int getResult(Team team){
        if(team == home){
            if(homeScore > visitorScore){
                return 3;
            }
            else if(visitorScore > homeScore){
                return 0;
            }
            else{ 
                return 1;
            }
        }
        else{
            if(visitorScore > homeScore){
                return 3;
            } 
            else if(homeScore > visitorScore){
                return 0;
            } 
            else{ 
                return 1;
            }
        }
    }
}
