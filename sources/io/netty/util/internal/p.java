package io.netty.util.internal;

import java.security.PrivilegedAction;

/* access modifiers changed from: package-private */
public final class p implements PrivilegedAction<ClassLoader> {
    p() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.security.PrivilegedAction
    public ClassLoader run() {
        return Thread.currentThread().getContextClassLoader();
    }
}
