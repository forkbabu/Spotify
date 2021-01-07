package com.google.common.escape;

final class Platform {
    private static final ThreadLocal<char[]> DEST_TL = new ThreadLocal<char[]>() {
        /* class com.google.common.escape.Platform.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public char[] initialValue() {
            return new char[1024];
        }
    };

    static char[] charBufferFromThreadLocal() {
        return DEST_TL.get();
    }
}
