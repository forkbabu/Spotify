package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: lu6  reason: default package */
public final /* synthetic */ class lu6 implements g {
    public static final /* synthetic */ lu6 a = new lu6();

    private /* synthetic */ lu6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to add/remove playlist.", new Object[0]);
    }
}
