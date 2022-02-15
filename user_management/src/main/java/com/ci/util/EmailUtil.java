package com.ci.util;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtil {

	@Autowired
	private JavaMailSender mailSender;

	public boolean sendEmail(String to, String subject, String body) {
		boolean isSend = false;
		MimeMessage mimeMessage = mailSender.createMimeMessage();

		try {
			MimeMessageHelper MessageHelper = new MimeMessageHelper(mimeMessage, true);

			MessageHelper.setTo(to);
			MessageHelper.setSubject(subject);
			MessageHelper.setText(body);

			mailSender.send(MessageHelper.getMimeMessage());
			isSend = true;
		} catch (Exception e) {
			System.out.println("Failed..." + e.getMessage());
		}
		return isSend;
	}
}
	