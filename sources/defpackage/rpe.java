package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.superbird.presets.model.PresetRequest;
import io.reactivex.a;
import io.reactivex.z;

/* renamed from: rpe  reason: default package */
public interface rpe {
    @jrf("carthing-proxy/content/v1/presets/{device_id}")
    a a(@mrf("device_id") String str, @uqf PresetRequest presetRequest);

    @jrf("carthing-proxy/content/v1/presets/{device_id}")
    a b(@mrf("device_id") String str, @uqf JsonNode jsonNode);

    @zqf("carthing-proxy/content/v1/presets/{device_id}?cold_start=true")
    z<JsonNode> c(@mrf("device_id") String str);
}
