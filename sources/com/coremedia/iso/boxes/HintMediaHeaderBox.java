package com.coremedia.iso.boxes;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class HintMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "hmhd";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private long avgBitrate;
    private int avgPduSize;
    private long maxBitrate;
    private int maxPduSize;

    static {
        ajc$preClinit();
    }

    public HintMediaHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("HintMediaHeaderBox.java", HintMediaHeaderBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getMaxPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 42);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getAvgPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "int"), 46);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getMaxBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", Constants.LONG), 50);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getAvgBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", Constants.LONG), 54);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "java.lang.String"), 84);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxPduSize = h7.l(byteBuffer);
        this.avgPduSize = h7.l(byteBuffer);
        this.maxBitrate = h7.n(byteBuffer);
        this.avgBitrate = h7.n(byteBuffer);
        h7.n(byteBuffer);
    }

    public long getAvgBitrate() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        return this.avgBitrate;
    }

    public int getAvgPduSize() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.avgPduSize;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        pe.e(byteBuffer, this.maxPduSize);
        pe.e(byteBuffer, this.avgPduSize);
        byteBuffer.putInt((int) this.maxBitrate);
        byteBuffer.putInt((int) this.avgBitrate);
        byteBuffer.putInt((int) 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 20;
    }

    public long getMaxBitrate() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.maxBitrate;
    }

    public int getMaxPduSize() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.maxPduSize;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_4, this, this), "HintMediaHeaderBox{maxPduSize=");
        c1.append(this.maxPduSize);
        c1.append(", avgPduSize=");
        c1.append(this.avgPduSize);
        c1.append(", maxBitrate=");
        c1.append(this.maxBitrate);
        c1.append(", avgBitrate=");
        return je.D0(c1, this.avgBitrate, '}');
    }
}
