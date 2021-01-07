package com.spotify.mobile.android.video.offline;

import android.util.Base64;
import com.spotify.mobile.android.video.offline.database.BetamaxOfflineDatabase;
import com.spotify.mobile.android.video.offline.database.b;
import com.spotify.mobile.android.video.offline.database.c;

public class x {
    private final BetamaxOfflineDatabase a;

    public x(BetamaxOfflineDatabase betamaxOfflineDatabase) {
        this.a = betamaxOfflineDatabase;
    }

    public void a(String str) {
        b bVar = (b) this.a.t();
        c b = bVar.b(str);
        if (b != null) {
            bVar.a(b);
        }
    }

    public h0 b(String str) {
        c b = ((b) this.a.t()).b(str);
        if (b != null) {
            return new h0(Base64.decode(b.b, 0));
        }
        return null;
    }

    public void c(String str, h0 h0Var) {
        ((b) this.a.t()).c(new c(str, h0Var.a()));
    }
}
