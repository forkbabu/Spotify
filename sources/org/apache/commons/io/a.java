package org.apache.commons.io;

import java.io.File;
import java.io.FileFilter;

/* access modifiers changed from: package-private */
public final class a implements FileFilter {
    final /* synthetic */ File a;

    a(File file) {
        this.a = file;
    }

    @Override // java.io.FileFilter
    public boolean accept(File file) {
        return file.equals(this.a);
    }
}
