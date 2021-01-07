package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;

public class c extends b {
    private short a;
    private short b;
    private List<a> c = new LinkedList();
    private int d;
    private int e;
    private short f;

    public static class a {
        int a;
        short b;

        public a(int i, short s) {
            this.a = i;
            this.b = s;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public int hashCode() {
            return (this.a * 31) + this.b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{availableBitrate=");
            sb.append(this.a);
            sb.append(", targetRateShare=");
            return je.A0(sb, this.b, '}');
        }
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        short s = this.a;
        ByteBuffer allocate = ByteBuffer.allocate(s == 1 ? 13 : (s * 6) + 11);
        allocate.putShort(this.a);
        if (this.a == 1) {
            allocate.putShort(this.b);
        } else {
            for (a aVar : this.c) {
                allocate.putInt(aVar.a);
                allocate.putShort(aVar.b);
            }
        }
        allocate.putInt(this.d);
        allocate.putInt(this.e);
        allocate.put((byte) (this.f & 255));
        allocate.rewind();
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return "rash";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(java.nio.ByteBuffer r6) {
        /*
            r5 = this;
            short r0 = r6.getShort()
            r5.a = r0
            r1 = 1
            if (r0 != r1) goto L_0x0010
            short r0 = r6.getShort()
            r5.b = r0
            goto L_0x0014
        L_0x0010:
            int r1 = r0 + -1
            if (r0 > 0) goto L_0x0034
        L_0x0014:
            long r0 = defpackage.h7.n(r6)
            int r0 = defpackage.rw.n(r0)
            r5.d = r0
            long r0 = defpackage.h7.n(r6)
            int r0 = defpackage.rw.n(r0)
            r5.e = r0
            byte r6 = r6.get()
            if (r6 >= 0) goto L_0x0030
            int r6 = r6 + 256
        L_0x0030:
            short r6 = (short) r6
            r5.f = r6
            return
        L_0x0034:
            java.util.List<com.googlecode.mp4parser.boxes.mp4.samplegrouping.c$a> r0 = r5.c
            com.googlecode.mp4parser.boxes.mp4.samplegrouping.c$a r2 = new com.googlecode.mp4parser.boxes.mp4.samplegrouping.c$a
            long r3 = defpackage.h7.n(r6)
            int r3 = defpackage.rw.n(r3)
            short r4 = r6.getShort()
            r2.<init>(r3, r4)
            r0.add(r2)
            r0 = r1
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.boxes.mp4.samplegrouping.c.c(java.nio.ByteBuffer):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f != cVar.f || this.d != cVar.d || this.e != cVar.e || this.a != cVar.a || this.b != cVar.b) {
            return false;
        }
        List<a> list = this.c;
        List<a> list2 = cVar.c;
        return list == null ? list2 == null : list.equals(list2);
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        List<a> list = this.c;
        return ((((((i + (list != null ? list.hashCode() : 0)) * 31) + this.d) * 31) + this.e) * 31) + this.f;
    }
}
