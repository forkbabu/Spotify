package defpackage;

import com.spotify.music.libs.debugtools.flags.DebugFlag;

/* renamed from: w9f  reason: default package */
public final class w9f implements fjf<sef> {
    private final wlf<pef> a;

    public w9f(wlf<pef> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        this.a.get();
        DebugFlag debugFlag = DebugFlag.SUPERBIRD_RECORD_VOICE;
        return new ref();
    }
}
