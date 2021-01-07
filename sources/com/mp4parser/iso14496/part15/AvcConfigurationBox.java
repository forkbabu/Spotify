package com.mp4parser.iso14496.part15;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.foundation.R;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public final class AvcConfigurationBox extends AbstractBox {
    public static final String TYPE = "avcC";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_11 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_12 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_13 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_14 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_15 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_16 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_17 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_18 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_19 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_20 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_21 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_22 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_23 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_24 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_25 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_26 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_27 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_28 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_29 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    public a avcDecoderConfigurationRecord = new a();

    static {
        ajc$preClinit();
    }

    public AvcConfigurationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("AvcConfigurationBox.java", AvcConfigurationBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 44);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 48);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 84);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 88);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 92);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 96);
        ajc$tjp_14 = bpf.g("method-execution", bpf.f("1", "getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 100);
        ajc$tjp_15 = bpf.g("method-execution", bpf.f("1", "setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 104);
        ajc$tjp_16 = bpf.g("method-execution", bpf.f("1", "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 108);
        ajc$tjp_17 = bpf.g("method-execution", bpf.f("1", "setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 112);
        ajc$tjp_18 = bpf.g("method-execution", bpf.f("1", "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 116);
        ajc$tjp_19 = bpf.g("method-execution", bpf.f("1", "setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 120);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 52);
        ajc$tjp_20 = bpf.g("method-execution", bpf.f("1", "getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), R.styleable.AppCompatTheme_windowNoTitle);
        ajc$tjp_21 = bpf.g("method-execution", bpf.f("1", "setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 128);
        ajc$tjp_22 = bpf.g("method-execution", bpf.f("1", "hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "boolean"), 132);
        ajc$tjp_23 = bpf.g("method-execution", bpf.f("1", "setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "", "void"), 136);
        ajc$tjp_24 = bpf.g("method-execution", bpf.f("1", "getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", Constants.LONG), 147);
        ajc$tjp_25 = bpf.g("method-execution", bpf.f("1", "getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 153);
        ajc$tjp_26 = bpf.g("method-execution", bpf.f("1", "getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 158);
        ajc$tjp_27 = bpf.g("method-execution", bpf.f("1", "getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 162);
        ajc$tjp_28 = bpf.g("method-execution", bpf.f("1", "getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 167);
        ajc$tjp_29 = bpf.g("method-execution", bpf.f("1", "toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), 172);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 56);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 60);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 64);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 72);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 76);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 80);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new a(byteBuffer);
    }

    public int getAvcLevelIndication() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        return this.avcDecoderConfigurationRecord.d;
    }

    public int getAvcProfileIndication() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.avcDecoderConfigurationRecord.b;
    }

    public int getBitDepthChromaMinus8() {
        d.a().b(bpf.b(ajc$tjp_18, this, this));
        return this.avcDecoderConfigurationRecord.k;
    }

    public int getBitDepthLumaMinus8() {
        d.a().b(bpf.b(ajc$tjp_16, this, this));
        return this.avcDecoderConfigurationRecord.j;
    }

    public int getChromaFormat() {
        d.a().b(bpf.b(ajc$tjp_14, this, this));
        return this.avcDecoderConfigurationRecord.i;
    }

    public int getConfigurationVersion() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.avcDecoderConfigurationRecord.a;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        d.a().b(bpf.c(ajc$tjp_25, this, this, byteBuffer));
        this.avcDecoderConfigurationRecord.a(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        d.a().b(bpf.b(ajc$tjp_24, this, this));
        return this.avcDecoderConfigurationRecord.b();
    }

    public int getLengthSizeMinusOne() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.avcDecoderConfigurationRecord.e;
    }

    public String[] getPPS() {
        d.a().b(bpf.b(ajc$tjp_27, this, this));
        return this.avcDecoderConfigurationRecord.c();
    }

    public List<byte[]> getPictureParameterSets() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.g);
    }

    public int getProfileCompatibility() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.avcDecoderConfigurationRecord.c;
    }

    public String[] getSPS() {
        d.a().b(bpf.b(ajc$tjp_26, this, this));
        return this.avcDecoderConfigurationRecord.e();
    }

    public List<byte[]> getSequenceParameterSetExts() {
        d.a().b(bpf.b(ajc$tjp_20, this, this));
        return this.avcDecoderConfigurationRecord.l;
    }

    public List<byte[]> getSequenceParameterSets() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.f);
    }

    public a getavcDecoderConfigurationRecord() {
        d.a().b(bpf.b(ajc$tjp_28, this, this));
        return this.avcDecoderConfigurationRecord;
    }

    public boolean hasExts() {
        d.a().b(bpf.b(ajc$tjp_22, this, this));
        return this.avcDecoderConfigurationRecord.h;
    }

    public void setAvcLevelIndication(int i) {
        d.a().b(bpf.c(ajc$tjp_10, this, this, new Integer(i)));
        this.avcDecoderConfigurationRecord.d = i;
    }

    public void setAvcProfileIndication(int i) {
        d.a().b(bpf.c(ajc$tjp_8, this, this, new Integer(i)));
        this.avcDecoderConfigurationRecord.b = i;
    }

    public void setBitDepthChromaMinus8(int i) {
        d.a().b(bpf.c(ajc$tjp_19, this, this, new Integer(i)));
        this.avcDecoderConfigurationRecord.k = i;
    }

    public void setBitDepthLumaMinus8(int i) {
        d.a().b(bpf.c(ajc$tjp_17, this, this, new Integer(i)));
        this.avcDecoderConfigurationRecord.j = i;
    }

    public void setChromaFormat(int i) {
        d.a().b(bpf.c(ajc$tjp_15, this, this, new Integer(i)));
        this.avcDecoderConfigurationRecord.i = i;
    }

    public void setConfigurationVersion(int i) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Integer(i)));
        this.avcDecoderConfigurationRecord.a = i;
    }

    public void setHasExts(boolean z) {
        d.a().b(bpf.c(ajc$tjp_23, this, this, new Boolean(z)));
        this.avcDecoderConfigurationRecord.h = z;
    }

    public void setLengthSizeMinusOne(int i) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, new Integer(i)));
        this.avcDecoderConfigurationRecord.e = i;
    }

    public void setPictureParameterSets(List<byte[]> list) {
        d.a().b(bpf.c(ajc$tjp_13, this, this, list));
        this.avcDecoderConfigurationRecord.g = list;
    }

    public void setProfileCompatibility(int i) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, new Integer(i)));
        this.avcDecoderConfigurationRecord.c = i;
    }

    public void setSequenceParameterSetExts(List<byte[]> list) {
        d.a().b(bpf.c(ajc$tjp_21, this, this, list));
        this.avcDecoderConfigurationRecord.l = list;
    }

    public void setSequenceParameterSets(List<byte[]> list) {
        d.a().b(bpf.c(ajc$tjp_12, this, this, list));
        this.avcDecoderConfigurationRecord.f = list;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_29, this, this), "AvcConfigurationBox{avcDecoderConfigurationRecord=");
        c1.append(this.avcDecoderConfigurationRecord);
        c1.append('}');
        return c1.toString();
    }
}
