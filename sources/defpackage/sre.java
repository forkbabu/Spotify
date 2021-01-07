package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import io.netty.channel.d;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.l;
import io.reactivex.g;

/* renamed from: sre  reason: default package */
public class sre implements l<d, g<JsonNode>> {
    sre() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public g<JsonNode> apply(d dVar) {
        return g.p(new ire(this, dVar), BackpressureStrategy.LATEST);
    }
}
