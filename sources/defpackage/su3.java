package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.functions.a;

/* renamed from: su3  reason: default package */
public final /* synthetic */ class su3 implements a {
    public final /* synthetic */ AdSlot a;

    public /* synthetic */ su3(AdSlot adSlot) {
        this.a = adSlot;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        Logger.b("%s adslot cleared", this.a.toString());
    }
}
