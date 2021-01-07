package defpackage;

import android.media.MediaPlayer;
import io.reactivex.functions.f;

/* renamed from: mld  reason: default package */
public final /* synthetic */ class mld implements f {
    public final /* synthetic */ MediaPlayer a;

    public /* synthetic */ mld(MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.release();
    }
}
