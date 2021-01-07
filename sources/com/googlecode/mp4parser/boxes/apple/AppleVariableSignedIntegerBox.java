package com.googlecode.mp4parser.boxes.apple;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public abstract class AppleVariableSignedIntegerBox extends AppleDataBox {
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    int intLength = 1;
    long value;

    static {
        ajc$preClinit();
    }

    protected AppleVariableSignedIntegerBox(String str) {
        super(str, 15);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("AppleVariableSignedIntegerBox.java", AppleVariableSignedIntegerBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getIntLength", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", "int"), 19);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setIntLength", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "int", "intLength", "", "void"), 23);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getValue", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", "", "", "", Constants.LONG), 27);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setValue", "com.googlecode.mp4parser.boxes.apple.AppleVariableSignedIntegerBox", Constants.LONG, "value", "", "void"), 36);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public int getDataLength() {
        return this.intLength;
    }

    public int getIntLength() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.intLength;
    }

    public long getValue() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        if (!isParsed()) {
            parseDetails();
        }
        return this.value;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public void parseData(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        this.value = oe.a(byteBuffer, remaining);
        this.intLength = remaining;
    }

    public void setIntLength(int i) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Integer(i)));
        this.intLength = i;
    }

    public void setValue(long j) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, new Long(j)));
        if (j <= 127 && j > -128) {
            this.intLength = 1;
        } else if (j <= 32767 && j > -32768 && this.intLength < 2) {
            this.intLength = 2;
        } else if (j > 8388607 || j <= -8388608 || this.intLength >= 3) {
            this.intLength = 4;
        } else {
            this.intLength = 3;
        }
        this.value = j;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public byte[] writeData() {
        int dataLength = getDataLength();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[dataLength]);
        h7.r(this.value, wrap, dataLength);
        return wrap.array();
    }
}
