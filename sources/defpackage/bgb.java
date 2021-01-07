package defpackage;

import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.a;
import com.spotify.music.v;
import com.spotify.music.w;
import defpackage.tfb;
import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* renamed from: bgb  reason: default package */
final class bgb<T> implements g<tfb.e> {
    final /* synthetic */ a a;
    final /* synthetic */ w b;
    final /* synthetic */ com.spotify.android.flags.g c;
    final /* synthetic */ v f;

    bgb(a aVar, w wVar, com.spotify.android.flags.g gVar, v vVar) {
        this.a = aVar;
        this.b = wVar;
        this.c = gVar;
        this.f = vVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(tfb.e eVar) {
        tfb.e eVar2 = eVar;
        h.e(eVar2, "startLoggedInSession");
        c a2 = eVar2.a();
        SessionState b2 = eVar2.b();
        this.a.a(a2, b2);
        this.b.a();
        this.c.a(a2);
        this.f.a(b2);
    }
}
