package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.service.session.e;
import com.spotify.mobile.android.service.session.f;
import com.spotify.mobile.android.util.LinkType;
import io.reactivex.z;

/* renamed from: nf0  reason: default package */
public class nf0 implements blb {
    private final f a;
    private final wlf<mf0> b;

    public nf0(f fVar, wlf<mf0> wlf) {
        this.a = fVar;
        this.b = wlf;
    }

    public /* synthetic */ z a(Intent intent, c cVar, SessionState sessionState) {
        return this.a.b().q0(hf0.a).R(lf0.a).t(new if0(this, intent)).h(z.z(elb.a()));
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        ((xkb) glb).k(mlb.b(LinkType.AUTOLOGIN), "Handle auto login links", new kf0(this));
    }

    public /* synthetic */ void c(e eVar, Intent intent) {
        this.b.get().a(eVar.call(), intent.getData());
    }
}
