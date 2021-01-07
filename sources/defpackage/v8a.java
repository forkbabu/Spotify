package defpackage;

import android.content.Context;
import com.spotify.music.libs.viewuri.c;
import defpackage.t8a;

/* renamed from: v8a  reason: default package */
public final class v8a implements t8a.a {
    private final wlf<y8a> a;
    private final wlf<Context> b;

    public v8a(wlf<y8a> wlf, wlf<Context> wlf2) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.t8a.a
    public t8a a(c cVar) {
        y8a y8a = this.a.get();
        b(y8a, 1);
        Context context = this.b.get();
        b(context, 2);
        b(cVar, 3);
        return new u8a(y8a, context, cVar);
    }
}
