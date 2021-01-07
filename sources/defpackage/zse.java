package defpackage;

import android.media.MediaPlayer;
import io.reactivex.functions.f;

/* renamed from: zse  reason: default package */
public final /* synthetic */ class zse implements f {
    public final /* synthetic */ MediaPlayer a;

    public /* synthetic */ zse(MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.release();
    }
}
