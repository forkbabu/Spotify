package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: dr6  reason: default package */
public final /* synthetic */ class dr6 implements g {
    public static final /* synthetic */ dr6 a = new dr6();

    private /* synthetic */ dr6() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        int i = sr6.o;
        Logger.e((Throwable) obj, "LicenseLayoutChangeObserver: Failed. Its OK! We will catch this error in another chain (i.e. we don't want multiple chain failures)", new Object[0]);
    }
}
