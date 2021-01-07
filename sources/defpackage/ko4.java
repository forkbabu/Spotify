package defpackage;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.model.a;
import io.reactivex.functions.g;

/* renamed from: ko4  reason: default package */
public final /* synthetic */ class ko4 implements g {
    public final /* synthetic */ a a;

    public /* synthetic */ ko4(a aVar) {
        this.a = aVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ((ConnectManager) obj).c(this.a.getCosmosIdentifier());
    }
}
