package defpackage;

import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.n;
import com.facebook.k;

/* renamed from: fg  reason: default package */
public class fg {
    private static b a = new a();

    /* renamed from: fg$a */
    static class a implements b {
        a() {
        }
    }

    /* renamed from: fg$b */
    public interface b {
    }

    public static void a() {
        n j;
        if (k.q() && (j = FetchedAppSettingsManager.j(k.e())) != null && j.g()) {
            bg.a();
        }
    }
}
