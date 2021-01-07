package com.fasterxml.jackson.core;

import java.io.Serializable;

public class JsonLocation implements Serializable {
    public static final JsonLocation NA = new JsonLocation(null, -1, -1, -1, -1);
    private static final long serialVersionUID = 1;
    protected final int _columnNr;
    protected final int _lineNr;
    final transient Object _sourceRef;
    protected final long _totalBytes;
    protected final long _totalChars;

    public JsonLocation(Object obj, long j, int i, int i2) {
        this._sourceRef = obj;
        this._totalBytes = -1;
        this._totalChars = j;
        this._lineNr = i;
        this._columnNr = i2;
    }

    private int _append(StringBuilder sb, String str) {
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return str.length();
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        JsonLocation jsonLocation = (JsonLocation) obj;
        Object obj2 = this._sourceRef;
        if (obj2 == null) {
            if (jsonLocation._sourceRef != null) {
                return false;
            }
        } else if (!obj2.equals(jsonLocation._sourceRef)) {
            return false;
        }
        if (this._lineNr == jsonLocation._lineNr && this._columnNr == jsonLocation._columnNr && this._totalChars == jsonLocation._totalChars && this._totalBytes == jsonLocation._totalBytes) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        Object obj = this._sourceRef;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            r0 = 80
            java.lang.String r1 = "[Source: "
            java.lang.StringBuilder r0 = defpackage.je.T0(r0, r1)
            java.lang.Object r1 = r9._sourceRef
            r2 = 93
            if (r1 != 0) goto L_0x0015
            java.lang.String r1 = "UNKNOWN"
            r0.append(r1)
            goto L_0x00c5
        L_0x0015:
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L_0x001d
            r3 = r1
            java.lang.Class r3 = (java.lang.Class) r3
            goto L_0x0021
        L_0x001d:
            java.lang.Class r3 = r1.getClass()
        L_0x0021:
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "java."
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L_0x0032
            java.lang.String r4 = r3.getSimpleName()
            goto L_0x003f
        L_0x0032:
            boolean r3 = r1 instanceof byte[]
            if (r3 == 0) goto L_0x0039
            java.lang.String r4 = "byte[]"
            goto L_0x003f
        L_0x0039:
            boolean r3 = r1 instanceof char[]
            if (r3 == 0) goto L_0x003f
            java.lang.String r4 = "char[]"
        L_0x003f:
            r3 = 40
            r0.append(r3)
            r0.append(r4)
            r3 = 41
            r0.append(r3)
            boolean r3 = r1 instanceof java.lang.CharSequence
            r4 = 500(0x1f4, float:7.0E-43)
            r5 = 0
            java.lang.String r6 = " chars"
            if (r3 == 0) goto L_0x006c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r3 = r1.length()
            int r4 = java.lang.Math.min(r3, r4)
            java.lang.CharSequence r1 = r1.subSequence(r5, r4)
            java.lang.String r1 = r1.toString()
            int r1 = r9._append(r0, r1)
            goto L_0x008b
        L_0x006c:
            boolean r3 = r1 instanceof char[]
            r7 = 34
            if (r3 == 0) goto L_0x008e
            char[] r1 = (char[]) r1
            int r3 = r1.length
            java.lang.String r8 = new java.lang.String
            int r4 = java.lang.Math.min(r3, r4)
            r8.<init>(r1, r5, r4)
            r0.append(r7)
            r0.append(r8)
            r0.append(r7)
            int r1 = r8.length()
        L_0x008b:
            int r5 = r3 - r1
            goto L_0x00b5
        L_0x008e:
            boolean r3 = r1 instanceof byte[]
            if (r3 == 0) goto L_0x00b5
            byte[] r1 = (byte[]) r1
            int r3 = r1.length
            int r3 = java.lang.Math.min(r3, r4)
            java.lang.String r4 = new java.lang.String
            java.lang.String r6 = "UTF-8"
            java.nio.charset.Charset r6 = java.nio.charset.Charset.forName(r6)
            r4.<init>(r1, r5, r3, r6)
            r0.append(r7)
            r0.append(r4)
            r0.append(r7)
            r4.length()
            int r1 = r1.length
            int r5 = r1 - r3
            java.lang.String r6 = " bytes"
        L_0x00b5:
            if (r5 <= 0) goto L_0x00c5
            java.lang.String r1 = "[truncated "
            r0.append(r1)
            r0.append(r5)
            r0.append(r6)
            r0.append(r2)
        L_0x00c5:
            java.lang.String r1 = "; line: "
            r0.append(r1)
            int r1 = r9._lineNr
            r0.append(r1)
            java.lang.String r1 = ", column: "
            r0.append(r1)
            int r1 = r9._columnNr
            java.lang.String r0 = defpackage.je.A0(r0, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonLocation.toString():java.lang.String");
    }

    public JsonLocation(Object obj, long j, long j2, int i, int i2) {
        this._sourceRef = obj;
        this._totalBytes = j;
        this._totalChars = j2;
        this._lineNr = i;
        this._columnNr = i2;
    }
}
