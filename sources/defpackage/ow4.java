package defpackage;

import com.google.common.collect.ImmutableList;
import com.spotify.music.features.editplaylist.operations.c0;
import com.spotify.music.features.editplaylist.operations.i0;
import com.spotify.music.features.editplaylist.operations.m0;
import com.spotify.music.features.editplaylist.operations.w;
import com.spotify.music.features.editplaylist.operations.z;
import java.util.List;

/* renamed from: ow4  reason: default package */
public final class ow4 implements fjf<List<i0>> {
    private final wlf<w> a;
    private final wlf<z> b;
    private final wlf<c0> c;
    private final wlf<m0> d;

    public ow4(wlf<w> wlf, wlf<z> wlf2, wlf<c0> wlf3, wlf<m0> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        ImmutableList of = ImmutableList.of((m0) this.a.get(), (m0) this.b.get(), (m0) this.c.get(), this.d.get());
        yif.g(of, "Cannot return null from a non-@Nullable @Provides method");
        return of;
    }
}
