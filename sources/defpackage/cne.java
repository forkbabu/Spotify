package defpackage;

import android.media.MediaPlayer;

/* renamed from: cne  reason: default package */
public final /* synthetic */ class cne implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ ene a;

    public /* synthetic */ cne(ene ene) {
        this.a = ene;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.a.a(mediaPlayer, i, i2);
        return true;
    }
}
