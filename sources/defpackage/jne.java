package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: jne  reason: default package */
public final /* synthetic */ class jne implements g {
    public static final /* synthetic */ jne a = new jne();

    private /* synthetic */ jne() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("Is Downloading over cellular allowed: %b", (Boolean) obj);
    }
}
