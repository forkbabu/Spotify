package com.mp4parser.iso14496.part12;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class SampleAuxiliaryInformationSizesBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "saiz";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_11 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private short defaultSampleInfoSize;
    private int sampleCount;
    private short[] sampleInfoSizes = new short[0];

    static {
        ajc$preClinit();
    }

    public SampleAuxiliaryInformationSizesBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("SampleAuxiliaryInformationSizesBox.java", SampleAuxiliaryInformationSizesBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "index", "", "short"), 57);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 106);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "setSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "sampleCount", "", "void"), 146);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "toString", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 151);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoType", "", "void"), 110);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 114);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoTypeParameter", "", "void"), 118);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 122);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "setDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "int", "defaultSampleInfoSize", "", "void"), 126);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "getSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "[S"), 131);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "setSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "[S", "sampleInfoSizes", "", "void"), 137);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "getSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "int"), 142);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.auxInfoType = h7.e(byteBuffer);
            this.auxInfoTypeParameter = h7.e(byteBuffer);
        }
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.defaultSampleInfoSize = (short) i;
        int n = rw.n(h7.n(byteBuffer));
        this.sampleCount = n;
        if (this.defaultSampleInfoSize == 0) {
            this.sampleInfoSizes = new short[n];
            for (int i2 = 0; i2 < this.sampleCount; i2++) {
                short[] sArr = this.sampleInfoSizes;
                int i3 = byteBuffer.get();
                if (i3 < 0) {
                    i3 += 256;
                }
                sArr[i2] = (short) i3;
            }
        }
    }

    public String getAuxInfoType() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.auxInfoType;
    }

    public String getAuxInfoTypeParameter() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
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
        byteBuffer.put((byte) (this.defaultSampleInfoSize & 255));
        if (this.defaultSampleInfoSize == 0) {
            byteBuffer.putInt((int) ((long) this.sampleInfoSizes.length));
            for (short s : this.sampleInfoSizes) {
                byteBuffer.put((byte) (s & 255));
            }
            return;
        }
        byteBuffer.putInt((int) ((long) this.sampleCount));
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) (((getFlags() & 1) == 1 ? 12 : 4) + 5 + (this.defaultSampleInfoSize == 0 ? this.sampleInfoSizes.length : 0));
    }

    public int getDefaultSampleInfoSize() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        return this.defaultSampleInfoSize;
    }

    public int getSampleCount() {
        d.a().b(bpf.b(ajc$tjp_9, this, this));
        return this.sampleCount;
    }

    public short[] getSampleInfoSizes() {
        d.a().b(bpf.b(ajc$tjp_7, this, this));
        short[] sArr = this.sampleInfoSizes;
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    public short getSize(int i) {
        d.a().b(bpf.c(ajc$tjp_0, this, this, new Integer(i)));
        if (getDefaultSampleInfoSize() == 0) {
            return this.sampleInfoSizes[i];
        }
        return this.defaultSampleInfoSize;
    }

    public void setAuxInfoType(String str) {
        d.a().b(bpf.c(ajc$tjp_2, this, this, str));
        this.auxInfoType = str;
    }

    public void setAuxInfoTypeParameter(String str) {
        d.a().b(bpf.c(ajc$tjp_4, this, this, str));
        this.auxInfoTypeParameter = str;
    }

    public void setDefaultSampleInfoSize(int i) {
        d.a().b(bpf.c(ajc$tjp_6, this, this, new Integer(i)));
        this.defaultSampleInfoSize = (short) i;
    }

    public void setSampleCount(int i) {
        d.a().b(bpf.c(ajc$tjp_10, this, this, new Integer(i)));
        this.sampleCount = i;
    }

    public void setSampleInfoSizes(short[] sArr) {
        d.a().b(bpf.c(ajc$tjp_8, this, this, sArr));
        short[] sArr2 = new short[sArr.length];
        this.sampleInfoSizes = sArr2;
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_11, this, this), "SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=");
        c1.append((int) this.defaultSampleInfoSize);
        c1.append(", sampleCount=");
        c1.append(this.sampleCount);
        c1.append(", auxInfoType='");
        je.A(c1, this.auxInfoType, '\'', ", auxInfoTypeParameter='");
        c1.append(this.auxInfoTypeParameter);
        c1.append('\'');
        c1.append('}');
        return c1.toString();
    }
}
