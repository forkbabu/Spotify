package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.s;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.artist.dac.ui.DacArtistFragment;
import com.spotify.music.navigation.k;
import com.spotify.remoteconfig.o5;
import kotlin.jvm.internal.h;

/* renamed from: wj2  reason: default package */
public final class wj2 implements blb, k {
    private final o5 a;

    public wj2(o5 o5Var) {
        h.e(o5Var, "dacProperties");
        this.a = o5Var;
    }

    @Override // com.spotify.music.navigation.k
    public s a(Intent intent, l0 l0Var, String str, c cVar, SessionState sessionState) {
        String str2;
        if (l0Var == null || (str2 = l0Var.toString()) == null) {
            str2 = "";
        }
        h.d(str2, "link?.toString() ?: \"\"");
        h.e(str2, "artistUri");
        DacArtistFragment dacArtistFragment = new DacArtistFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ARTIST_URI", str2);
        dacArtistFragment.r4(bundle);
        return dacArtistFragment;
    }

    @Override // defpackage.blb
    public void b(glb glb) {
        h.e(glb, "registry");
        if (this.a.a()) {
            ((xkb) glb).i(LinkType.INTERNAL_ARTIST, "Show Artist Page", this);
        }
    }
}
