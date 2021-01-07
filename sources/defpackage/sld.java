package defpackage;

import android.media.MediaPlayer;
import io.reactivex.b;

/* renamed from: sld  reason: default package */
public final /* synthetic */ class sld implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ b a;

    public /* synthetic */ sld(b bVar) {
        this.a = bVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        b bVar = this.a;
        mediaPlayer.reset();
        bVar.onComplete();
    }
}
