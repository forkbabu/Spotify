package defpackage;

import android.content.res.Resources;
import com.spotify.music.C0707R;

/* renamed from: y55  reason: default package */
public final class y55 implements fjf<String> {
    private final wlf<Resources> a;

    public y55(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().getString(C0707R.string.error_general_body);
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
