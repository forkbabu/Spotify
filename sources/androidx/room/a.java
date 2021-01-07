package androidx.room;

import android.content.Context;
import androidx.room.RoomDatabase;
import defpackage.q7;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public class a {
    public final q7.c a;
    public final Context b;
    public final String c;
    public final RoomDatabase.c d;
    public final List<RoomDatabase.b> e;
    public final boolean f;
    public final RoomDatabase.JournalMode g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;

    public a(Context context, String str, q7.c cVar, RoomDatabase.c cVar2, List<RoomDatabase.b> list, boolean z, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.a = cVar;
        this.b = context;
        this.c = str;
        this.d = cVar2;
        this.e = list;
        this.f = z;
        this.g = journalMode;
        this.h = executor;
        this.i = executor2;
        this.j = z3;
        this.k = z4;
    }

    public boolean a(int i2, int i3) {
        if ((!(i2 > i3) || !this.k) && this.j) {
            return true;
        }
        return false;
    }
}
