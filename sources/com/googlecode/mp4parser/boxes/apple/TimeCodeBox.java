package com.googlecode.mp4parser.boxes.apple;

import com.adjust.sdk.Constants;
import com.coremedia.iso.boxes.b;
import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.Collections;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class TimeCodeBox extends AbstractBox implements SampleEntry, b {
    public static final String TYPE = "tmcd";
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
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    int dataReferenceIndex;
    long flags;
    int frameDuration;
    int numberOfFrames;
    int reserved1;
    int reserved2;
    byte[] rest = new byte[0];
    int timeScale;

    static {
        ajc$preClinit();
    }

    public TimeCodeBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("TimeCodeBox.java", TimeCodeBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 88);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "dataReferenceIndex", "", "void"), 92);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "setReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved1", "", "void"), 137);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "getReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 141);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "setReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "reserved2", "", "void"), 145);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "getFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", Constants.LONG), 149);
        ajc$tjp_14 = bpf.g("method-execution", bpf.f("1", "setFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", Constants.LONG, "flags", "", "void"), 153);
        ajc$tjp_15 = bpf.g("method-execution", bpf.f("1", "getRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "[B"), 157);
        ajc$tjp_16 = bpf.g("method-execution", bpf.f("1", "setRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "[B", "rest", "", "void"), 161);
        ajc$tjp_17 = bpf.g("method-execution", bpf.f("1", "getBoxes", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.util.List"), 166);
        ajc$tjp_18 = bpf.g("method-execution", bpf.f("1", "setBoxes", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "java.util.List", "boxes", "", "void"), 170);
        ajc$tjp_19 = bpf.g("method-execution", bpf.f("1", "getBoxes", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "java.lang.Class", "clazz", "", "java.util.List"), 174);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "toString", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.lang.String"), 98);
        ajc$tjp_20 = bpf.g("method-execution", bpf.f("1", "getBoxes", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "java.lang.Class:boolean", "clazz:recursive", "", "java.util.List"), 178);
        ajc$tjp_21 = bpf.g("method-execution", bpf.f("1", "getByteBuffer", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "long:long", "start:size", "java.io.IOException", "java.nio.ByteBuffer"), 182);
        ajc$tjp_22 = bpf.g("method-execution", bpf.f("1", "writeContainer", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "java.nio.channels.WritableByteChannel", "bb", "java.io.IOException", "void"), 186);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 109);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "setTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "timeScale", "", "void"), 113);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 117);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "frameDuration", "", "void"), 121);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "getNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 125);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "setNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "int", "numberOfFrames", "", "void"), 129);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "getReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "int"), 133);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        byteBuffer.position(6);
        this.dataReferenceIndex = h7.l(byteBuffer);
        this.reserved1 = byteBuffer.getInt();
        this.flags = h7.n(byteBuffer);
        this.timeScale = byteBuffer.getInt();
        this.frameDuration = byteBuffer.getInt();
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.numberOfFrames = i;
        this.reserved2 = h7.m(byteBuffer);
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.rest = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry, com.coremedia.iso.boxes.b
    public <T extends com.coremedia.iso.boxes.a> List<T> getBoxes(Class<T> cls, boolean z) {
        d.a().b(bpf.d(ajc$tjp_20, this, this, cls, new Boolean(z)));
        return Collections.emptyList();
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry, com.coremedia.iso.boxes.b
    public ByteBuffer getByteBuffer(long j, long j2) {
        d.a().b(bpf.d(ajc$tjp_21, this, this, new Long(j), new Long(j2)));
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[6]);
        pe.e(byteBuffer, this.dataReferenceIndex);
        byteBuffer.putInt(this.reserved1);
        byteBuffer.putInt((int) this.flags);
        byteBuffer.putInt(this.timeScale);
        byteBuffer.putInt(this.frameDuration);
        byteBuffer.put((byte) (this.numberOfFrames & BitmapRenderer.ALPHA_VISIBLE));
        pe.f(byteBuffer, this.reserved2);
        byteBuffer.put(this.rest);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) (this.rest.length + 28);
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public int getDataReferenceIndex() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.dataReferenceIndex;
    }

    public long getFlags() {
        d.a().b(bpf.b(ajc$tjp_13, this, this));
        return this.flags;
    }

    public int getFrameDuration() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        return this.frameDuration;
    }

    public int getNumberOfFrames() {
        d.a().b(bpf.b(ajc$tjp_7, this, this));
        return this.numberOfFrames;
    }

    public int getReserved1() {
        d.a().b(bpf.b(ajc$tjp_9, this, this));
        return this.reserved1;
    }

    public int getReserved2() {
        d.a().b(bpf.b(ajc$tjp_11, this, this));
        return this.reserved2;
    }

    public byte[] getRest() {
        d.a().b(bpf.b(ajc$tjp_15, this, this));
        return this.rest;
    }

    public int getTimeScale() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        return this.timeScale;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public void setBoxes(List<com.coremedia.iso.boxes.a> list) {
        d.a().b(bpf.c(ajc$tjp_18, this, this, list));
        throw new RuntimeException("Time Code Box doesn't accept any children");
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public void setDataReferenceIndex(int i) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Integer(i)));
        this.dataReferenceIndex = i;
    }

    public void setFlags(long j) {
        d.a().b(bpf.c(ajc$tjp_14, this, this, new Long(j)));
        this.flags = j;
    }

    public void setFrameDuration(int i) {
        d.a().b(bpf.c(ajc$tjp_6, this, this, new Integer(i)));
        this.frameDuration = i;
    }

    public void setNumberOfFrames(int i) {
        d.a().b(bpf.c(ajc$tjp_8, this, this, new Integer(i)));
        this.numberOfFrames = i;
    }

    public void setReserved1(int i) {
        d.a().b(bpf.c(ajc$tjp_10, this, this, new Integer(i)));
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        d.a().b(bpf.c(ajc$tjp_12, this, this, new Integer(i)));
        this.reserved2 = i;
    }

    public void setRest(byte[] bArr) {
        d.a().b(bpf.c(ajc$tjp_16, this, this, bArr));
        this.rest = bArr;
    }

    public void setTimeScale(int i) {
        d.a().b(bpf.c(ajc$tjp_4, this, this, new Integer(i)));
        this.timeScale = i;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_2, this, this), "TimeCodeBox{timeScale=");
        c1.append(this.timeScale);
        c1.append(", frameDuration=");
        c1.append(this.frameDuration);
        c1.append(", numberOfFrames=");
        c1.append(this.numberOfFrames);
        c1.append(", reserved1=");
        c1.append(this.reserved1);
        c1.append(", reserved2=");
        c1.append(this.reserved2);
        c1.append(", flags=");
        return je.D0(c1, this.flags, '}');
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry, com.coremedia.iso.boxes.b
    public void writeContainer(WritableByteChannel writableByteChannel) {
        d.a().b(bpf.c(ajc$tjp_22, this, this, writableByteChannel));
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry, com.coremedia.iso.boxes.b
    public List<com.coremedia.iso.boxes.a> getBoxes() {
        d.a().b(bpf.b(ajc$tjp_17, this, this));
        return Collections.emptyList();
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry, com.coremedia.iso.boxes.b
    public <T extends com.coremedia.iso.boxes.a> List<T> getBoxes(Class<T> cls) {
        d.a().b(bpf.c(ajc$tjp_19, this, this, cls));
        return Collections.emptyList();
    }
}
