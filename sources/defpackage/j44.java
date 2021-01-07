package defpackage;

import android.content.res.Resources;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.music.navigation.b;
import com.spotify.ubi.specification.factories.z;
import io.reactivex.s;
import io.reactivex.w;
import kotlin.jvm.internal.h;

/* renamed from: j44  reason: default package */
public final class j44 {

    /* access modifiers changed from: package-private */
    /* renamed from: j44$a */
    /* compiled from: java-style lambda group */
    public static final class a implements io.reactivex.functions.a {
        public final /* synthetic */ int a;
        public final /* synthetic */ Object b;
        public final /* synthetic */ Object c;

        public a(int i, Object obj, Object obj2) {
            this.a = i;
            this.b = obj;
            this.c = obj2;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            int i = this.a;
            if (i == 0) {
                ((ere) this.b).a(((z) this.c).c().a());
            } else if (i == 1) {
                ((ere) this.b).a(((z) this.c).b().a());
            } else {
                throw null;
            }
        }
    }

    public static final w<u34, v34> a(s<String> sVar, bqa bqa, com.spotify.music.features.blendinvitation.api.a aVar, b bVar, SnackbarManager snackbarManager, ere ere, z zVar, Resources resources) {
        h.e(sVar, "username");
        h.e(bqa, "profile");
        h.e(aVar, "blendInvitationDataSource");
        h.e(bVar, "activityStarter");
        h.e(snackbarManager, "snackbarManager");
        h.e(ere, "eventLogger");
        h.e(zVar, "eventFactory");
        h.e(resources, "resources");
        m f = i.f();
        f.h(a44.class, new l44(sVar, bqa));
        f.h(z34.class, new k44(aVar));
        f.b(g44.class, new n44(snackbarManager));
        f.e(f44.class, new m44(resources, bVar), io.reactivex.android.schedulers.a.b());
        f.b(e44.class, new a(0, ere, zVar));
        f.b(d44.class, new a(1, ere, zVar));
        return f.i();
    }
}
