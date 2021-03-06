package ca.ubc.cpsc210.todo.model;

import java.util.Date;

/**
 * Created by HardingLiu on 2015-07-22.
 */
public class ScheduledTodoItem extends TodoItem {
    private Date dueDate;


    public ScheduledTodoItem (String title, String description, Date dueDate) {
        super(title, description);
        this.dueDate = dueDate;

    }




    public Date getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public boolean isCompleted() {
        Date today = new Date();
        if (today.after(dueDate)) {
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean isHighPriority () {
        Date today = new Date();

        return (today.getYear() == dueDate.getYear()) && (today.getMonth() == dueDate.getMonth())&&
        ( today.getDay() == dueDate.getDay());
    }



}
