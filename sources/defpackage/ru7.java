package defpackage;

import android.content.Context;
import com.spotify.music.features.profile.editprofile.p;

/* renamed from: ru7  reason: default package */
public final class ru7 implements fjf<qu7> {
    private final wlf<Context> a;
    private final wlf<p> b;

    public ru7(wlf<Context> wlf, wlf<p> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qu7(this.a.get(), this.b.get());
    }
}
