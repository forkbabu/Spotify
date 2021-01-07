package defpackage;

import com.spotify.music.libs.podcast.loader.m;
import com.spotify.music.libs.podcast.loader.o;
import com.spotify.player.model.Context;
import io.reactivex.internal.operators.single.SingleCache;
import io.reactivex.z;

/* renamed from: jjc  reason: default package */
public class jjc {
    private final o a;
    private z<Context> b;

    public jjc(o oVar) {
        this.a = oVar;
    }

    public z<Context> a(String str, String str2) {
        if (this.b == null) {
            m a2 = this.a.a(str);
            a2.b().h(0, 15);
            a2.b().g(str2);
            this.b = new SingleCache(a2.a().A(new bjc(str)));
        }
        return this.b;
    }
}
