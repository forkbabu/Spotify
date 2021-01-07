package org.threeten.bp.zone;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class a extends c {
    private List<String> c;
    private final ConcurrentNavigableMap<String, C0667a> d = new ConcurrentSkipListMap();

    /* access modifiers changed from: package-private */
    /* renamed from: org.threeten.bp.zone.a$a  reason: collision with other inner class name */
    public static class C0667a {
        private final String a;
        private final String[] b;
        private final short[] c;
        private final AtomicReferenceArray<Object> d;

        C0667a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.d = atomicReferenceArray;
            this.a = str;
            this.b = strArr;
            this.c = sArr;
        }

        /* access modifiers changed from: package-private */
        public ZoneRules b(String str) {
            int binarySearch = Arrays.binarySearch(this.b, str);
            if (binarySearch < 0) {
                return null;
            }
            try {
                short s = this.c[binarySearch];
                Object obj = this.d.get(s);
                if (obj instanceof byte[]) {
                    obj = Ser.a(new DataInputStream(new ByteArrayInputStream((byte[]) obj)));
                    this.d.set(s, obj);
                }
                return (ZoneRules) obj;
            } catch (Exception e) {
                StringBuilder a1 = je.a1("Invalid binary time-zone data: TZDB:", str, ", version: ");
                a1.append(this.a);
                throw new ZoneRulesException(a1.toString(), e);
            }
        }

        public String toString() {
            return this.a;
        }
    }

    public a(InputStream inputStream) {
        new CopyOnWriteArraySet();
        try {
            f(inputStream);
        } catch (Exception e) {
            throw new ZoneRulesException("Unable to load TZDB time-zone rules", e);
        }
    }

    private boolean f(InputStream inputStream) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readByte() != 1) {
            throw new StreamCorruptedException("File format not recognised");
        } else if ("TZDB".equals(dataInputStream.readUTF())) {
            int readShort = dataInputStream.readShort();
            String[] strArr = new String[readShort];
            boolean z = false;
            for (int i = 0; i < readShort; i++) {
                strArr[i] = dataInputStream.readUTF();
            }
            int readShort2 = dataInputStream.readShort();
            String[] strArr2 = new String[readShort2];
            for (int i2 = 0; i2 < readShort2; i2++) {
                strArr2[i2] = dataInputStream.readUTF();
            }
            this.c = Arrays.asList(strArr2);
            int readShort3 = dataInputStream.readShort();
            Object[] objArr = new Object[readShort3];
            for (int i3 = 0; i3 < readShort3; i3++) {
                byte[] bArr = new byte[dataInputStream.readShort()];
                dataInputStream.readFully(bArr);
                objArr[i3] = bArr;
            }
            AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(objArr);
            HashSet hashSet = new HashSet(readShort);
            for (int i4 = 0; i4 < readShort; i4++) {
                int readShort4 = dataInputStream.readShort();
                String[] strArr3 = new String[readShort4];
                short[] sArr = new short[readShort4];
                for (int i5 = 0; i5 < readShort4; i5++) {
                    strArr3[i5] = strArr2[dataInputStream.readShort()];
                    sArr[i5] = dataInputStream.readShort();
                }
                hashSet.add(new C0667a(strArr[i4], strArr3, sArr, atomicReferenceArray));
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C0667a aVar = (C0667a) it.next();
                C0667a putIfAbsent = this.d.putIfAbsent(aVar.a, aVar);
                if (putIfAbsent == null || putIfAbsent.a.equals(aVar.a)) {
                    z = true;
                } else {
                    StringBuilder V0 = je.V0("Data already loaded for TZDB time-zone rules version: ");
                    V0.append(aVar.a);
                    throw new ZoneRulesException(V0.toString());
                }
            }
            return z;
        } else {
            throw new StreamCorruptedException("File format not recognised");
        }
    }

    /* access modifiers changed from: protected */
    @Override // org.threeten.bp.zone.c
    public ZoneRules c(String str, boolean z) {
        yif.J(str, "zoneId");
        ZoneRules b = this.d.lastEntry().getValue().b(str);
        if (b != null) {
            return b;
        }
        throw new ZoneRulesException(je.x0("Unknown time-zone ID: ", str));
    }

    /* access modifiers changed from: protected */
    @Override // org.threeten.bp.zone.c
    public Set<String> d() {
        return new HashSet(this.c);
    }

    public String toString() {
        return "TZDB";
    }
}
