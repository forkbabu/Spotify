package defpackage;

import com.spotify.music.features.playlistentity.configuration.c;
import defpackage.b66;
import kotlin.jvm.internal.h;

/* renamed from: r46  reason: default package */
public final class r46 implements h46<c> {
    private final y56 a;

    public r46(y56 y56) {
        h.e(y56, "externalDependencies");
        this.a = y56;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.h46
    public c a() {
        c cVar = c.b;
        c.a aVar = new c.a(null, 1);
        b66 b66 = b66.f;
        b66.a a2 = b66.a();
        a2.d(this.a.d());
        a2.e(false);
        a2.b(true);
        a2.c(true ^ this.a.c());
        aVar.b(a2.a());
        return aVar.a();
    }
}
