package defpackage;

import com.spotify.playlist.models.Show;
import com.spotify.playlist.models.i;
import defpackage.jyd;
import java.util.List;

/* renamed from: ryd  reason: default package */
public abstract class ryd implements i<Show> {

    /* renamed from: ryd$a */
    public interface a {
        a a(List<Show> list);

        a b(int i);

        ryd build();

        a c(boolean z);

        a d(int i);

        a e(int i);
    }

    public static a a() {
        return new jyd.b();
    }

    public abstract int b();
}
