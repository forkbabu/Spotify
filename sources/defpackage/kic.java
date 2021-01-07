package defpackage;

import com.spotify.mobile.android.quotesharing.b;
import com.spotify.mobile.android.quotesharing.c;
import com.spotify.playlist.models.Episode;
import java.util.List;

/* renamed from: kic  reason: default package */
public final class kic implements jic {
    private final ngc a;
    private final etc b;

    kic(ngc ngc, etc etc) {
        this.a = ngc;
        this.b = etc;
        ngc.d(false);
        ngc.c(true);
    }

    @Override // defpackage.jic
    public void a(iic iic, Episode episode, Episode[] episodeArr, String str, List<b> list, c.a aVar, boolean z) {
        this.a.b(iic, episode, episodeArr, str, z);
        nic nic = (nic) iic;
        nic.g(list, aVar);
        nic.E(this.b.e(episode));
        if (!this.b.e(episode)) {
            nic.w(false);
        }
    }
}
