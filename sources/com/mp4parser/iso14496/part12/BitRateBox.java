package com.mp4parser.iso14496.part12;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public final class BitRateBox extends AbstractBox {
    public static final String TYPE = "btrt";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private long avgBitrate;
    private long bufferSizeDb;
    private long maxBitrate;

    static {
        ajc$preClinit();
    }

    public BitRateBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("BitRateBox.java", BitRateBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", Constants.LONG), 74);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", Constants.LONG, "bufferSizeDb", "", "void"), 82);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", Constants.LONG), 90);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", Constants.LONG, "maxBitrate", "", "void"), 98);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", Constants.LONG), 106);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", Constants.LONG, "avgBitrate", "", "void"), 114);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.bufferSizeDb = h7.n(byteBuffer);
        this.maxBitrate = h7.n(byteBuffer);
        this.avgBitrate = h7.n(byteBuffer);
    }

    public long getAvgBitrate() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.avgBitrate;
    }

    public long getBufferSizeDb() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.bufferSizeDb;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putInt((int) this.bufferSizeDb);
        byteBuffer.putInt((int) this.maxBitrate);
        byteBuffer.putInt((int) this.avgBitrate);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 12;
    }

    public long getMaxBitrate() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.maxBitrate;
    }

    public void setAvgBitrate(long j) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, new Long(j)));
        this.avgBitrate = j;
    }

    public void setBufferSizeDb(long j) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Long(j)));
        this.bufferSizeDb = j;
    }

    public void setMaxBitrate(long j) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, new Long(j)));
        this.maxBitrate = j;
    }
}
