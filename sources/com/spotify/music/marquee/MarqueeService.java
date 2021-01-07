package com.spotify.music.marquee;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.ads.api.e;
import com.spotify.music.marquee.trigger.MarqueeTriggerModel;
import com.spotify.music.marquee.trigger.f0;
import com.spotify.music.marquee.trigger.h0;
import com.spotify.rxjava2.p;
import dagger.android.g;
import io.reactivex.s;

public class MarqueeService extends g {
    public static final /* synthetic */ int q = 0;
    private final a a = new a();
    ds3 b;
    e c;
    MobiusLoop.f<MarqueeTriggerModel, h0, f0> f;
    boolean n;
    private final p o = new p();
    private MobiusLoop<MarqueeTriggerModel, h0, f0> p;

    public class a extends Binder {
        public a() {
        }
    }

    public void e() {
        this.o.a();
        Logger.b("[Marquee] - stop MarqueeService", new Object[0]);
        MobiusLoop<MarqueeTriggerModel, h0, f0> mobiusLoop = this.p;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
            this.p = null;
        }
    }

    /* access modifiers changed from: protected */
    public void f(Response response) {
        if (response.getStatus() == 200 || response.getStatus() == 202) {
            Logger.b("[Marquee] - start MarqueeService", new Object[0]);
            if (this.p == null) {
                this.p = this.f.g(MarqueeTriggerModel.a);
                return;
            }
            return;
        }
        Logger.b("[Marquee] - stop MarqueeService", new Object[0]);
        MobiusLoop<MarqueeTriggerModel, h0, f0> mobiusLoop = this.p;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
            this.p = null;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.a;
    }

    @Override // dagger.android.g, android.app.Service
    public void onCreate() {
        Logger.b("[Marquee] - onCreate service", new Object[0]);
        super.onCreate();
        this.o.b(s.i0(Boolean.valueOf(this.n)).Q(b.a).J0(new a(this)).Q(d.a).W(new c(this), false, Integer.MAX_VALUE).subscribe(new e(this)));
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.b("[Marquee] - onDestroy service", new Object[0]);
        e();
        super.onDestroy();
    }
}
