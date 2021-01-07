package defpackage;

import com.spotify.mobile.android.waze.model.WazeBannerModel;
import io.reactivex.functions.n;

/* renamed from: xq5  reason: default package */
public final /* synthetic */ class xq5 implements n {
    public static final /* synthetic */ xq5 a = new xq5();

    private /* synthetic */ xq5() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        WazeBannerModel wazeBannerModel = (WazeBannerModel) obj;
        return wazeBannerModel.h() == WazeBannerModel.Type.NAVIGATION_BANNER || wazeBannerModel.h() == WazeBannerModel.Type.NO_BANNER;
    }
}
