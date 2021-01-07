package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.employeepodcasts.view.EmployeePodcastsFragment;
import com.spotify.music.navigation.k;
import io.reactivex.z;
import java.net.URLDecoder;
import kotlin.collections.d;
import kotlin.jvm.internal.h;
import kotlin.text.e;

/* renamed from: ky4  reason: default package */
public final class ky4 implements blb {
    private final boolean a;
    private final ly4 b;

    /* renamed from: ky4$a */
    static final class a implements k {
        public static final a a = new a();

        a() {
        }

        @Override // com.spotify.music.navigation.k
        public final s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
            return new EmployeePodcastsFragment();
        }
    }

    /* renamed from: ky4$b */
    static final class b implements vkb {
        final /* synthetic */ ky4 a;

        b(ky4 ky4) {
            this.a = ky4;
        }

        @Override // defpackage.vkb
        public final z<elb> a(Intent intent, c cVar, SessionState sessionState) {
            h.e(intent, "intent");
            String B = l0.z(intent.getDataString()).B();
            if (B != null) {
                String decode = URLDecoder.decode((String) d.q(e.w(B, new String[]{":"}, false, 0, 6, null)), "utf-8");
                ly4 ly4 = this.a.b;
                h.d(decode, "authCode");
                return ((my4) ly4).d(decode);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public ky4(boolean z, ly4 ly4) {
        h.e(ly4, "authHandler");
        this.a = z;
        this.b = ly4;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        a aVar = a.a;
        b bVar = new b(this);
        if (this.a) {
            xkb xkb = (xkb) glb;
            xkb.i(LinkType.EMPLOYEE_PODCASTS, "Employee Podcasts features", aVar);
            xkb.k(mlb.b(LinkType.EMPLOYEE_PODCASTS_AUTH), "employee-podcasts", bVar);
        }
    }
}
