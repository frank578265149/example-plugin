package org.elasticsearch.plugin.example;

import org.elasticsearch.common.inject.AbstractModule;
/**
 * Created by frank on 17-3-30.
 */
public class ExampleRestModule  extends AbstractModule {

    @Override
    protected void configure() {
        bind(HelloRestHandler.class).asEagerSingleton();
    }
}
