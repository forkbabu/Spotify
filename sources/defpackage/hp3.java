package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: hp3  reason: default package */
public class hp3 {
    private static final SpSharedPreferences.b<Object, Integer> b = SpSharedPreferences.b.e("VideoAdsPreferences.overlayAutoHideTimeout");
    private static final SpSharedPreferences.b<Object, Boolean> c = SpSharedPreferences.b.e("record_audio_permission_request_shown");
    private final SpSharedPreferences<Object> a;

    public hp3(SpSharedPreferences<Object> spSharedPreferences) {
        spSharedPreferences.getClass();
        this.a = spSharedPreferences;
    }

    public int a() {
        return this.a.f(b, SnackbarUtilsKt.SNACKBAR_ACTION_DURATION);
    }

    public void b(boolean z) {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(c, z);
        b2.j();
    }

    public boolean c() {
        return this.a.d(c, true);
    }
}
