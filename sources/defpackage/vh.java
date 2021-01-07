package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.li;

/* renamed from: vh  reason: default package */
final /* synthetic */ class vh implements li.b {
    private static final vh a = new vh();

    private vh() {
    }

    public static li.b a() {
        return a;
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        return li.h((SQLiteDatabase) obj);
    }
}
