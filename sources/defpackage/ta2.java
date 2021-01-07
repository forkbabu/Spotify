package defpackage;

import com.spotify.mobile.android.waze.model.WazeBannerModel;
import io.reactivex.functions.l;

/* renamed from: ta2  reason: default package */
public final /* synthetic */ class ta2 implements l {
    public static final /* synthetic */ ta2 a = new ta2();

    private /* synthetic */ ta2() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return Boolean.valueOf(((WazeBannerModel) obj).h() == WazeBannerModel.Type.GOTO_BANNER);
    }
}
