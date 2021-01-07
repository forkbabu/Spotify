package defpackage;

import android.content.Context;
import android.media.MediaPlayer;

/* renamed from: gne  reason: default package */
public class gne {
    private final Context a;

    public gne(Context context) {
        this.a = context;
    }

    public MediaPlayer a(int i) {
        return MediaPlayer.create(this.a, i);
    }
}
