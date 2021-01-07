package com.spotify.wakeword.sensory;

import android.app.Application;
import com.sensory.speech.snsr.SnsrStream;
import com.spotify.audiorecord.api.AudioRecordingType;
import com.spotify.audiorecord.api.e;
import io.reactivex.y;
import java.util.Map;

public final class c0 implements fjf<b0> {
    public static b0 a(Application application, y yVar, fif fif, wlf<SnsrStream> wlf, v vVar, cif cif, Map<AudioRecordingType, e> map, z zVar) {
        return new b0(application, yVar, fif, wlf, vVar, cif, map, zVar);
    }
}
