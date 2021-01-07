package com.spotify.music.newplaying.scroll.view;

final class h extends l {
    private final int a;
    private final int b;

    h(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // com.spotify.music.newplaying.scroll.view.l
    public int a() {
        return this.b;
    }

    @Override // com.spotify.music.newplaying.scroll.view.l
    public int b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a == lVar.b() && this.b == lVar.a()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ScrollEvent{y=");
        V0.append(this.a);
        V0.append(", oldY=");
        return je.B0(V0, this.b, "}");
    }
}
