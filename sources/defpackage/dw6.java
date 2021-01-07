package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: dw6  reason: default package */
public final /* synthetic */ class dw6 implements g {
    public static final /* synthetic */ dw6 a = new dw6();

    private /* synthetic */ dw6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "PublishedItem: Failed to set published state.", new Object[0]);
    }
}
