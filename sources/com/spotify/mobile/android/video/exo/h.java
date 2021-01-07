package com.spotify.mobile.android.video.exo;

import android.net.Uri;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.upstream.o;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.offline.BetamaxOfflineManager;
import com.spotify.mobile.android.video.offline.e0;
import com.spotify.mobile.android.video.u;
import java.util.List;
import okhttp3.y;

public class h {
    private final e72 a;
    private final List<c72> b;
    private final y c;

    public h(y yVar, e72 e72, List<c72> list) {
        this.c = yVar;
        this.a = e72;
        this.b = list;
    }

    public t a(d0 d0Var, o oVar, BetamaxOfflineManager betamaxOfflineManager, u uVar) {
        d0Var.getClass();
        e0 e0Var = null;
        if (betamaxOfflineManager != null) {
            e0Var = betamaxOfflineManager.e(d0Var.b());
        }
        for (c72 c72 : this.b) {
            if (c72.c(d0Var)) {
                return c72.a(d0Var, uVar, e0Var, this.a);
            }
        }
        return new y.a(z42.d(this.c, oVar, uVar)).a(Uri.parse(d0Var.b()));
    }
}
