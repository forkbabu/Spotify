package defpackage;

import com.spotify.topic.proto.TopicsViewResponse;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: os8  reason: default package */
public final class os8 {
    private final ps8 a;
    private final l<TopicsViewResponse, b91> b;

    public os8(ps8 ps8, l<TopicsViewResponse, b91> lVar) {
        h.e(ps8, "topicDataSource");
        h.e(lVar, "topicViewResponseToHubsTransformer");
        this.a = ps8;
        this.b = lVar;
    }

    public final z<b91> a() {
        z<R> A = this.a.a().A(this.b);
        h.d(A, "topicDataSource.fetchTop…esponseToHubsTransformer)");
        return A;
    }
}
