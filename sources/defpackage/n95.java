package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.l0;
import io.reactivex.functions.l;
import io.reactivex.z;

/* renamed from: n95  reason: default package */
public final /* synthetic */ class n95 implements l {
    public static final /* synthetic */ n95 a = new n95();

    private /* synthetic */ n95() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Failed to lookup track when trying to navigate to an album.", new Object[0]);
        return z.z(l0.z("spotify:home"));
    }
}
