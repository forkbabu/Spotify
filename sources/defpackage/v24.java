package defpackage;

import android.app.Activity;
import com.spotify.music.C0707R;

/* renamed from: v24  reason: default package */
public final class v24 implements fjf<String> {
    private final wlf<Activity> a;

    public v24(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        String string = this.a.get().getString(C0707R.string.page_title);
        yif.g(string, "Cannot return null from a non-@Nullable @Provides method");
        return string;
    }
}