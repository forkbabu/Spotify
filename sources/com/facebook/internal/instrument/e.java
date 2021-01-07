package com.facebook.internal.instrument;

import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
public final class e implements FilenameFilter {
    e() {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.matches(String.format("^%s[0-9]+.json$", "analysis_log_"));
    }
}
