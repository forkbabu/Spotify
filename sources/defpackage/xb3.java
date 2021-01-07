package defpackage;

import android.os.Build;
import com.spotify.mobile.android.util.d0;

/* renamed from: xb3  reason: default package */
public final class xb3 implements fjf<String> {

    /* access modifiers changed from: private */
    /* renamed from: xb3$a */
    public static final class a {
        private static final xb3 a = new xb3();
    }

    public static xb3 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        StringBuilder V0 = je.V0("Spotify/8.5.89 Android/");
        V0.append(Build.VERSION.SDK_INT);
        V0.append(" (");
        V0.append(Build.MODEL);
        V0.append(')');
        String d = d0.d(V0.toString());
        yif.g(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }
}
