package com.spotify.mobile.android.service.media;

import com.spotify.base.java.logging.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class y2 {
    private final Map<String, z1> a = new ConcurrentHashMap(3);

    public void a(String str, z1 z1Var) {
        this.a.put(str, z1Var);
        Logger.g("EIS consumer %s registered", str);
    }

    public void b() {
        if (!this.a.isEmpty()) {
            Logger.g("Shutting down all EIS consumers", new Object[0]);
            for (z1 z1Var : this.a.values()) {
                z1Var.j();
            }
        }
    }

    public void c(String str) {
        this.a.remove(str);
        Logger.g("EIS consumer %s unregistered", str);
    }
}
