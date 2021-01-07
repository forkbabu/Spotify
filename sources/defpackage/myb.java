package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: myb  reason: default package */
public final /* synthetic */ class myb implements g {
    public static final /* synthetic */ myb a = new myb();

    private /* synthetic */ myb() {
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Failed to load music videos for music video toggle test", new Object[0]);
    }
}
