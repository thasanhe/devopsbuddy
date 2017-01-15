package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPOJO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 * Created by kingoftheroad on 1/15/17.
 */
public abstract class AbstractEmailService implements EmailService {

    @Value("${default.to.address}")
    private String defaultToAddress;

    /**
     * Creates a Simple Mail Message from the Feedback Pojo
     * @param feedbackPOJO The feedback pojo
     * @return
     */

    protected SimpleMailMessage prepareSimpleMailMessageFromFeedbackPojo(FeedbackPOJO feedbackPOJO){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(defaultToAddress);
        message.setFrom(feedbackPOJO.getEmail());
        message.setSubject("[DevOps Buddy] : Feedback received from " + feedbackPOJO.getFirstName() +
        " " + feedbackPOJO.getLastName() + " " + feedbackPOJO.getEmail() + "!");
        message.setText(feedbackPOJO.getFeedback());
        return message;
    }

    @Override
    public void sendFeedbackEmail(FeedbackPOJO feedbackPOJO) {
        sendGenericEmailMessage(prepareSimpleMailMessageFromFeedbackPojo(feedbackPOJO));
    }
}
