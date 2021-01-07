package com.spotify.mobile.android.spotlets.appprotocol.service;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.w3;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$HelloDetails;
import com.spotify.music.appprotocol.api.session.b;
import io.reactivex.s;
import io.reactivex.subjects.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class k0 {
    private final Map<Integer, b> a = new LinkedHashMap();
    private final a<List<b>> b = a.h1();

    public s<List<b>> a() {
        return this.b;
    }

    public List<b> b() {
        return new ArrayList(this.a.values());
    }

    public void c(w3 w3Var) {
        int c = w3Var.c();
        this.a.put(Integer.valueOf(c), new b(w3Var));
        Logger.b("Session created: %d", Integer.valueOf(c));
        this.b.onNext(b());
    }

    public void d(w3 w3Var) {
        int c = w3Var.c();
        this.a.remove(Integer.valueOf(c));
        Logger.b("Session stopped: %d", Integer.valueOf(c));
        this.b.onNext(b());
    }

    public void e(w3 w3Var) {
        b bVar = this.a.get(Integer.valueOf(w3Var.c()));
        if (bVar != null) {
            com.spotify.music.appprotocol.api.session.a a2 = bVar.a();
            HelloDetailsAppProtocol$HelloDetails b2 = (a2 == null || !a2.e()) ? null : a2.b();
            if (b2 != null) {
                Logger.b("Session updated: %s", b2.info);
                this.b.onNext(b());
                return;
            }
            return;
        }
        Assertion.g("Called update on stopped session.");
    }
}
