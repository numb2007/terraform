package org.urbancode.terraform.tasks.common;


abstract public class SubTask extends Task {

    //**********************************************************************************************
    // CLASS
    //**********************************************************************************************

    //**********************************************************************************************
    // INSTANCE
    //**********************************************************************************************

    //----------------------------------------------------------------------------------------------
    protected SubTask() {
        super(null);
    }

    //----------------------------------------------------------------------------------------------
    protected SubTask(Context context) {
        super(context);
    }

    //----------------------------------------------------------------------------------------------
    @Override
    abstract public void create() throws Exception;

    //----------------------------------------------------------------------------------------------
    @Override
    abstract public void destroy() throws Exception;


}