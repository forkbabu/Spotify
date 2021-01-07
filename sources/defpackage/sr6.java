package defpackage;

import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.o;
import com.spotify.playlist.formatlisttype.a;
import com.spotify.rxjava2.p;
import defpackage.zo6;
import io.reactivex.disposables.c;
import io.reactivex.s;

/* renamed from: sr6  reason: default package */
public class sr6 {
    private static final String m;
    private static final String n;
    public static final /* synthetic */ int o = 0;
    private final ur6 a;
    private final txc b;
    private final yn0 c;
    private final o d;
    private final qr6 e;
    private final ap6 f;
    private final x46 g;
    private final a h;
    private final p i = new p();
    private Optional<String> j = Optional.absent();
    private Optional<LicenseLayout> k = Optional.absent();
    private zo6.b l;

    static {
        String name = sr6.class.getName();
        m = je.x0(name, "key_current_mode");
        n = je.x0(name, "key_license_layout");
    }

    public sr6(ur6 ur6, txc txc, yn0 yn0, o oVar, qr6 qr6, ap6 ap6, x46 x46, a aVar) {
        this.a = ur6;
        this.b = txc;
        this.c = yn0;
        this.d = oVar;
        this.e = qr6;
        this.f = ap6;
        this.g = x46;
        this.h = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.u3 r8) {
        /*
            r7 = this;
            F r0 = r8.a
            r0.getClass()
            java.util.Map r0 = (java.util.Map) r0
            S r8 = r8.b
            r8.getClass()
            com.spotify.playlist.models.k r8 = (com.spotify.playlist.models.k) r8
            com.spotify.playlist.models.j r1 = r8.j()
            com.spotify.playlist.formatlisttype.a r2 = r7.h
            java.lang.String r3 = r1.g()
            com.spotify.playlist.formatlisttype.FormatListType r2 = r2.a(r3)
            zo6$b r3 = new zo6$b
            java.lang.String r4 = r1.getUri()
            java.util.Map r5 = r1.f()
            r3.<init>(r4, r2, r5)
            zo6$b r2 = r7.l
            boolean r2 = r3.equals(r2)
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x005b
            ap6 r2 = r7.f
            zo6 r2 = r2.i(r3)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            com.google.common.base.Optional<java.lang.String> r6 = r7.j
            boolean r6 = r6.isPresent()
            if (r6 == 0) goto L_0x0055
            com.google.common.base.Optional<java.lang.String> r3 = r7.j
            java.lang.Object r3 = r3.get()
            boolean r2 = r2.equals(r3)
            r2 = r2 ^ r4
            goto L_0x005e
        L_0x0055:
            com.google.common.base.Optional r2 = com.google.common.base.Optional.of(r2)
            r7.j = r2
        L_0x005b:
            r7.l = r3
            r2 = 0
        L_0x005e:
            x46 r3 = r7.g
            com.spotify.music.features.playlistentity.configuration.LicenseLayout r8 = r3.a(r8, r0)
            com.google.common.base.Optional<com.spotify.music.features.playlistentity.configuration.LicenseLayout> r0 = r7.k
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x0078
            com.google.common.base.Optional<com.spotify.music.features.playlistentity.configuration.LicenseLayout> r0 = r7.k
            java.lang.Object r0 = r0.get()
            if (r8 == r0) goto L_0x0075
            goto L_0x0076
        L_0x0075:
            r4 = 0
        L_0x0076:
            r5 = r4
            goto L_0x007e
        L_0x0078:
            com.google.common.base.Optional r8 = com.google.common.base.Optional.of(r8)
            r7.k = r8
        L_0x007e:
            if (r2 != 0) goto L_0x0082
            if (r5 == 0) goto L_0x008d
        L_0x0082:
            ur6 r8 = r7.a
            java.lang.String r0 = r1.getUri()
            yn0 r2 = r7.c
            r8.a(r0, r2)
        L_0x008d:
            com.spotify.music.features.playlistentity.o r8 = r7.d
            java.util.Map r0 = r1.f()
            java.lang.String r1 = "request_id"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr6.a(u3):void");
    }

    public void b(Bundle bundle) {
        if (bundle != null) {
            this.k = Optional.fromNullable((LicenseLayout) bundle.getSerializable(n));
            this.j = Optional.fromNullable(bundle.getString(m));
        }
    }

    public void c(Bundle bundle) {
        if (this.j.isPresent()) {
            bundle.putString(m, this.j.get());
        }
        if (this.k.isPresent()) {
            bundle.putSerializable(n, this.k.get());
        }
    }

    public void d(String str) {
        this.i.b(s.n(this.b.b(), this.e.b(str), er6.a).subscribe(new cr6(this), dr6.a));
    }

    public void e() {
        this.i.b(c.a());
    }
}
