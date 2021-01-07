package com.coremedia.iso.boxes.sampleentry;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class AmrSpecificBox extends AbstractBox {
    public static final String TYPE = "damr";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private int decoderVersion;
    private int framesPerSample;
    private int modeChangePeriod;
    private int modeSet;
    private String vendor;

    static {
        ajc$preClinit();
    }

    public AmrSpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("AmrSpecificBox.java", AmrSpecificBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getVendor", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getDecoderVersion", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 50);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getModeSet", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 54);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getModeChangePeriod", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 58);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getFramesPerSample", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "int"), 62);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getContent", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 84);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.sampleentry.AmrSpecificBox", "", "", "", "java.lang.String"), 92);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr);
        this.vendor = ne.a(bArr);
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.decoderVersion = i;
        this.modeSet = h7.l(byteBuffer);
        int i2 = byteBuffer.get();
        if (i2 < 0) {
            i2 += 256;
        }
        this.modeChangePeriod = i2;
        int i3 = byteBuffer.get();
        if (i3 < 0) {
            i3 += 256;
        }
        this.framesPerSample = i3;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, byteBuffer));
        byteBuffer.put(ne.b(this.vendor));
        byteBuffer.put((byte) (this.decoderVersion & BitmapRenderer.ALPHA_VISIBLE));
        pe.e(byteBuffer, this.modeSet);
        byteBuffer.put((byte) (this.modeChangePeriod & BitmapRenderer.ALPHA_VISIBLE));
        byteBuffer.put((byte) (this.framesPerSample & BitmapRenderer.ALPHA_VISIBLE));
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 9;
    }

    public int getDecoderVersion() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.decoderVersion;
    }

    public int getFramesPerSample() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.framesPerSample;
    }

    public int getModeChangePeriod() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        return this.modeChangePeriod;
    }

    public int getModeSet() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.modeSet;
    }

    public String getVendor() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.vendor;
    }

    public String toString() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return "AmrSpecificBox[vendor=" + getVendor() + ";decoderVersion=" + getDecoderVersion() + ";modeSet=" + getModeSet() + ";modeChangePeriod=" + getModeChangePeriod() + ";framesPerSample=" + getFramesPerSample() + "]";
    }
}
