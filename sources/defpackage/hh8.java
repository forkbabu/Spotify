package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

/* renamed from: hh8  reason: default package */
public class hh8 implements jh8 {
    private final String a;

    hh8(String str) {
        this.a = str;
    }

    @Override // defpackage.jh8
    public c a() {
        return ViewUris.q0.b(this.a);
    }
}
