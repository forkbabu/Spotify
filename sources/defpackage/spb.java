package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.ads.voice.domain.v;

/* renamed from: spb  reason: default package */
public final /* synthetic */ class spb implements da2 {
    public final /* synthetic */ gqb a;

    public /* synthetic */ spb(gqb gqb) {
        this.a = gqb;
    }

    @Override // defpackage.da2
    public final void accept(Object obj) {
        gqb gqb = this.a;
        v vVar = (v) obj;
        gqb.getClass();
        Logger.b("[VoiceAd] Mobius model emitted: %s", vVar);
        new Handler(Looper.getMainLooper()).post(new npb(gqb, vVar));
    }
}
