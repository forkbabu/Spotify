package defpackage;

import android.content.Context;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.music.features.playlistentity.configuration.e;
import com.squareup.picasso.Picasso;
import defpackage.ja6;

/* renamed from: ma6  reason: default package */
final class ma6 implements ja6.a {
    private final wlf<Picasso> a;
    private final wlf<Context> b;
    private final wlf<ha6> c;
    private final wlf<c.a> d;

    ma6(wlf<Picasso> wlf, wlf<Context> wlf2, wlf<ha6> wlf3, wlf<c.a> wlf4) {
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

    @Override // defpackage.ja6.a
    public ja6 a(e eVar) {
        Picasso picasso = this.a.get();
        b(picasso, 1);
        Picasso picasso2 = picasso;
        Context context = this.b.get();
        b(context, 2);
        Context context2 = context;
        ha6 ha6 = this.c.get();
        b(ha6, 3);
        ha6 ha62 = ha6;
        c.a aVar = this.d.get();
        b(aVar, 4);
        b(eVar, 5);
        return new la6(picasso2, context2, ha62, aVar, eVar);
    }
}
