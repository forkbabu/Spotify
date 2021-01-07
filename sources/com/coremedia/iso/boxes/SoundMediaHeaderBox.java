package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class SoundMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "smhd";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private float balance;

    static {
        ajc$preClinit();
    }

    public SoundMediaHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("SoundMediaHeaderBox.java", SoundMediaHeaderBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getBalance", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "float"), 36);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.SoundMediaHeaderBox", "", "", "", "java.lang.String"), 58);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.balance = h7.h(byteBuffer);
        h7.l(byteBuffer);
    }

    public float getBalance() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.balance;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        pe.c(byteBuffer, (double) this.balance);
        pe.e(byteBuffer, 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 8;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_1, this, this), "SoundMediaHeaderBox[balance=");
        c1.append(getBalance());
        c1.append("]");
        return c1.toString();
    }
}
