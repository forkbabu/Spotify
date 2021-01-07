package defpackage;

import com.google.common.collect.ImmutableSet;
import com.spotify.music.features.connect.cast.discovery.h;
import com.spotify.music.features.connect.cast.o;

/* renamed from: ta3  reason: default package */
public final class ta3 implements fjf<ImmutableSet<h>> {
    private final wlf<o> a;

    public ta3(wlf<o> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return ImmutableSet.of(this.a.get());
    }
}
