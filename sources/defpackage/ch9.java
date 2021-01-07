package defpackage;

import android.app.Activity;
import com.spotify.music.C0707R;
import kotlin.jvm.internal.h;

/* renamed from: ch9  reason: default package */
public final class ch9 implements fjf<String> {
    private final wlf<Activity> a;

    public ch9(wlf<Activity> wlf) {
        this.a = wlf;
    }

    public static String a(Activity activity) {
        h.e(activity, "activity");
        String string = activity.getString(C0707R.string.your_library_x_liked_songs_title);
        h.d(string, "activity.getString(R.str…rary_x_liked_songs_title)");
        return string;
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get());
    }
}
