package defpackage;

import com.spotify.music.features.languagepicker.logger.b;

/* renamed from: om5  reason: default package */
public final class om5 implements fjf<im5> {
    private final wlf<b> a;

    public om5(wlf<b> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new im5(this.a.get());
    }
}
