package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: c3a  reason: default package */
public final /* synthetic */ class c3a implements g {
    public static final /* synthetic */ c3a a = new c3a();

    private /* synthetic */ c3a() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        int i = n3a.s;
        Logger.e(th, "Error fetching branch enabled parameter for id passback: %s", th);
    }
}
