package defpackage;

import com.spotify.libs.connect.ConnectManager;
import io.reactivex.functions.g;

/* renamed from: ltb  reason: default package */
public final /* synthetic */ class ltb implements g {
    public final /* synthetic */ mtb a;

    public /* synthetic */ ltb(mtb mtb) {
        this.a = mtb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        mtb.a(this.a, (ConnectManager.ConnectState) obj);
    }
}
