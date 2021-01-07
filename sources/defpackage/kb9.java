package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.item.m;

/* renamed from: kb9  reason: default package */
public final class kb9 implements fjf<jb9> {
    private final wlf<m> a;

    public kb9(wlf<m> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jb9(this.a.get());
    }
}
