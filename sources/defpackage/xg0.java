package defpackage;

import com.spotify.collection.endpoints.artist.policy.Policy;
import com.spotify.collection.endpoints.common.player.PlayPayload;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.i;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.z;
import java.util.Map;

/* renamed from: xg0  reason: default package */
public interface xg0 {
    s<i<b>> a(Map<String, String> map, Policy policy);

    z<i<b>> b(Map<String, String> map, Policy policy);

    a c(String str, yg0 yg0);

    a d(String str, yg0 yg0, PlayPayload playPayload);

    s<li0> e(String str, yg0 yg0);

    a f(String str, yg0 yg0);

    s<li0> g(String str, yg0 yg0);
}
