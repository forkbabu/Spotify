package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;

public class g extends b {
    private boolean a;
    private short b;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(1);
        allocate.put((byte) ((this.a ? 128 : 0) | (this.b & 127)));
        allocate.rewind();
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return "rap ";
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void c(ByteBuffer byteBuffer) {
        byte b2 = byteBuffer.get();
        this.a = (b2 & 128) == 128;
        this.b = (short) (b2 & Byte.MAX_VALUE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.b == gVar.b && this.a == gVar.a;
    }

    public int hashCode() {
        return ((this.a ? 1 : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder Z0 = je.Z0("VisualRandomAccessEntry", "{numLeadingSamplesKnown=");
        Z0.append(this.a);
        Z0.append(", numLeadingSamples=");
        return je.A0(Z0, this.b, '}');
    }
}
