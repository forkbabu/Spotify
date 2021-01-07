package defpackage;

import com.spotify.audiorecord.api.AudioRecordingException;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.i;
import io.reactivex.functions.l;
import io.reactivex.g;

/* renamed from: qse  reason: default package */
public final /* synthetic */ class qse implements l {
    public static final /* synthetic */ qse a = new qse();

    private /* synthetic */ qse() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof AudioRecordingException) {
            return g.B(new VoiceSessionException(ErrorDomain.AUDIO_RECORDER, i.a(((AudioRecordingException) th).a()), th));
        }
        return g.B(th);
    }
}
