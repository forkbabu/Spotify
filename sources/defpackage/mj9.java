package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;

/* renamed from: mj9  reason: default package */
public final /* synthetic */ class mj9 implements l {
    public final /* synthetic */ zj9 a;

    public /* synthetic */ mj9(zj9 zj9) {
        this.a = zj9;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c((SpSharedPreferences.Update) obj);
    }
}
