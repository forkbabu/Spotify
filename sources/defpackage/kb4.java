package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;

/* renamed from: kb4  reason: default package */
public final class kb4 implements fjf<String> {
    private final wlf<Context> a;

    public kb4(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().getString(C0707R.string.search_default_title);
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
