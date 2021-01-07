package defpackage;

import defpackage.li;

/* access modifiers changed from: package-private */
/* renamed from: ci  reason: default package */
public final /* synthetic */ class ci implements li.d {
    private final ri a;

    private ci(ri riVar) {
        this.a = riVar;
    }

    public static li.d b(ri riVar) {
        return new ci(riVar);
    }

    @Override // defpackage.li.d
    public Object a() {
        return this.a.getWritableDatabase();
    }
}
