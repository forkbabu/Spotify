package defpackage;

import com.spotify.mobile.android.video.events.f0;
import com.spotify.music.features.ads.video.j;
import com.spotify.music.features.ads.video.m;
import java.util.Arrays;
import java.util.List;

/* renamed from: zv8  reason: default package */
public final class zv8 implements fjf<List<f0>> {
    private final wlf<m> a;
    private final wlf<j> b;
    private final wlf<com.spotify.mobile.android.video.endvideo.m> c;
    private final wlf<t9b> d;

    public zv8(wlf<m> wlf, wlf<j> wlf2, wlf<com.spotify.mobile.android.video.endvideo.m> wlf3, wlf<t9b> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        List asList = Arrays.asList(this.a.get(), this.b.get(), this.c.get(), this.d.get());
        yif.g(asList, "Cannot return null from a non-@Nullable @Provides method");
        return asList;
    }
}
