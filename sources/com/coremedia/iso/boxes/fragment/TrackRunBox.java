package com.coremedia.iso.boxes.fragment;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.spotify.core.http.HttpConnection;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class TrackRunBox extends AbstractFullBox {
    public static final String TYPE = "trun";
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
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    private int dataOffset;
    private List<a> entries = new ArrayList();
    private a firstSampleFlags;

    public static class a {
        private long a;
        private long b;
        private a c;
        private long d;

        public long i() {
            return this.d;
        }

        public long j() {
            return this.a;
        }

        public a k() {
            return this.c;
        }

        public long l() {
            return this.b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Entry{duration=");
            sb.append(this.a);
            sb.append(", size=");
            sb.append(this.b);
            sb.append(", dlags=");
            sb.append(this.c);
            sb.append(", compTimeOffset=");
            return je.D0(sb, this.d, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackRunBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("TrackRunBox.java", TrackRunBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.util.List"), 57);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "int", "dataOffset", "", "void"), 120);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "setDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 267);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 275);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "setSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 283);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "setSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 292);
        ajc$tjp_14 = bpf.g("method-execution", bpf.f("1", "setSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "boolean", "v", "", "void"), 300);
        ajc$tjp_15 = bpf.g("method-execution", bpf.f("1", "getDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "int"), HttpConnection.kErrorHttpFail);
        ajc$tjp_16 = bpf.g("method-execution", bpf.f("1", "getFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 313);
        ajc$tjp_17 = bpf.g("method-execution", bpf.f("1", "setFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "firstSampleFlags", "", "void"), 317);
        ajc$tjp_18 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.lang.String"), 327);
        ajc$tjp_19 = bpf.g("method-execution", bpf.f("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "java.util.List", "entries", "", "void"), 342);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getSampleCompositionTimeOffsets", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "[J"), 129);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getSampleCount", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Constants.LONG), 238);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "isDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 242);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "isFirstSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 246);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "isSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 251);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "isSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), BitmapRenderer.ALPHA_VISIBLE);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "isSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 259);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "isSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "boolean"), 263);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long n = h7.n(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.dataOffset = rw.n(h7.n(byteBuffer));
        } else {
            this.dataOffset = -1;
        }
        if ((getFlags() & 4) == 4) {
            this.firstSampleFlags = new a(byteBuffer);
        }
        for (int i = 0; ((long) i) < n; i++) {
            a aVar = new a();
            if ((getFlags() & 256) == 256) {
                aVar.a = h7.n(byteBuffer);
            }
            if ((getFlags() & 512) == 512) {
                aVar.b = h7.n(byteBuffer);
            }
            if ((getFlags() & 1024) == 1024) {
                aVar.c = new a(byteBuffer);
            }
            if ((getFlags() & 2048) == 2048) {
                aVar.d = (long) byteBuffer.getInt();
            }
            this.entries.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) ((long) this.entries.size()));
        int flags = getFlags();
        if ((flags & 1) == 1) {
            byteBuffer.putInt((int) ((long) this.dataOffset));
        }
        if ((flags & 4) == 4) {
            this.firstSampleFlags.a(byteBuffer);
        }
        for (a aVar : this.entries) {
            if ((flags & 256) == 256) {
                byteBuffer.putInt((int) aVar.a);
            }
            if ((flags & 512) == 512) {
                byteBuffer.putInt((int) aVar.b);
            }
            if ((flags & 1024) == 1024) {
                aVar.c.a(byteBuffer);
            }
            if ((flags & 2048) == 2048) {
                if (getVersion() == 0) {
                    byteBuffer.putInt((int) aVar.d);
                } else {
                    byteBuffer.putInt((int) aVar.d);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int flags = getFlags();
        long j = (flags & 1) == 1 ? 12 : 8;
        if ((flags & 4) == 4) {
            j += 4;
        }
        long j2 = 0;
        if ((flags & 256) == 256) {
            j2 = 4;
        }
        if ((flags & 512) == 512) {
            j2 += 4;
        }
        if ((flags & 1024) == 1024) {
            j2 += 4;
        }
        if ((flags & 2048) == 2048) {
            j2 += 4;
        }
        return (j2 * ((long) this.entries.size())) + j;
    }

    public int getDataOffset() {
        d.a().b(bpf.b(ajc$tjp_15, this, this));
        return this.dataOffset;
    }

    public List<a> getEntries() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.entries;
    }

    public a getFirstSampleFlags() {
        d.a().b(bpf.b(ajc$tjp_16, this, this));
        return this.firstSampleFlags;
    }

    public long[] getSampleCompositionTimeOffsets() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        if (!isSampleCompositionTimeOffsetPresent()) {
            return null;
        }
        int size = this.entries.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = this.entries.get(i).i();
        }
        return jArr;
    }

    public long getSampleCount() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        return (long) this.entries.size();
    }

    public boolean isDataOffsetPresent() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return (getFlags() & 1) == 1;
    }

    public boolean isFirstSampleFlagsPresent() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        return (getFlags() & 4) == 4;
    }

    public boolean isSampleCompositionTimeOffsetPresent() {
        d.a().b(bpf.b(ajc$tjp_9, this, this));
        return (getFlags() & 2048) == 2048;
    }

    public boolean isSampleDurationPresent() {
        d.a().b(bpf.b(ajc$tjp_7, this, this));
        return (getFlags() & 256) == 256;
    }

    public boolean isSampleFlagsPresent() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return (getFlags() & 1024) == 1024;
    }

    public boolean isSampleSizePresent() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return (getFlags() & 512) == 512;
    }

    public void setDataOffset(int i) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Integer(i)));
        if (i == -1) {
            setFlags(getFlags() & 16777214);
        } else {
            setFlags(getFlags() | 1);
        }
        this.dataOffset = i;
    }

    public void setDataOffsetPresent(boolean z) {
        d.a().b(bpf.c(ajc$tjp_10, this, this, new Boolean(z)));
        if (z) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & 16777214);
        }
    }

    public void setEntries(List<a> list) {
        d.a().b(bpf.c(ajc$tjp_19, this, this, list));
        this.entries = list;
    }

    public void setFirstSampleFlags(a aVar) {
        d.a().b(bpf.c(ajc$tjp_17, this, this, aVar));
        if (aVar == null) {
            setFlags(getFlags() & 16777211);
        } else {
            setFlags(getFlags() | 4);
        }
        this.firstSampleFlags = aVar;
    }

    public void setSampleCompositionTimeOffsetPresent(boolean z) {
        d.a().b(bpf.c(ajc$tjp_14, this, this, new Boolean(z)));
        if (z) {
            setFlags(getFlags() | 2048);
        } else {
            setFlags(getFlags() & 16775167);
        }
    }

    public void setSampleDurationPresent(boolean z) {
        d.a().b(bpf.c(ajc$tjp_12, this, this, new Boolean(z)));
        if (z) {
            setFlags(getFlags() | 256);
        } else {
            setFlags(getFlags() & 16776959);
        }
    }

    public void setSampleFlagsPresent(boolean z) {
        d.a().b(bpf.c(ajc$tjp_13, this, this, new Boolean(z)));
        if (z) {
            setFlags(getFlags() | 1024);
        } else {
            setFlags(getFlags() & 16776191);
        }
    }

    public void setSampleSizePresent(boolean z) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, new Boolean(z)));
        if (z) {
            setFlags(getFlags() | 512);
        } else {
            setFlags(getFlags() & 16776703);
        }
    }

    public String toString() {
        d.a().b(bpf.b(ajc$tjp_18, this, this));
        return "TrackRunBox{sampleCount=" + this.entries.size() + ", dataOffset=" + this.dataOffset + ", dataOffsetPresent=" + isDataOffsetPresent() + ", sampleSizePresent=" + isSampleSizePresent() + ", sampleDurationPresent=" + isSampleDurationPresent() + ", sampleFlagsPresentPresent=" + isSampleFlagsPresent() + ", sampleCompositionTimeOffsetPresent=" + isSampleCompositionTimeOffsetPresent() + ", firstSampleFlags=" + this.firstSampleFlags + '}';
    }
}
