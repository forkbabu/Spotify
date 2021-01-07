package defpackage;

import defpackage.i1;

/* renamed from: r80  reason: default package */
public final class r80 extends h80 {
    private final int a;

    private r80(int i) {
        this.a = i;
    }

    public static h80 b(int i) {
        return new r80(i);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.h80
    public void a(i1.a aVar) {
        aVar.c(this.a);
    }
}
