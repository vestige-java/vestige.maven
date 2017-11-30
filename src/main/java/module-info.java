module fr.gaellalire.vestige.maven {
    
    requires org.apache.maven.resolver;

    requires org.apache.maven.resolver.impl;

    requires org.apache.maven.resolver.spi;

    requires org.apache.maven.resolver.util;

    exports org.apache.maven.settings.building;

    exports org.apache.maven.model;
    
    exports org.apache.maven.model.building;
    
    exports org.apache.maven.model.superpom;
    
    exports org.apache.maven.repository.internal;
    
    exports org.apache.maven.settings;
    
}
