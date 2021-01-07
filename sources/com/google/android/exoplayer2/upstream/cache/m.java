package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g;
import com.google.android.exoplayer2.util.h;
import com.google.android.exoplayer2.util.y;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* access modifiers changed from: package-private */
public class m {
    private final HashMap<String, l> a;
    private final SparseArray<String> b;
    private final SparseBooleanArray c;
    private final SparseBooleanArray d;
    private c e;
    private c f;

    private static final class a implements c {
        private static final String[] e = {"id", "key", "metadata"};
        private final com.google.android.exoplayer2.database.a a;
        private final SparseArray<l> b = new SparseArray<>();
        private String c;
        private String d;

        public a(com.google.android.exoplayer2.database.a aVar) {
            this.a = aVar;
        }

        private void i(SQLiteDatabase sQLiteDatabase, l lVar) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            m.b(lVar.d(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(lVar.a));
            contentValues.put("key", lVar.b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow(this.d, null, contentValues);
        }

        private void j(SQLiteDatabase sQLiteDatabase) {
            com.google.android.exoplayer2.database.c.c(sQLiteDatabase, 1, this.c, 1);
            String str = this.d;
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
            sQLiteDatabase.execSQL("CREATE TABLE " + this.d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        public boolean a() {
            if (com.google.android.exoplayer2.database.c.a(this.a.getReadableDatabase(), 1, this.c) != -1) {
                return true;
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        public void b(l lVar, boolean z) {
            if (z) {
                this.b.delete(lVar.a);
            } else {
                this.b.put(lVar.a, null);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        public void c(HashMap<String, l> hashMap) {
            if (this.b.size() != 0) {
                try {
                    SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    for (int i = 0; i < this.b.size(); i++) {
                        try {
                            l valueAt = this.b.valueAt(i);
                            if (valueAt == null) {
                                writableDatabase.delete(this.d, "id = ?", new String[]{Integer.toString(this.b.keyAt(i))});
                            } else {
                                i(writableDatabase, valueAt);
                            }
                        } catch (Throwable th) {
                            writableDatabase.endTransaction();
                            throw th;
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.b.clear();
                    writableDatabase.endTransaction();
                } catch (SQLException e2) {
                    throw new DatabaseIOException(e2);
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        public void d(long j) {
            String hexString = Long.toHexString(j);
            this.c = hexString;
            this.d = je.x0("ExoPlayerCacheIndex", hexString);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        public void e(HashMap<String, l> hashMap) {
            try {
                SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    j(writableDatabase);
                    for (l lVar : hashMap.values()) {
                        i(writableDatabase, lVar);
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        public void f(l lVar) {
            this.b.put(lVar.a, lVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
            if (r0 != null) goto L_0x0083;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
            throw r1;
         */
        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.l> r12, android.util.SparseArray<java.lang.String> r13) {
            /*
                r11 = this;
                android.util.SparseArray<com.google.android.exoplayer2.upstream.cache.l> r0 = r11.b
                int r0 = r0.size()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x000c
                r0 = 1
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                com.google.android.exoplayer2.util.g.m(r0)
                com.google.android.exoplayer2.database.a r0 = r11.a     // Catch:{ SQLiteException -> 0x0087 }
                android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0087 }
                java.lang.String r3 = r11.c     // Catch:{ SQLiteException -> 0x0087 }
                int r0 = com.google.android.exoplayer2.database.c.a(r0, r2, r3)     // Catch:{ SQLiteException -> 0x0087 }
                if (r0 == r2) goto L_0x0036
                com.google.android.exoplayer2.database.a r0 = r11.a     // Catch:{ SQLiteException -> 0x0087 }
                android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0087 }
                r0.beginTransactionNonExclusive()     // Catch:{ SQLiteException -> 0x0087 }
                r11.j(r0)     // Catch:{ all -> 0x0031 }
                r0.setTransactionSuccessful()     // Catch:{ all -> 0x0031 }
                r0.endTransaction()
                goto L_0x0036
            L_0x0031:
                r1 = move-exception
                r0.endTransaction()
                throw r1
            L_0x0036:
                com.google.android.exoplayer2.database.a r0 = r11.a
                android.database.sqlite.SQLiteDatabase r3 = r0.getReadableDatabase()
                java.lang.String r4 = r11.d
                java.lang.String[] r5 = com.google.android.exoplayer2.upstream.cache.m.a.e
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                android.database.Cursor r0 = r3.query(r4, r5, r6, r7, r8, r9, r10)
            L_0x0049:
                boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x007e }
                if (r3 == 0) goto L_0x007a
                int r3 = r0.getInt(r1)     // Catch:{ all -> 0x007e }
                java.lang.String r4 = r0.getString(r2)     // Catch:{ all -> 0x007e }
                r5 = 2
                byte[] r5 = r0.getBlob(r5)     // Catch:{ all -> 0x007e }
                java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x007e }
                r6.<init>(r5)     // Catch:{ all -> 0x007e }
                java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ all -> 0x007e }
                r5.<init>(r6)     // Catch:{ all -> 0x007e }
                com.google.android.exoplayer2.upstream.cache.q r5 = com.google.android.exoplayer2.upstream.cache.m.a(r5)     // Catch:{ all -> 0x007e }
                com.google.android.exoplayer2.upstream.cache.l r6 = new com.google.android.exoplayer2.upstream.cache.l     // Catch:{ all -> 0x007e }
                r6.<init>(r3, r4, r5)     // Catch:{ all -> 0x007e }
                r12.put(r4, r6)     // Catch:{ all -> 0x007e }
                int r3 = r6.a     // Catch:{ all -> 0x007e }
                java.lang.String r4 = r6.b     // Catch:{ all -> 0x007e }
                r13.put(r3, r4)     // Catch:{ all -> 0x007e }
                goto L_0x0049
            L_0x007a:
                r0.close()
                return
            L_0x007e:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0080 }
            L_0x0080:
                r1 = move-exception
                if (r0 == 0) goto L_0x0086
                r0.close()     // Catch:{ all -> 0x0086 }
            L_0x0086:
                throw r1
            L_0x0087:
                r0 = move-exception
                r12.clear()
                r13.clear()
                com.google.android.exoplayer2.database.DatabaseIOException r12 = new com.google.android.exoplayer2.database.DatabaseIOException
                r12.<init>(r0)
                goto L_0x0095
            L_0x0094:
                throw r12
            L_0x0095:
                goto L_0x0094
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.m.a.g(java.util.HashMap, android.util.SparseArray):void");
        }

        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        public void h() {
            com.google.android.exoplayer2.database.a aVar = this.a;
            String str = this.c;
            try {
                String str2 = "ExoPlayerCacheIndex" + str;
                SQLiteDatabase writableDatabase = aVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    com.google.android.exoplayer2.database.c.b(writableDatabase, 1, str);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }
    }

    private static class b implements c {
        private final boolean a;
        private final Cipher b;
        private final SecretKeySpec c;
        private final Random d;
        private final h e;
        private boolean f;
        private y g;

        public b(File file, byte[] bArr, boolean z) {
            SecretKeySpec secretKeySpec;
            Cipher cipher;
            Random random = null;
            if (bArr != null) {
                g.a(bArr.length == 16);
                try {
                    if (f0.a == 18) {
                        try {
                            cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
                        } catch (Throwable unused) {
                        }
                        secretKeySpec = new SecretKeySpec(bArr, "AES");
                    }
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
                    throw new IllegalStateException(e2);
                }
            } else {
                g.a(!z);
                cipher = null;
                secretKeySpec = null;
            }
            this.a = z;
            this.b = cipher;
            this.c = secretKeySpec;
            this.d = z ? new Random() : random;
            this.e = new h(file);
        }

        private int i(l lVar, int i) {
            int hashCode = lVar.b.hashCode() + (lVar.a * 31);
            if (i >= 2) {
                return (hashCode * 31) + lVar.d().hashCode();
            }
            long a2 = n.a(lVar.d());
            return (hashCode * 31) + ((int) (a2 ^ (a2 >>> 32)));
        }

        private l j(int i, DataInputStream dataInputStream) {
            q qVar;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i < 2) {
                long readLong = dataInputStream.readLong();
                p pVar = new p();
                p.c(pVar, readLong);
                qVar = q.c.a(pVar);
            } else {
                qVar = m.a(dataInputStream);
            }
            return new l(readInt, readUTF, qVar);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        public boolean a() {
            return this.e.c();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        public void b(l lVar, boolean z) {
            this.f = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        public void c(HashMap<String, l> hashMap) {
            if (this.f) {
                e(hashMap);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        public void d(long j) {
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ad A[SYNTHETIC, Splitter:B:33:0x00ad] */
        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void e(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.l> r8) {
            /*
                r7 = this;
                r0 = 0
                com.google.android.exoplayer2.util.h r1 = r7.e     // Catch:{ all -> 0x00a8 }
                java.io.OutputStream r1 = r1.e()     // Catch:{ all -> 0x00a8 }
                com.google.android.exoplayer2.util.y r2 = r7.g     // Catch:{ all -> 0x00a8 }
                if (r2 != 0) goto L_0x0013
                com.google.android.exoplayer2.util.y r2 = new com.google.android.exoplayer2.util.y     // Catch:{ all -> 0x00a8 }
                r2.<init>(r1)     // Catch:{ all -> 0x00a8 }
                r7.g = r2     // Catch:{ all -> 0x00a8 }
                goto L_0x0016
            L_0x0013:
                r2.a(r1)     // Catch:{ all -> 0x00a8 }
            L_0x0016:
                java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ all -> 0x00a8 }
                com.google.android.exoplayer2.util.y r2 = r7.g     // Catch:{ all -> 0x00a8 }
                r1.<init>(r2)     // Catch:{ all -> 0x00a8 }
                r0 = 2
                r1.writeInt(r0)     // Catch:{ all -> 0x00a5 }
                boolean r2 = r7.a     // Catch:{ all -> 0x00a5 }
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0029
                r2 = 1
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                r1.writeInt(r2)     // Catch:{ all -> 0x00a5 }
                boolean r2 = r7.a     // Catch:{ all -> 0x00a5 }
                if (r2 == 0) goto L_0x0065
                r2 = 16
                byte[] r2 = new byte[r2]     // Catch:{ all -> 0x00a5 }
                java.util.Random r5 = r7.d     // Catch:{ all -> 0x00a5 }
                r5.nextBytes(r2)     // Catch:{ all -> 0x00a5 }
                r1.write(r2)     // Catch:{ all -> 0x00a5 }
                javax.crypto.spec.IvParameterSpec r5 = new javax.crypto.spec.IvParameterSpec     // Catch:{ all -> 0x00a5 }
                r5.<init>(r2)     // Catch:{ all -> 0x00a5 }
                javax.crypto.Cipher r2 = r7.b     // Catch:{ InvalidKeyException -> 0x005e, InvalidAlgorithmParameterException -> 0x005c }
                javax.crypto.spec.SecretKeySpec r6 = r7.c     // Catch:{ InvalidKeyException -> 0x005e, InvalidAlgorithmParameterException -> 0x005c }
                r2.init(r3, r6, r5)     // Catch:{ InvalidKeyException -> 0x005e, InvalidAlgorithmParameterException -> 0x005c }
                r1.flush()
                java.io.DataOutputStream r2 = new java.io.DataOutputStream
                javax.crypto.CipherOutputStream r3 = new javax.crypto.CipherOutputStream
                com.google.android.exoplayer2.util.y r5 = r7.g
                javax.crypto.Cipher r6 = r7.b
                r3.<init>(r5, r6)
                r2.<init>(r3)
                r1 = r2
                goto L_0x0065
            L_0x005c:
                r8 = move-exception
                goto L_0x005f
            L_0x005e:
                r8 = move-exception
            L_0x005f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>(r8)
                throw r0
            L_0x0065:
                int r2 = r8.size()
                r1.writeInt(r2)
                java.util.Collection r8 = r8.values()
                java.util.Iterator r8 = r8.iterator()
                r2 = 0
            L_0x0075:
                boolean r3 = r8.hasNext()
                if (r3 == 0) goto L_0x0098
                java.lang.Object r3 = r8.next()
                com.google.android.exoplayer2.upstream.cache.l r3 = (com.google.android.exoplayer2.upstream.cache.l) r3
                int r5 = r3.a
                r1.writeInt(r5)
                java.lang.String r5 = r3.b
                r1.writeUTF(r5)
                com.google.android.exoplayer2.upstream.cache.q r5 = r3.d()
                com.google.android.exoplayer2.upstream.cache.m.b(r5, r1)
                int r3 = r7.i(r3, r0)
                int r2 = r2 + r3
                goto L_0x0075
            L_0x0098:
                r1.writeInt(r2)
                com.google.android.exoplayer2.util.h r8 = r7.e
                r8.b(r1)
                int r8 = com.google.android.exoplayer2.util.f0.a
                r7.f = r4
                return
            L_0x00a5:
                r8 = move-exception
                r0 = r1
                goto L_0x00a9
            L_0x00a8:
                r8 = move-exception
            L_0x00a9:
                int r1 = com.google.android.exoplayer2.util.f0.a
                if (r0 == 0) goto L_0x00b0
                r0.close()     // Catch:{ IOException -> 0x00b0 }
            L_0x00b0:
                goto L_0x00b2
            L_0x00b1:
                throw r8
            L_0x00b2:
                goto L_0x00b1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.m.b.e(java.util.HashMap):void");
        }

        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        public void f(l lVar) {
            this.f = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:48:0x00b7  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00c0  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00c8  */
        /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(java.util.HashMap<java.lang.String, com.google.android.exoplayer2.upstream.cache.l> r11, android.util.SparseArray<java.lang.String> r12) {
            /*
            // Method dump skipped, instructions count: 212
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.cache.m.b.g(java.util.HashMap, android.util.SparseArray):void");
        }

        @Override // com.google.android.exoplayer2.upstream.cache.m.c
        public void h() {
            this.e.a();
        }
    }

    /* access modifiers changed from: private */
    public interface c {
        boolean a();

        void b(l lVar, boolean z);

        void c(HashMap<String, l> hashMap);

        void d(long j);

        void e(HashMap<String, l> hashMap);

        void f(l lVar);

        void g(HashMap<String, l> hashMap, SparseArray<String> sparseArray);

        void h();
    }

    public m(com.google.android.exoplayer2.database.a aVar, File file, byte[] bArr, boolean z, boolean z2) {
        g.m((aVar == null && file == null) ? false : true);
        this.a = new HashMap<>();
        this.b = new SparseArray<>();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        b bVar = null;
        a aVar2 = aVar != null ? new a(aVar) : null;
        bVar = file != null ? new b(new File(file, "cached_content_index.exi"), bArr, z) : bVar;
        if (aVar2 == null || (bVar != null && z2)) {
            this.e = bVar;
            this.f = aVar2;
            return;
        }
        this.e = aVar2;
        this.f = bVar;
    }

    static q a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = f0.f;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, 10485760);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException(je.p0("Invalid value size: ", readInt2));
            }
        }
        return new q(hashMap);
    }

    static void b(q qVar, DataOutputStream dataOutputStream) {
        Set<Map.Entry<String, byte[]>> b2 = qVar.b();
        dataOutputStream.writeInt(b2.size());
        for (Map.Entry<String, byte[]> entry : b2) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public void c(String str, p pVar) {
        l h = h(str);
        if (h.b(pVar)) {
            this.e.f(h);
        }
    }

    public l d(String str) {
        return this.a.get(str);
    }

    public Collection<l> e() {
        return this.a.values();
    }

    public o f(String str) {
        l lVar = this.a.get(str);
        return lVar != null ? lVar.d() : q.c;
    }

    public String g(int i) {
        return this.b.get(i);
    }

    public l h(String str) {
        int i;
        l lVar = this.a.get(str);
        if (lVar != null) {
            return lVar;
        }
        SparseArray<String> sparseArray = this.b;
        int size = sparseArray.size();
        int i2 = 0;
        if (size == 0) {
            i = 0;
        } else {
            i = sparseArray.keyAt(size - 1) + 1;
        }
        if (i < 0) {
            while (i2 < size && i2 == sparseArray.keyAt(i2)) {
                i2++;
            }
            i = i2;
        }
        l lVar2 = new l(i, str, q.c);
        this.a.put(str, lVar2);
        this.b.put(i, str);
        this.d.put(i, true);
        this.e.f(lVar2);
        return lVar2;
    }

    public void i(long j) {
        c cVar;
        this.e.d(j);
        c cVar2 = this.f;
        if (cVar2 != null) {
            cVar2.d(j);
        }
        if (this.e.a() || (cVar = this.f) == null || !cVar.a()) {
            this.e.g(this.a, this.b);
        } else {
            this.f.g(this.a, this.b);
            this.e.e(this.a);
        }
        c cVar3 = this.f;
        if (cVar3 != null) {
            cVar3.h();
            this.f = null;
        }
    }

    public void j(String str) {
        l lVar = this.a.get(str);
        if (lVar != null && lVar.g() && !lVar.h()) {
            this.a.remove(str);
            int i = lVar.a;
            boolean z = this.d.get(i);
            this.e.b(lVar, z);
            if (z) {
                this.b.remove(i);
                this.d.delete(i);
                return;
            }
            this.b.put(i, null);
            this.c.put(i, true);
        }
    }

    public void k() {
        int size = this.a.size();
        String[] strArr = new String[size];
        this.a.keySet().toArray(strArr);
        for (int i = 0; i < size; i++) {
            j(strArr[i]);
        }
    }

    public void l() {
        this.e.c(this.a);
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            this.b.remove(this.c.keyAt(i));
        }
        this.c.clear();
        this.d.clear();
    }
}
