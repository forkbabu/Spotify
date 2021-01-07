package defpackage;

import android.content.Context;
import com.google.common.base.Optional;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.music.features.playlistentity.configuration.h;
import com.squareup.picasso.Picasso;
import defpackage.qb6;

/* renamed from: tb6  reason: default package */
final class tb6 implements qb6.a {
    private final wlf<Picasso> a;
    private final wlf<Context> b;
    private final wlf<ob6> c;
    private final wlf<c.a> d;

    tb6(wlf<Picasso> wlf, wlf<Context> wlf2, wlf<ob6> wlf3, wlf<c.a> wlf4) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.qb6.a
    public qb6 a(h hVar, Optional optional) {
        Picasso picasso = this.a.get();
        b(picasso, 1);
        Picasso picasso2 = picasso;
        Context context = this.b.get();
        b(context, 2);
        Context context2 = context;
        ob6 ob6 = this.c.get();
        b(ob6, 3);
        ob6 ob62 = ob6;
        c.a aVar = this.d.get();
        b(aVar, 4);
        b(hVar, 5);
        b(optional, 6);
        return new sb6(picasso2, context2, ob62, aVar, hVar, optional);
    }
}
