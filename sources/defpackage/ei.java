package defpackage;

import android.database.Cursor;
import defpackage.li;

/* access modifiers changed from: package-private */
/* renamed from: ei  reason: default package */
public final /* synthetic */ class ei implements li.b {
    private static final ei a = new ei();

    private ei() {
    }

    public static li.b a() {
        return a;
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
