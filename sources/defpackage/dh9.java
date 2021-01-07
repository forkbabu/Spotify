package defpackage;

import android.app.Activity;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: dh9  reason: default package */
public final class dh9 implements fjf<String> {
    private final wlf<Activity> a;

    public dh9(wlf<Activity> wlf) {
        this.a = wlf;
    }

    public static String a(Activity activity) {
        h.e(activity, "activity");
        String string = activity.getString(C0707R.string.your_library_x_your_episodes_title);
        h.d(string, "activity.getString(R.str…ry_x_your_episodes_title)");
        return string;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
