package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.music.appprotocol.superbird.tipsandtricks.model.TipsAndTricksAppProtocol;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
/* renamed from: jh2  reason: default package */
public final class jh2<T, R> implements l<JsonNode, TipsAndTricksAppProtocol.DeviceTipsAndTricks> {
    public static final jh2 a = new jh2();

    jh2() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public TipsAndTricksAppProtocol.DeviceTipsAndTricks apply(JsonNode jsonNode) {
        JsonNode jsonNode2 = jsonNode;
        h.e(jsonNode2, "it");
        return new TipsAndTricksAppProtocol.DeviceTipsAndTricks(jsonNode2);
    }
}
