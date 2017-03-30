package org.elasticsearch.plugin.example;

import org.elasticsearch.common.collect.Lists; import org.elasticsearch.common.inject.Module; import org.elasticsearch.plugins.AbstractPlugin;
import java.util.Collection;
public class ExamplePlugin extends AbstractPlugin {


    public String name() {
        return "example-plugin";
    }

    public String description() {
        return "Example Plugin Description";
    }
    public Collection<Class<? extends Module>> modules() {

        Collection<Class<? extends Module>> modules = Lists.newArrayList();

        modules.add(ExampleRestModule.class); return modules;

    }

}
