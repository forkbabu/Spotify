package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class EditListBox extends AbstractFullBox {
    public static final String TYPE = "elst";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private List<a> entries = new LinkedList();

    static {
        ajc$preClinit();
    }

    public EditListBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("EditListBox.java", EditListBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getEntries", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setEntries", "com.coremedia.iso.boxes.EditListBox", "java.util.List", "entries", "", "void"), 72);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.EditListBox", "", "", "", "java.lang.String"), 108);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int n = rw.n(h7.n(byteBuffer));
        this.entries = new LinkedList();
        for (int i = 0; i < n; i++) {
            this.entries.add(new a(this, byteBuffer));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt((int) ((long) this.entries.size()));
        for (a aVar : this.entries) {
            aVar.a(byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int i;
        if (getVersion() == 1) {
            i = this.entries.size() * 20;
        } else {
            i = this.entries.size() * 12;
        }
        return ((long) i) + 8;
    }

    public List<a> getEntries() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<a> list) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_2, this, this), "EditListBox{entries=");
        c1.append(this.entries);
        c1.append('}');
        return c1.toString();
    }

    public static class a {
        EditListBox a;
        private long b;
        private long c;
        private double d;

        public a(EditListBox editListBox, long j, long j2, double d2) {
            this.b = j;
            this.c = j2;
            this.d = d2;
            this.a = editListBox;
        }

        public void a(ByteBuffer byteBuffer) {
            if (this.a.getVersion() == 1) {
                byteBuffer.putLong(this.b);
                byteBuffer.putLong(this.c);
            } else {
                byteBuffer.putInt((int) ((long) rw.n(this.b)));
                byteBuffer.putInt(rw.n(this.c));
            }
            pe.b(byteBuffer, this.d);
        }

        public double b() {
            return this.d;
        }

        public long c() {
            return this.c;
        }

        public long d() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && this.b == aVar.b;
        }

        public int hashCode() {
            long j = this.b;
            long j2 = this.c;
            return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "Entry{segmentDuration=" + this.b + ", mediaTime=" + this.c + ", mediaRate=" + this.d + '}';
        }

        public a(EditListBox editListBox, ByteBuffer byteBuffer) {
            if (editListBox.getVersion() == 1) {
                this.b = h7.p(byteBuffer);
                this.c = byteBuffer.getLong();
                this.d = h7.g(byteBuffer);
            } else {
                this.b = h7.n(byteBuffer);
                this.c = (long) byteBuffer.getInt();
                this.d = h7.g(byteBuffer);
            }
            this.a = editListBox;
        }
    }
}
