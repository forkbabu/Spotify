package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.g;

/* renamed from: s95  reason: default package */
public final /* synthetic */ class s95 implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ s95(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        String str = this.a;
        if (((Boolean) obj).booleanValue()) {
            Logger.b("Successfully attempted to play.", new Object[0]);
        } else {
            Logger.b("Not allowed to play %s", str);
        }
    }
}
