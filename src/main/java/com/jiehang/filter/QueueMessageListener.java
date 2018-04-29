package com.jiehang.filter;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Administrator on 2017/1/5.
 */
public class QueueMessageListener implements MessageListener {

    public void onMessage(Message message) {

        try {
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " listen the message: " +
                    ((TextMessage) message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}