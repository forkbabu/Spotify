package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.ui.activity.upsell.model.Offer;
import io.reactivex.functions.l;

/* renamed from: pid  reason: default package */
public final /* synthetic */ class pid implements l {
    public static final /* synthetic */ pid a = new pid();

    private /* synthetic */ pid() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (Offer) ((Optional) obj).get();
    }
}
