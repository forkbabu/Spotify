package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;

/* renamed from: sk8  reason: default package */
public final /* synthetic */ class sk8 implements l {
    public final /* synthetic */ vk8 a;

    public /* synthetic */ sk8(vk8 vk8) {
        this.a = vk8;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        this.a.d((SpSharedPreferences) obj);
        return b.a;
    }
}
