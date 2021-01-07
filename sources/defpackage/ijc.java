package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.music.libs.podcast.loader.m;
import com.spotify.music.libs.podcast.loader.o;
import io.reactivex.internal.operators.single.SingleCache;
import io.reactivex.z;

@Deprecated
/* renamed from: ijc  reason: default package */
public class ijc {
    private final o a;
    private z<PlayerContext> b;

    public ijc(o oVar) {
        this.a = oVar;
    }

    public z<PlayerContext> a(String str, String str2) {
        if (this.b == null) {
            m a2 = this.a.a(str);
            a2.b().h(0, 15);
            a2.b().g(str2);
            this.b = new SingleCache(a2.a().A(new ajc(this, str)));
        }
        return this.b;
    }
}
