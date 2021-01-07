package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;
import java.util.Queue;

/* renamed from: ym9  reason: default package */
public final /* synthetic */ class ym9 implements l {
    public final /* synthetic */ fn9 a;
    public final /* synthetic */ Queue b;

    public /* synthetic */ ym9(fn9 fn9, Queue queue) {
        this.a = fn9;
        this.b = queue;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        this.a.f(this.b, (SpSharedPreferences) obj);
        return b.a;
    }
}
