package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;

public class a {
    private static a d;
    private UUID a = UUID.randomUUID();
    private Intent b;
    private int c;

    public a(int i) {
        this.c = i;
    }

    public static synchronized a a(UUID uuid, int i) {
        synchronized (a.class) {
            a aVar = d;
            if (aVar != null && aVar.a.equals(uuid)) {
                if (aVar.c == i) {
                    e(null);
                    return aVar;
                }
            }
            return null;
        }
    }

    private static synchronized boolean e(a aVar) {
        boolean z;
        synchronized (a.class) {
            a aVar2 = d;
            d = aVar;
            z = aVar2 != null;
        }
        return z;
    }

    public UUID b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    public Intent d() {
        return this.b;
    }

    public boolean f() {
        return e(this);
    }

    public void g(Intent intent) {
        this.b = intent;
    }
}
