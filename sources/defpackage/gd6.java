package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.features.playlistentity.homemix.header.mixtuning.o;

/* renamed from: gd6  reason: default package */
public class gd6 {
    private final wlf<Context> a;
    private final wlf<o> b;
    private final wlf<SnackbarManager> c;

    public gd6(wlf<Context> wlf, wlf<o> wlf2, wlf<SnackbarManager> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public id6 b(ViewGroup viewGroup) {
        Context context = this.a.get();
        a(context, 1);
        o oVar = this.b.get();
        a(oVar, 2);
        SnackbarManager snackbarManager = this.c.get();
        a(snackbarManager, 3);
        a(viewGroup, 4);
        return new id6(context, oVar, snackbarManager, viewGroup);
    }
}
