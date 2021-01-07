package com.googlecode.mp4parser.boxes.threegpp26244;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class SegmentIndexBox extends AbstractFullBox {
    public static final String TYPE = "sidx";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_11 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_12 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    long earliestPresentationTime;
    List<a> entries = new ArrayList();
    long firstOffset;
    long referenceId;
    int reserved;
    long timeScale;

    public static class a {
        byte a;
        int b;
        long c;
        byte d;
        byte e;
        int f;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.f == aVar.f && this.e == aVar.e && this.d == aVar.d && this.c == aVar.c;
        }

        public int hashCode() {
            long j = this.c;
            return (((((((((this.a * 31) + this.b) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.d) * 31) + this.e) * 31) + this.f;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Entry{referenceType=");
            sb.append((int) this.a);
            sb.append(", referencedSize=");
            sb.append(this.b);
            sb.append(", subsegmentDuration=");
            sb.append(this.c);
            sb.append(", startsWithSap=");
            sb.append((int) this.d);
            sb.append(", sapType=");
            sb.append((int) this.e);
            sb.append(", sapDeltaTime=");
            return je.A0(sb, this.f, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public SegmentIndexBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("SegmentIndexBox.java", SegmentIndexBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.util.List"), 128);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "java.util.List", "entries", "", "void"), 132);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "getReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "int"), 168);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "int", "reserved", "", "void"), 172);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "toString", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.lang.String"), 298);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", Constants.LONG), 136);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", Constants.LONG, "referenceId", "", "void"), 140);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", Constants.LONG), 144);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", Constants.LONG, "timeScale", "", "void"), 148);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", Constants.LONG), 152);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", Constants.LONG, "earliestPresentationTime", "", "void"), 156);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", Constants.LONG), 160);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", Constants.LONG, "firstOffset", "", "void"), 164);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.referenceId = h7.n(byteBuffer);
        this.timeScale = h7.n(byteBuffer);
        if (getVersion() == 0) {
            this.earliestPresentationTime = h7.n(byteBuffer);
            this.firstOffset = h7.n(byteBuffer);
        } else {
            this.earliestPresentationTime = h7.p(byteBuffer);
            this.firstOffset = h7.p(byteBuffer);
        }
        this.reserved = h7.l(byteBuffer);
        int l = h7.l(byteBuffer);
        for (int i = 0; i < l; i++) {
            h40 h40 = new h40(byteBuffer);
            a aVar = new a();
            aVar.a = (byte) h40.a(1);
            aVar.b = h40.a(31);
            aVar.c = h7.n(byteBuffer);
            h40 h402 = new h40(byteBuffer);
            aVar.d = (byte) h402.a(1);
            aVar.e = (byte) h402.a(3);
            aVar.f = h402.a(28);
            this.entries.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) this.referenceId);
        byteBuffer.putInt((int) this.timeScale);
        if (getVersion() == 0) {
            byteBuffer.putInt((int) this.earliestPresentationTime);
            byteBuffer.putInt((int) this.firstOffset);
        } else {
            byteBuffer.putLong(this.earliestPresentationTime);
            byteBuffer.putLong(this.firstOffset);
        }
        pe.e(byteBuffer, this.reserved);
        pe.e(byteBuffer, this.entries.size());
        for (a aVar : this.entries) {
            i40 i40 = new i40(byteBuffer);
            i40.a(aVar.a, 1);
            i40.a(aVar.b, 31);
            byteBuffer.putInt((int) aVar.c);
            i40 i402 = new i40(byteBuffer);
            i402.a(aVar.d, 1);
            i402.a(aVar.e, 3);
            i402.a(aVar.f, 28);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 12 + ((long) (getVersion() == 0 ? 8 : 16)) + 2 + 2 + ((long) (this.entries.size() * 12));
    }

    public long getEarliestPresentationTime() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.earliestPresentationTime;
    }

    public List<a> getEntries() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.entries;
    }

    public long getFirstOffset() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.firstOffset;
    }

    public long getReferenceId() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.referenceId;
    }

    public int getReserved() {
        d.a().b(bpf.b(ajc$tjp_10, this, this));
        return this.reserved;
    }

    public long getTimeScale() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.timeScale;
    }

    public void setEarliestPresentationTime(long j) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Long(j)));
        this.earliestPresentationTime = j;
    }

    public void setEntries(List<a> list) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public void setFirstOffset(long j) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, new Long(j)));
        this.firstOffset = j;
    }

    public void setReferenceId(long j) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, new Long(j)));
        this.referenceId = j;
    }

    public void setReserved(int i) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, new Integer(i)));
        this.reserved = i;
    }

    public void setTimeScale(long j) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, new Long(j)));
        this.timeScale = j;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_12, this, this), "SegmentIndexBox{entries=");
        c1.append(this.entries);
        c1.append(", referenceId=");
        c1.append(this.referenceId);
        c1.append(", timeScale=");
        c1.append(this.timeScale);
        c1.append(", earliestPresentationTime=");
        c1.append(this.earliestPresentationTime);
        c1.append(", firstOffset=");
        c1.append(this.firstOffset);
        c1.append(", reserved=");
        return je.A0(c1, this.reserved, '}');
    }
}
