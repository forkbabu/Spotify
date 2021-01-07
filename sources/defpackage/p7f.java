package defpackage;

import com.spotify.nlu.voiceview.v1.VoiceRequest;
import com.spotify.nlu.voiceview.v1.VoiceResponse;
import io.reactivex.z;

/* renamed from: p7f  reason: default package */
public interface p7f {
    @erf({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    @irf("voice-view{environment}/v3/voice")
    z<VoiceResponse> a(@mrf("environment") String str, @uqf VoiceRequest voiceRequest);
}
