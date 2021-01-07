package defpackage;

import com.spotify.libs.connect.model.GaiaDevice;
import io.reactivex.functions.l;

/* renamed from: ktb  reason: default package */
public final /* synthetic */ class ktb implements l {
    public final /* synthetic */ mtb a;

    public /* synthetic */ ktb(mtb mtb) {
        this.a = mtb;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c((GaiaDevice) obj);
    }
}
