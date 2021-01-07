package defpackage;

import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.functions.g;

/* renamed from: gq3  reason: default package */
public final /* synthetic */ class gq3 implements g {
    public final /* synthetic */ lq3 a;
    public final /* synthetic */ AdSlot b;

    public /* synthetic */ gq3(lq3 lq3, AdSlot adSlot) {
        this.a = lq3;
        this.b = adSlot;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.c(this.b, (Response) obj);
    }
}
