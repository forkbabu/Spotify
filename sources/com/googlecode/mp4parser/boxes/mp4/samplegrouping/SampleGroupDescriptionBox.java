package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.comscore.streaming.ContentType;
import com.googlecode.mp4parser.AbstractFullBox;
import com.mp4parser.iso14496.part15.c;
import com.mp4parser.iso14496.part15.d;
import com.mp4parser.iso14496.part15.e;
import com.mp4parser.iso14496.part15.f;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class SampleGroupDescriptionBox extends AbstractFullBox {
    public static final String TYPE = "sgpd";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private int defaultLength;
    private List<b> groupEntries = new LinkedList();
    private String groupingType;

    static {
        ajc$preClinit();
    }

    public SampleGroupDescriptionBox() {
        super(TYPE);
        setVersion(1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("SampleGroupDescriptionBox.java", SampleGroupDescriptionBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), 57);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.String", "groupingType", "", "void"), 61);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 153);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setDefaultLength", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "int", "defaultLength", "", "void"), 157);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.util.List"), 161);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setGroupEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.util.List", "groupEntries", "", "void"), 165);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "equals", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "java.lang.Object", "o", "", "boolean"), 170);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "hashCode", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "int"), 191);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "toString", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox", "", "", "", "java.lang.String"), ContentType.BUMPER);
    }

    private b parseGroupEntry(ByteBuffer byteBuffer, String str) {
        b bVar;
        if ("roll".equals(str)) {
            bVar = new d();
        } else if ("rash".equals(str)) {
            bVar = new c();
        } else if ("seig".equals(str)) {
            bVar = new a();
        } else if ("rap ".equals(str)) {
            bVar = new g();
        } else if ("tele".equals(str)) {
            bVar = new e();
        } else if ("sync".equals(str)) {
            bVar = new d();
        } else if ("tscl".equals(str)) {
            bVar = new e();
        } else if ("tsas".equals(str)) {
            bVar = new f();
        } else if ("stsa".equals(str)) {
            bVar = new c();
        } else {
            bVar = new f(str);
        }
        bVar.c(byteBuffer);
        return bVar;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.groupingType = h7.e(byteBuffer);
            if (getVersion() == 1) {
                this.defaultLength = rw.n(h7.n(byteBuffer));
            }
            long n = h7.n(byteBuffer);
            while (true) {
                long j = n - 1;
                if (n > 0) {
                    int i = this.defaultLength;
                    if (getVersion() == 1) {
                        if (this.defaultLength == 0) {
                            i = rw.n(h7.n(byteBuffer));
                        }
                        int position = byteBuffer.position() + i;
                        ByteBuffer slice = byteBuffer.slice();
                        slice.limit(i);
                        this.groupEntries.add(parseGroupEntry(slice, this.groupingType));
                        byteBuffer.position(position);
                        n = j;
                    } else {
                        throw new RuntimeException("This should be implemented");
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new RuntimeException("SampleGroupDescriptionBox are only supported in version 1");
        }
    }

    public boolean equals(Object obj) {
        com.googlecode.mp4parser.d.a().b(bpf.c(ajc$tjp_6, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SampleGroupDescriptionBox sampleGroupDescriptionBox = (SampleGroupDescriptionBox) obj;
        if (this.defaultLength != sampleGroupDescriptionBox.defaultLength) {
            return false;
        }
        List<b> list = this.groupEntries;
        List<b> list2 = sampleGroupDescriptionBox.groupEntries;
        return list == null ? list2 == null : list.equals(list2);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(ne.b(this.groupingType));
        if (getVersion() == 1) {
            byteBuffer.putInt((int) ((long) this.defaultLength));
        }
        byteBuffer.putInt((int) ((long) this.groupEntries.size()));
        for (b bVar : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                byteBuffer.putInt((int) ((long) bVar.a().limit()));
            }
            byteBuffer.put(bVar.a());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long j = (getVersion() == 1 ? 12 : 8) + 4;
        for (b bVar : this.groupEntries) {
            if (getVersion() == 1 && this.defaultLength == 0) {
                j += 4;
            }
            j += (long) bVar.d();
        }
        return j;
    }

    public int getDefaultLength() {
        com.googlecode.mp4parser.d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.defaultLength;
    }

    public List<b> getGroupEntries() {
        com.googlecode.mp4parser.d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.groupEntries;
    }

    public String getGroupingType() {
        com.googlecode.mp4parser.d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.groupingType;
    }

    public int hashCode() {
        com.googlecode.mp4parser.d.a().b(bpf.b(ajc$tjp_7, this, this));
        int i = 0;
        int i2 = (this.defaultLength + 0) * 31;
        List<b> list = this.groupEntries;
        if (list != null) {
            i = list.hashCode();
        }
        return i2 + i;
    }

    public void setDefaultLength(int i) {
        com.googlecode.mp4parser.d.a().b(bpf.c(ajc$tjp_3, this, this, new Integer(i)));
        this.defaultLength = i;
    }

    public void setGroupEntries(List<b> list) {
        com.googlecode.mp4parser.d.a().b(bpf.c(ajc$tjp_5, this, this, list));
        this.groupEntries = list;
    }

    public void setGroupingType(String str) {
        com.googlecode.mp4parser.d.a().b(bpf.c(ajc$tjp_1, this, this, str));
        this.groupingType = str;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_8, this, this), "SampleGroupDescriptionBox{groupingType='");
        je.A(c1, this.groupEntries.size() > 0 ? this.groupEntries.get(0).b() : "????", '\'', ", defaultLength=");
        c1.append(this.defaultLength);
        c1.append(", groupEntries=");
        c1.append(this.groupEntries);
        c1.append('}');
        return c1.toString();
    }
}
