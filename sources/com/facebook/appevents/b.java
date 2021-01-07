package com.facebook.appevents;

import android.content.Context;
import com.facebook.k;
import java.util.HashMap;
import java.util.Set;

/* access modifiers changed from: package-private */
public class b {
    private final HashMap<AccessTokenAppIdPair, j> a = new HashMap<>();

    private synchronized j e(AccessTokenAppIdPair accessTokenAppIdPair) {
        j jVar;
        jVar = this.a.get(accessTokenAppIdPair);
        if (jVar == null) {
            Context d = k.d();
            jVar = new j(com.facebook.internal.b.e(d), e.b(d));
        }
        this.a.put(accessTokenAppIdPair, jVar);
        return jVar;
    }

    public synchronized void a(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        e(accessTokenAppIdPair).a(appEvent);
    }

    public synchronized void b(PersistedEvents persistedEvents) {
        for (AccessTokenAppIdPair accessTokenAppIdPair : persistedEvents.d()) {
            j e = e(accessTokenAppIdPair);
            for (AppEvent appEvent : persistedEvents.c(accessTokenAppIdPair)) {
                e.a(appEvent);
            }
        }
    }

    public synchronized j c(AccessTokenAppIdPair accessTokenAppIdPair) {
        return this.a.get(accessTokenAppIdPair);
    }

    public synchronized int d() {
        int i;
        i = 0;
        for (j jVar : this.a.values()) {
            i += jVar.c();
        }
        return i;
    }

    public synchronized Set<AccessTokenAppIdPair> f() {
        return this.a.keySet();
    }
}
