package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: v55  reason: default package */
public final class v55 implements fjf<Boolean> {

    /* access modifiers changed from: private */
    /* renamed from: v55$a */
    public static final class a {
        private static final v55 a = new v55();
    }

    public static v55 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        DebugFlag debugFlag = DebugFlag.FREE_TIER_ARTIST_LOCAL_HUBS;
        return Boolean.FALSE;
    }
}
