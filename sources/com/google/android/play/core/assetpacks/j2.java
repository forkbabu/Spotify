package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j2 implements FilenameFilter {
    static final FilenameFilter a = new j2();

    private j2() {
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return k2.a.matcher(str).matches();
    }
}
