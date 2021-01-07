package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;

/* renamed from: lu2  reason: default package */
public final class lu2 implements fjf<String> {
    private final wlf<Context> a;

    public lu2(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().getString(C0707R.string.media_provider_authority);
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
