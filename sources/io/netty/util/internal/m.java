package io.netty.util.internal;

import java.security.PrivilegedAction;

/* access modifiers changed from: package-private */
public final class m implements PrivilegedAction<String> {
    m() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.security.PrivilegedAction
    public String run() {
        return System.getProperty("java.specification.version");
    }
}
