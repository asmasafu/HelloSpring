package com.java.annotation;

import org.springframework.stereotype.Service;

import com.java.MessageProvider;
import com.java.MessageRenderer;
@Service("messageRenderer")
public class StandardOutMessageRenderer implements MessageRenderer {
	

private MessageProvider messageProvider = null;

public void render() {
if (messageProvider == null) {
throw new RuntimeException(
"You must set the property messageProvider of class:"
+ StandardOutMessageRenderer.class.getName());
}
System.out.println(messageProvider.getMessage());
}
public void setMessageProvider(MessageProvider provider) {
this.messageProvider = provider;
}
public MessageProvider getMessageProvider() {
return this.messageProvider;
}
}