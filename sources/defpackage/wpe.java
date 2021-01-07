package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: wpe  reason: default package */
public final class wpe implements vpe {
    private final xpe a;

    public wpe(xpe xpe) {
        h.e(xpe, "superbirdTipsAndTricksEndpoint");
        this.a = xpe;
    }

    @Override // defpackage.vpe
    public z<JsonNode> a() {
        return this.a.a();
    }
}
