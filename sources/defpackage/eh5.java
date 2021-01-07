package defpackage;

import com.spotify.music.libs.collection.model.d;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.f;
import com.spotify.playlist.models.i;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: eh5  reason: default package */
public final class eh5 implements fjf<s<ng5>> {
    private final wlf<s<f>> a;
    private final wlf<s<i<Episode>>> b;
    private final wlf<s<d>> c;
    private final wlf<s<Boolean>> d;
    private final wlf<y> e;

    public eh5(wlf<s<f>> wlf, wlf<s<i<Episode>>> wlf2, wlf<s<d>> wlf3, wlf<s<Boolean>> wlf4, wlf<y> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static eh5 a(wlf<s<f>> wlf, wlf<s<i<Episode>>> wlf2, wlf<s<d>> wlf3, wlf<s<Boolean>> wlf4, wlf<y> wlf5) {
        return new eh5(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return s.l(this.a.get(), this.b.get(), this.c.get(), this.d.get(), og5.a).z(200, TimeUnit.MILLISECONDS, this.e.get()).v0(1).h1();
    }
}
