package defpackage;

import android.util.Base64;
import com.spotify.metadata.voice.proto.Metadata$AudioFile;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* renamed from: b3f  reason: default package */
public final /* synthetic */ class b3f implements nmf {
    public static final /* synthetic */ b3f a = new b3f();

    private /* synthetic */ b3f() {
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        Metadata$AudioFile metadata$AudioFile = (Metadata$AudioFile) obj;
        return VoiceInteractionResponse.Preview.AudioFile.create(Base64.encodeToString(metadata$AudioFile.h().A(), 0), metadata$AudioFile.i().name());
    }
}
