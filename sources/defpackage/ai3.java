package defpackage;

import android.content.Context;
import com.spotify.music.playlist.synchronizer.d;
import com.squareup.picasso.Picasso;
import defpackage.zh3;

/* renamed from: ai3  reason: default package */
public final class ai3 implements zh3.a {
    private final wlf<Context> a;
    private final wlf<Picasso> b;
    private final wlf<d> c;

    public ai3(wlf<Context> wlf, wlf<Picasso> wlf2, wlf<d> wlf3) {
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

    @Override // defpackage.zh3.a
    public zh3 a(zh3.c cVar) {
        Context context = this.a.get();
        b(context, 1);
        Picasso picasso = this.b.get();
        b(picasso, 2);
        d dVar = this.c.get();
        b(dVar, 3);
        b(cVar, 4);
        return new zh3(context, picasso, dVar, cVar);
    }
}
