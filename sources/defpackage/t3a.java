package defpackage;

import com.spotify.music.libs.branchintegration.network.c;
import java.util.concurrent.TimeUnit;
import okhttp3.y;
import retrofit2.adapter.rxjava2.g;
import retrofit2.w;

/* renamed from: t3a  reason: default package */
public final class t3a implements fjf<c> {

    /* access modifiers changed from: private */
    /* renamed from: t3a$a */
    public static final class a {
        private static final t3a a = new t3a();
    }

    public static t3a a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        y.b bVar = new y.b();
        bVar.e(3, TimeUnit.SECONDS);
        y c = bVar.c();
        w.b bVar2 = new w.b();
        bVar2.c("https://sharing-config.spotifycdn.com/");
        bVar2.g(c);
        bVar2.a(g.d());
        bVar2.b(dqf.c());
        c cVar = (c) bVar2.e().d(c.class);
        yif.g(cVar, "Cannot return null from a non-@Nullable @Provides method");
        return cVar;
    }
}
