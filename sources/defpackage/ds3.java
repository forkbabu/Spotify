package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.s;

/* renamed from: ds3  reason: default package */
public class ds3 {
    private final ol3 a;

    public ds3(ol3 ol3) {
        this.a = ol3;
    }

    public s<Response> a(AdSlot adSlot) {
        return this.a.a(adSlot.getSlotId(), adSlot).P();
    }
}
