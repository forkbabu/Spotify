package defpackage;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: zk0  reason: default package */
public final class zk0 {
    private final RoomDatabase a;

    public zk0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
    }

    public List<yk0> a(String str) {
        j d = j.d("SELECT eventName || '_' || hex(sequenceId) AS eventName, sequenceNumberNext, COUNT(sequenceNumber) AS storageSize,MIN(sequenceNumber) AS sequenceNumberMin FROM EventSequenceNumbers LEFT JOIN Events USING (eventName, sequenceId) WHERE ? = COALESCE(owner, ?) GROUP BY eventName", 2);
        if (str == null) {
            d.O1(1);
        } else {
            d.a1(1, str);
        }
        if (str == null) {
            d.O1(2);
        } else {
            d.a1(2, str);
        }
        this.a.b();
        Cursor b = l7.b(this.a, d, false, null);
        try {
            int d2 = h7.d(b, "eventName");
            int d3 = h7.d(b, "sequenceNumberNext");
            int d4 = h7.d(b, "storageSize");
            int d5 = h7.d(b, "sequenceNumberMin");
            ArrayList arrayList = new ArrayList(b.getCount());
            while (b.moveToNext()) {
                yk0 yk0 = new yk0();
                yk0.a = b.getString(d2);
                if (b.isNull(d3)) {
                    yk0.c = null;
                } else {
                    yk0.c = Long.valueOf(b.getLong(d3));
                }
                if (b.isNull(d4)) {
                    yk0.d = null;
                } else {
                    yk0.d = Long.valueOf(b.getLong(d4));
                }
                if (b.isNull(d5)) {
                    yk0.b = null;
                } else {
                    yk0.b = Long.valueOf(b.getLong(d5));
                }
                arrayList.add(yk0);
            }
            return arrayList;
        } finally {
            b.close();
            d.f();
        }
    }
}
