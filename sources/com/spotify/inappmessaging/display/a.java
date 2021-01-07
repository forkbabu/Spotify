package com.spotify.inappmessaging.display;

/* access modifiers changed from: package-private */
public abstract class a extends p {
    private final float a;
    private final float b;
    private final float c;
    private final float f;

    a(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.f = f5;
    }

    @Override // com.spotify.inappmessaging.display.p
    public float a() {
        return this.c;
    }

    @Override // com.spotify.inappmessaging.display.p
    public float b() {
        return this.f;
    }

    @Override // com.spotify.inappmessaging.display.p
    public float c() {
        return this.a;
    }

    @Override // com.spotify.inappmessaging.display.p
    public float e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (Float.floatToIntBits(this.a) == Float.floatToIntBits(pVar.c()) && Float.floatToIntBits(this.b) == Float.floatToIntBits(pVar.e()) && Float.floatToIntBits(this.c) == Float.floatToIntBits(pVar.a()) && Float.floatToIntBits(this.f) == Float.floatToIntBits(pVar.b())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003) ^ Float.floatToIntBits(this.f);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("TouchBoundary{mXPos=");
        V0.append(this.a);
        V0.append(", mYPos=");
        V0.append(this.b);
        V0.append(", mHeight=");
        V0.append(this.c);
        V0.append(", mWidth=");
        V0.append(this.f);
        V0.append("}");
        return V0.toString();
    }
}
