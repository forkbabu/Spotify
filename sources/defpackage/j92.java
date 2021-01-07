package defpackage;

import android.app.Application;
import android.content.Context;
import com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection;
import com.spotify.remoteconfig.rb;
import com.spotify.rxjava2.p;
import defpackage.o92;
import io.reactivex.y;

/* renamed from: j92  reason: default package */
public class j92 {
    static final o92 m = new b();
    o92 a = m;
    private final Context b;
    private final y c;
    private final com.spotify.mobile.android.waze.sdkprotocol.a d;
    private final o92 e;
    private final o92 f;
    private final g92 g;
    private final com.spotify.mobile.android.waze.model.b h;
    private final r92 i;
    private final wlf<rb> j;
    private final p k = new p();
    final o92.a l = new a();

    /* renamed from: j92$a */
    class a implements o92.a {
        a() {
        }

        @Override // defpackage.o92.a
        public void a(WazeTransportDrivingDirection wazeTransportDrivingDirection) {
            j92.c(j92.this, wazeTransportDrivingDirection);
        }

        @Override // defpackage.o92.a
        public void b(boolean z) {
            if (!z) {
                j92.c(j92.this, WazeTransportDrivingDirection.NONE);
            }
        }

        @Override // defpackage.o92.a
        public void c(boolean z) {
            j92.this.g.h(z);
        }

        @Override // defpackage.o92.a
        public void d(int i) {
            j92.this.g.i(String.valueOf(i));
            j92.this.l();
        }

        @Override // defpackage.o92.a
        public void e(String str) {
            j92.this.g.getClass();
        }

        @Override // defpackage.o92.a
        public void f(String str, String str2) {
            j92.this.g.k(str);
            j92.this.g.l(str2);
            j92.this.l();
        }

        @Override // defpackage.o92.a
        public void g() {
        }

        @Override // defpackage.o92.a
        public void h(boolean z) {
            if (z) {
                j92.this.g.k("");
                j92.this.l();
                return;
            }
            j92.c(j92.this, WazeTransportDrivingDirection.NONE);
            j92.d(j92.this);
        }

        @Override // defpackage.o92.a
        public void i(String str) {
            j92.this.g.getClass();
        }
    }

    /* renamed from: j92$b */
    static class b implements o92 {
        b() {
        }

        @Override // defpackage.o92
        public void a() {
        }

        @Override // defpackage.o92
        public boolean b() {
            return false;
        }

        @Override // defpackage.o92
        public void c(o92.a aVar) {
        }

        @Override // defpackage.o92
        public void stop() {
        }
    }

    public j92(Application application, y yVar, com.spotify.mobile.android.waze.sdkprotocol.a aVar, o92 o92, o92 o922, g92 g92, com.spotify.mobile.android.waze.model.b bVar, r92 r92, wlf<rb> wlf) {
        this.b = application;
        this.c = yVar;
        this.d = aVar;
        this.e = o92;
        this.f = o922;
        this.g = g92;
        this.h = bVar;
        this.i = r92;
        this.j = wlf;
    }

    static void c(j92 j92, WazeTransportDrivingDirection wazeTransportDrivingDirection) {
        j92.g.e();
        j92.g.j(wazeTransportDrivingDirection);
        int ordinal = wazeTransportDrivingDirection.ordinal();
        if (!(ordinal == 6 || ordinal == 7)) {
            j92.g.i("");
        }
        j92.l();
    }

    static void d(j92 j92) {
        j92.k.a();
        if (j92.i()) {
            j92.a.stop();
            j92.a = m;
        }
    }

    private boolean f() {
        return this.g.c() == null && this.a.b();
    }

    private boolean i() {
        o92 o92;
        return !this.j.get().a() || ((o92 = this.a) != m && o92.b());
    }

    /* access modifiers changed from: private */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (r5 != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0088, code lost:
        if (r5 != false) goto L_0x00b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        r7 = com.spotify.music.C0707R.drawable.waze_directions_roundabout_enter;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l() {
        /*
        // Method dump skipped, instructions count: 462
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j92.l():void");
    }

    public void e() {
        this.k.a();
        if (i()) {
            this.a.stop();
            this.a = m;
        }
    }

    public void g() {
        if (!i()) {
            o92 o92 = this.f;
            this.a = o92;
            o92.c(this.l);
        }
    }

    public void h() {
        if (!i()) {
            o92 o92 = this.e;
            this.a = o92;
            o92.c(this.l);
        }
    }

    public void j(Boolean bool) {
        if (bool.booleanValue()) {
            if (!i()) {
                o92 o92 = this.f;
                this.a = o92;
                o92.c(this.l);
            }
        } else if (!i()) {
            o92 o922 = this.e;
            this.a = o922;
            o922.c(this.l);
        }
        this.a.a();
    }

    public void k() {
        if (i()) {
            this.a.a();
        } else {
            this.k.b(this.d.b(this.b).B(this.c).subscribe(new z82(this)));
        }
    }
}
