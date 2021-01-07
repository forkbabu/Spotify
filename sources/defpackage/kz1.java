package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.o;
import com.spotify.music.libs.facebook.q;
import defpackage.ce0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.je0;

/* renamed from: kz1  reason: default package */
public class kz1 {
    private final Context a;
    private final o b;
    private final q c;
    private final ae0 d;
    private final yx0 e;

    public kz1(Context context, o oVar, ae0 ae0, yx0 yx0, q qVar) {
        this.a = context;
        this.b = oVar;
        this.d = ae0;
        this.e = yx0;
        this.c = qVar;
    }

    public void a() {
        this.a.startService(this.b.c(this.a, "com.spotify.mobile.android.service.action.session.LOGOUT"));
        this.c.a().j();
        this.e.b();
        this.d.a(new ce0.c(je0.l.b, fe0.m.b, ge0.k.b));
    }
}
