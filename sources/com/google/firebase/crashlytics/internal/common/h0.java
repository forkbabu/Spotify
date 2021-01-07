package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.d;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* access modifiers changed from: package-private */
public class h0 implements Thread.UncaughtExceptionHandler {
    private final a a;
    private final d b;
    private final Thread.UncaughtExceptionHandler c;
    private final AtomicBoolean d = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    public interface a {
    }

    public h0(a aVar, d dVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = aVar;
        this.b = dVar;
        this.c = uncaughtExceptionHandler;
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.d.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.d.set(true);
        if (thread == null) {
            try {
                ty.f().d("Could not handle uncaught exception; null thread");
            } catch (Exception e) {
                ty.f().e("An error occurred in the uncaught exception handler", e);
            } catch (Throwable th2) {
                ty.f().b("Crashlytics completed exception processing. Invoking default exception handler.");
                this.c.uncaughtException(thread, th);
                this.d.set(false);
                throw th2;
            }
        } else if (th == null) {
            ty.f().d("Could not handle uncaught exception; null throwable");
        } else {
            a aVar = this.a;
            m.this.M(this.b, thread, th);
        }
        ty.f().b("Crashlytics completed exception processing. Invoking default exception handler.");
        this.c.uncaughtException(thread, th);
        this.d.set(false);
    }
}
