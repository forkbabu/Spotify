package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import defpackage.c69;

/* renamed from: u29  reason: default package */
public final /* synthetic */ class u29 implements c69.e {
    public final /* synthetic */ da2 b;
    public final /* synthetic */ zc9 c;

    public /* synthetic */ u29(da2 da2, zc9 zc9) {
        this.b = da2;
        this.c = zc9;
    }

    @Override // defpackage.c69.e
    public final void a(va9 va9) {
        da2 da2 = this.b;
        zc9 zc9 = this.c;
        da2.accept(s0.c(va9));
        zc9.e(va9.b());
    }
}
