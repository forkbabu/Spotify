package defpackage;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.ContextTrack;
import com.spotify.remoteconfig.m8;
import kotlin.jvm.internal.h;

/* renamed from: lcb  reason: default package */
public final class lcb implements kcb {
    private m8 a;

    public lcb(m8 m8Var) {
        h.e(m8Var, "androidLibsLyricsProperties");
        this.a = m8Var;
    }

    public static final boolean c(ContextTrack contextTrack) {
        return Boolean.parseBoolean((String) je.e0(contextTrack, AppProtocol.TrackData.TYPE_TRACK, "has_lyrics"));
    }

    @Override // defpackage.kcb
    public boolean a() {
        return this.a.b();
    }

    @Override // defpackage.kcb
    public boolean b() {
        return this.a.a();
    }
}
