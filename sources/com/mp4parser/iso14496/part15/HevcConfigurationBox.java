package com.mp4parser.iso14496.part15;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import com.mp4parser.iso14496.part15.b;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class HevcConfigurationBox extends AbstractBox {
    public static final String TYPE = "hvcC";
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
    private b hevcDecoderConfigurationRecord = new b();

    static {
        ajc$preClinit();
    }

    public HevcConfigurationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("HevcConfigurationBox.java", HevcConfigurationBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getHevcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord"), 38);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setHevcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "com.mp4parser.iso14496.part15.HevcDecoderConfigurationRecord", "hevcDecoderConfigurationRecord", "", "void"), 42);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "getGeneral_level_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 90);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "getMin_spatial_segmentation_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 94);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "getParallelismType", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 98);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "getChromaFormat", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 102);
        ajc$tjp_14 = bpf.g("method-execution", bpf.f("1", "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 106);
        ajc$tjp_15 = bpf.g("method-execution", bpf.f("1", "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 110);
        ajc$tjp_16 = bpf.g("method-execution", bpf.f("1", "getAvgFrameRate", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 114);
        ajc$tjp_17 = bpf.g("method-execution", bpf.f("1", "getNumTemporalLayers", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 118);
        ajc$tjp_18 = bpf.g("method-execution", bpf.f("1", "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 122);
        ajc$tjp_19 = bpf.g("method-execution", bpf.f("1", "isTemporalIdNested", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "boolean"), 126);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "equals", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "java.lang.Object", "o", "", "boolean"), 47);
        ajc$tjp_20 = bpf.g("method-execution", bpf.f("1", "getConstantFrameRate", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 130);
        ajc$tjp_21 = bpf.g("method-execution", bpf.f("1", "getArrays", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "java.util.List"), 134);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "hashCode", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 60);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getConfigurationVersion", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 65);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getGeneral_profile_space", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 69);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "isGeneral_tier_flag", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "boolean"), 73);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "getGeneral_profile_idc", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", "int"), 78);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getGeneral_profile_compatibility_flags", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", Constants.LONG), 82);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "getGeneral_constraint_indicator_flags", "com.mp4parser.iso14496.part15.HevcConfigurationBox", "", "", "", Constants.LONG), 86);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        b bVar = this.hevcDecoderConfigurationRecord;
        bVar.getClass();
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        bVar.a = i;
        int i2 = byteBuffer.get();
        if (i2 < 0) {
            i2 += 256;
        }
        bVar.b = (i2 & 192) >> 6;
        bVar.c = (i2 & 32) > 0;
        bVar.d = i2 & 31;
        bVar.e = h7.n(byteBuffer);
        long o = h7.o(byteBuffer);
        bVar.f = o;
        long j = o >> 44;
        bVar.x = (8 & j) > 0;
        bVar.y = (4 & j) > 0;
        bVar.z = (2 & j) > 0;
        bVar.A = (j & 1) > 0;
        bVar.f = o & 140737488355327L;
        int i3 = byteBuffer.get();
        if (i3 < 0) {
            i3 += 256;
        }
        bVar.g = i3;
        int l = h7.l(byteBuffer);
        bVar.h = (61440 & l) >> 12;
        bVar.i = l & 4095;
        int i4 = byteBuffer.get();
        if (i4 < 0) {
            i4 += 256;
        }
        bVar.j = (i4 & 252) >> 2;
        bVar.k = i4 & 3;
        int i5 = byteBuffer.get();
        if (i5 < 0) {
            i5 += 256;
        }
        bVar.l = (i5 & 252) >> 2;
        bVar.m = i5 & 3;
        int i6 = byteBuffer.get();
        if (i6 < 0) {
            i6 += 256;
        }
        bVar.n = (i6 & 248) >> 3;
        bVar.o = i6 & 7;
        int i7 = byteBuffer.get();
        if (i7 < 0) {
            i7 += 256;
        }
        bVar.p = (i7 & 248) >> 3;
        bVar.q = i7 & 7;
        bVar.r = h7.l(byteBuffer);
        int i8 = byteBuffer.get();
        if (i8 < 0) {
            i8 += 256;
        }
        bVar.s = (i8 & 192) >> 6;
        bVar.t = (i8 & 56) >> 3;
        bVar.u = (i8 & 4) > 0;
        bVar.v = i8 & 3;
        int i9 = byteBuffer.get();
        if (i9 < 0) {
            i9 += 256;
        }
        bVar.w = new ArrayList();
        for (int i10 = 0; i10 < i9; i10++) {
            b.a aVar = new b.a();
            int i11 = byteBuffer.get();
            if (i11 < 0) {
                i11 += 256;
            }
            aVar.a = (i11 & 128) > 0;
            aVar.b = (i11 & 64) > 0;
            aVar.c = i11 & 63;
            int l2 = h7.l(byteBuffer);
            aVar.d = new ArrayList();
            for (int i12 = 0; i12 < l2; i12++) {
                byte[] bArr = new byte[h7.l(byteBuffer)];
                byteBuffer.get(bArr);
                aVar.d.add(bArr);
            }
            bVar.w.add(aVar);
        }
    }

    public boolean equals(Object obj) {
        d.a().b(bpf.c(ajc$tjp_2, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = this.hevcDecoderConfigurationRecord;
        b bVar2 = ((HevcConfigurationBox) obj).hevcDecoderConfigurationRecord;
        return bVar == null ? bVar2 == null : bVar.equals(bVar2);
    }

    public List<b.a> getArrays() {
        d.a().b(bpf.b(ajc$tjp_21, this, this));
        return this.hevcDecoderConfigurationRecord.w;
    }

    public int getAvgFrameRate() {
        d.a().b(bpf.b(ajc$tjp_16, this, this));
        return this.hevcDecoderConfigurationRecord.r;
    }

    public int getBitDepthChromaMinus8() {
        d.a().b(bpf.b(ajc$tjp_15, this, this));
        return this.hevcDecoderConfigurationRecord.q;
    }

    public int getBitDepthLumaMinus8() {
        d.a().b(bpf.b(ajc$tjp_14, this, this));
        return this.hevcDecoderConfigurationRecord.o;
    }

    public int getChromaFormat() {
        d.a().b(bpf.b(ajc$tjp_13, this, this));
        return this.hevcDecoderConfigurationRecord.m;
    }

    public int getConfigurationVersion() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.hevcDecoderConfigurationRecord.a;
    }

    public int getConstantFrameRate() {
        d.a().b(bpf.b(ajc$tjp_20, this, this));
        return this.hevcDecoderConfigurationRecord.s;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        b bVar = this.hevcDecoderConfigurationRecord;
        byteBuffer.put((byte) (bVar.a & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (((bVar.b << 6) + (bVar.c ? 32 : 0) + bVar.d) & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.putInt((int) bVar.e);
        long j = bVar.f;
        if (bVar.x) {
            j |= 140737488355328L;
        }
        if (bVar.y) {
            j |= 70368744177664L;
        }
        if (bVar.z) {
            j |= 35184372088832L;
        }
        if (bVar.A) {
            j |= 17592186044416L;
        }
        pe.g(byteBuffer, j);
        byteBuffer.put((byte) (bVar.g & BitmapRenderer.ALPHA_VISIBLE));
        pe.e(byteBuffer, (bVar.h << 12) + bVar.i);
        byteBuffer.put((byte) (((bVar.j << 2) + bVar.k) & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (((bVar.l << 2) + bVar.m) & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (((bVar.n << 3) + bVar.o) & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (((bVar.p << 3) + bVar.q) & BitmapRenderer.ALPHA_VISIBLE));
        pe.e(byteBuffer, bVar.r);
        byteBuffer.put((byte) (((bVar.s << 6) + (bVar.t << 3) + (bVar.u ? 4 : 0) + bVar.v) & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (bVar.w.size() & BitmapRenderer.ALPHA_VISIBLE));
        for (b.a aVar : bVar.w) {
            byteBuffer.put((byte) (((aVar.a ? 128 : 0) + (aVar.b ? 64 : 0) + aVar.c) & BitmapRenderer.ALPHA_VISIBLE));
            pe.e(byteBuffer, aVar.d.size());
            for (byte[] bArr : aVar.d) {
                pe.e(byteBuffer, bArr.length);
                byteBuffer.put(bArr);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int i = 23;
        for (b.a aVar : this.hevcDecoderConfigurationRecord.w) {
            i += 3;
            for (byte[] bArr : aVar.d) {
                i = i + 2 + bArr.length;
            }
        }
        return (long) i;
    }

    public long getGeneral_constraint_indicator_flags() {
        d.a().b(bpf.b(ajc$tjp_9, this, this));
        return this.hevcDecoderConfigurationRecord.f;
    }

    public int getGeneral_level_idc() {
        d.a().b(bpf.b(ajc$tjp_10, this, this));
        return this.hevcDecoderConfigurationRecord.g;
    }

    public long getGeneral_profile_compatibility_flags() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.hevcDecoderConfigurationRecord.e;
    }

    public int getGeneral_profile_idc() {
        d.a().b(bpf.b(ajc$tjp_7, this, this));
        return this.hevcDecoderConfigurationRecord.d;
    }

    public int getGeneral_profile_space() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        return this.hevcDecoderConfigurationRecord.b;
    }

    public b getHevcDecoderConfigurationRecord() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.hevcDecoderConfigurationRecord;
    }

    public int getLengthSizeMinusOne() {
        d.a().b(bpf.b(ajc$tjp_18, this, this));
        return this.hevcDecoderConfigurationRecord.v;
    }

    public int getMin_spatial_segmentation_idc() {
        d.a().b(bpf.b(ajc$tjp_11, this, this));
        return this.hevcDecoderConfigurationRecord.i;
    }

    public int getNumTemporalLayers() {
        d.a().b(bpf.b(ajc$tjp_17, this, this));
        return this.hevcDecoderConfigurationRecord.t;
    }

    public int getParallelismType() {
        d.a().b(bpf.b(ajc$tjp_12, this, this));
        return this.hevcDecoderConfigurationRecord.k;
    }

    public int hashCode() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        b bVar = this.hevcDecoderConfigurationRecord;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public boolean isGeneral_tier_flag() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.hevcDecoderConfigurationRecord.c;
    }

    public boolean isTemporalIdNested() {
        d.a().b(bpf.b(ajc$tjp_19, this, this));
        return this.hevcDecoderConfigurationRecord.u;
    }

    public void setHevcDecoderConfigurationRecord(b bVar) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, bVar));
        this.hevcDecoderConfigurationRecord = bVar;
    }
}
