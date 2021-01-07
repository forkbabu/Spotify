package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

final class FullSegmentEncryptionKeyCache {
    private final LinkedHashMap<Uri, byte[]> a;

    public FullSegmentEncryptionKeyCache(final int i) {
        this.a = new LinkedHashMap<Uri, byte[]>(i + 1, 1.0f, false) {
            /* class com.google.android.exoplayer2.source.hls.FullSegmentEncryptionKeyCache.AnonymousClass1 */

            /* access modifiers changed from: protected */
            @Override // java.util.LinkedHashMap
            public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
                return size() > i;
            }
        };
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        LinkedHashMap<Uri, byte[]> linkedHashMap = this.a;
        uri.getClass();
        return linkedHashMap.put(uri, bArr);
    }

    public byte[] c(Uri uri) {
        return this.a.remove(uri);
    }
}
