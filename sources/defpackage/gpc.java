package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: gpc  reason: default package */
public final class gpc extends hpc {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    gpc(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.h = i9;
        this.i = i10;
    }

    @Override // defpackage.hpc
    public int a() {
        return this.a;
    }

    @Override // defpackage.hpc
    public int b() {
        return this.b;
    }

    @Override // defpackage.hpc
    public int d() {
        return this.g;
    }

    @Override // defpackage.hpc
    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hpc)) {
            return false;
        }
        hpc hpc = (hpc) obj;
        if (this.a == hpc.a() && this.b == hpc.b() && this.c == hpc.f() && this.d == hpc.e() && this.e == hpc.h() && this.f == hpc.i() && this.g == hpc.d() && this.h == hpc.g() && this.i == hpc.j()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hpc
    public int f() {
        return this.c;
    }

    @Override // defpackage.hpc
    public int g() {
        return this.h;
    }

    @Override // defpackage.hpc
    public int h() {
        return this.e;
    }

    public int hashCode() {
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i;
    }

    @Override // defpackage.hpc
    public int i() {
        return this.f;
    }

    @Override // defpackage.hpc
    public int j() {
        return this.i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Configuration{cardWidth=");
        V0.append(this.a);
        V0.append(", descriptionSize=");
        V0.append(this.b);
        V0.append(", podcastImageSize=");
        V0.append(this.c);
        V0.append(", podcastImagePlaceHolderSize=");
        V0.append(this.d);
        V0.append(", titleAppearance=");
        V0.append(this.e);
        V0.append(", titleColor=");
        V0.append(this.f);
        V0.append(", metadataVisibility=");
        V0.append(this.g);
        V0.append(", textOffset=");
        V0.append(this.h);
        V0.append(", titleTopMargin=");
        return je.B0(V0, this.i, "}");
    }
}
