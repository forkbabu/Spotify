package com.spotify.music.features.ads.screensaver;

import android.content.Context;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.x;
import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.api.e;
import com.spotify.music.features.ads.model.Ad;
import com.spotify.music.features.ads.model.AdSlot;
import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.rxjava2.p;
import com.spotify.rxjava2.q;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.h0;
import com.squareup.picasso.z;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public class n0 implements g<AdSlotEvent> {
    protected static final long x = TimeUnit.MINUTES.toMillis(5);
    public static final /* synthetic */ int y = 0;
    private final Context a;
    private final q b = new q();
    private final h0 c;
    private final e f;
    private final SlotApi n;
    private final jp3 o;
    private final y p;
    private final ajf<Picasso> q;
    private boolean r;
    private boolean s;
    private Ad t;
    private a u;
    private final p v = new p();
    private final p w = new p();

    public interface a {
    }

    public n0(Context context, e eVar, SlotApi slotApi, ajf<Picasso> ajf, jp3 jp3, y yVar) {
        this.a = context;
        this.f = eVar;
        this.n = slotApi;
        this.o = jp3;
        this.p = yVar;
        this.q = ajf;
        this.s = true;
        this.c = new v0();
    }

    public static s i(n0 n0Var, long j) {
        n0Var.getClass();
        return s.X0(j, TimeUnit.MILLISECONDS, n0Var.p);
    }

    private void p(SlotApi.Intent intent, String str) {
        String slotId = AdSlot.MOBILE_SCREENSAVER.getSlotId();
        this.b.a(this.n.a(slotId, intent).subscribe(new i(str, slotId), new p(str, slotId)));
    }

    /* renamed from: a */
    public void accept(AdSlotEvent adSlotEvent) {
        if (AdSlotEvent.Event.AVAILABLE == adSlotEvent.getEvent()) {
            Ad ad = adSlotEvent.getAd();
            this.t = ad;
            if (ad.isPreview()) {
                d();
                return;
            }
            Ad ad2 = this.t;
            ad2.getClass();
            if (!ad2.getImages().isEmpty()) {
                e(ad2).h(new m0(this));
            }
        } else if (AdSlotEvent.Event.DISCARD == adSlotEvent.getEvent()) {
            boolean f2 = f();
            this.t = null;
            if (f2) {
                p(SlotApi.Intent.FETCH, "fetchAdFromSlot");
            }
        }
    }

    public void c() {
        this.b.c();
    }

    public void d() {
        p(SlotApi.Intent.NOW, "triggerNextAdOnSlot");
        Ad ad = this.t;
        if (ad != null) {
            if (!ad.getImages().isEmpty() || (!ad.getVideos().isEmpty())) {
                ((b) this.u).a.d(ad);
            } else {
                Logger.b("Consumed dummy ad", new Object[0]);
            }
            this.t = null;
        }
    }

    public z e(Ad ad) {
        z l = this.q.get().l(Uri.parse(ad.getImages().get(0).getUrl()));
        l.x(this.c);
        l.q();
        return l;
    }

    public boolean f() {
        return this.t != null;
    }

    public boolean g() {
        return this.r;
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return this.a.getResources().getConfiguration().orientation == 1;
    }

    public void j() {
        if (this.o.b()) {
            this.w.b(s.X0(TimeUnit.SECONDS.toMillis((long) this.o.a()), TimeUnit.MILLISECONDS, this.p).subscribe(new q(this), m.a));
        } else {
            this.v.b(this.f.b(AdSlot.MOBILE_SCREENSAVER.getSlotId()).j0(o.a).r0(l.a).J0(new n(this)).subscribe(new r(this), k.a));
        }
    }

    public /* synthetic */ void k(Long l) {
        p(SlotApi.Intent.FETCH, "fetchAudioPlusLeaveBehind");
    }

    public /* synthetic */ void l(Long l) {
        p(SlotApi.Intent.FETCH, "fetchAdFromSlot");
    }

    public void m(boolean z) {
        this.r = z && !x.g(this.a);
    }

    public void n() {
        if (this.r && !f()) {
            this.v.a();
            this.w.a();
            AdSlot.MOBILE_SCREENSAVER.registerAdRequest(new j(this));
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x002e: APUT  
      (r0v1 java.lang.Object[])
      (3 ??[int, float, short, byte, char])
      (wrap: java.lang.Boolean : 0x0029: INVOKE  (r1v9 java.lang.Boolean) = (r1v8 boolean) type: STATIC call: java.lang.Boolean.valueOf(boolean):java.lang.Boolean)
     */
    public void o() {
        Object[] objArr = new Object[6];
        boolean z = false;
        objArr[0] = Boolean.valueOf(this.r);
        objArr[1] = Boolean.valueOf(this.o.b());
        objArr[2] = Boolean.valueOf(this.s);
        objArr[3] = Boolean.valueOf(this.u != null);
        objArr[4] = Boolean.valueOf(f());
        objArr[5] = Boolean.valueOf(h());
        Logger.b("Opportunity to render: isFeatureEnabled:%s, isAudioPlusFetchEnabled:%s, isPermitted:%s, hasConsumer:%s, hasPendingAd:%s, isInPortraitMode:%s", objArr);
        this.v.a();
        this.w.a();
        if (f() && this.s) {
            if ((this.u != null) && h()) {
                z = true;
            }
        }
        if (z) {
            d();
        }
    }

    public void q(a aVar) {
        this.u = aVar;
    }

    public void r(boolean z) {
        this.s = z;
    }
}
