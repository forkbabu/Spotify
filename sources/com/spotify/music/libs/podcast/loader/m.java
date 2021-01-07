package com.spotify.music.libs.podcast.loader;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.util.l0;
import io.reactivex.schedulers.a;
import io.reactivex.z;

@Deprecated
public class m {
    private final q a;
    private final n b;

    public m(n nVar, String str) {
        this.b = nVar;
        this.a = new q(l0.z(str).i());
        Logger.b("Creating new ShowDataLoader", new Object[0]);
    }

    public z<qyd> a() {
        ShowUriBuilder e = this.a.e();
        Policy policy = new Policy(this.a.c());
        return this.b.a(this.a.d(), e.c(), policy).H(a.a()).A(a.a).B(io.reactivex.android.schedulers.a.b());
    }

    public q b() {
        return this.a;
    }
}
