package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class TierInfoBox extends AbstractBox {
    public static final String TYPE = "tiri";
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
    int constantFrameRate;
    int discardable;
    int frameRate;
    int levelIndication;
    int profileIndication;
    int profile_compatibility;
    int reserved1 = 0;
    int reserved2 = 0;
    int tierID;
    int visualHeight;
    int visualWidth;

    static {
        ajc$preClinit();
    }

    public TierInfoBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("TierInfoBox.java", TierInfoBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 69);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "tierID", "", "void"), 73);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "getVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 109);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "visualWidth", "", "void"), 113);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "getVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 117);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "setVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "visualHeight", "", "void"), 121);
        ajc$tjp_14 = bpf.g("method-execution", bpf.f("1", "getDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 125);
        ajc$tjp_15 = bpf.g("method-execution", bpf.f("1", "setDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "discardable", "", "void"), 129);
        ajc$tjp_16 = bpf.g("method-execution", bpf.f("1", "getConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 133);
        ajc$tjp_17 = bpf.g("method-execution", bpf.f("1", "setConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "constantFrameRate", "", "void"), 137);
        ajc$tjp_18 = bpf.g("method-execution", bpf.f("1", "getReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 141);
        ajc$tjp_19 = bpf.g("method-execution", bpf.f("1", "setReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "reserved2", "", "void"), 145);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 77);
        ajc$tjp_20 = bpf.g("method-execution", bpf.f("1", "getFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 149);
        ajc$tjp_21 = bpf.g("method-execution", bpf.f("1", "setFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "frameRate", "", "void"), 153);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "profileIndication", "", "void"), 81);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 85);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "profile_compatibility", "", "void"), 89);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 93);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "levelIndication", "", "void"), 97);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 101);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "reserved1", "", "void"), 105);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.tierID = h7.l(byteBuffer);
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.profileIndication = i;
        int i2 = byteBuffer.get();
        if (i2 < 0) {
            i2 += 256;
        }
        this.profile_compatibility = i2;
        int i3 = byteBuffer.get();
        if (i3 < 0) {
            i3 += 256;
        }
        this.levelIndication = i3;
        int i4 = byteBuffer.get();
        if (i4 < 0) {
            i4 += 256;
        }
        this.reserved1 = i4;
        this.visualWidth = h7.l(byteBuffer);
        this.visualHeight = h7.l(byteBuffer);
        int i5 = byteBuffer.get();
        if (i5 < 0) {
            i5 += 256;
        }
        this.discardable = (i5 & 192) >> 6;
        this.constantFrameRate = (i5 & 48) >> 4;
        this.reserved2 = i5 & 15;
        this.frameRate = h7.l(byteBuffer);
    }

    public int getConstantFrameRate() {
        d.a().b(bpf.b(ajc$tjp_16, this, this));
        return this.constantFrameRate;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        pe.e(byteBuffer, this.tierID);
        byteBuffer.put((byte) (this.profileIndication & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (this.profile_compatibility & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (this.levelIndication & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (this.reserved1 & BitmapRenderer.ALPHA_VISIBLE));
        pe.e(byteBuffer, this.visualWidth);
        pe.e(byteBuffer, this.visualHeight);
        byteBuffer.put((byte) (((this.discardable << 6) + (this.constantFrameRate << 4) + this.reserved2) & BitmapRenderer.ALPHA_VISIBLE));
        pe.e(byteBuffer, this.frameRate);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 13;
    }

    public int getDiscardable() {
        d.a().b(bpf.b(ajc$tjp_14, this, this));
        return this.discardable;
    }

    public int getFrameRate() {
        d.a().b(bpf.b(ajc$tjp_20, this, this));
        return this.frameRate;
    }

    public int getLevelIndication() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.levelIndication;
    }

    public int getProfileIndication() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.profileIndication;
    }

    public int getProfile_compatibility() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.profile_compatibility;
    }

    public int getReserved1() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.reserved1;
    }

    public int getReserved2() {
        d.a().b(bpf.b(ajc$tjp_18, this, this));
        return this.reserved2;
    }

    public int getTierID() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.tierID;
    }

    public int getVisualHeight() {
        d.a().b(bpf.b(ajc$tjp_12, this, this));
        return this.visualHeight;
    }

    public int getVisualWidth() {
        d.a().b(bpf.b(ajc$tjp_10, this, this));
        return this.visualWidth;
    }

    public void setConstantFrameRate(int i) {
        d.a().b(bpf.c(ajc$tjp_17, this, this, new Integer(i)));
        this.constantFrameRate = i;
    }

    public void setDiscardable(int i) {
        d.a().b(bpf.c(ajc$tjp_15, this, this, new Integer(i)));
        this.discardable = i;
    }

    public void setFrameRate(int i) {
        d.a().b(bpf.c(ajc$tjp_21, this, this, new Integer(i)));
        this.frameRate = i;
    }

    public void setLevelIndication(int i) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Integer(i)));
        this.levelIndication = i;
    }

    public void setProfileIndication(int i) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, new Integer(i)));
        this.profileIndication = i;
    }

    public void setProfile_compatibility(int i) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, new Integer(i)));
        this.profile_compatibility = i;
    }

    public void setReserved1(int i) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, new Integer(i)));
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        d.a().b(bpf.c(ajc$tjp_19, this, this, new Integer(i)));
        this.reserved2 = i;
    }

    public void setTierID(int i) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Integer(i)));
        this.tierID = i;
    }

    public void setVisualHeight(int i) {
        d.a().b(bpf.c(ajc$tjp_13, this, this, new Integer(i)));
        this.visualHeight = i;
    }

    public void setVisualWidth(int i) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, new Integer(i)));
        this.visualWidth = i;
    }
}
