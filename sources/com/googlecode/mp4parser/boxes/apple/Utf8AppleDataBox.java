package com.googlecode.mp4parser.boxes.apple;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.mp4parser.aspectj.lang.a;

public abstract class Utf8AppleDataBox extends AppleDataBox {
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    String value;

    static {
        ajc$preClinit();
    }

    protected Utf8AppleDataBox(String str) {
        super(str, 1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("Utf8AppleDataBox.java", Utf8AppleDataBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getValue", "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox", "", "", "", "java.lang.String"), 21);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setValue", "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox", "java.lang.String", "value", "", "void"), 30);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public int getDataLength() {
        return this.value.getBytes(Charset.forName(Constants.ENCODING)).length;
    }

    public String getValue() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        if (!isParsed()) {
            parseDetails();
        }
        return this.value;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public void parseData(ByteBuffer byteBuffer) {
        this.value = h7.k(byteBuffer, byteBuffer.remaining());
    }

    public void setValue(String str) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, str));
        this.value = str;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public byte[] writeData() {
        return h7.b(this.value);
    }
}
