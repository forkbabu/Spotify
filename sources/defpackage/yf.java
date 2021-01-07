package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
/* renamed from: yf  reason: default package */
public final class yf implements FilenameFilter {
    yf() {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.matches(String.format("^%s[0-9]+.json$", "error_log_"));
    }
}
