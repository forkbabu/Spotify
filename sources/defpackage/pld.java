package defpackage;

import android.media.MediaPlayer;

/* renamed from: pld  reason: default package */
public final /* synthetic */ class pld implements MediaPlayer.OnErrorListener {
    public static final /* synthetic */ pld a = new pld();

    private /* synthetic */ pld() {
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        mediaPlayer.reset();
        return true;
    }
}
