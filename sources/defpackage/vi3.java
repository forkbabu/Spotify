package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.l;

/* renamed from: vi3  reason: default package */
public final /* synthetic */ class vi3 implements l {
    public static final /* synthetic */ vi3 a = new vi3();

    private /* synthetic */ vi3() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Logger.e((Throwable) obj, "Failed to subscribe to Listen later episodes", new Object[0]);
        return 0;
    }
}
