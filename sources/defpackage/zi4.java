package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.features.carepackage.CarePackageFragment;
import kotlin.jvm.internal.h;

/* renamed from: zi4  reason: default package */
public final class zi4 implements blb {
    private final tg0<Boolean> a;

    /* renamed from: zi4$a */
    static final class a implements flb {
        final /* synthetic */ zi4 a;

        a(zi4 zi4) {
            this.a = zi4;
        }

        @Override // defpackage.flb
        public final elb a(Intent intent, c cVar, SessionState sessionState) {
            Object obj = this.a.a.get();
            h.d(obj, "carePackageEnabled.get()");
            if (((Boolean) obj).booleanValue()) {
                return elb.d(new CarePackageFragment());
            }
            return elb.a();
        }
    }

    public zi4(tg0<Boolean> tg0) {
        h.e(tg0, "carePackageEnabled");
        this.a = tg0;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        ((xkb) glb).k(mlb.b(LinkType.FOREVER_FAVORITES), "Forever Favorites assisted playlist creation.", new fkb(new a(this)));
    }
}
