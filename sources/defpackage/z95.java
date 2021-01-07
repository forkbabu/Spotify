package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: z95  reason: default package */
public final /* synthetic */ class z95 implements g {
    public static final /* synthetic */ z95 a = new z95();

    private /* synthetic */ z95() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.d("Social playback attempt failed", new Object[0]);
    }
}
