package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: c80  reason: default package */
public final /* synthetic */ class c80 implements g {
    public static final /* synthetic */ c80 a = new c80();

    private /* synthetic */ c80() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Error on warmUp Chrome tabs", new Object[0]);
    }
}
