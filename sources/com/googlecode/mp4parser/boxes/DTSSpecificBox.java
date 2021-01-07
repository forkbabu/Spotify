package com.googlecode.mp4parser.boxes;

import com.adjust.sdk.Constants;
import com.comscore.streaming.AdvertisementType;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class DTSSpecificBox extends AbstractBox {
    public static final String TYPE = "ddts";
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
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_30 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_31 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    long DTSSamplingFrequency;
    int LBRDurationMod;
    long avgBitRate;
    int channelLayout;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int frameDuration;
    long maxBitRate;
    int multiAssetFlag;
    int pcmSampleDepth;
    int representationType;
    int reserved;
    int reservedBoxPresent;
    int stereoDownmix;
    int streamConstruction;

    static {
        ajc$preClinit();
    }

    public DTSSpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("DTSSpecificBox.java", DTSSpecificBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.LONG), 89);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.LONG, "avgBitRate", "", "void"), 93);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "getStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 129);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "streamConstruction", "", "void"), 133);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "getCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 137);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "setCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLFEPresent", "", "void"), 141);
        ajc$tjp_14 = bpf.g("method-execution", bpf.f("1", "getCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 145);
        ajc$tjp_15 = bpf.g("method-execution", bpf.f("1", "setCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreLayout", "", "void"), 149);
        ajc$tjp_16 = bpf.g("method-execution", bpf.f("1", "getCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 153);
        ajc$tjp_17 = bpf.g("method-execution", bpf.f("1", "setCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "coreSize", "", "void"), 157);
        ajc$tjp_18 = bpf.g("method-execution", bpf.f("1", "getStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 161);
        ajc$tjp_19 = bpf.g("method-execution", bpf.f("1", "setStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "stereoDownmix", "", "void"), 165);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.LONG), 97);
        ajc$tjp_20 = bpf.g("method-execution", bpf.f("1", "getRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 169);
        ajc$tjp_21 = bpf.g("method-execution", bpf.f("1", "setRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "representationType", "", "void"), 173);
        ajc$tjp_22 = bpf.g("method-execution", bpf.f("1", "getChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 177);
        ajc$tjp_23 = bpf.g("method-execution", bpf.f("1", "setChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "channelLayout", "", "void"), 181);
        ajc$tjp_24 = bpf.g("method-execution", bpf.f("1", "getMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 185);
        ajc$tjp_25 = bpf.g("method-execution", bpf.f("1", "setMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "multiAssetFlag", "", "void"), 189);
        ajc$tjp_26 = bpf.g("method-execution", bpf.f("1", "getLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 193);
        ajc$tjp_27 = bpf.g("method-execution", bpf.f("1", "setLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "LBRDurationMod", "", "void"), 197);
        ajc$tjp_28 = bpf.g("method-execution", bpf.f("1", "getReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 201);
        ajc$tjp_29 = bpf.g("method-execution", bpf.f("1", "setReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reserved", "", "void"), 205);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.LONG, "DTSSamplingFrequency", "", "void"), 101);
        ajc$tjp_30 = bpf.g("method-execution", bpf.f("1", "getReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 209);
        ajc$tjp_31 = bpf.g("method-execution", bpf.f("1", "setReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "reservedBoxPresent", "", "void"), AdvertisementType.ON_DEMAND_POST_ROLL);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.LONG), 105);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.LONG, "maxBitRate", "", "void"), 109);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 113);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "pcmSampleDepth", "", "void"), 117);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", "int"), 121);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "int", "frameDuration", "", "void"), 125);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.DTSSamplingFrequency = h7.n(byteBuffer);
        this.maxBitRate = h7.n(byteBuffer);
        this.avgBitRate = h7.n(byteBuffer);
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.pcmSampleDepth = i;
        h40 h40 = new h40(byteBuffer);
        this.frameDuration = h40.a(2);
        this.streamConstruction = h40.a(5);
        this.coreLFEPresent = h40.a(1);
        this.coreLayout = h40.a(6);
        this.coreSize = h40.a(14);
        this.stereoDownmix = h40.a(1);
        this.representationType = h40.a(3);
        this.channelLayout = h40.a(16);
        this.multiAssetFlag = h40.a(1);
        this.LBRDurationMod = h40.a(1);
        this.reservedBoxPresent = h40.a(1);
        this.reserved = h40.a(5);
    }

    public long getAvgBitRate() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.avgBitRate;
    }

    public int getChannelLayout() {
        d.a().b(bpf.b(ajc$tjp_22, this, this));
        return this.channelLayout;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.putInt((int) this.DTSSamplingFrequency);
        byteBuffer.putInt((int) this.maxBitRate);
        byteBuffer.putInt((int) this.avgBitRate);
        byteBuffer.put((byte) (this.pcmSampleDepth & BitmapRenderer.ALPHA_VISIBLE));
        i40 i40 = new i40(byteBuffer);
        i40.a(this.frameDuration, 2);
        i40.a(this.streamConstruction, 5);
        i40.a(this.coreLFEPresent, 1);
        i40.a(this.coreLayout, 6);
        i40.a(this.coreSize, 14);
        i40.a(this.stereoDownmix, 1);
        i40.a(this.representationType, 3);
        i40.a(this.channelLayout, 16);
        i40.a(this.multiAssetFlag, 1);
        i40.a(this.LBRDurationMod, 1);
        i40.a(this.reservedBoxPresent, 1);
        i40.a(this.reserved, 5);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 20;
    }

    public int getCoreLFEPresent() {
        d.a().b(bpf.b(ajc$tjp_12, this, this));
        return this.coreLFEPresent;
    }

    public int getCoreLayout() {
        d.a().b(bpf.b(ajc$tjp_14, this, this));
        return this.coreLayout;
    }

    public int getCoreSize() {
        d.a().b(bpf.b(ajc$tjp_16, this, this));
        return this.coreSize;
    }

    public long getDTSSamplingFrequency() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.DTSSamplingFrequency;
    }

    public int[] getDashAudioChannelConfiguration() {
        int i;
        int i2;
        int channelLayout2 = getChannelLayout();
        if ((channelLayout2 & 1) == 1) {
            i2 = 1;
            i = 4;
        } else {
            i2 = 0;
            i = 0;
        }
        if ((channelLayout2 & 2) == 2) {
            i2 += 2;
            i = i | 1 | 2;
        }
        if ((channelLayout2 & 4) == 4) {
            i2 += 2;
            i = i | 16 | 32;
        }
        if ((channelLayout2 & 8) == 8) {
            i2++;
            i |= 8;
        }
        if ((channelLayout2 & 16) == 16) {
            i2++;
            i |= 256;
        }
        if ((channelLayout2 & 32) == 32) {
            i2 += 2;
            i = i | 4096 | 16384;
        }
        if ((channelLayout2 & 64) == 64) {
            i2 += 2;
            i = i | 16 | 32;
        }
        if ((channelLayout2 & 128) == 128) {
            i2++;
            i |= 8192;
        }
        if ((channelLayout2 & 256) == 256) {
            i2++;
            i |= 2048;
        }
        if ((channelLayout2 & 512) == 512) {
            i2 += 2;
            i = i | 64 | 128;
        }
        if ((channelLayout2 & 1024) == 1024) {
            i2 += 2;
            i = i | 512 | 1024;
        }
        if ((channelLayout2 & 2048) == 2048) {
            i2 += 2;
            i = i | 16 | 32;
        }
        if ((channelLayout2 & 4096) == 4096) {
            i2++;
            i |= 8;
        }
        if ((channelLayout2 & 8192) == 8192) {
            i2 += 2;
            i = i | 16 | 32;
        }
        if ((channelLayout2 & 16384) == 16384) {
            i2++;
            i |= 65536;
        }
        if ((channelLayout2 & 32768) == 32768) {
            i2 += 2;
            i = 32768 | i | 131072;
        }
        if ((channelLayout2 & 65536) == 65536) {
            i2++;
        }
        if ((channelLayout2 & 131072) == 131072) {
            i2 += 2;
        }
        return new int[]{i2, i};
    }

    public int getFrameDuration() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.frameDuration;
    }

    public int getLBRDurationMod() {
        d.a().b(bpf.b(ajc$tjp_26, this, this));
        return this.LBRDurationMod;
    }

    public long getMaxBitRate() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.maxBitRate;
    }

    public int getMultiAssetFlag() {
        d.a().b(bpf.b(ajc$tjp_24, this, this));
        return this.multiAssetFlag;
    }

    public int getPcmSampleDepth() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.pcmSampleDepth;
    }

    public int getRepresentationType() {
        d.a().b(bpf.b(ajc$tjp_20, this, this));
        return this.representationType;
    }

    public int getReserved() {
        d.a().b(bpf.b(ajc$tjp_28, this, this));
        return this.reserved;
    }

    public int getReservedBoxPresent() {
        d.a().b(bpf.b(ajc$tjp_30, this, this));
        return this.reservedBoxPresent;
    }

    public int getStereoDownmix() {
        d.a().b(bpf.b(ajc$tjp_18, this, this));
        return this.stereoDownmix;
    }

    public int getStreamConstruction() {
        d.a().b(bpf.b(ajc$tjp_10, this, this));
        return this.streamConstruction;
    }

    public void setAvgBitRate(long j) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Long(j)));
        this.avgBitRate = j;
    }

    public void setChannelLayout(int i) {
        d.a().b(bpf.c(ajc$tjp_23, this, this, new Integer(i)));
        this.channelLayout = i;
    }

    public void setCoreLFEPresent(int i) {
        d.a().b(bpf.c(ajc$tjp_13, this, this, new Integer(i)));
        this.coreLFEPresent = i;
    }

    public void setCoreLayout(int i) {
        d.a().b(bpf.c(ajc$tjp_15, this, this, new Integer(i)));
        this.coreLayout = i;
    }

    public void setCoreSize(int i) {
        d.a().b(bpf.c(ajc$tjp_17, this, this, new Integer(i)));
        this.coreSize = i;
    }

    public void setDTSSamplingFrequency(long j) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, new Long(j)));
        this.DTSSamplingFrequency = j;
    }

    public void setFrameDuration(int i) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, new Integer(i)));
        this.frameDuration = i;
    }

    public void setLBRDurationMod(int i) {
        d.a().b(bpf.c(ajc$tjp_27, this, this, new Integer(i)));
        this.LBRDurationMod = i;
    }

    public void setMaxBitRate(long j) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, new Long(j)));
        this.maxBitRate = j;
    }

    public void setMultiAssetFlag(int i) {
        d.a().b(bpf.c(ajc$tjp_25, this, this, new Integer(i)));
        this.multiAssetFlag = i;
    }

    public void setPcmSampleDepth(int i) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Integer(i)));
        this.pcmSampleDepth = i;
    }

    public void setRepresentationType(int i) {
        d.a().b(bpf.c(ajc$tjp_21, this, this, new Integer(i)));
        this.representationType = i;
    }

    public void setReserved(int i) {
        d.a().b(bpf.c(ajc$tjp_29, this, this, new Integer(i)));
        this.reserved = i;
    }

    public void setReservedBoxPresent(int i) {
        d.a().b(bpf.c(ajc$tjp_31, this, this, new Integer(i)));
        this.reservedBoxPresent = i;
    }

    public void setStereoDownmix(int i) {
        d.a().b(bpf.c(ajc$tjp_19, this, this, new Integer(i)));
        this.stereoDownmix = i;
    }

    public void setStreamConstruction(int i) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, new Integer(i)));
        this.streamConstruction = i;
    }
}
