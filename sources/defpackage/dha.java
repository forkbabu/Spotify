package defpackage;

import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;

/* renamed from: dha  reason: default package */
public final /* synthetic */ class dha implements l {
    public static final /* synthetic */ dha a = new dha();

    private /* synthetic */ dha() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SpSharedPreferences.b<Object, Boolean> bVar = iha.c;
        T t = ((SpSharedPreferences.Update) obj).a;
        return Boolean.valueOf(t == null ? false : t.booleanValue());
    }
}
