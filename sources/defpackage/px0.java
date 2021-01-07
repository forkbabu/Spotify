package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.util.connectivity.r;
import com.spotify.mobile.android.util.t;
import com.spotify.pses.v1.proto.ClientData;
import com.spotify.pses.v1.proto.DeviceInformation;
import com.spotify.pses.v1.proto.Screen;

/* renamed from: px0  reason: default package */
public class px0 implements ox0 {
    private final String a;
    private final String b;
    private final t c;
    private final DisplayMetrics d;
    private final b e;
    private final a f;
    private final wx0 g;
    private final yx0 h;

    /* renamed from: px0$a */
    static class a {
        private final Context a;

        public a(Activity activity) {
            this.a = activity;
        }

        /* access modifiers changed from: package-private */
        public ConnectionType a() {
            return r.a(this.a);
        }
    }

    /* renamed from: px0$b */
    static class b {
        private final Context a;

        public b(Activity activity) {
            this.a = activity;
        }

        /* access modifiers changed from: package-private */
        public long a() {
            return pf.e(this.a);
        }
    }

    public px0(String str, com.spotify.music.spotlets.tracker.identifier.a aVar, t tVar, DisplayMetrics displayMetrics, b bVar, a aVar2, wx0 wx0, yx0 yx0) {
        this.a = str;
        this.b = aVar.b();
        this.c = tVar;
        this.d = displayMetrics;
        this.e = bVar;
        this.f = aVar2;
        this.g = wx0;
        this.h = yx0;
    }

    @Override // defpackage.ox0
    public ClientData get() {
        int i;
        ClientData.b r = ClientData.r();
        r.t(this.b);
        r.r(this.c.c().split("-")[0]);
        r.o(this.a);
        r.q("android");
        Screen.b m = Screen.m();
        m.m(this.d.heightPixels);
        m.o(this.d.widthPixels);
        m.n(this.d.density);
        r.s((Screen) m.build());
        DeviceInformation.b p = DeviceInformation.p();
        this.e.getClass();
        p.q(String.valueOf(Build.VERSION.SDK_INT));
        this.e.getClass();
        p.m(Build.BRAND);
        this.e.getClass();
        p.p(Build.MODEL);
        p.o(this.g.a());
        long a2 = this.e.a();
        if (a2 == -1) {
            i = -1;
        } else {
            i = (int) ((a2 / 1000) / 1000);
        }
        p.r(i);
        p.n(this.f.a().toString());
        r.n((DeviceInformation) p.build());
        r.p(this.h.a());
        r.m(this.c.y());
        return (ClientData) r.build();
    }
}
