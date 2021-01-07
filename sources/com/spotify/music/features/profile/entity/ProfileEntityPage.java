package com.spotify.music.features.profile.entity;

import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.viewuri.c;
import com.spotify.pageloader.ObservableLoadable;
import io.reactivex.s;
import io.reactivex.y;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class ProfileEntityPage implements psd {
    private final dtd a;
    private final qsd b;
    private final Set<atd> c;
    private final y d;
    private final boolean e;

    public static final class FailLoadingProfileEntityException extends RuntimeException {
        public FailLoadingProfileEntityException() {
            super("Failed loading profile entity");
        }
    }

    static final class a implements ToolbarConfig.b {
        final /* synthetic */ ProfileEntityPage a;

        a(ProfileEntityPage profileEntityPage) {
            this.a = profileEntityPage;
        }

        @Override // com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.b
        public final boolean G() {
            return this.a.e;
        }
    }

    public ProfileEntityPage(qac qac, s sVar, y yVar, bp7 bp7, t tVar, boolean z) {
        h.e(qac, "template");
        h.e(sVar, "factory");
        h.e(yVar, "mainThreadScheduler");
        h.e(bp7, "profileEntityDataLoader");
        h.e(tVar, "profileEntityPageParameters");
        this.d = yVar;
        this.e = z;
        l0 z2 = l0.z(tVar.b());
        h.d(z2, "SpotifyLink.of(profileEn…ageParameters.profileUri)");
        String r = z2.r();
        if (r != null) {
            s<np7> Q = bp7.d(r, tVar.a()).o0(yVar).N(new p(new ProfileEntityPage$content$1(this))).Q(new q(new ProfileEntityPage$content$2(this)));
            h.d(Q, "profileEntityDataLoader\n…      .filter(::isLoaded)");
            this.a = qac.a(this, ObservableLoadable.a(Q), new nac(new ProfileEntityPage$content$3(sVar), null, null, null, 14));
            ysd ysd = new ysd("");
            c a2 = c.a(tVar.b());
            h.d(a2, "ViewUri.create(profileEn…ageParameters.profileUri)");
            PageIdentifiers pageIdentifiers = PageIdentifiers.PROFILE;
            ifd ifd = kfd.z1;
            h.d(ifd, "FeatureIdentifiers.USER_PROFILE");
            this.b = new qsd(ysd, a2, pageIdentifiers, ifd, tVar.b());
            this.c = d.G(new a(this));
            return;
        }
        throw new IllegalStateException("Required value was null.".toString());
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
        return this.c;
    }
}
