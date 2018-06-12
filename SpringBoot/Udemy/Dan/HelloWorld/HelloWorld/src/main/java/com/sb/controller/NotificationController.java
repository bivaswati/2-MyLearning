package com.sb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.notification.NotificationService;

@RestController
public class NotificationController {

	/*@Autowired
	private NotificationService notificationService;*/
	
	private NotificationService notificationService;
	
	/*@Autowired
	public NotificationController(NotificationService notificationService) {
		this.notificationService = notificationService;
	}*/

	@Autowired
	public void setNotificationService(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@RequestMapping(value = "/notify")
	public String notifyy() {
	return notificationService.toString();
	}
	
}
