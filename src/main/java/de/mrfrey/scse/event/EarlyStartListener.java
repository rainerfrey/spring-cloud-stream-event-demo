package de.mrfrey.scse.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EarlyStartListener implements ApplicationListener<ApplicationStartingEvent> {
    private static final Logger logger = LoggerFactory.getLogger( EarlyStartListener.class );

    @Override
    public void onApplicationEvent( ApplicationStartingEvent event ) {
        logger.info( "event {}", event );
    }
}
