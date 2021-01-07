package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import kotlin.jvm.internal.h;

/* renamed from: jqe  reason: default package */
public final class jqe {
    private MediaPlayer a;
    private final Context b;

    public jqe(Context context) {
        h.e(context, "context");
        this.b = context;
    }

    public MediaPlayer a(int i) {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer create = MediaPlayer.create(this.b, i);
        this.a = create;
        h.d(create, "MediaPlayer.create(conte…lso { activePlayer = it }");
        return create;
    }

    public MediaPlayer b() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        MediaPlayer mediaPlayer2 = new MediaPlayer();
        this.a = mediaPlayer2;
        return mediaPlayer2;
    }

    public MediaPlayer c() {
        return this.a;
    }
}
