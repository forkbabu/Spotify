package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;

/* renamed from: zm9  reason: default package */
public final /* synthetic */ class zm9 implements l {
    public final /* synthetic */ fn9 a;

    public /* synthetic */ zm9(fn9 fn9) {
        this.a = fn9;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.d((SpSharedPreferences) obj);
    }
}
