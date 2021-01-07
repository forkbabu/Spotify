package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: tj5  reason: default package */
public final class tj5 implements fjf<Boolean> {

    /* access modifiers changed from: private */
    /* renamed from: tj5$a */
    public static final class a {
        private static final tj5 a = new tj5();
    }

    public static tj5 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        DebugFlag debugFlag = DebugFlag.HOME_NO_CACHE;
        return Boolean.FALSE;
    }
}
