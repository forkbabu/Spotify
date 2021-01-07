package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
/* renamed from: a00  reason: default package */
public final /* synthetic */ class a00 implements FilenameFilter {
    private static final a00 a = new a00();

    private a00() {
    }

    public static FilenameFilter a() {
        return a;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        int i = e00.l;
        return str.startsWith("event") && !str.endsWith("_");
    }
}
