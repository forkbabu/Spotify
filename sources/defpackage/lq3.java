package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.a2;
import com.spotify.music.features.ads.g0;
import com.spotify.music.features.ads.model.AdSlot;
import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.music.features.ads.model.Format;
import com.spotify.rxjava2.q;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

/* renamed from: lq3  reason: default package */
public class lq3 {
    private final q a = new q();
    private final a2 b;
    private final zr3 c;
    private final y d;
    private final ds3 e;
    private final tt3 f;
    private final ms3 g;

    /* renamed from: lq3$a */
    static class a implements g<AdSlotEvent> {
        private final ms3 a;

        public a(ms3 ms3) {
            this.a = ms3;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(AdSlotEvent adSlotEvent) {
            AdSlotEvent adSlotEvent2 = adSlotEvent;
            if (adSlotEvent2.getFormat() == Format.AUDIO) {
                this.a.accept(adSlotEvent2);
            }
        }
    }

    public lq3(ds3 ds3, tt3 tt3, ms3 ms3, zr3 zr3, y yVar, a2 a2Var) {
        this.e = ds3;
        this.f = tt3;
        this.b = a2Var;
        this.g = ms3;
        this.c = zr3;
        this.d = yVar;
    }

    public void a(g0 g0Var) {
        this.a.a(this.c.a().Q(dq3.a).subscribe(new a(this.g), eq3.a));
        if (g0Var.d()) {
            e(AdSlot.PREROLL);
        }
        if (g0Var.b()) {
            e(AdSlot.WATCHNOW);
        }
        if (g0Var.c()) {
            e(AdSlot.MIDROLL_WATCHNOW);
        }
        e(AdSlot.STREAM);
        boolean a2 = g0Var.a();
        zr3 zr3 = this.c;
        if (a2) {
            AdSlot adSlot = AdSlot.SPONSORED_PLAYLIST;
            this.a.a(this.e.a(adSlot).N(new gq3(this, adSlot)).J0(new hq3(zr3)).W(new kq3(this), false, Integer.MAX_VALUE).subscribe(this.f, jq3.a));
        }
    }

    public void b() {
        Logger.b("AdSubscriptions are being destroyed.", new Object[0]);
        this.a.c();
    }

    public /* synthetic */ void c(AdSlot adSlot, Response response) {
        if (response.getStatus() < 200 || response.getStatus() >= 300) {
            Logger.b("failed to register %s because %s", adSlot.slot_id, response.getBodyString());
        } else {
            Logger.g("registered adslot %s", adSlot.slot_id);
        }
        adSlot.onRegistered(this.b);
    }

    public /* synthetic */ v d(AdSlotEvent adSlotEvent) {
        return s.i0(adSlotEvent).o0(adSlotEvent.getAd().isPreview() ? io.reactivex.android.schedulers.a.b() : this.d);
    }

    public void e(AdSlot adSlot) {
        this.a.a(this.e.a(adSlot).subscribe(new gq3(this, adSlot), new iq3(adSlot)));
    }
}
