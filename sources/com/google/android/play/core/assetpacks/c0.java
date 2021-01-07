package com.google.android.play.core.assetpacks;

import com.google.android.play.core.internal.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

final class c0 extends o {
    private final File a;
    private final File b;
    private final NavigableMap<Long, File> c = new TreeMap();

    c0(File file, File file2) {
        this.a = file;
        this.b = file2;
        ArrayList arrayList = (ArrayList) k2.a(file, file2);
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            long j = 0;
            while (it.hasNext()) {
                File file3 = (File) it.next();
                this.c.put(Long.valueOf(j), file3);
                j += file3.length();
            }
            return;
        }
        throw new bv(String.format("Virtualized slice archive empty for %s, %s", file, file2));
    }

    private final InputStream d(long j, Long l) {
        FileInputStream fileInputStream = new FileInputStream((File) this.c.get(l));
        if (fileInputStream.skip(j - l.longValue()) == j - l.longValue()) {
            return fileInputStream;
        }
        throw new bv(String.format("Virtualized slice archive corrupt, could not skip in file with key %s", l));
    }

    @Override // com.google.android.play.core.internal.o
    public final long a() {
        Map.Entry<Long, File> lastEntry = this.c.lastEntry();
        return lastEntry.getValue().length() + lastEntry.getKey().longValue();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.play.core.internal.o
    public final InputStream b(long j, long j2) {
        if (j < 0 || j2 < 0) {
            throw new bv(String.format("Invalid input parameters %s, %s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j + j2;
        if (j3 <= a()) {
            Long floorKey = this.c.floorKey(Long.valueOf(j));
            Long floorKey2 = this.c.floorKey(Long.valueOf(j3));
            if (floorKey.equals(floorKey2)) {
                return new b0(d(j, floorKey), j2);
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(d(j, floorKey));
            Collection<File> values = this.c.subMap(floorKey, false, floorKey2, false).values();
            if (!values.isEmpty()) {
                arrayList.add(new t1(Collections.enumeration(values)));
            }
            arrayList.add(new b0(new FileInputStream((File) this.c.get(floorKey2)), j2 - (floorKey2.longValue() - j)));
            return new SequenceInputStream(Collections.enumeration(arrayList));
        }
        throw new bv(String.format("Trying to access archive out of bounds. Archive ends at: %s. Tried accessing: %s", Long.valueOf(a()), Long.valueOf(j3)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
