package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: fs3  reason: default package */
public final /* synthetic */ class fs3 implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ fs3(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.b("Failed to resolve request for %s: %s", this.a, (Throwable) obj);
    }
}
