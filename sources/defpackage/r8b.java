package defpackage;

import com.spotify.topic.proto.TopicsViewResponse;
import io.reactivex.z;

/* renamed from: r8b  reason: default package */
public interface r8b {
    @zqf("topics-view-mobile/v1/topics/{topicId}")
    z<TopicsViewResponse> a(@mrf("topicId") String str);
}
