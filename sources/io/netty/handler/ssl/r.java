package io.netty.handler.ssl;

import java.io.IOException;
import java.io.InputStream;
import java.security.PrivilegedAction;
import java.util.Properties;
import org.apache.tomcat.Apr;

final class r implements PrivilegedAction<Boolean> {
    r() {
    }

    /* renamed from: a */
    public Boolean run() {
        InputStream inputStream = null;
        try {
            InputStream resourceAsStream = Apr.class.getResourceAsStream("/org/apache/tomcat/apr.properties");
            Properties properties = new Properties();
            properties.load(resourceAsStream);
            String property = properties.getProperty("tcn.info");
            Boolean valueOf = Boolean.valueOf(property != null && property.startsWith("netty-tcnative"));
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (IOException unused) {
                }
            }
            return valueOf;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
