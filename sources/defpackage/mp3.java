package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: mp3  reason: default package */
public final /* synthetic */ class mp3 implements g {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public /* synthetic */ mp3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        Logger.b("Failed to report event %s for ad %s.", this.a, this.b);
    }
}
