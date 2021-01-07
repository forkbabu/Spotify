package defpackage;

import android.app.Activity;
import android.content.Context;
import com.spotify.share.sharedata.t;
import defpackage.b4e;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: v5e  reason: default package */
public class v5e implements i6e {
    private final y a;
    private final j7e b;
    private final x3e c;

    public v5e(y yVar, j7e j7e, x3e x3e) {
        this.b = j7e;
        this.a = yVar;
        this.c = x3e;
    }

    @Override // defpackage.i6e
    public /* synthetic */ Exception a(Context context, o8e o8e) {
        return h6e.a(this, context, o8e);
    }

    @Override // defpackage.i6e
    public boolean b(t tVar) {
        return true;
    }

    @Override // defpackage.i6e
    public z<String> c(Activity activity, o8e o8e, t tVar, z7e z7e, d8e d8e, long j) {
        b4e.a a2 = b4e.a(tVar.g());
        a2.c(tVar.a());
        a2.d(r3e.a(tVar.c()));
        a2.a(tVar.f());
        return this.c.a(a2.build()).B(this.a).s(new a5e(this, tVar, activity, z7e, o8e, j, d8e));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (com.google.common.base.MoreObjects.isNullOrEmpty(r1) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.reactivex.d0 d(com.spotify.share.sharedata.t r5, android.app.Activity r6, defpackage.z7e r7, defpackage.o8e r8, long r9, defpackage.d8e r11, defpackage.w3e r12) {
        /*
            r4 = this;
            java.lang.String r0 = r12.d()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            boolean r1 = r5 instanceof com.spotify.share.sharedata.s
            if (r1 == 0) goto L_0x001a
            r1 = r5
            com.spotify.share.sharedata.s r1 = (com.spotify.share.sharedata.s) r1
            java.lang.String r1 = r1.k()
            boolean r2 = com.google.common.base.MoreObjects.isNullOrEmpty(r1)
            if (r2 != 0) goto L_0x001a
            goto L_0x0021
        L_0x001a:
            r1 = 2132019080(0x7f140788, float:1.9676485E38)
            java.lang.String r1 = r6.getString(r1)
        L_0x0021:
            j7e r2 = r4.b
            r2.getClass()
            com.facebook.share.model.ShareMessengerURLActionButton$b r2 = new com.facebook.share.model.ShareMessengerURLActionButton$b
            r2.<init>()
            r2.b(r1)
            r2.g(r0)
            r1 = 1
            r2.f(r1)
            com.facebook.share.model.ShareMessengerURLActionButton r1 = r2.e()
            com.facebook.share.model.j$b r2 = new com.facebook.share.model.j$b
            r2.<init>()
            java.lang.String r3 = "6243987495"
            r2.i(r3)
            r2.n(r0)
            r2.m(r1)
            com.facebook.share.model.j r0 = r2.l()
            com.facebook.share.widget.b r1 = new com.facebook.share.widget.b
            r1.<init>(r6)
            r1.g(r0)
            java.lang.String r6 = r12.b()
            int r0 = r8.a()
            r7.b(r6, r0, r9)
            int r6 = r8.a()
            java.lang.String r7 = r12.b()
            r8 = 0
            r11.a(r5, r6, r7, r8)
            java.lang.String r5 = r12.b()
            io.reactivex.z r5 = io.reactivex.z.z(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v5e.d(com.spotify.share.sharedata.t, android.app.Activity, z7e, o8e, long, d8e, w3e):io.reactivex.d0");
    }
}
