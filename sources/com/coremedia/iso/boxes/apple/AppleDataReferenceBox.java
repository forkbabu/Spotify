package com.coremedia.iso.boxes.apple;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class AppleDataReferenceBox extends AbstractFullBox {
    public static final String TYPE = "rdrf";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private String dataReference;
    private int dataReferenceSize;
    private String dataReferenceType;

    static {
        ajc$preClinit();
    }

    public AppleDataReferenceBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("AppleDataReferenceBox.java", AppleDataReferenceBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getDataReferenceSize", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", Constants.LONG), 63);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getDataReferenceType", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getDataReference", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 71);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.dataReferenceType = h7.e(byteBuffer);
        int n = rw.n(h7.n(byteBuffer));
        this.dataReferenceSize = n;
        this.dataReference = h7.k(byteBuffer, n);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(ne.b(this.dataReferenceType));
        byteBuffer.putInt((int) ((long) this.dataReferenceSize));
        byteBuffer.put(h7.b(this.dataReference));
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) (this.dataReferenceSize + 12);
    }

    public String getDataReference() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.dataReference;
    }

    public long getDataReferenceSize() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return (long) this.dataReferenceSize;
    }

    public String getDataReferenceType() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.dataReferenceType;
    }
}
