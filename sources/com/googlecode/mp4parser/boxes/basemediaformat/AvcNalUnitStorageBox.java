package com.googlecode.mp4parser.boxes.basemediaformat;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class AvcNalUnitStorageBox extends AbstractBox {
    public static final String TYPE = "avcn";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    com.mp4parser.iso14496.part15.a avcDecoderConfigurationRecord;

    static {
        ajc$preClinit();
    }

    public AvcNalUnitStorageBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("AvcNalUnitStorageBox.java", AvcNalUnitStorageBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getAvcDecoderConfigurationRecord", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 44);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getLengthSizeMinusOne", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "int"), 49);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getSPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 53);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getPPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 57);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getSequenceParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 61);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getSequenceParameterSetExtsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 65);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getPictureParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 69);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "toString", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.lang.String"), 89);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new com.mp4parser.iso14496.part15.a(byteBuffer);
    }

    public com.mp4parser.iso14496.part15.a getAvcDecoderConfigurationRecord() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.avcDecoderConfigurationRecord;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord.a(byteBuffer);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.avcDecoderConfigurationRecord.b();
    }

    public int getLengthSizeMinusOne() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.avcDecoderConfigurationRecord.e;
    }

    public String[] getPPS() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        return this.avcDecoderConfigurationRecord.c();
    }

    public List<String> getPictureParameterSetsAsStrings() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.avcDecoderConfigurationRecord.d();
    }

    public String[] getSPS() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.avcDecoderConfigurationRecord.e();
    }

    public List<String> getSequenceParameterSetExtsAsStrings() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        com.mp4parser.iso14496.part15.a aVar = this.avcDecoderConfigurationRecord;
        aVar.getClass();
        ArrayList arrayList = new ArrayList(aVar.l.size());
        for (byte[] bArr : aVar.l) {
            arrayList.add(me.a(bArr));
        }
        return arrayList;
    }

    public List<String> getSequenceParameterSetsAsStrings() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.avcDecoderConfigurationRecord.f();
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_7, this, this), "AvcNalUnitStorageBox{SPS=");
        c1.append(this.avcDecoderConfigurationRecord.f());
        c1.append(",PPS=");
        c1.append(this.avcDecoderConfigurationRecord.d());
        c1.append(",lengthSize=");
        c1.append(this.avcDecoderConfigurationRecord.e + 1);
        c1.append('}');
        return c1.toString();
    }

    public AvcNalUnitStorageBox(AvcConfigurationBox avcConfigurationBox) {
        super(TYPE);
        this.avcDecoderConfigurationRecord = avcConfigurationBox.getavcDecoderConfigurationRecord();
    }
}
