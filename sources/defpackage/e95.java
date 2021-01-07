package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: e95  reason: default package */
public final class e95 implements fjf<Boolean> {

    /* access modifiers changed from: private */
    /* renamed from: e95$a */
    public static final class a {
        private static final e95 a = new e95();
    }

    public static e95 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        DebugFlag debugFlag = DebugFlag.FREE_TIER_TRACK_LOCAL_HUBS;
        return Boolean.FALSE;
    }
}
