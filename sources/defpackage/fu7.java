package defpackage;

import com.spotify.mobius.e0;
import com.spotify.mobius.g0;
import com.spotify.music.features.profile.saveprofile.domain.b;
import com.spotify.music.features.profile.saveprofile.domain.d;
import com.spotify.music.features.profile.saveprofile.domain.e;
import com.spotify.music.features.profile.saveprofile.domain.f;
import com.spotify.music.features.profile.saveprofile.domain.g;
import com.spotify.music.features.profile.saveprofile.domain.h;
import com.spotify.music.features.profile.saveprofile.domain.i;
import com.spotify.music.features.profile.saveprofile.domain.j;
import com.spotify.music.features.profile.saveprofile.domain.k;
import com.spotify.music.features.profile.saveprofile.domain.o;
import com.spotify.music.features.profile.saveprofile.domain.q;
import com.spotify.music.podcastentityrow.u;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: fu7  reason: default package */
public final /* synthetic */ class fu7 implements g0 {
    public static final /* synthetic */ fu7 a = new fu7();

    private /* synthetic */ fu7() {
    }

    @Override // com.spotify.mobius.g0
    public final e0 a(Object obj, Object obj2) {
        Object obj3;
        q qVar = (q) obj;
        o oVar = (o) obj2;
        d dVar = new d(qVar);
        h hVar = new h(qVar);
        g gVar = new g(qVar);
        k kVar = new k(qVar);
        j jVar = new j(qVar);
        i iVar = new i(qVar);
        b bVar = new b(qVar);
        e eVar = new e(qVar);
        f fVar = new f(qVar);
        oVar.getClass();
        kotlin.jvm.internal.h.e(dVar, "s");
        kotlin.jvm.internal.h.e(hVar, "c");
        kotlin.jvm.internal.h.e(gVar, u.a);
        kotlin.jvm.internal.h.e(kVar, "cpd");
        kotlin.jvm.internal.h.e(jVar, "uis");
        kotlin.jvm.internal.h.e(iVar, "sis");
        kotlin.jvm.internal.h.e(bVar, "ris");
        kotlin.jvm.internal.h.e(eVar, "sdns");
        kotlin.jvm.internal.h.e(fVar, "cc");
        if (oVar instanceof o.e) {
            obj3 = dVar.invoke(oVar);
        } else if (oVar instanceof o.a) {
            obj3 = hVar.invoke(oVar);
        } else if (oVar instanceof o.i) {
            obj3 = gVar.invoke(oVar);
        } else if (oVar instanceof o.c) {
            obj3 = kVar.invoke(oVar);
        } else if (oVar instanceof o.h) {
            obj3 = jVar.invoke(oVar);
        } else if (oVar instanceof o.g) {
            obj3 = iVar.invoke(oVar);
        } else if (oVar instanceof o.d) {
            obj3 = bVar.invoke(oVar);
        } else if (oVar instanceof o.f) {
            obj3 = eVar.invoke(oVar);
        } else if (oVar instanceof o.b) {
            obj3 = fVar.invoke(oVar);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return (e0) obj3;
    }
}
