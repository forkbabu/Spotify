package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.superbird.presets.model.PresetRequest;
import io.reactivex.d0;
import io.reactivex.e;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingle;
import io.reactivex.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: qpe  reason: default package */
public final class qpe implements ppe {
    private final rpe a;
    private final l<String> b;
    private final cqe c;

    /* renamed from: qpe$a */
    static final class a<T, R> implements io.reactivex.functions.l<String, d0<? extends JsonNode>> {
        final /* synthetic */ qpe a;

        a(qpe qpe) {
            this.a = qpe;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public d0<? extends JsonNode> apply(String str) {
            String str2 = str;
            h.e(str2, "serial");
            return this.a.a.c(str2);
        }
    }

    /* renamed from: qpe$b */
    static final class b<T, R> implements io.reactivex.functions.l<String, e> {
        final /* synthetic */ qpe a;
        final /* synthetic */ JsonNode b;

        b(qpe qpe, JsonNode jsonNode) {
            this.a = qpe;
            this.b = jsonNode;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public e apply(String str) {
            String str2 = str;
            h.e(str2, "serial");
            return this.a.a.b(str2, this.b);
        }
    }

    /* renamed from: qpe$c */
    static final class c<T, R> implements io.reactivex.functions.l<String, e> {
        final /* synthetic */ qpe a;
        final /* synthetic */ int b;
        final /* synthetic */ String c;

        c(qpe qpe, int i, String str) {
            this.a = qpe;
            this.b = i;
            this.c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public e apply(String str) {
            String str2 = str;
            h.e(str2, "serial");
            return this.a.a.a(str2, new PresetRequest(this.b, this.c, this.a.c.d(), null, 0, 24, null));
        }
    }

    public qpe(rpe rpe, l<String> lVar, cqe cqe) {
        h.e(rpe, "superbirdPresetsEndpoint");
        h.e(lVar, "superbirdSerial");
        h.e(cqe, "clock");
        this.a = rpe;
        this.b = lVar;
        this.c = cqe;
    }

    @Override // defpackage.ppe
    public io.reactivex.a a(JsonNode jsonNode) {
        h.e(jsonNode, "presets");
        io.reactivex.a h = this.b.h(new b(this, jsonNode));
        h.d(h, "superbirdSerial\n        …l, presets)\n            }");
        return h;
    }

    @Override // defpackage.ppe
    public z<JsonNode> b() {
        l<String> lVar = this.b;
        a aVar = new a(this);
        lVar.getClass();
        MaybeFlatMapSingle maybeFlatMapSingle = new MaybeFlatMapSingle(lVar, aVar);
        h.d(maybeFlatMapSingle, "superbirdSerial\n        …ets(serial)\n            }");
        return maybeFlatMapSingle;
    }

    @Override // defpackage.ppe
    public io.reactivex.a c(int i, String str) {
        h.e(str, "contextUri");
        io.reactivex.a h = this.b.h(new c(this, i, str));
        h.d(h, "superbirdSerial\n        …          )\n            }");
        return h;
    }
}
