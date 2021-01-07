package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.features.playlistentity.configuration.e;
import com.spotify.music.features.playlistentity.w;
import com.spotify.playlist.endpoints.v;
import io.reactivex.y;

/* access modifiers changed from: package-private */
/* renamed from: ha6  reason: default package */
public class ha6 {
    private final wlf<ba6> a;
    private final wlf<v> b;
    private final wlf<ea6> c;
    private final wlf<w> d;
    private final wlf<String> e;
    private final wlf<y> f;
    private final wlf<SnackbarManager> g;
    private final wlf<Context> h;

    ha6(wlf<ba6> wlf, wlf<v> wlf2, wlf<ea6> wlf3, wlf<w> wlf4, wlf<String> wlf5, wlf<y> wlf6, wlf<SnackbarManager> wlf7, wlf<Context> wlf8) {
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
        a(wlf7, 7);
        this.g = wlf7;
        a(wlf8, 8);
        this.h = wlf8;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    /* access modifiers changed from: package-private */
    public ga6 b(e eVar) {
        ba6 ba6 = this.a.get();
        a(ba6, 1);
        ba6 ba62 = ba6;
        v vVar = this.b.get();
        a(vVar, 2);
        v vVar2 = vVar;
        ea6 ea6 = this.c.get();
        a(ea6, 3);
        ea6 ea62 = ea6;
        w wVar = this.d.get();
        a(wVar, 4);
        w wVar2 = wVar;
        String str = this.e.get();
        a(str, 5);
        String str2 = str;
        y yVar = this.f.get();
        a(yVar, 6);
        y yVar2 = yVar;
        SnackbarManager snackbarManager = this.g.get();
        a(snackbarManager, 7);
        SnackbarManager snackbarManager2 = snackbarManager;
        Context context = this.h.get();
        a(context, 8);
        a(eVar, 9);
        return new ga6(ba62, vVar2, ea62, wVar2, str2, yVar2, snackbarManager2, context, eVar);
    }
}
