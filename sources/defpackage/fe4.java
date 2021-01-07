package defpackage;

import com.spotify.android.flags.c;
import com.spotify.localization.SpotifyLocale;
import com.spotify.music.features.browse.b;
import com.spotify.music.libs.podcast.download.f0;
import io.reactivex.z;

/* renamed from: fe4  reason: default package */
public class fe4 implements ee4 {
    private final cf4 a;
    private final String b;
    private final String c = SpotifyLocale.c();
    private final String d;
    private final String e;
    private final boolean f;

    fe4(cf4 cf4, c cVar, cqe cqe, b bVar) {
        this.a = cf4;
        this.b = cqe.f().getID();
        bVar.getClass();
        this.d = bVar.b();
        this.e = bVar.a() ? "application:nft" : null;
        this.f = f0.b(cVar);
    }

    @Override // defpackage.ee4
    public z<b91> a(ff4 ff4) {
        int a2 = ff4.a();
        cf4 cf4 = this.a;
        String b2 = ff4.b();
        if (b2.isEmpty()) {
            String[] split = this.d.split(":");
            b2 = split[split.length - 1];
        }
        return cf4.b(b2, this.b, this.f, this.c, this.e, a2 > 0 ? Integer.toString(a2) : null).e(b91.class);
    }
}
