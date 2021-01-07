package defpackage;

import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.i;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

/* renamed from: vk1  reason: default package */
public final class vk1 implements fjf<s<i<Episode>>> {
    private final wlf<com.spotify.music.libs.podcast.loader.i> a;
    private final wlf<yn1> b;

    public vk1(wlf<com.spotify.music.libs.podcast.loader.i> wlf, wlf<yn1> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new v(this.b.get().a().O(tk1.a).s()).j0(new rk1(this.a.get())).W(sk1.a, false, Integer.MAX_VALUE);
    }
}
