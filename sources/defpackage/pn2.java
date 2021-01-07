package defpackage;

import com.spotify.audiorecord.api.AudioRecordingType;
import com.spotify.audiorecord.api.e;
import com.spotify.music.carmode.navigation.domain.p;
import io.reactivex.s;
import java.util.Map;

/* renamed from: pn2  reason: default package */
public final class pn2 {
    private final e a;

    public pn2(Map<AudioRecordingType, e> map) {
        this.a = map.get(AudioRecordingType.MICROPHONE);
    }

    public s<p> a() {
        return this.a.h().j0(jn2.a).E();
    }
}
