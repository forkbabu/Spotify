package defpackage;

import android.content.Context;
import androidx.core.content.a;
import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.subjects.c;
import io.reactivex.z;

/* renamed from: jn5  reason: default package */
public class jn5 {
    private static final SpSharedPreferences.b<Object, Boolean> c = SpSharedPreferences.b.e("settings.local_files.library.enabled");
    private final SpSharedPreferences<Object> a;
    private c<Boolean> b = PublishSubject.h1();

    public jn5(SpSharedPreferences<Object> spSharedPreferences) {
        this.a = spSharedPreferences;
    }

    public static void b(jn5 jn5, boolean z) {
        SpSharedPreferences.a<Object> b2 = jn5.a.b();
        b2.a(c, z);
        b2.i();
    }

    private void d(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(c, z);
        b2.i();
    }

    public boolean a(Context context) {
        if (!(a.a(context, "android.permission.READ_EXTERNAL_STORAGE") == 0)) {
            d(false);
        }
        return this.a.d(c, false);
    }

    public void c(int i, int[] iArr) {
        if (i == 100) {
            boolean z = false;
            if (iArr.length > 0 && iArr[0] == 0) {
                z = true;
            }
            this.b.onNext(Boolean.valueOf(z));
        }
    }

    public z<Boolean> e(Fragment fragment, boolean z) {
        if (!z) {
            d(false);
            return z.z(Boolean.FALSE);
        }
        if (a.a(fragment.F2(), "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            d(true);
            return z.z(Boolean.TRUE);
        }
        PublishSubject h1 = PublishSubject.h1();
        this.b = h1;
        z<Boolean> p = h1.T().p(new in5(this));
        fragment.i4(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 100);
        return p;
    }
}
