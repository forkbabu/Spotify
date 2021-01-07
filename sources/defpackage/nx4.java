package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.glue.dialogs.g;
import com.spotify.music.libs.viewuri.c;
import defpackage.mx4;

/* renamed from: nx4  reason: default package */
public final class nx4 implements mx4.c {
    private final wlf<Context> a;
    private final wlf<c> b;
    private final wlf<dj9> c;
    private final wlf<SnackbarManager> d;
    private final wlf<g> e;
    private final wlf<kx4> f;

    public nx4(wlf<Context> wlf, wlf<c> wlf2, wlf<dj9> wlf3, wlf<SnackbarManager> wlf4, wlf<g> wlf5, wlf<kx4> wlf6) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
        b(wlf5, 5);
        this.e = wlf5;
        b(wlf6, 6);
        this.f = wlf6;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.mx4.c
    public mx4 a(mx4.b bVar) {
        Context context = this.a.get();
        b(context, 1);
        Context context2 = context;
        c cVar = this.b.get();
        b(cVar, 2);
        c cVar2 = cVar;
        dj9 dj9 = this.c.get();
        b(dj9, 3);
        dj9 dj92 = dj9;
        SnackbarManager snackbarManager = this.d.get();
        b(snackbarManager, 4);
        SnackbarManager snackbarManager2 = snackbarManager;
        g gVar = this.e.get();
        b(gVar, 5);
        g gVar2 = gVar;
        kx4 kx4 = this.f.get();
        b(kx4, 6);
        b(bVar, 7);
        return new mx4(context2, cVar2, dj92, snackbarManager2, gVar2, kx4, bVar);
    }
}
