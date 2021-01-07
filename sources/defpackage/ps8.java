package defpackage;

import com.spotify.topic.proto.TopicsViewResponse;
import io.reactivex.z;
import kotlin.jvm.internal.h;

/* renamed from: ps8  reason: default package */
public final class ps8 {
    private final r8b a;
    private final String b;

    public ps8(r8b r8b, String str) {
        h.e(r8b, "topicViewMobileEndpoint");
        h.e(str, "topicId");
        this.a = r8b;
        this.b = str;
    }

    public z<TopicsViewResponse> a() {
        z<TopicsViewResponse> a2 = this.a.a(this.b);
        h.d(a2, "topicViewMobileEndpoint.topic(topicId)");
        return a2;
    }
}
