package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.functions.l;

/* renamed from: pdc  reason: default package */
public final /* synthetic */ class pdc implements l {
    public static final /* synthetic */ pdc a = new pdc();

    private /* synthetic */ pdc() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        SpSharedPreferences.b<Object, String> bVar = tdc.d;
        PartnerType k = PartnerType.k((String) obj);
        if (k != PartnerType.UNKNOWN) {
            return bdc.c(Optional.of(k));
        }
        return bdc.c(Optional.absent());
    }
}
