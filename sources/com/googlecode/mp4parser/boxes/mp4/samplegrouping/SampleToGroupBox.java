package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class SampleToGroupBox extends AbstractFullBox {
    public static final String TYPE = "sbgp";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    List<a> entries = new LinkedList();
    private String groupingType;
    private String groupingTypeParameter;

    public static class a {
        private long a;
        private int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }

        public int a() {
            return this.b;
        }

        public long b() {
            return this.a;
        }

        public void c(long j) {
            this.a = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.a == aVar.a;
        }

        public int hashCode() {
            long j = this.a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Entry{sampleCount=");
            sb.append(this.a);
            sb.append(", groupDescriptionIndex=");
            return je.A0(sb, this.b, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleToGroupBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("SampleToGroupBox.java", SampleToGroupBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingType", "", "void"), 154);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 158);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingTypeParameter", "", "void"), 162);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.util.List"), 166);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.util.List", "entries", "", "void"), 170);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.groupingType = h7.e(byteBuffer);
        if (getVersion() == 1) {
            this.groupingTypeParameter = h7.e(byteBuffer);
        }
        long n = h7.n(byteBuffer);
        while (true) {
            long j = n - 1;
            if (n > 0) {
                this.entries.add(new a((long) rw.n(h7.n(byteBuffer)), rw.n(h7.n(byteBuffer))));
                n = j;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.groupingType.getBytes());
        if (getVersion() == 1) {
            byteBuffer.put(this.groupingTypeParameter.getBytes());
        }
        byteBuffer.putInt((int) ((long) this.entries.size()));
        for (a aVar : this.entries) {
            byteBuffer.putInt((int) aVar.b());
            byteBuffer.putInt((int) ((long) aVar.a()));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) (getVersion() == 1 ? (this.entries.size() * 8) + 16 : (this.entries.size() * 8) + 12);
    }

    public List<a> getEntries() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.entries;
    }

    public String getGroupingType() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.groupingType;
    }

    public String getGroupingTypeParameter() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.groupingTypeParameter;
    }

    public void setEntries(List<a> list) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, list));
        this.entries = list;
    }

    public void setGroupingType(String str) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, str));
        this.groupingType = str;
    }

    public void setGroupingTypeParameter(String str) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, str));
        this.groupingTypeParameter = str;
    }
}
