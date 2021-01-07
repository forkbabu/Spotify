package defpackage;

import com.spotify.playlist.models.Episode;
import defpackage.dyd;

/* renamed from: lyd  reason: default package */
public abstract class lyd {

    /* renamed from: lyd$a */
    public interface a {
        a a(Episode episode);

        lyd build();
    }

    public static a a() {
        return new dyd.b();
    }

    public abstract Episode b();
}
