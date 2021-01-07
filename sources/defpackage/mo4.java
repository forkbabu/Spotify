package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: mo4  reason: default package */
public final /* synthetic */ class mo4 implements g {
    public static final /* synthetic */ mo4 a = new mo4();

    private /* synthetic */ mo4() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Can't start discovery", new Object[0]);
    }
}
