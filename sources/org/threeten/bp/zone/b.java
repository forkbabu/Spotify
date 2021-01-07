package org.threeten.bp.zone;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public abstract class b {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final AtomicReference<b> b = new AtomicReference<>();

    /* access modifiers changed from: package-private */
    public static class a extends b {
        a() {
        }

        /* access modifiers changed from: protected */
        @Override // org.threeten.bp.zone.b
        public void b() {
            Iterator it = ServiceLoader.load(c.class, c.class.getClassLoader()).iterator();
            while (it.hasNext()) {
                try {
                    c.e((c) it.next());
                } catch (ServiceConfigurationError e) {
                    if (!(e.getCause() instanceof SecurityException)) {
                        throw e;
                    }
                }
            }
        }
    }

    static void a() {
        if (!a.getAndSet(true)) {
            AtomicReference<b> atomicReference = b;
            atomicReference.compareAndSet(null, new a());
            atomicReference.get().b();
            return;
        }
        throw new IllegalStateException("Already initialized");
    }

    public static void c(b bVar) {
        if (a.get()) {
            throw new IllegalStateException("Already initialized");
        } else if (!b.compareAndSet(null, bVar)) {
            throw new IllegalStateException("Initializer was already set, possibly with a default during initialization");
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b();
}
