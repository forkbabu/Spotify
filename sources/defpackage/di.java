package defpackage;

import android.database.Cursor;
import android.util.Base64;
import defpackage.li;
import defpackage.tg;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: di  reason: default package */
public final /* synthetic */ class di implements li.b {
    private static final di a = new di();

    private di() {
    }

    public static li.b a() {
        return a;
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        byte[] bArr;
        Cursor cursor = (Cursor) obj;
        int i = li.o;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            tg.a a2 = tg.a();
            a2.b(cursor.getString(1));
            a2.d(yi.b(cursor.getInt(2)));
            String string = cursor.getString(3);
            if (string == null) {
                bArr = null;
            } else {
                bArr = Base64.decode(string, 0);
            }
            a2.c(bArr);
            arrayList.add(a2.a());
        }
        return arrayList;
    }
}
