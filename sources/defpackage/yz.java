package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
/* renamed from: yz  reason: default package */
public final /* synthetic */ class yz implements FilenameFilter {
    private final String a;

    private yz(String str) {
        this.a = str;
    }

    public static FilenameFilter a(String str) {
        return new yz(str);
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        String str2 = this.a;
        int i = e00.l;
        return str.startsWith(str2);
    }
}
