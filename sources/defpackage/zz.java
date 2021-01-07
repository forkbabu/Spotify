package defpackage;

import java.io.File;
import java.io.FileFilter;

/* access modifiers changed from: package-private */
/* renamed from: zz  reason: default package */
public final /* synthetic */ class zz implements FileFilter {
    private final String a;

    private zz(String str) {
        this.a = str;
    }

    public static FileFilter a(String str) {
        return new zz(str);
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        String str = this.a;
        int i = e00.l;
        return file.isDirectory() && !file.getName().equals(str);
    }
}
