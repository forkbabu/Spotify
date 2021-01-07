package defpackage;

import com.spotify.music.features.connectui.picker.frictionlessjoin.model.DevicesExposure;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.a;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.b;
import com.spotify.music.sociallistening.models.Session;
import io.reactivex.z;

/* renamed from: sq4  reason: default package */
public interface sq4 {
    @zqf("social-connect/v2/sessions/info/{joinToken}")
    z<Session> a(@mrf("joinToken") String str);

    @irf("social-connect/v2/sessions/available")
    z<b> b(@uqf a aVar, @nrf("origin") String str);

    @jrf("social-connect/v2/devices/{deviceId}/exposed")
    z<DevicesExposure> c(@mrf("deviceId") String str);

    @vqf("social-connect/v2/devices/{deviceId}/exposed")
    z<DevicesExposure> d(@mrf("deviceId") String str);

    @zqf("social-connect/v2/devices/exposure")
    z<DevicesExposure> e();
}
