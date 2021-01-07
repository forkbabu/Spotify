package com.mp4parser.iso14496.part15;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class TierBitRateBox extends AbstractBox {
    public static final String TYPE = "tibr";
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
    long avgBitRate;
    long baseBitRate;
    long maxBitRate;
    long tierAvgBitRate;
    long tierBaseBitRate;
    long tierMaxBitRate;

    static {
        ajc$preClinit();
    }

    public TierBitRateBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("TierBitRateBox.java", TierBitRateBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", Constants.LONG), 52);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", Constants.LONG, "baseBitRate", "", "void"), 56);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "getTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", Constants.LONG), 92);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", Constants.LONG, "tierAvgBitRate", "", "void"), 96);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", Constants.LONG), 60);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", Constants.LONG, "maxBitRate", "", "void"), 64);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", Constants.LONG), 68);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", Constants.LONG, "avgBitRate", "", "void"), 72);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", Constants.LONG), 76);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", Constants.LONG, "tierBaseBitRate", "", "void"), 80);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", Constants.LONG), 84);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", Constants.LONG, "tierMaxBitRate", "", "void"), 88);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.baseBitRate = h7.n(byteBuffer);
        this.maxBitRate = h7.n(byteBuffer);
        this.avgBitRate = h7.n(byteBuffer);
        this.tierBaseBitRate = h7.n(byteBuffer);
        this.tierMaxBitRate = h7.n(byteBuffer);
        this.tierAvgBitRate = h7.n(byteBuffer);
    }

    public long getAvgBitRate() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.avgBitRate;
    }

    public long getBaseBitRate() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.baseBitRate;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putInt((int) this.baseBitRate);
        byteBuffer.putInt((int) this.maxBitRate);
        byteBuffer.putInt((int) this.avgBitRate);
        byteBuffer.putInt((int) this.tierBaseBitRate);
        byteBuffer.putInt((int) this.tierMaxBitRate);
        byteBuffer.putInt((int) this.tierAvgBitRate);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 24;
    }

    public long getMaxBitRate() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.maxBitRate;
    }

    public long getTierAvgBitRate() {
        d.a().b(bpf.b(ajc$tjp_10, this, this));
        return this.tierAvgBitRate;
    }

    public long getTierBaseBitRate() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.tierBaseBitRate;
    }

    public long getTierMaxBitRate() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.tierMaxBitRate;
    }

    public void setAvgBitRate(long j) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, new Long(j)));
        this.avgBitRate = j;
    }

    public void setBaseBitRate(long j) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Long(j)));
        this.baseBitRate = j;
    }

    public void setMaxBitRate(long j) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, new Long(j)));
        this.maxBitRate = j;
    }

    public void setTierAvgBitRate(long j) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, new Long(j)));
        this.tierAvgBitRate = j;
    }

    public void setTierBaseBitRate(long j) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Long(j)));
        this.tierBaseBitRate = j;
    }

    public void setTierMaxBitRate(long j) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, new Long(j)));
        this.tierMaxBitRate = j;
    }
}
