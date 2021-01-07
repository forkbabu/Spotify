package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import com.spotify.android.flags.c;
import com.spotify.intentrouter.j;
import com.spotify.intentrouter.m;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.k;
import com.spotify.music.navigation.v;
import com.spotify.page.hosting.PageHostingFragment;
import com.spotify.page.hosting.a;
import defpackage.alb;
import defpackage.glb;

/* renamed from: xkb  reason: default package */
public class xkb implements glb {
    private final j.b<hlb> a = j.a();
    private final alb.b b;
    private final zkb c;
    private final qg0<Intent> d;
    private final ykb e;
    private final a f;

    public xkb(alb.b bVar, zkb zkb, qg0<Intent> qg0, ykb ykb, a aVar) {
        this.b = bVar;
        this.c = zkb;
        this.d = qg0;
        this.e = ykb;
        this.f = aVar;
    }

    public j<hlb> a() {
        return this.a.b();
    }

    public /* synthetic */ void b(glb.b bVar, Intent intent, c cVar, SessionState sessionState) {
        Intent intent2 = (Intent) bVar.a(intent, cVar);
        if (intent2 != null) {
            this.d.accept(intent2);
        }
    }

    public /* synthetic */ s c(Class cls, v vVar, Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        PageHostingFragment a2 = this.f.a(cls, vVar.a(intent, l0Var, sessionState));
        a2.N4();
        return a2;
    }

    public void d(String str, String str2, glb.a<Intent, c, SessionState> aVar) {
        this.a.a(new ilb(str), this.b.a(aVar, str2, ekb.a));
    }

    public void e(m<? extends glb.c> mVar, String str, glb.b<Intent, c, Intent> bVar) {
        this.a.a(mVar, this.b.a(new gkb(this, bVar), str, hkb.a));
    }

    public void f(m<? extends glb.c> mVar, String str, flb flb) {
        this.a.a(mVar, this.c.d(new fkb(flb), str));
    }

    public void g(glb.a<Intent, c, SessionState> aVar) {
        this.e.a(aVar);
    }

    public void h(LinkType linkType, String str, glb.b<Intent, c, Intent> bVar) {
        e(llb.a(ilb.b(), mlb.c(mlb.b(linkType))), str, bVar);
    }

    public void i(LinkType linkType, String str, k kVar) {
        this.a.a(llb.a(ilb.b(), mlb.c(mlb.b(linkType))), this.c.e(kVar, str));
    }

    public <P extends Parcelable> void j(LinkType linkType, String str, Class<? extends usd<P>> cls, v<P> vVar) {
        this.a.a(llb.a(ilb.b(), mlb.c(mlb.b(linkType))), this.c.e(new dkb(this, cls, vVar), str));
    }

    public void k(m<l0> mVar, String str, vkb vkb) {
        this.a.a(llb.a(ilb.b(), mlb.c(mVar)), this.c.d(vkb, str));
    }
}
