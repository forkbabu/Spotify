package com.getkeepsafe.relinker;

import java.io.File;
import java.io.FilenameFilter;

/* access modifiers changed from: package-private */
public class c implements FilenameFilter {
    final /* synthetic */ String a;

    c(d dVar, String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}
