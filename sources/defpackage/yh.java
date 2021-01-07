package defpackage;

import android.database.Cursor;
import defpackage.li;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: yh  reason: default package */
public final /* synthetic */ class yh implements li.b {
    private static final yh a = new yh();

    private yh() {
    }

    public static li.b a() {
        return a;
    }

    @Override // defpackage.li.b
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        int i = li.o;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i2 += blob.length;
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            byte[] bArr2 = (byte[]) arrayList.get(i4);
            System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
            i3 += bArr2.length;
        }
        return bArr;
    }
}
