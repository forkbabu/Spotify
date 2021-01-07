package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: oh3  reason: default package */
public final class oh3 implements nh3 {
    private static final SpSharedPreferences.b<Object, Boolean> b = SpSharedPreferences.b.e("utterance_banner_explicitly_closed");
    private final SpSharedPreferences<Object> a;

    /* renamed from: oh3$a */
    static final class a<T, R> implements l<SpSharedPreferences.Update<Boolean>, Boolean> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(SpSharedPreferences.Update<Boolean> update) {
            SpSharedPreferences.Update<Boolean> update2 = update;
            h.e(update2, "it");
            return update2.a;
        }
    }

    public oh3(SpSharedPreferences<Object> spSharedPreferences) {
        h.e(spSharedPreferences, "sharedPreferences");
        this.a = spSharedPreferences;
    }

    @Override // defpackage.nh3
    public s<Boolean> a() {
        SpSharedPreferences<Object> spSharedPreferences = this.a;
        SpSharedPreferences.b<Object, Boolean> bVar = b;
        s<R> G0 = spSharedPreferences.p(bVar).j0(a.a).G0((R) Boolean.valueOf(this.a.d(bVar, false)));
        h.d(G0, "sharedPreferences.observ…CITLY_CLOSED_KEY, false))");
        return G0;
    }

    @Override // defpackage.nh3
    public void b() {
        SpSharedPreferences.a<Object> b2 = this.a.b();
        b2.a(b, true);
        b2.j();
    }
}
