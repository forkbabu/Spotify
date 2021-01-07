package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.glue.dialogs.g;
import defpackage.jj3;

/* renamed from: kj3  reason: default package */
public class kj3 {
    private final wlf<Context> a;
    private final wlf<dj9> b;
    private final wlf<SnackbarManager> c;
    private final wlf<g> d;

    public kj3(wlf<Context> wlf, wlf<dj9> wlf2, wlf<SnackbarManager> wlf3, wlf<g> wlf4) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public jj3 b(jj3.b bVar) {
        Context context = this.a.get();
        a(context, 1);
        Context context2 = context;
        dj9 dj9 = this.b.get();
        a(dj9, 2);
        dj9 dj92 = dj9;
        SnackbarManager snackbarManager = this.c.get();
        a(snackbarManager, 3);
        SnackbarManager snackbarManager2 = snackbarManager;
        g gVar = this.d.get();
        a(gVar, 4);
        a(bVar, 5);
        return new jj3(context2, dj92, snackbarManager2, gVar, bVar);
    }
}
