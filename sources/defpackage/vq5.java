package defpackage;

import com.spotify.mobile.android.waze.model.WazeBannerModel;
import io.reactivex.functions.l;

/* renamed from: vq5  reason: default package */
public final /* synthetic */ class vq5 implements l {
    public static final /* synthetic */ vq5 a = new vq5();

    private /* synthetic */ vq5() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((WazeBannerModel) obj).h() == WazeBannerModel.Type.NAVIGATION_BANNER);
    }
}
