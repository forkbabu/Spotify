package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;

/* renamed from: vod  reason: default package */
public class vod<T> {
    private final uod<T> a;

    public vod(uod<T> uod) {
        this.a = uod;
    }

    public /* synthetic */ Optional a(SpSharedPreferences.b bVar, String str) {
        return this.a.a(bVar, str);
    }

    public /* synthetic */ void b(SpSharedPreferences.b bVar) {
        this.a.b(bVar);
    }

    public /* synthetic */ void c(SpSharedPreferences.b bVar, String str, long j, Object obj) {
        this.a.c(bVar, obj, str, j);
    }
}
