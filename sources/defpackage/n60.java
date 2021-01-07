package defpackage;

import android.content.ContentValues;

/* renamed from: n60  reason: default package */
public final class n60 {
    private final ContentValues a;

    public n60(int i) {
        ContentValues contentValues = new ContentValues();
        this.a = contentValues;
        contentValues.put("idNo", Integer.toString(i));
    }

    public ContentValues a() {
        return this.a;
    }

    public void b(String str, x60 x60) {
        this.a.put(str, x60.a());
    }
}
