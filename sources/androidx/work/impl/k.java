package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.j;
import java.io.File;
import java.util.HashMap;

public class k {
    private static final String a = j.f("WrkDbPathHelper");
    private static final String[] b = {"-journal", "-shm", "-wal"};
    public static final /* synthetic */ int c = 0;

    public static void a(Context context) {
        String str;
        File file;
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && databasePath.exists()) {
            j.c().a(a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            if (i >= 23) {
                File databasePath2 = context.getDatabasePath("androidx.work.workdb");
                if (i < 23) {
                    file = context.getDatabasePath("androidx.work.workdb");
                } else {
                    file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                }
                hashMap.put(databasePath2, file);
                String[] strArr = b;
                for (String str2 : strArr) {
                    hashMap.put(new File(databasePath2.getPath() + str2), new File(file.getPath() + str2));
                }
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        j.c().h(a, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        str = String.format("Migrated %s to %s", file2, file3);
                    } else {
                        str = String.format("Renaming %s to %s failed", file2, file3);
                    }
                    j.c().a(a, str, new Throwable[0]);
                }
            }
        }
    }
}
