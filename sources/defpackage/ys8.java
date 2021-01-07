package defpackage;

import android.content.res.Resources;
import com.spotify.music.C0707R;
import defpackage.us8;
import kotlin.jvm.internal.h;

/* renamed from: ys8  reason: default package */
public final class ys8 implements fjf<String> {
    private final wlf<Resources> a;

    public ys8(wlf<Resources> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Resources resources = this.a.get();
        us8.a aVar = us8.a;
        h.e(resources, "resources");
        String string = resources.getString(C0707R.string.topic_popular_episodes_title);
        h.d(string, "resources.getString(R.st…c_popular_episodes_title)");
        return string;
    }
}
