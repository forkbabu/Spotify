package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: xic  reason: default package */
public final /* synthetic */ class xic implements g {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;

    public /* synthetic */ xic(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "Error playing podcast episode: %s at %d", this.a, Long.valueOf(this.b));
    }
}
