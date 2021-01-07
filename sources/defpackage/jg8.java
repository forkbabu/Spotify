package defpackage;

import android.os.Parcelable;
import defpackage.e61;

/* renamed from: jg8  reason: default package */
abstract class jg8 extends pg8 {
    private final e61.a a;
    private final Parcelable b;
    private final gh8 c;
    private final int f;

    jg8(e61.a aVar, Parcelable parcelable, gh8 gh8, int i) {
        if (aVar != null) {
            this.a = aVar;
            if (parcelable != null) {
                this.b = parcelable;
                if (gh8 != null) {
                    this.c = gh8;
                    this.f = i;
                    return;
                }
                throw new NullPointerException("Null backgroundState");
            }
            throw new NullPointerException("Null searchFieldState");
        }
        throw new NullPointerException("Null hubsState");
    }

    @Override // defpackage.pg8
    public gh8 a() {
        return this.c;
    }

    @Override // defpackage.pg8
    public e61.a b() {
        return this.a;
    }

    @Override // defpackage.pg8
    public int c() {
        return this.f;
    }

    @Override // defpackage.pg8
    public Parcelable e() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pg8)) {
            return false;
        }
        pg8 pg8 = (pg8) obj;
        if (!this.a.equals(pg8.b()) || !this.b.equals(pg8.e()) || !this.c.equals(pg8.a()) || this.f != pg8.c()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("MainViewBinderSaveState{hubsState=");
        V0.append(this.a);
        V0.append(", searchFieldState=");
        V0.append(this.b);
        V0.append(", backgroundState=");
        V0.append(this.c);
        V0.append(", lastKnownColor=");
        return je.B0(V0, this.f, "}");
    }
}
