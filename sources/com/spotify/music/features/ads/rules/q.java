package com.spotify.music.features.ads.rules;

import com.spotify.music.features.ads.api.e;
import com.spotify.music.features.ads.api.f;
import com.spotify.music.features.ads.model.AdSlot;
import com.spotify.music.features.ads.rules.AdRules;
import io.reactivex.disposables.a;
import java.util.EnumMap;
import java.util.Map;

public class q extends o {
    private final Map<AdRules.StateType, Boolean> a = new EnumMap(AdRules.StateType.class);
    private final f b;
    private final e c;
    private final a d = new a();

    public q(f fVar, e eVar) {
        this.b = fVar;
        this.c = eVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.ads.rules.o
    public void a() {
        this.d.f();
    }

    @Override // com.spotify.music.features.ads.rules.o
    public boolean b() {
        return !d();
    }

    @Override // com.spotify.music.features.ads.rules.o
    public void c(j jVar) {
        if (jVar.a == AdRules.StateType.PLAYING_FROM_SPONSORED_CONTEXT) {
            boolean b2 = b();
            this.a.put(jVar.a, Boolean.valueOf(jVar.b));
            boolean b3 = b();
            if (b2 == b3) {
                return;
            }
            if (b3) {
                e();
            } else {
                f(Boolean.FALSE);
            }
        }
    }

    public boolean d() {
        Map<AdRules.StateType, Boolean> map = this.a;
        AdRules.StateType stateType = AdRules.StateType.PLAYING_FROM_SPONSORED_CONTEXT;
        return map.containsKey(stateType) && this.a.get(stateType).booleanValue();
    }

    /* access modifiers changed from: protected */
    public void e() {
        this.d.b(this.b.getState().subscribe(new d(this), f.a));
    }

    public void f(Boolean bool) {
        this.d.b(this.c.d(AdSlot.MIDROLL_WATCHNOW.getSlotId(), "slot_enabled", bool.toString()).subscribe(new e(bool), new c(bool)));
    }
}
