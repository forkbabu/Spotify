package defpackage;

import android.app.Activity;
import com.spotify.music.C0707R;
import defpackage.us8;
import kotlin.jvm.internal.h;

/* renamed from: xs8  reason: default package */
public final class xs8 implements fjf<String> {
    private final wlf<Activity> a;

    public xs8(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Activity activity = this.a.get();
        us8.a aVar = us8.a;
        h.e(activity, "context");
        String string = activity.getString(C0707R.string.topic_page_title);
        h.d(string, "context.getString(R.string.topic_page_title)");
        return string;
    }
}
