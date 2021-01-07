package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.partnerapps.PartnerType;
import defpackage.adc;
import io.reactivex.functions.g;

/* renamed from: ldc  reason: default package */
public final /* synthetic */ class ldc implements g {
    public final /* synthetic */ hla a;

    public /* synthetic */ ldc(hla hla) {
        this.a = hla;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        hla hla = this.a;
        adc.c cVar = (adc.c) obj;
        if (cVar.a() == PartnerType.WAZE) {
            hla.b();
        } else if (cVar.a() == PartnerType.GOOGLE_MAPS) {
            hla.a();
        } else {
            Logger.d("Unrecognized partner app: %s", cVar.a().toString());
        }
    }
}
