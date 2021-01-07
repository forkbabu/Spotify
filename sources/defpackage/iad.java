package defpackage;

import android.content.Intent;
import com.spotify.android.flags.c;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.sociallistening.models.JoinType;
import defpackage.glb;
import kotlin.jvm.internal.h;

/* renamed from: iad  reason: default package */
public final class iad implements blb {
    private final ead a;
    private final cfd b;
    private final f4d c;
    private final t7d d;
    private final scd e;

    /* renamed from: iad$a */
    static final class a<T, U, R> implements glb.b<Intent, c, Intent> {
        final /* synthetic */ iad a;

        a(iad iad) {
            this.a = iad;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // defpackage.glb.b
        public Intent a(Intent intent, c cVar) {
            Intent intent2 = intent;
            if (this.a.b.b()) {
                return this.a.d.a();
            }
            if (!this.a.b.c()) {
                return null;
            }
            h.d(intent2, "intent");
            l0 z = l0.z(intent2.getDataString());
            h.d(z, "link");
            if (z.p() <= 1) {
                return this.a.e.getIntent();
            }
            boolean booleanExtra = intent2.getBooleanExtra("from_scannable", false);
            if (booleanExtra) {
                iad iad = this.a;
                StringBuilder V0 = je.V0("Joining from scannable: ");
                V0.append(z.k());
                iad.g(iad, V0.toString());
                ead ead = this.a.a;
                String B = z.B();
                h.c(B);
                ead.b(B);
            } else {
                iad iad2 = this.a;
                StringBuilder V02 = je.V0("Joining from link: ");
                V02.append(z.k());
                iad.g(iad2, V02.toString());
                ead ead2 = this.a.a;
                String B2 = z.B();
                h.c(B2);
                ead2.a(B2);
            }
            if (h.a(z.k(), this.a.c.k().b())) {
                iad.g(this.a, "Tried to join current session");
                return this.a.e.getIntent();
            }
            JoinType joinType = booleanExtra ? JoinType.a : JoinType.b;
            t7d t7d = this.a.d;
            String k = z.k();
            h.d(k, "link.lastSegment");
            return t7d.e(k, joinType, false);
        }
    }

    public iad(ead ead, cfd cfd, f4d f4d, t7d t7d, scd scd) {
        h.e(ead, "socialListeningRouteLogger");
        h.e(cfd, "socialListeningProperties");
        h.e(f4d, "socialListening");
        h.e(t7d, "socialListeningActivityDialogs");
        h.e(scd, "participantListIntentProvider");
        this.a = ead;
        this.b = cfd;
        this.c = f4d;
        this.d = t7d;
        this.e = scd;
    }

    public static final void g(iad iad, String str) {
        iad.getClass();
        Logger.b("social listening route: " + str, new Object[0]);
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        ((xkb) glb).h(LinkType.SOCIALSESSION, "Join or view a social session", new a(this));
    }
}
