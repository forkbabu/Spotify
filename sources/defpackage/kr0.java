package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: kr0  reason: default package */
public final class kr0 implements fjf<Boolean> {

    /* access modifiers changed from: private */
    /* renamed from: kr0$a */
    public static final class a {
        private static final kr0 a = new kr0();
    }

    public static kr0 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        DebugFlag debugFlag = DebugFlag.CONNECT_IN_BACKGROUND;
        return Boolean.FALSE;
    }
}
