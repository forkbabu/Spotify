package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* renamed from: a40  reason: default package */
class a40 implements w30 {
    private final /* synthetic */ long a;
    private final /* synthetic */ ByteBuffer b;
    private final /* synthetic */ int c;

    a40(b40 b40, long j, ByteBuffer byteBuffer, int i) {
        this.a = j;
        this.b = byteBuffer;
        this.c = i;
    }

    @Override // defpackage.w30
    public void a(WritableByteChannel writableByteChannel) {
        writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.b.position(this.c)).slice().limit(rw.n(this.a)));
    }

    @Override // defpackage.w30
    public long getSize() {
        return this.a;
    }
}
