package com.sijin.free.web.task;

/**
 * Created by sijinzhang on 16/8/26.
 * 定时任务，设置任务状态，运行数据，回写任务状态
 */
public  interface TaskService {

    public void start();

    public void executeTask();

    public void finishTask();

}
