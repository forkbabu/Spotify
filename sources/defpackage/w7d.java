package defpackage;

import com.spotify.music.sociallistening.models.Session;
import io.reactivex.a;
import io.reactivex.z;
import retrofit2.v;

/* renamed from: w7d  reason: default package */
public interface w7d {
    @zqf("social-connect/v2/sessions/info/{joinToken}")
    z<Session> a(@mrf("joinToken") String str);

    @zqf("social-connect/v2/sessions/current_or_new")
    z<v<Session>> b(@nrf("local_device_id") String str);

    @irf("social-connect/v2/sessions/join/{joinToken}")
    z<v<Session>> c(@mrf("joinToken") String str, @nrf("playback_control") String str2, @nrf("local_device_id") String str3, @nrf("join_type") String str4);

    @zqf("social-connect/v2/sessions/current")
    z<v<Session>> d(@nrf("local_device_id") String str);

    @vqf("social-connect/v3/sessions/{sessionId}")
    a e(@mrf("sessionId") String str, @nrf("local_device_id") String str2);

    @irf("social-connect/v3/sessions/{sessionId}/leave")
    a f(@mrf("sessionId") String str, @nrf("local_device_id") String str2);
}
