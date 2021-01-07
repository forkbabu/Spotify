package defpackage;

import com.spotify.mobile.android.waze.model.WazeBannerModel;
import io.reactivex.functions.g;

/* renamed from: tub  reason: default package */
public final /* synthetic */ class tub implements g {
    public final /* synthetic */ dvb a;

    public /* synthetic */ tub(dvb dvb) {
        this.a = dvb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        dvb.c(this.a, (WazeBannerModel) obj);
    }
}
