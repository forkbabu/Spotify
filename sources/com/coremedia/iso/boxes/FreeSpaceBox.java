package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class FreeSpaceBox extends AbstractBox {
    public static final String TYPE = "skip";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    byte[] data;

    static {
        ajc$preClinit();
    }

    public FreeSpaceBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("FreeSpaceBox.java", FreeSpaceBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "setData", "com.coremedia.iso.boxes.FreeSpaceBox", "[B", "data", "", "void"), 42);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getData", "com.coremedia.iso.boxes.FreeSpaceBox", "", "", "", "[B"), 46);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.FreeSpaceBox", "", "", "", "java.lang.String"), 61);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.data = bArr;
        byteBuffer.get(bArr);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(this.data);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) this.data.length;
    }

    public byte[] getData() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.data;
    }

    public void setData(byte[] bArr) {
        d.a().b(bpf.c(ajc$tjp_0, this, this, bArr));
        this.data = bArr;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_2, this, this), "FreeSpaceBox[size=");
        c1.append(this.data.length);
        c1.append(";type=");
        c1.append(getType());
        c1.append("]");
        return c1.toString();
    }
}
