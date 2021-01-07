package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: yu3  reason: default package */
public final /* synthetic */ class yu3 implements g {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public /* synthetic */ yu3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Logger.c((Throwable) obj, "Flashpoint - Failed to report event %s with data (%s)", this.a, this.b);
    }
}
