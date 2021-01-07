package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.AdBreakState;
import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.disposables.b;
import io.reactivex.s;
import io.reactivex.subjects.a;

/* renamed from: xr3  reason: default package */
public class xr3 {
    private final s<AdBreakState> a;
    private final zr3 b;
    private b c;
    private final a<AdSlotEvent> d = a.h1();

    public xr3(s<AdBreakState> sVar, zr3 zr3) {
        this.a = sVar;
        this.b = zr3;
    }

    public a<AdSlotEvent> a() {
        return this.d;
    }

    public void b() {
        b bVar = this.c;
        if (bVar == null || bVar.d()) {
            Logger.b("Ad Break: Starting Ad Break Observable", new Object[0]);
            Logger.b("Ad Break: Building PLAY AdSlotEvent Observable", new Object[0]);
            s<R> j0 = this.b.a().Q(mr3.a).a1(this.a, sr3.a).Q(nr3.a).j0(lr3.a);
            a<AdSlotEvent> aVar = this.d;
            aVar.getClass();
            this.c = j0.subscribe(new rr3(aVar), or3.a);
            return;
        }
        Logger.b("Ad Break: Won't start Ad Break Observable since there's a subscription already", new Object[0]);
    }

    public void c() {
        if (this.c != null) {
            Logger.b("Ad Break: Stopping Ad Break Observable", new Object[0]);
            this.c.dispose();
        }
    }
}
