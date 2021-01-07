package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.voiceassistant.voice.results.o;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.i;

/* renamed from: qx8  reason: default package */
public class qx8 {
    private final Context a;
    private final MediaSessionCompat b;
    private final vja c;
    private final o d;

    public qx8(Application application, MediaSessionCompat mediaSessionCompat, vja vja, o oVar) {
        this.a = application;
        this.b = mediaSessionCompat;
        this.c = vja;
        this.d = oVar;
    }

    public void a(Optional optional, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.spotify.music.CAR_MODE", false);
        if (booleanValue) {
            this.b.w(this.c.a(this.a, ViewUris.d.toString(), bundle));
        } else if (!optional.isPresent()) {
            this.b.w(this.c.a(this.a, ViewUris.g0.toString(), bundle));
        } else {
            this.b.w(this.c.a(this.a, (String) optional.get(), bundle));
        }
    }

    public a b(Optional<String> optional) {
        Logger.b("Setting session activity to %s", optional);
        return new i(this.d.b().N0(1).R(Boolean.FALSE).p(new tw8(this, optional)));
    }
}
