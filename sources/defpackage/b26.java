package defpackage;

import android.app.Activity;
import com.spotify.music.features.playlistallsongs.i;
import com.squareup.picasso.Picasso;
import defpackage.u06;
import defpackage.z16;

/* renamed from: b26  reason: default package */
public final class b26 implements z16.a {
    private final wlf<Picasso> a;
    private final wlf<Activity> b;
    private final wlf<u06.a> c;
    private final wlf<i> d;
    private final wlf<w16> e;

    public b26(wlf<Picasso> wlf, wlf<Activity> wlf2, wlf<u06.a> wlf3, wlf<i> wlf4, wlf<w16> wlf5) {
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
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public z16 b(l16 l16) {
        Picasso picasso = this.a.get();
        a(picasso, 1);
        Picasso picasso2 = picasso;
        Activity activity = this.b.get();
        a(activity, 2);
        Activity activity2 = activity;
        u06.a aVar = this.c.get();
        a(aVar, 3);
        u06.a aVar2 = aVar;
        i iVar = this.d.get();
        a(iVar, 4);
        i iVar2 = iVar;
        w16 w16 = this.e.get();
        a(w16, 5);
        a(l16, 6);
        return new a26(picasso2, activity2, aVar2, iVar2, w16, l16);
    }
}
