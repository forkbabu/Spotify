package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.a;

/* renamed from: gs3  reason: default package */
public final /* synthetic */ class gs3 implements a {
    public final /* synthetic */ String a;

    public /* synthetic */ gs3(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        Logger.b("Next track request made successfully for %s slot", this.a);
    }
}
