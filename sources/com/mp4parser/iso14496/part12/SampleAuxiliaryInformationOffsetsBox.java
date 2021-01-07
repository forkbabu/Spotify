package com.mp4parser.iso14496.part12;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class SampleAuxiliaryInformationOffsetsBox extends AbstractFullBox {
    public static final String TYPE = "saio";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private long[] offsets = new long[0];

    static {
        ajc$preClinit();
    }

    public SampleAuxiliaryInformationOffsetsBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("SampleAuxiliaryInformationOffsetsBox.java", SampleAuxiliaryInformationOffsetsBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 107);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoType", "", "void"), 111);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 115);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 119);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getOffsets", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "[J"), 123);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setOffsets", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "[J", "offsets", "", "void"), 127);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.auxInfoType = h7.e(byteBuffer);
            this.auxInfoTypeParameter = h7.e(byteBuffer);
        }
        int n = rw.n(h7.n(byteBuffer));
        this.offsets = new long[n];
        for (int i = 0; i < n; i++) {
            if (getVersion() == 0) {
                this.offsets[i] = h7.n(byteBuffer);
            } else {
                this.offsets[i] = h7.p(byteBuffer);
            }
        }
    }

    public String getAuxInfoType() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.auxInfoType;
    }

    public String getAuxInfoTypeParameter() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.auxInfoTypeParameter;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(ne.b(this.auxInfoType));
            byteBuffer.put(ne.b(this.auxInfoTypeParameter));
        }
        byteBuffer.putInt((int) ((long) this.offsets.length));
        for (long j : this.offsets) {
            Long valueOf = Long.valueOf(j);
            if (getVersion() == 0) {
                byteBuffer.putInt((int) valueOf.longValue());
            } else {
                byteBuffer.putLong(valueOf.longValue());
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int i = 8;
        int length = (getVersion() == 0 ? this.offsets.length * 4 : this.offsets.length * 8) + 8;
        if ((getFlags() & 1) != 1) {
            i = 0;
        }
        return (long) (length + i);
    }

    public long[] getOffsets() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.offsets;
    }

    public void setAuxInfoType(String str) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, str));
        this.auxInfoType = str;
    }

    public void setAuxInfoTypeParameter(String str) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, str));
        this.auxInfoTypeParameter = str;
    }

    public void setOffsets(long[] jArr) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, jArr));
        this.offsets = jArr;
    }
}
