package de.mrfrey.scse.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class StartupEventListener implements ApplicationListener<ApplicationReadyEvent> {
    private static final Logger logger = LoggerFactory.getLogger( StartupEventListener.class );

    @Autowired
    private MessageChannel output;

    @Override
    public void onApplicationEvent( ApplicationReadyEvent event ) {
        logger.info( "event {}", event, new Throwable().fillInStackTrace() );
//        output.send( MessageBuilder.withPayload( event.toString() ).build() );
    }
}
