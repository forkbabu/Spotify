package io.netty.util.internal;

import java.security.PrivilegedAction;

/* access modifiers changed from: package-private */
public final class o implements PrivilegedAction<ClassLoader> {
    final /* synthetic */ Class a;

    o(Class cls) {
        this.a = cls;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.security.PrivilegedAction
    public ClassLoader run() {
        return this.a.getClassLoader();
    }
}
