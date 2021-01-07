package com.facebook.appevents;

import android.preference.PreferenceManager;
import com.facebook.k;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* access modifiers changed from: package-private */
public class a {
    private static ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    private static String b;
    private static volatile boolean c = false;

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.appevents.a$a  reason: collision with other inner class name */
    public static class RunnableC0065a implements Runnable {
        RunnableC0065a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    a.c();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    public static String b() {
        if (!c) {
            c();
        }
        a.readLock().lock();
        try {
            return b;
        } finally {
            a.readLock().unlock();
        }
    }

    /* access modifiers changed from: private */
    public static void c() {
        if (!c) {
            a.writeLock().lock();
            try {
                if (!c) {
                    b = PreferenceManager.getDefaultSharedPreferences(k.d()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                    c = true;
                    a.writeLock().unlock();
                }
            } finally {
                a.writeLock().unlock();
            }
        }
    }

    public static void d() {
        if (!c) {
            e.a().execute(new RunnableC0065a());
        }
    }
}
