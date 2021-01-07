package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.navigation.v;
import com.spotify.remoteconfig.bd;
import kotlin.jvm.internal.h;

/* renamed from: vg0  reason: default package */
public final class vg0 implements blb {
    private final bd a;

    /* renamed from: vg0$a */
    static final class a<P extends Parcelable> implements v<wsd> {
        public static final a a = new a();

        a() {
        }

        /* Return type fixed from 'android.os.Parcelable' to match base method */
        @Override // com.spotify.music.navigation.v
        public wsd a(Intent intent, l0 l0Var, SessionState sessionState) {
            return new wsd();
        }
    }

    public vg0(bd bdVar) {
        h.e(bdVar, "properties");
        this.a = bdVar;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        if (this.a.a()) {
            ((xkb) glb).j(LinkType.NOARGS_CALIFORNIA, "feature pattern experiments", tg4.class, a.a);
        }
    }
}
