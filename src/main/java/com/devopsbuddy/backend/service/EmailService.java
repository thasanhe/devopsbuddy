package com.devopsbuddy.backend.service;

import com.devopsbuddy.web.domain.frontend.FeedbackPOJO;
import org.springframework.mail.SimpleMailMessage;

/**
 * Contract for email service
 * Created by kingoftheroad on 1/15/17.
 */
public interface EmailService {

    /**
     * Sends an Email with the content in the feedback pojo
     * @param feedbackPOJO The feedback pojo
     */
    public void sendFeedbackEmail(FeedbackPOJO feedbackPOJO);

    /**
     * Sends an Email with the content of the SimpleMailMessage object
     * @param message The object containing the email content
     */
    public void sendGenericEmailMessage(SimpleMailMessage message);
}
