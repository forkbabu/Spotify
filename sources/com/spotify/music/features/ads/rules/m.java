package com.spotify.music.features.ads.rules;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.model.AdSlot;
import com.spotify.music.features.ads.rules.AdRules;
import io.reactivex.disposables.b;
import java.util.EnumSet;

public class m extends o {
    public static final String f = "m";
    private final EnumSet<AdRules.StateType> a;
    private final EnumSet<AdRules.StateType> b;
    private final EnumSet<AdRules.StateType> c = EnumSet.noneOf(AdRules.StateType.class);
    private final SlotApi d;
    private b e;

    public m(SlotApi slotApi) {
        AdRules.StateType stateType = AdRules.StateType.CAR_CONNECTED;
        AdRules.StateType stateType2 = AdRules.StateType.DISABLED_NAVIGATION_ITEM;
        AdRules.StateType stateType3 = AdRules.StateType.WIFI_DISCONNECTED;
        this.a = EnumSet.of(stateType, stateType2, stateType3, AdRules.StateType.ON_SPONSORED_PAGE, AdRules.StateType.PLAYING_SOCIAL_ON_DEMAND_TRACK);
        this.b = EnumSet.of(stateType2, stateType, stateType3);
        this.d = slotApi;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.music.features.ads.rules.o
    public void a() {
        b bVar = this.e;
        if (bVar != null && !bVar.d()) {
            this.e.dispose();
        }
    }

    @Override // com.spotify.music.features.ads.rules.o
    public boolean b() {
        return this.c.isEmpty();
    }

    @Override // com.spotify.music.features.ads.rules.o
    public void c(j jVar) {
        if (!this.a.contains(jVar.a)) {
            return;
        }
        if (jVar.b) {
            AdRules.StateType stateType = jVar.a;
            if (!this.b.contains(stateType) || !this.c.contains(stateType)) {
                boolean b2 = b();
                this.c.add(stateType);
                if (b2 && e()) {
                    Logger.b("%s onDisallowed", d());
                    f();
                    return;
                }
                return;
            }
            return;
        }
        AdRules.StateType stateType2 = jVar.a;
        boolean z = !this.c.isEmpty();
        this.c.remove(stateType2);
        if (z && b()) {
            Logger.b("%s onAllowed", d());
        }
    }

    /* access modifiers changed from: protected */
    public String d() {
        return f;
    }

    public boolean e() {
        return !this.c.isEmpty();
    }

    /* access modifiers changed from: protected */
    public void f() {
        String str = f;
        Logger.b("%s clearing preroll", str);
        String slotId = AdSlot.PREROLL.getSlotId();
        this.e = this.d.a(slotId, SlotApi.Intent.CLEAR).subscribe(new b(slotId), new a(slotId));
        Logger.b("%s disabling preroll", str);
    }
}
