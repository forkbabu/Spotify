package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: j75  reason: default package */
public final class j75 implements fjf<Boolean> {

    /* access modifiers changed from: private */
    /* renamed from: j75$a */
    public static final class a {
        private static final j75 a = new j75();
    }

    public static j75 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        DebugFlag debugFlag = DebugFlag.FREE_TIER_ARTIST_LOCAL_HUBS;
        return Boolean.FALSE;
    }
}
