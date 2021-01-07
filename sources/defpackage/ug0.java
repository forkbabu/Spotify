package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.california.feature.e;
import com.spotify.music.features.california.feature.f;
import com.spotify.music.navigation.v;
import com.spotify.remoteconfig.bd;
import kotlin.jvm.internal.h;

/* renamed from: ug0  reason: default package */
public final class ug0 implements blb {
    private final bd a;

    /* renamed from: ug0$a */
    static final class a<P extends Parcelable> implements v<f> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'android.os.Parcelable' to match base method */
        @Override // com.spotify.music.navigation.v
        public f a(Intent intent, l0 l0Var, SessionState sessionState) {
            int intExtra = intent.getIntExtra("lucky_number", 42);
            String currentUser = sessionState.currentUser();
            h.d(currentUser, "sessionState.currentUser()");
            return new f(intExtra, currentUser);
        }
    }

    public ug0(bd bdVar) {
        h.e(bdVar, "properties");
        this.a = bdVar;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        if (this.a.a()) {
            ((xkb) glb).j(LinkType.CALIFORNIA, "feature pattern experiments", e.class, a.a);
        }
    }
}
