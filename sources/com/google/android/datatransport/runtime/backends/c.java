package com.google.android.datatransport.runtime.backends;

import android.content.Context;

final class c extends g {
    private final Context a;
    private final ti b;
    private final ti c;
    private final String d;

    c(Context context, ti tiVar, ti tiVar2, String str) {
        if (context != null) {
            this.a = context;
            if (tiVar != null) {
                this.b = tiVar;
                if (tiVar2 != null) {
                    this.c = tiVar2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public Context a() {
        return this.a;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public String b() {
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public ti c() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.backends.g
    public ti d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.a.equals(gVar.a()) || !this.b.equals(gVar.d()) || !this.c.equals(gVar.c()) || !this.d.equals(gVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("CreationContext{applicationContext=");
        V0.append(this.a);
        V0.append(", wallClock=");
        V0.append(this.b);
        V0.append(", monotonicClock=");
        V0.append(this.c);
        V0.append(", backendName=");
        return je.I0(V0, this.d, "}");
    }
}
