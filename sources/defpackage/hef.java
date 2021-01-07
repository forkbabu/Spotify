package defpackage;

import com.spotify.mobius.e0;
import com.spotify.voice.external.experience.domain.model.b;
import com.spotify.voice.external.experience.domain.model.c;
import defpackage.kef;
import defpackage.lef;

/* renamed from: hef  reason: default package */
public final /* synthetic */ class hef implements ti0 {
    public final /* synthetic */ b a;

    public /* synthetic */ hef(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        c cVar;
        b bVar = this.a;
        lef.d dVar = (lef.d) obj;
        String transcript = dVar.j().transcript();
        if (dVar.j().isFinal()) {
            cVar = c.b(transcript);
        } else {
            cVar = c.d(transcript);
        }
        return e0.g(bVar.s(cVar), z42.l(new kef.f(bVar.m(), l9f.a(dVar.j()))));
    }
}
