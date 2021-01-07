package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: e3a  reason: default package */
public final /* synthetic */ class e3a implements g {
    public static final /* synthetic */ e3a a = new e3a();

    private /* synthetic */ e3a() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        int i = n3a.s;
        Logger.e(th, "Error fetching branch partner-id: %s", th);
    }
}
