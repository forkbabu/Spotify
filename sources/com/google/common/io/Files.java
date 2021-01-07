package com.google.common.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public final class Files {

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.common.io.Files$1  reason: invalid class name */
    public final class AnonymousClass1 {
    }

    /* access modifiers changed from: private */
    public static final class FileByteSource extends ByteSource {
        private final File file;

        FileByteSource(File file2, AnonymousClass1 r2) {
            file2.getClass();
            this.file = file2;
        }

        @Override // com.google.common.io.ByteSource
        public InputStream openStream() {
            return new FileInputStream(this.file);
        }

        public String toString() {
            StringBuilder V0 = je.V0("Files.asByteSource(");
            V0.append(this.file);
            V0.append(")");
            return V0.toString();
        }
    }

    public static ByteSource asByteSource(File file) {
        return new FileByteSource(file, null);
    }
}
