package com.spotify.music.features.profile.profilelist;

import com.spotify.music.features.profile.model.e;
import com.spotify.pageloader.ObservableLoadable;
import io.reactivex.s;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.h;

public final class ProfileListPage implements psd {
    private final dtd a;
    private final qsd b;
    private final t c;
    private final fl7 d;
    private final u e;

    public static final class FailLoadingProfileListException extends RuntimeException {
        public FailLoadingProfileListException() {
            super("Failed loading profile list");
        }
    }

    public ProfileListPage(qac qac, t tVar, fl7 fl7, u uVar, qsd qsd) {
        h.e(qac, "template");
        h.e(tVar, "pageElementFactory");
        h.e(fl7, "profileListDataSource");
        h.e(uVar, "profileListPageParameters");
        h.e(qsd, "pageLegacyMetadata");
        this.c = tVar;
        this.d = fl7;
        this.e = uVar;
        s<e> Q = fl7.a(e.a).N(new q(new ProfileListPage$content$1(this))).Q(new r(new ProfileListPage$content$2(this)));
        h.d(Q, "profileListDataSource\n  …      .filter(::isLoaded)");
        this.a = qac.a(this, ObservableLoadable.a(Q), new nac(new ProfileListPage$content$3(this), null, null, null, 14));
        this.b = qsd;
    }

    @Override // defpackage.psd
    public qsd a() {
        return this.b;
    }

    @Override // defpackage.psd
    public dtd b() {
        return this.a;
    }

    @Override // defpackage.psd
    public Set<atd> getCapabilities() {
        return EmptySet.a;
    }
}
