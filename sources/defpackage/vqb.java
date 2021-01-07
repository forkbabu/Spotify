package defpackage;

import com.spotify.player.model.ContextTrack;

/* renamed from: vqb  reason: default package */
public class vqb {
    private final ContextTrack a;
    private final int b;

    public vqb(ContextTrack contextTrack, int i, int i2) {
        this.a = contextTrack;
        this.b = (i * 31) + i2;
    }

    public int a() {
        return this.b;
    }

    public ContextTrack b() {
        return this.a;
    }
}
