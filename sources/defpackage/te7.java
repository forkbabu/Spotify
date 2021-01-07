package defpackage;

import com.spotify.music.json.e;

/* renamed from: te7  reason: default package */
public final class te7 implements fjf<se7> {
    private final wlf<e> a;

    public te7(wlf<e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new se7(this.a.get());
    }
}
