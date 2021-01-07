package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import io.reactivex.functions.n;

/* renamed from: dse  reason: default package */
public final /* synthetic */ class dse implements n {
    public static final /* synthetic */ dse a = new dse();

    private /* synthetic */ dse() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return !((JsonNode) obj).has("transcript");
    }
}
