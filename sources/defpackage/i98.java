package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;

/* renamed from: i98  reason: default package */
public final class i98 implements fjf<String> {
    private final wlf<Context> a;

    public i98(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().getString(C0707R.string.recent_searches_title);
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
