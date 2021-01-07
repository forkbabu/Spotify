package defpackage;

import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableViewModel;
import defpackage.i17;
import defpackage.o17;
import io.reactivex.functions.l;

/* renamed from: e17  reason: default package */
public final /* synthetic */ class e17 implements l {
    public final /* synthetic */ boolean a;

    public /* synthetic */ e17(boolean z) {
        this.a = z;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        boolean z = this.a;
        i17.b bVar = (i17.b) o17.a.a();
        bVar.b(z);
        bVar.d((HubsImmutableViewModel) obj);
        bVar.c(false);
        return bVar.a();
    }
}
