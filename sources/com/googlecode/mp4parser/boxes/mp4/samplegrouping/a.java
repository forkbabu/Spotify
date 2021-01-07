package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import java.nio.ByteBuffer;
import java.util.UUID;

public class a extends b {
    private boolean a;
    private byte b;
    private UUID c;

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public ByteBuffer a() {
        ByteBuffer allocate = ByteBuffer.allocate(20);
        pe.f(allocate, this.a ? 1 : 0);
        if (this.a) {
            allocate.put((byte) (this.b & 255));
            allocate.put(rw.j(this.c));
        } else {
            allocate.put(new byte[17]);
        }
        allocate.rewind();
        return allocate;
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public String b() {
        return "seig";
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.samplegrouping.b
    public void c(ByteBuffer byteBuffer) {
        boolean z = true;
        if (h7.m(byteBuffer) != 1) {
            z = false;
        }
        this.a = z;
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.b = (byte) i;
        byte[] bArr = new byte[16];
        byteBuffer.get(bArr);
        this.c = rw.i(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a != aVar.a || this.b != aVar.b) {
            return false;
        }
        UUID uuid = this.c;
        UUID uuid2 = aVar.c;
        return uuid == null ? uuid2 == null : uuid.equals(uuid2);
    }

    public int hashCode() {
        int i = (((this.a ? 7 : 19) * 31) + this.b) * 31;
        UUID uuid = this.c;
        return i + (uuid != null ? uuid.hashCode() : 0);
    }

    public String toString() {
        return "CencSampleEncryptionInformationGroupEntry{isEncrypted=" + this.a + ", ivSize=" + ((int) this.b) + ", kid=" + this.c + '}';
    }
}
