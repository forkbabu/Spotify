package defpackage;

import android.database.sqlite.SQLiteDatabase;
import defpackage.li;

/* renamed from: ki  reason: default package */
final /* synthetic */ class ki implements li.b {
    private final li a;
    private final tg b;

    private ki(li liVar, tg tgVar) {
        this.a = liVar;
        this.b = tgVar;
    }

    public static li.b a(li liVar, tg tgVar) {
        return new ki(liVar, tgVar);
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        return li.g(this.a, this.b, (SQLiteDatabase) obj);
    }
}
