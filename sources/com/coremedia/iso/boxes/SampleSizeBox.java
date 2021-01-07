package com.coremedia.iso.boxes;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class SampleSizeBox extends AbstractFullBox {
    public static final String TYPE = "stsz";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    int sampleCount;
    private long sampleSize;
    private long[] sampleSizes = new long[0];

    static {
        ajc$preClinit();
    }

    public SampleSizeBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("SampleSizeBox.java", SampleSizeBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", Constants.LONG), 50);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", Constants.LONG, "sampleSize", "", "void"), 54);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", "int", "index", "", Constants.LONG), 59);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", Constants.LONG), 67);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"), 76);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", "void"), 80);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"), 119);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.sampleSize = h7.n(byteBuffer);
        int n = rw.n(h7.n(byteBuffer));
        this.sampleCount = n;
        if (this.sampleSize == 0) {
            this.sampleSizes = new long[n];
            for (int i = 0; i < this.sampleCount; i++) {
                this.sampleSizes[i] = h7.n(byteBuffer);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) this.sampleSize);
        if (this.sampleSize == 0) {
            byteBuffer.putInt((int) ((long) this.sampleSizes.length));
            for (long j : this.sampleSizes) {
                byteBuffer.putInt((int) j);
            }
            return;
        }
        byteBuffer.putInt((int) ((long) this.sampleCount));
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) ((this.sampleSize == 0 ? this.sampleSizes.length * 4 : 0) + 12);
    }

    public long getSampleCount() {
        int length;
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        if (this.sampleSize > 0) {
            length = this.sampleCount;
        } else {
            length = this.sampleSizes.length;
        }
        return (long) length;
    }

    public long getSampleSize() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.sampleSize;
    }

    public long getSampleSizeAtIndex(int i) {
        d.a().b(bpf.c(ajc$tjp_2, this, this, new Integer(i)));
        long j = this.sampleSize;
        if (j > 0) {
            return j;
        }
        return this.sampleSizes[i];
    }

    public long[] getSampleSizes() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.sampleSizes;
    }

    public void setSampleSize(long j) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Long(j)));
        this.sampleSize = j;
    }

    public void setSampleSizes(long[] jArr) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, jArr));
        this.sampleSizes = jArr;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_6, this, this), "SampleSizeBox[sampleSize=");
        c1.append(getSampleSize());
        c1.append(";sampleCount=");
        c1.append(getSampleCount());
        c1.append("]");
        return c1.toString();
    }
}
