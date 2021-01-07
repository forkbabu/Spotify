package defpackage;

import com.spotify.music.follow.j;
import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import com.spotify.music.libs.fullscreen.story.domain.g;
import com.spotify.music.libs.fullscreen.story.domain.i;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.s;
import io.reactivex.v;

/* renamed from: ec5  reason: default package */
public class ec5 {
    private final f a;
    private final m b;

    public ec5(f fVar, m mVar) {
        this.a = fVar;
        this.b = mVar;
    }

    public /* synthetic */ void a(j jVar) {
        this.b.g(jVar);
    }

    public i b(g.c cVar, String str) {
        String a2 = cVar.a();
        boolean c = cVar.c();
        this.b.e(str, c);
        return new i.C0291i(a2, c);
    }

    public /* synthetic */ v c(g.c cVar) {
        a aVar;
        String b2 = cVar.b();
        if (this.b.c(b2) == null) {
            aVar = this.a.a(b2).T().t(new bb5(this));
        } else {
            aVar = b.a;
        }
        return aVar.g(s.c0(new ya5(this, cVar, b2))).r0(db5.a);
    }
}
