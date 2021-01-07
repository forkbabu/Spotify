package defpackage;

import android.app.Activity;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.music.features.playlistentity.configuration.g;

/* renamed from: sq6  reason: default package */
public class sq6 {
    private final wlf<Activity> a;
    private final wlf<pq6> b;
    private final wlf<c.a> c;

    public sq6(wlf<Activity> wlf, wlf<pq6> wlf2, wlf<c.a> wlf3) {
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

    public rq6 b(g gVar) {
        Activity activity = this.a.get();
        a(activity, 1);
        pq6 pq6 = this.b.get();
        a(pq6, 2);
        c.a aVar = this.c.get();
        a(aVar, 3);
        a(gVar, 4);
        return new rq6(activity, pq6, aVar, gVar);
    }
}
