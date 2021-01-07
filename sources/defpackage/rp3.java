package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.a;

/* renamed from: rp3  reason: default package */
public final /* synthetic */ class rp3 implements a {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;

    public /* synthetic */ rp3(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        Logger.b("Ad Event Reported Successfully: %s, %s", this.a, this.b);
    }
}
