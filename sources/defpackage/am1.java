package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: am1  reason: default package */
public final /* synthetic */ class am1 implements g {
    public static final /* synthetic */ am1 a = new am1();

    private /* synthetic */ am1() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Something went wrong while fetching category.", new Object[0]);
    }
}
