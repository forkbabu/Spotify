package defpackage;

import android.media.MediaPlayer;
import io.reactivex.functions.a;

/* renamed from: dne  reason: default package */
public final /* synthetic */ class dne implements a {
    public final /* synthetic */ MediaPlayer a;

    public /* synthetic */ dne(MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        this.a.start();
    }
}
