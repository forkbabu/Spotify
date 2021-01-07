package defpackage;

import android.os.Build;
import com.google.android.wearable.WearableSharedLib;

/* renamed from: a0  reason: default package */
public final class a0 {

    /* renamed from: a0$a */
    static final class a {
        static final boolean a;

        static {
            boolean z = true;
            if (Build.VERSION.SDK_INT > 21) {
                try {
                    Class.forName("com.google.android.wearable.compat.WearableActivityController");
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
            }
            a = z;
        }
    }

    /* renamed from: a0$b */
    static final class b {
        static final int a = a(Build.VERSION.SDK_INT);

        static int a(int i) {
            if (i < 25) {
                return 0;
            }
            return WearableSharedLib.version();
        }
    }

    public static int a() {
        if (a.a) {
            return b.a;
        }
        throw new IllegalStateException("Could not find wearable shared library classes. Please add <uses-library android:name=\"com.google.android.wearable\" android:required=\"false\" /> to the application manifest");
    }
}
