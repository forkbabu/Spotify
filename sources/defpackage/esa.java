package defpackage;

import defpackage.s81;

/* renamed from: esa  reason: default package */
public abstract class esa implements dsa {
    private final String a;

    public esa(String str) {
        this.a = str;
    }

    @Override // defpackage.dsa
    public s81.a a(s81.a aVar) {
        return aVar.d("label", this.a);
    }
}
