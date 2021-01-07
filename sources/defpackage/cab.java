package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import io.reactivex.z;
import okhttp3.u;

/* renamed from: cab  reason: default package */
public final class cab {
    private static final u a = u.p("https://storage.googleapis.com");

    /* renamed from: cab$a */
    interface a {
        @zqf("evn/{id}")
        z<bab> a(@mrf("id") String str);
    }

    public static z<PlayerContext> a(String str, bab bab, com.spotify.http.u uVar) {
        return ((a) uVar.a(a.class, a)).a(str).F(bab).A(new w9b(str));
    }
}
