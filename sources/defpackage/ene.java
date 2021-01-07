package defpackage;

import android.media.MediaPlayer;
import io.reactivex.a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ene  reason: default package */
public class ene {
    private final gne a;
    private final cte b;
    private final Map<Integer, MediaPlayer> c = new HashMap();
    private final MediaPlayer.OnErrorListener d = new cne(this);

    public ene(gne gne, cte cte) {
        this.a = gne;
        this.b = cte;
    }

    public boolean a(MediaPlayer mediaPlayer, int i, int i2) {
        mediaPlayer.release();
        for (Map.Entry<Integer, MediaPlayer> entry : this.c.entrySet()) {
            if (entry.getValue() == mediaPlayer) {
                int intValue = entry.getKey().intValue();
                MediaPlayer a2 = this.a.a(intValue);
                a2.setOnErrorListener(this.d);
                this.c.put(Integer.valueOf(intValue), a2);
            }
        }
        return true;
    }

    public a b(int i) {
        if (!this.c.containsKey(Integer.valueOf(i))) {
            return this.b.b(i);
        }
        MediaPlayer mediaPlayer = this.c.get(Integer.valueOf(i));
        mediaPlayer.getClass();
        return a.u(new dne(mediaPlayer)).G(io.reactivex.schedulers.a.c());
    }

    public void c(int[] iArr) {
        for (int i : iArr) {
            MediaPlayer a2 = this.a.a(i);
            a2.setOnErrorListener(this.d);
            this.c.put(Integer.valueOf(i), a2);
        }
    }

    public void d() {
        for (MediaPlayer mediaPlayer : this.c.values()) {
            mediaPlayer.release();
        }
        this.c.clear();
    }
}
