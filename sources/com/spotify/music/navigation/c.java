package com.spotify.music.navigation;

import com.spotify.music.C0707R;

public class c {
    private final boolean a;
    private final int b;
    private final int c;

    public c(boolean z, int i, int i2) {
        this.a = z;
        if (i == 0 && i2 == 0) {
            this.b = C0707R.anim.fade_in_hard;
            this.c = C0707R.anim.fade_out_hard;
            return;
        }
        this.b = i;
        this.c = i2;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.b;
    }

    public boolean b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
    }

    public int hashCode() {
        return ((((this.a ? 1 : 0) * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AnimationSpec{crossfade=");
        V0.append(this.a);
        V0.append(", enterAnim=");
        V0.append(this.b);
        V0.append(", exitAnim=");
        return je.A0(V0, this.c, '}');
    }
}
