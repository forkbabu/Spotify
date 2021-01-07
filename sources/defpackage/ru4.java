package defpackage;

import android.app.Activity;
import defpackage.pu4;

/* renamed from: ru4  reason: default package */
public final class ru4 implements pu4.a {
    private final wlf<Activity> a;

    public ru4(wlf<Activity> wlf) {
        a(wlf, 1);
        this.a = wlf;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public pu4 b(fu4 fu4) {
        Activity activity = this.a.get();
        a(activity, 1);
        a(fu4, 2);
        return new qu4(activity, fu4);
    }
}
