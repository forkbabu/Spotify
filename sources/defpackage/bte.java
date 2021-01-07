package defpackage;

import android.media.MediaPlayer;
import io.reactivex.b;

/* renamed from: bte  reason: default package */
public final /* synthetic */ class bte implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ b a;

    public /* synthetic */ bte(b bVar) {
        this.a = bVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        b bVar = this.a;
        if (!bVar.d()) {
            bVar.onComplete();
        }
    }
}
