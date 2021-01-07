package defpackage;

import android.content.Context;
import com.spotify.libs.glue.custom.playbutton.c;
import defpackage.hg6;

/* access modifiers changed from: package-private */
/* renamed from: kg6  reason: default package */
public final class kg6 implements hg6.a {
    private final wlf<Context> a;
    private final wlf<c.a> b;
    private final wlf<fg6> c;

    kg6(wlf<Context> wlf, wlf<c.a> wlf2, wlf<fg6> wlf3) {
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

    @Override // defpackage.hg6.a
    public hg6 a(com.spotify.music.features.playlistentity.configuration.c cVar) {
        Context context = this.a.get();
        b(context, 1);
        c.a aVar = this.b.get();
        b(aVar, 2);
        fg6 fg6 = this.c.get();
        b(fg6, 3);
        b(cVar, 4);
        return new jg6(context, aVar, fg6, cVar);
    }
}
