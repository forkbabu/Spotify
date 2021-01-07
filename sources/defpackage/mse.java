package defpackage;

import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.i;
import io.reactivex.functions.l;
import io.reactivex.z;

/* renamed from: mse  reason: default package */
public final /* synthetic */ class mse implements l {
    public static final /* synthetic */ mse a = new mse();

    private /* synthetic */ mse() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return z.q(new VoiceSessionException(ErrorDomain.AUTHENTICATION, i.b, (Throwable) obj));
    }
}
