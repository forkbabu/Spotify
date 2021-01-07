package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;

/* renamed from: qk8  reason: default package */
public final /* synthetic */ class qk8 implements l {
    public final /* synthetic */ vk8 a;
    public final /* synthetic */ int b;

    public /* synthetic */ qk8(vk8 vk8, int i) {
        this.a = vk8;
        this.b = i;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.f(this.b, (SpSharedPreferences) obj);
    }
}
