package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import io.reactivex.functions.g;

/* renamed from: iw9  reason: default package */
public final /* synthetic */ class iw9 implements g {
    public static final /* synthetic */ iw9 a = new iw9();

    private /* synthetic */ iw9() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        SpSharedPreferences.b<Object, String> bVar = fx9.e;
        Logger.e((Throwable) obj, "Error fetching partner-id", new Object[0]);
    }
}
