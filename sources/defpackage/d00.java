package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: d00  reason: default package */
final /* synthetic */ class d00 implements FilenameFilter {
    private static final d00 a = new d00();

    private d00() {
    }

    public static FilenameFilter a() {
        return a;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        int i = e00.l;
        return str.startsWith("event");
    }
}
