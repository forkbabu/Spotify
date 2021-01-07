package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: bx4  reason: default package */
public final /* synthetic */ class bx4 implements g {
    public static final /* synthetic */ bx4 a = new bx4();

    private /* synthetic */ bx4() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to cancel the image saving", new Object[0]);
    }
}
