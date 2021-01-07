package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: d16  reason: default package */
public final /* synthetic */ class d16 implements g {
    public static final /* synthetic */ d16 a = new d16();

    private /* synthetic */ d16() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Unable to subscribe to playlist", new Object[0]);
    }
}
