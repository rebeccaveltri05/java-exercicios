package model;

import java.util.Date;

public class Match {

    private Team home;
    private Team visitor;
    private int homeScore;
    private int visitorScore;
    private Date date;
    
    public Team getHome() {
        return home;
    }

    public void setHome(Team home) {
        this.home = home;
    }

    public Team getVisitor() {
        return visitor;
    }

    public void setVisitor(Team visitor) {
        this.visitor = visitor;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public int getVisitorScore() {
        return visitorScore;
    }

    public void setVisitorScore(int visitorScore) {
        this.visitorScore = visitorScore;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Team getResult(){
        if (homeScore < visitorScore)
            return visitor;      
        else {
            if (homeScore > visitorScore)
                return home;
            else
                return null;
        }
    }

    public int getResult(Team t) {
        if (t == home && homeScore > visitorScore)
            return 3;
        else if (t == visitor && homeScore < visitorScore)
            return 3;
        else if (t == home && homeScore < visitorScore)
            return 0;
        else if (t == visitor && homeScore > visitorScore)
            return 0;
        else 
            return 1;
    }
    
}
