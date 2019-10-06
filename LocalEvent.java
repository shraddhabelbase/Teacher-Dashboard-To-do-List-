/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.time.LocalDate;

/**
 *
 * @author shraddhabelbase
 */
public class LocalEvent {
     private String homework;
    private LocalDate date;

    /**
     * @return the homework
     */
    public String getHomework() {
        return homework;
    }

    /**
     * @param homework the homework to set
     */
    public void setHomework(String homework) {
        this.homework = homework;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    
    public LocalEvent(LocalDate date, String homework){
        this.setDate(date);
        this.setHomework(homework);
    }
    
    @Override
    public String toString(){
        return "Due:    " + this.getDate() + "       " + this.getHomework();
    }
}



