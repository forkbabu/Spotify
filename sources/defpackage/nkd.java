package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.music.json.g;
import kotlin.jvm.internal.h;

/* renamed from: nkd  reason: default package */
public final class nkd {
    private final ObjectMapper a;
    private final dre b;

    public nkd(dre dre, g gVar) {
        h.e(dre, "ubiLogger");
        h.e(gVar, "objectMapperFactory");
        this.b = dre;
        this.a = gVar.a();
    }

    public final void a(JsonNode jsonNode) {
        h.e(jsonNode, "impression");
        this.b.b(this.a.writeValueAsString(jsonNode));
    }

    public final void b(JsonNode jsonNode) {
        h.e(jsonNode, "interaction");
        this.b.a(this.a.writeValueAsString(jsonNode));
    }
}
