package defpackage;

import com.spotify.music.premiummini.k;
import kotlin.jvm.internal.h;

/* renamed from: z56  reason: default package */
public final class z56 implements y56 {
    private final kcb a;
    private final k b;
    private final zec c;

    public z56(kcb kcb, k kVar, zec zec) {
        h.e(kcb, "lyricsConfiguration");
        h.e(kVar, "premiumMiniProperties");
        h.e(zec, "roundPlayButtonFlagUtils");
        this.a = kcb;
        this.b = kVar;
        this.c = zec;
    }

    @Override // defpackage.y56
    public boolean a() {
        return this.b.a();
    }

    @Override // defpackage.y56
    public boolean b() {
        return this.a.b();
    }

    @Override // defpackage.y56
    public boolean c() {
        return this.c.c();
    }

    @Override // defpackage.y56
    public boolean d() {
        return this.c.d();
    }

    @Override // defpackage.y56
    public boolean e(boolean z) {
        if (this.b.a()) {
            return false;
        }
        return z;
    }
}
