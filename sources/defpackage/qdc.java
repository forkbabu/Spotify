package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.l;
import io.reactivex.z;

/* renamed from: qdc  reason: default package */
public final /* synthetic */ class qdc implements l {
    public static final /* synthetic */ qdc a = new qdc();

    private /* synthetic */ qdc() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SpSharedPreferences.b<Object, String> bVar = tdc.d;
        Logger.e((Throwable) obj, "Server error. Can't fetch partner settings", new Object[0]);
        return z.z(ImmutableMap.of());
    }
}
