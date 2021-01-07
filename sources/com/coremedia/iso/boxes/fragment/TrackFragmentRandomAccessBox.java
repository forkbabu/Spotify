package com.coremedia.iso.boxes.fragment;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class TrackFragmentRandomAccessBox extends AbstractFullBox {
    public static final String TYPE = "tfra";
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
    private List<a> entries = Collections.emptyList();
    private int lengthSizeOfSampleNum = 2;
    private int lengthSizeOfTrafNum = 2;
    private int lengthSizeOfTrunNum = 2;
    private int reserved;
    private long trackId;

    public static class a {
        private long a;
        private long b;
        private long c;
        private long d;
        private long e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.e == aVar.e && this.a == aVar.a && this.c == aVar.c && this.d == aVar.d;
        }

        public int hashCode() {
            long j = this.a;
            long j2 = this.b;
            long j3 = this.c;
            long j4 = this.d;
            long j5 = this.e;
            return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Entry{time=");
            sb.append(this.a);
            sb.append(", moofOffset=");
            sb.append(this.b);
            sb.append(", trafNumber=");
            sb.append(this.c);
            sb.append(", trunNumber=");
            sb.append(this.d);
            sb.append(", sampleNumber=");
            return je.D0(sb, this.e, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackFragmentRandomAccessBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("TrackFragmentRandomAccessBox.java", TrackFragmentRandomAccessBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", Constants.LONG, "trackId", "", "void"), 145);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrafNum", "", "void"), 149);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.util.List"), 185);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "java.util.List", "entries", "", "void"), 189);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.lang.String"), 290);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "setLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfTrunNum", "", "void"), 153);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "int", "lengthSizeOfSampleNum", "", "void"), 157);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", Constants.LONG), 161);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getReserved", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 165);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 169);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "getLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 173);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "int"), 177);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "getNumberOfEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", Constants.LONG), 181);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = h7.n(byteBuffer);
        long n = h7.n(byteBuffer);
        this.reserved = (int) (n >> 6);
        this.lengthSizeOfTrafNum = (((int) (63 & n)) >> 4) + 1;
        this.lengthSizeOfTrunNum = (((int) (12 & n)) >> 2) + 1;
        this.lengthSizeOfSampleNum = ((int) (n & 3)) + 1;
        long n2 = h7.n(byteBuffer);
        this.entries = new ArrayList();
        for (int i = 0; ((long) i) < n2; i++) {
            a aVar = new a();
            if (getVersion() == 1) {
                aVar.a = h7.p(byteBuffer);
                aVar.b = h7.p(byteBuffer);
            } else {
                aVar.a = h7.n(byteBuffer);
                aVar.b = h7.n(byteBuffer);
            }
            aVar.c = oe.a(byteBuffer, this.lengthSizeOfTrafNum);
            aVar.d = oe.a(byteBuffer, this.lengthSizeOfTrunNum);
            aVar.e = oe.a(byteBuffer, this.lengthSizeOfSampleNum);
            this.entries.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) this.trackId);
        byteBuffer.putInt((int) (((long) (this.reserved << 6)) | ((long) (((this.lengthSizeOfTrafNum - 1) & 3) << 4)) | ((long) (((this.lengthSizeOfTrunNum - 1) & 3) << 2)) | ((long) ((this.lengthSizeOfSampleNum - 1) & 3))));
        byteBuffer.putInt((int) ((long) this.entries.size()));
        for (a aVar : this.entries) {
            if (getVersion() == 1) {
                byteBuffer.putLong(aVar.a);
                byteBuffer.putLong(aVar.b);
            } else {
                byteBuffer.putInt((int) aVar.a);
                byteBuffer.putInt((int) aVar.b);
            }
            h7.r(aVar.c, byteBuffer, this.lengthSizeOfTrafNum);
            h7.r(aVar.d, byteBuffer, this.lengthSizeOfTrunNum);
            h7.r(aVar.e, byteBuffer, this.lengthSizeOfSampleNum);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int i;
        if (getVersion() == 1) {
            i = this.entries.size() * 16;
        } else {
            i = this.entries.size() * 8;
        }
        return 16 + ((long) i) + ((long) (this.entries.size() * this.lengthSizeOfTrafNum)) + ((long) (this.entries.size() * this.lengthSizeOfTrunNum)) + ((long) (this.entries.size() * this.lengthSizeOfSampleNum));
    }

    public List<a> getEntries() {
        d.a().b(bpf.b(ajc$tjp_10, this, this));
        return Collections.unmodifiableList(this.entries);
    }

    public int getLengthSizeOfSampleNum() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.lengthSizeOfSampleNum;
    }

    public int getLengthSizeOfTrafNum() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.lengthSizeOfTrafNum;
    }

    public int getLengthSizeOfTrunNum() {
        d.a().b(bpf.b(ajc$tjp_7, this, this));
        return this.lengthSizeOfTrunNum;
    }

    public long getNumberOfEntries() {
        d.a().b(bpf.b(ajc$tjp_9, this, this));
        return (long) this.entries.size();
    }

    public int getReserved() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        return this.reserved;
    }

    public long getTrackId() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.trackId;
    }

    public void setEntries(List<a> list) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, list));
        this.entries = list;
    }

    public void setLengthSizeOfSampleNum(int i) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, new Integer(i)));
        this.lengthSizeOfSampleNum = i;
    }

    public void setLengthSizeOfTrafNum(int i) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, new Integer(i)));
        this.lengthSizeOfTrafNum = i;
    }

    public void setLengthSizeOfTrunNum(int i) {
        d.a().b(bpf.c(ajc$tjp_2, this, this, new Integer(i)));
        this.lengthSizeOfTrunNum = i;
    }

    public void setTrackId(long j) {
        d.a().b(bpf.c(ajc$tjp_0, this, this, new Long(j)));
        this.trackId = j;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_12, this, this), "TrackFragmentRandomAccessBox{trackId=");
        c1.append(this.trackId);
        c1.append(", entries=");
        c1.append(this.entries);
        c1.append('}');
        return c1.toString();
    }
}
