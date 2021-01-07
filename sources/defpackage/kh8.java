package defpackage;

import com.spotify.music.features.ads.model.Ad;
import com.spotify.pageloader.s0;
import java.util.List;

/* renamed from: kh8  reason: default package */
public final /* synthetic */ class kh8 implements sg0 {
    public final /* synthetic */ wlf a;
    public final /* synthetic */ wlf b;

    public /* synthetic */ kh8(wlf wlf, wlf wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.sg0
    public final Object apply(Object obj) {
        wlf wlf = this.a;
        wlf wlf2 = this.b;
        List<Ad> list = (List) obj;
        if (list == null || list.isEmpty()) {
            return (s0) wlf2.get();
        }
        rh8 rh8 = (rh8) wlf.get();
        rh8.a(list);
        return rh8;
    }
}
