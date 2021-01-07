package defpackage;

import com.sensory.speech.snsr.SnsrStream;
import com.spotify.audiorecord.api.AudioRecordingType;
import com.spotify.audiorecord.api.e;
import com.spotify.wakeword.sensory.z;
import java.util.Map;

/* renamed from: jif  reason: default package */
public final class jif implements fjf<SnsrStream> {
    private final wlf<cif> a;
    private final wlf<Map<AudioRecordingType, e>> b;
    private final wlf<fif> c;
    private final wlf<z> d;

    public jif(wlf<cif> wlf, wlf<Map<AudioRecordingType, e>> wlf2, wlf<fif> wlf3, wlf<z> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        SnsrStream snsrStream;
        Map<AudioRecordingType, e> map = this.b.get();
        fif fif = this.c.get();
        z zVar = this.d.get();
        if (this.a.get().b()) {
            snsrStream = SnsrStream.fromProvider(new iif(map, fif, zVar));
        } else {
            snsrStream = SnsrStream.fromAudioDevice();
        }
        yif.g(snsrStream, "Cannot return null from a non-@Nullable @Provides method");
        return snsrStream;
    }
}
