package defpackage;

import android.content.Context;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.appprotocol.volume.m;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.g7;
import defpackage.ff2;
import io.reactivex.g;
import io.reactivex.y;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ks1  reason: default package */
public final class ks1 {
    private final Context a;
    private final ff2.a b;
    private final Map<String, ff2> c = new HashMap(15);
    private final v1 d;
    private final y e;
    private final y f;
    private final hl2 g;
    private final w h;
    private final g<PlayerState> i;
    private final cqe j;
    private final ai2 k;
    private final mg2 l;
    private final hh2 m;
    private final g7 n;
    private final ts1 o;

    public ks1(ff2.a aVar, v1 v1Var, Context context, y yVar, y yVar2, hl2 hl2, w wVar, g<PlayerState> gVar, cqe cqe, ai2 ai2, mg2 mg2, hh2 hh2, g7 g7Var, ts1 ts1) {
        this.a = context;
        this.d = v1Var;
        this.b = aVar;
        this.e = yVar;
        this.f = yVar2;
        this.g = hl2;
        this.h = wVar;
        this.i = gVar;
        this.j = cqe;
        this.k = ai2;
        this.l = mg2;
        this.m = hh2;
        this.n = g7Var;
        this.o = ts1;
    }

    public ff2 a(String str) {
        Map<String, ff2> map = this.c;
        str.getClass();
        return map.get(str);
    }

    public ff2 b(int i2) {
        for (ff2 ff2 : this.c.values()) {
            if (ff2.a(i2)) {
                return ff2;
            }
        }
        return null;
    }

    public void c() {
        bs1 bs1 = new bs1(this.d, this.b, this.e, this.i, this.o);
        ps1 ps1 = new ps1(this.d, this.b, this.e, this.i, this.j, this.o);
        cs1 cs1 = new cs1(this.d, this.b, this.e, this.i, this.o);
        is1 is1 = new is1(this.d, this.b, this.e, this.i, this.o);
        fs1 fs1 = new fs1(this.d, this.b, this.e, this.i, this.o);
        gs1 gs1 = new gs1(this.d, this.b, this.e, this.i, this.o);
        es1 es1 = new es1(this.d, this.b);
        Context context = this.a;
        v1 v1Var = this.d;
        as1 as1 = new as1(context, v1Var, this.b, new tq1(v1Var, this.e, this.i));
        js1 js1 = new js1(this.a, this.d, this.b, this.e);
        xr1 xr1 = new xr1(this.d, this.b);
        ds1 ds1 = new ds1(this.d, this.b, this.e, this.i, this.j, this.o);
        zr1 zr1 = new zr1(this.d, this.h, this.b, this.f);
        os1 os1 = new os1(this.a, this.d, this.b, this.e, this.g);
        hs1 hs1 = new hs1(this.a, this.d, this.b, this.e);
        this.c.put("com.spotify.current_track", bs1);
        this.c.put("com.spotify.track_elapsed", ps1);
        this.c.put("com.spotify.playback_speed", cs1);
        this.c.put("com.spotify.shuffle", is1);
        this.c.put("com.spotify.repeat", fs1);
        this.c.put("com.spotify.saved", gs1);
        this.c.put("com.spotify.rating", es1);
        this.c.put("com.spotify.current_context", as1);
        this.c.put("com.spotify.status", js1);
        this.c.put("com.spotify.alert", xr1);
        this.c.put("com.spotify.player_state", ds1);
        this.c.put("com.spotify.capabilities", zr1);
        this.c.put("com.spotify.token", os1);
        this.c.put("com.spotify.session_state", hs1);
        if (this.n.b()) {
            this.k.a(new sr1(this, "com.spotify.superbird"), this.b);
            this.l.a(new sr1(this, "com.spotify.superbird"), this.b);
            this.m.a(new sr1(this, "com.spotify.superbird"), this.b);
            new yg2(this.d, this.e, this.i).a(new sr1(this, "com.spotify.play_queue"), this.b);
        }
        new m(this.d, this.e).a(new sr1(this, "com.spotify.volume"), this.b);
    }

    public /* synthetic */ void d(String str, String str2, ff2 ff2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('.');
        Assertion.k(str2.startsWith(sb.toString()) || str2.equals(str), "SubscriptionManager must be registered under namespace - %s not in %s", str2, str);
        this.c.put(str2, ff2);
    }

    public void e() {
        this.o.d();
        for (ff2 ff2 : this.c.values()) {
            ff2.g();
        }
    }

    public void f() {
        this.o.e();
        for (ff2 ff2 : this.c.values()) {
            ff2.h();
        }
    }
}
