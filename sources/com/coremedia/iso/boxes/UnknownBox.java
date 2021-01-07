package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class UnknownBox extends AbstractBox {
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    ByteBuffer data;

    static {
        ajc$preClinit();
    }

    public UnknownBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("UnknownBox.java", UnknownBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getData", "com.coremedia.iso.boxes.UnknownBox", "", "", "", "java.nio.ByteBuffer"), 52);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setData", "com.coremedia.iso.boxes.UnknownBox", "java.nio.ByteBuffer", "data", "", "void"), 56);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.UnknownBox", "", "", "", "java.lang.String"), 61);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.data = byteBuffer;
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        this.data.rewind();
        byteBuffer.put(this.data);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) this.data.limit();
    }

    public ByteBuffer getData() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.data;
    }

    public void setData(ByteBuffer byteBuffer) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, byteBuffer));
        this.data = byteBuffer;
    }

    public String toString() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return getClass().getName() + "[" + getType() + "]@" + Integer.toHexString(hashCode());
    }
}
