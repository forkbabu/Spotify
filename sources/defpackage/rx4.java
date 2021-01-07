package defpackage;

import com.spotify.music.features.editplaylist.EditPlaylistLogger;
import com.spotify.music.features.editplaylist.c;
import com.spotify.music.features.editplaylist.operations.j0;
import defpackage.mx4;
import defpackage.px4;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: rx4  reason: default package */
public final class rx4 implements px4.a {
    private final wlf<j0> a;
    private final wlf<txc> b;
    private final wlf<EditPlaylistLogger> c;
    private final wlf<y> d;
    private final wlf<c> e;
    private final wlf<mx4.c> f;

    public rx4(wlf<j0> wlf, wlf<txc> wlf2, wlf<EditPlaylistLogger> wlf3, wlf<y> wlf4, wlf<c> wlf5, wlf<mx4.c> wlf6) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public px4 b(z zVar) {
        j0 j0Var = this.a.get();
        a(j0Var, 1);
        j0 j0Var2 = j0Var;
        txc txc = this.b.get();
        a(txc, 2);
        txc txc2 = txc;
        EditPlaylistLogger editPlaylistLogger = this.c.get();
        a(editPlaylistLogger, 3);
        EditPlaylistLogger editPlaylistLogger2 = editPlaylistLogger;
        y yVar = this.d.get();
        a(yVar, 4);
        y yVar2 = yVar;
        c cVar = this.e.get();
        a(cVar, 5);
        c cVar2 = cVar;
        mx4.c cVar3 = this.f.get();
        a(cVar3, 6);
        a(zVar, 7);
        return new qx4(j0Var2, txc2, editPlaylistLogger2, yVar2, cVar2, cVar3, zVar);
    }
}
