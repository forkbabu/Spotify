package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import com.google.protobuf.u;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;

/* renamed from: oob  reason: default package */
public class oob {
    private static final SpSharedPreferences.b<Object, Boolean> h = SpSharedPreferences.b.e("user_has_denied_microphone_permission");
    private final Fragment a;
    private final gl0<u> b;
    private final bv3 c;
    private final cqe d;
    private final k e;
    private final SpSharedPreferences<Object> f;
    private final m g = new nob(this);

    public oob(Fragment fragment, gl0<u> gl0, bv3 bv3, cqe cqe, k kVar, SpSharedPreferences<Object> spSharedPreferences) {
        this.a = fragment;
        this.b = gl0;
        this.c = bv3;
        this.d = cqe;
        this.e = kVar;
        this.f = spSharedPreferences;
    }

    static boolean b(oob oob) {
        c B2 = oob.a.B2();
        if (B2 == null) {
            return false;
        }
        boolean shouldShowRequestPermissionRationale = B2.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO");
        if (!oob.f.d(h, false) || shouldShowRequestPermissionRationale) {
            return false;
        }
        return true;
    }

    static void c(oob oob) {
        SpSharedPreferences.a<Object> b2 = oob.f.b();
        b2.a(h, true);
        b2.i();
    }

    public void g() {
        this.e.y0(this.g);
    }
}
