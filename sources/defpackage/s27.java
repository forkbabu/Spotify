package defpackage;

import defpackage.r27;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.d;

/* renamed from: s27  reason: default package */
public final class s27 implements fjf<Map<String, Boolean>> {
    private final wlf<Boolean> a;

    public s27(wlf<Boolean> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        boolean booleanValue = this.a.get().booleanValue();
        r27.a aVar = r27.a;
        Boolean bool = Boolean.TRUE;
        return d.y(new Pair("link", bool), new Pair("name", bool), new Pair("offline", bool), new Pair("isNew", bool), new Pair("isInListenLater", bool), new Pair("isPlayed", bool), new Pair("length", bool), new Pair("timeLeft", bool), new Pair("publishDate", bool), new Pair("playable", bool), new Pair("available", bool), new Pair("covers", bool), new Pair("freezeFrames", bool), new Pair("manifestId", bool), new Pair("mediaTypeEnum", bool), new Pair("isExplicit", bool), new Pair("backgroundable", bool), new Pair("description", bool), new Pair("type", bool), new Pair("syncProgress", bool), new Pair("quotes", Boolean.valueOf(booleanValue)), new Pair("isMusicAndTalk", bool));
    }
}
