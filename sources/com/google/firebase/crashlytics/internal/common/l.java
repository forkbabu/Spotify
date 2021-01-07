package com.google.firebase.crashlytics.internal.common;

import java.io.File;
import java.io.FilenameFilter;

final /* synthetic */ class l implements FilenameFilter {
    private static final l a = new l();

    private l() {
    }

    public static FilenameFilter a() {
        return a;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        FilenameFilter filenameFilter = m.z;
        return str.startsWith(".ae");
    }
}
