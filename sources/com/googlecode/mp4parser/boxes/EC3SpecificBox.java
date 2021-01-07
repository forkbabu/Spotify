package com.googlecode.mp4parser.boxes;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class EC3SpecificBox extends AbstractBox {
    public static final String TYPE = "dec3";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    int dataRate;
    List<a> entries = new LinkedList();
    int numIndSub;

    public static class a {
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        public String toString() {
            StringBuilder sb = new StringBuilder("Entry{fscod=");
            sb.append(this.a);
            sb.append(", bsid=");
            sb.append(this.b);
            sb.append(", bsmod=");
            sb.append(this.c);
            sb.append(", acmod=");
            sb.append(this.d);
            sb.append(", lfeon=");
            sb.append(this.e);
            sb.append(", reserved=");
            sb.append(this.f);
            sb.append(", num_dep_sub=");
            sb.append(this.g);
            sb.append(", chan_loc=");
            sb.append(this.h);
            sb.append(", reserved2=");
            return je.A0(sb, this.i, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public EC3SpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("EC3SpecificBox.java", EC3SpecificBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getContentSize", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", Constants.LONG), 25);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getContent", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 65);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "java.util.List"), 86);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setEntries", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "java.util.List", "entries", "", "void"), 90);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "addEntry", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "com.googlecode.mp4parser.boxes.EC3SpecificBox$Entry", "entry", "", "void"), 94);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "int"), 98);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "setDataRate", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "int", "dataRate", "", "void"), 102);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "getNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "", "", "", "int"), 106);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "setNumIndSub", "com.googlecode.mp4parser.boxes.EC3SpecificBox", "int", "numIndSub", "", "void"), 110);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        h40 h40 = new h40(byteBuffer);
        this.dataRate = h40.a(13);
        this.numIndSub = h40.a(3) + 1;
        for (int i = 0; i < this.numIndSub; i++) {
            a aVar = new a();
            aVar.a = h40.a(2);
            aVar.b = h40.a(5);
            aVar.c = h40.a(5);
            aVar.d = h40.a(3);
            aVar.e = h40.a(1);
            aVar.f = h40.a(3);
            int a2 = h40.a(4);
            aVar.g = a2;
            if (a2 > 0) {
                aVar.h = h40.a(9);
            } else {
                aVar.i = h40.a(1);
            }
            this.entries.add(aVar);
        }
    }

    public void addEntry(a aVar) {
        d.a().b(bpf.c(ajc$tjp_4, this, this, aVar));
        this.entries.add(aVar);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, byteBuffer));
        i40 i40 = new i40(byteBuffer);
        i40.a(this.dataRate, 13);
        i40.a(this.entries.size() - 1, 3);
        for (a aVar : this.entries) {
            i40.a(aVar.a, 2);
            i40.a(aVar.b, 5);
            i40.a(aVar.c, 5);
            i40.a(aVar.d, 3);
            i40.a(aVar.e, 1);
            i40.a(aVar.f, 3);
            i40.a(aVar.g, 4);
            if (aVar.g > 0) {
                i40.a(aVar.h, 9);
            } else {
                i40.a(aVar.i, 1);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        long j = 2;
        for (a aVar : this.entries) {
            j += aVar.g > 0 ? 4 : 3;
        }
        return j;
    }

    public int getDataRate() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        return this.dataRate;
    }

    public List<a> getEntries() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.entries;
    }

    public int getNumIndSub() {
        d.a().b(bpf.b(ajc$tjp_7, this, this));
        return this.numIndSub;
    }

    public void setDataRate(int i) {
        d.a().b(bpf.c(ajc$tjp_6, this, this, new Integer(i)));
        this.dataRate = i;
    }

    public void setEntries(List<a> list) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, list));
        this.entries = list;
    }

    public void setNumIndSub(int i) {
        d.a().b(bpf.c(ajc$tjp_8, this, this, new Integer(i)));
        this.numIndSub = i;
    }
}
