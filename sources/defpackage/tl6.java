package defpackage;

import android.content.Context;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.music.features.playlistentity.configuration.g;
import defpackage.rl6;

/* renamed from: tl6  reason: default package */
public final class tl6 implements rl6.a {
    private final wlf<Context> a;
    private final wlf<pl6> b;
    private final wlf<c.a> c;

    public tl6(wlf<Context> wlf, wlf<pl6> wlf2, wlf<c.a> wlf3) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.rl6.a
    public rl6 a(g gVar) {
        Context context = this.a.get();
        b(context, 1);
        pl6 pl6 = this.b.get();
        b(pl6, 2);
        c.a aVar = this.c.get();
        b(aVar, 3);
        b(gVar, 4);
        return new sl6(context, pl6, aVar, gVar);
    }
}
