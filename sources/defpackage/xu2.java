package defpackage;

import android.content.Context;
import com.spotify.music.C0707R;

/* renamed from: xu2  reason: default package */
public final class xu2 implements fjf<String> {
    private final wlf<Context> a;

    public xu2(wlf<Context> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().getString(C0707R.string.share_snapchat_client_id);
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}
