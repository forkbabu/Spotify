package com.spotify.music.libs.search.transition;

import android.graphics.Rect;

abstract class a extends l {
    private final Rect a;
    private final String b;
    private final String c;

    a(Rect rect, String str, String str2) {
        if (rect != null) {
            this.a = rect;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null buttonAccessibilityText");
            }
            throw new NullPointerException("Null buttonText");
        }
        throw new NullPointerException("Null viewBounds");
    }

    @Override // com.spotify.music.libs.search.transition.l
    public String a() {
        return this.c;
    }

    @Override // com.spotify.music.libs.search.transition.l
    public String b() {
        return this.b;
    }

    @Override // com.spotify.music.libs.search.transition.l
    public Rect c() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.a.equals(lVar.c()) || !this.b.equals(lVar.b()) || !this.c.equals(lVar.a())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SearchLaunchTransitionParameters{viewBounds=");
        V0.append(this.a);
        V0.append(", buttonText=");
        V0.append(this.b);
        V0.append(", buttonAccessibilityText=");
        return je.I0(V0, this.c, "}");
    }
}
