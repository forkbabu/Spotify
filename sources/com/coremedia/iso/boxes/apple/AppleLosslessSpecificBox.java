package com.coremedia.iso.boxes.apple;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public final class AppleLosslessSpecificBox extends AbstractFullBox {
    public static final String TYPE = "alac";
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
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;

    static {
        ajc$preClinit();
    }

    public AppleLosslessSpecificBox() {
        super("alac");
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("AppleLosslessSpecificBox.java", AppleLosslessSpecificBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.LONG), 34);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxSamplePerFrame", "", "void"), 38);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "getKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 74);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "kModifier", "", "void"), 78);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "getChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 82);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "setChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "channels", "", "void"), 86);
        ajc$tjp_14 = bpf.g("method-execution", bpf.f("1", "getUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 90);
        ajc$tjp_15 = bpf.g("method-execution", bpf.f("1", "setUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown2", "", "void"), 94);
        ajc$tjp_16 = bpf.g("method-execution", bpf.f("1", "getMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.LONG), 98);
        ajc$tjp_17 = bpf.g("method-execution", bpf.f("1", "setMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "maxCodedFrameSize", "", "void"), 102);
        ajc$tjp_18 = bpf.g("method-execution", bpf.f("1", "getBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.LONG), 106);
        ajc$tjp_19 = bpf.g("method-execution", bpf.f("1", "setBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "bitRate", "", "void"), 110);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 42);
        ajc$tjp_20 = bpf.g("method-execution", bpf.f("1", "getSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.LONG), 114);
        ajc$tjp_21 = bpf.g("method-execution", bpf.f("1", "setSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleRate", "", "void"), 118);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "unknown1", "", "void"), 46);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "sampleSize", "", "void"), 54);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "historyMult", "", "void"), 62);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", "int"), 66);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "int", "initialHistory", "", "void"), 70);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxSamplePerFrame = h7.n(byteBuffer);
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.unknown1 = i;
        int i2 = byteBuffer.get();
        if (i2 < 0) {
            i2 += 256;
        }
        this.sampleSize = i2;
        int i3 = byteBuffer.get();
        if (i3 < 0) {
            i3 += 256;
        }
        this.historyMult = i3;
        int i4 = byteBuffer.get();
        if (i4 < 0) {
            i4 += 256;
        }
        this.initialHistory = i4;
        int i5 = byteBuffer.get();
        if (i5 < 0) {
            i5 += 256;
        }
        this.kModifier = i5;
        int i6 = byteBuffer.get();
        if (i6 < 0) {
            i6 += 256;
        }
        this.channels = i6;
        this.unknown2 = h7.l(byteBuffer);
        this.maxCodedFrameSize = h7.n(byteBuffer);
        this.bitRate = h7.n(byteBuffer);
        this.sampleRate = h7.n(byteBuffer);
    }

    public long getBitRate() {
        d.a().b(bpf.b(ajc$tjp_18, this, this));
        return this.bitRate;
    }

    public int getChannels() {
        d.a().b(bpf.b(ajc$tjp_12, this, this));
        return this.channels;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) this.maxSamplePerFrame);
        byteBuffer.put((byte) (this.unknown1 & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (this.sampleSize & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (this.historyMult & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (this.initialHistory & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (this.kModifier & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (this.channels & BitmapRenderer.ALPHA_VISIBLE));
        pe.e(byteBuffer, this.unknown2);
        byteBuffer.putInt((int) this.maxCodedFrameSize);
        byteBuffer.putInt((int) this.bitRate);
        byteBuffer.putInt((int) this.sampleRate);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 28;
    }

    public int getHistoryMult() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.historyMult;
    }

    public int getInitialHistory() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.initialHistory;
    }

    public int getKModifier() {
        d.a().b(bpf.b(ajc$tjp_10, this, this));
        return this.kModifier;
    }

    public long getMaxCodedFrameSize() {
        d.a().b(bpf.b(ajc$tjp_16, this, this));
        return this.maxCodedFrameSize;
    }

    public long getMaxSamplePerFrame() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.maxSamplePerFrame;
    }

    public long getSampleRate() {
        d.a().b(bpf.b(ajc$tjp_20, this, this));
        return this.sampleRate;
    }

    public int getSampleSize() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.sampleSize;
    }

    public int getUnknown1() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.unknown1;
    }

    public int getUnknown2() {
        d.a().b(bpf.b(ajc$tjp_14, this, this));
        return this.unknown2;
    }

    public void setBitRate(int i) {
        d.a().b(bpf.c(ajc$tjp_19, this, this, new Integer(i)));
        this.bitRate = (long) i;
    }

    public void setChannels(int i) {
        d.a().b(bpf.c(ajc$tjp_13, this, this, new Integer(i)));
        this.channels = i;
    }

    public void setHistoryMult(int i) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Integer(i)));
        this.historyMult = i;
    }

    public void setInitialHistory(int i) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, new Integer(i)));
        this.initialHistory = i;
    }

    public void setKModifier(int i) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, new Integer(i)));
        this.kModifier = i;
    }

    public void setMaxCodedFrameSize(int i) {
        d.a().b(bpf.c(ajc$tjp_17, this, this, new Integer(i)));
        this.maxCodedFrameSize = (long) i;
    }

    public void setMaxSamplePerFrame(int i) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Integer(i)));
        this.maxSamplePerFrame = (long) i;
    }

    public void setSampleRate(int i) {
        d.a().b(bpf.c(ajc$tjp_21, this, this, new Integer(i)));
        this.sampleRate = (long) i;
    }

    public void setSampleSize(int i) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, new Integer(i)));
        this.sampleSize = i;
    }

    public void setUnknown1(int i) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, new Integer(i)));
        this.unknown1 = i;
    }

    public void setUnknown2(int i) {
        d.a().b(bpf.c(ajc$tjp_15, this, this, new Integer(i)));
        this.unknown2 = i;
    }
}
