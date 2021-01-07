package com.spotify.music.features.ads.rules;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.api.h;
import com.spotify.music.features.ads.model.Targetings;
import com.spotify.music.features.ads.rules.AdRules;
import java.util.Collections;
import java.util.EnumSet;

public class k extends o {
    private final EnumSet<AdRules.StateType> a = EnumSet.of(AdRules.StateType.MIDROLL_VIDEO_ADS, AdRules.StateType.WATCH_NOW_SLOT);
    private final EnumSet<AdRules.StateType> b = EnumSet.of(AdRules.StateType.CAR_CONNECTED, AdRules.StateType.WIFI_DISCONNECTED, AdRules.StateType.PLAYING_FROM_SPONSORED_CONTEXT);
    private final io.reactivex.disposables.a c = new io.reactivex.disposables.a();
    private final EnumSet<AdRules.StateType> d = EnumSet.noneOf(AdRules.StateType.class);
    private boolean e = false;
    private final h f;

    /* access modifiers changed from: private */
    public static class b extends io.reactivex.observers.a<Targetings> {
        b(a aVar) {
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onComplete() {
            Logger.b("Request for updating targeting information completed", new Object[0]);
        }

        @Override // io.reactivex.x, io.reactivex.c
        public void onError(Throwable th) {
            Logger.b("Error in making request to targeting endpoint: %s", th.getMessage());
        }

        @Override // io.reactivex.x
        public void onNext(Object obj) {
            Targetings targetings = (Targetings) obj;
            Logger.b("Targeting information posted successfully", new Object[0]);
        }
    }

    public k(h hVar) {
        this.f = hVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.ads.rules.o
    public void a() {
        this.c.f();
    }

    @Override // com.spotify.music.features.ads.rules.o
    public boolean b() {
        return this.d.containsAll(this.a) && Collections.disjoint(this.d, this.b);
    }

    @Override // com.spotify.music.features.ads.rules.o
    public void c(j jVar) {
        if (this.a.contains(jVar.a) || this.b.contains(jVar.a)) {
            if (jVar.b) {
                this.d.add(jVar.a);
            } else {
                this.d.remove(jVar.a);
            }
            if (b()) {
                e();
            } else {
                d();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (this.e) {
            this.e = false;
            b bVar = new b(null);
            this.f.a("ad-product", "no-midroll-watch-now").B0().P().subscribe(bVar);
            this.c.b(bVar);
            Logger.b("MidRollTargeting DePatched", new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public void e() {
        if (!this.e) {
            this.e = true;
            b bVar = new b(null);
            this.f.a("ad-product", "midroll-watch-now").B0().P().subscribe(bVar);
            this.c.b(bVar);
            Logger.b("MidRollTargeting Patched", new Object[0]);
        }
    }
}
