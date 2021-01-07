package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class SampleDependencyTypeBox extends AbstractFullBox {
    public static final String TYPE = "sdtp";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private List<a> entries = new ArrayList();

    public static class a {
        private int a;

        public a(int i) {
            this.a = i;
        }

        public int b() {
            return (this.a >> 4) & 3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && a.class == obj.getClass() && this.a == ((a) obj).a;
        }

        public int hashCode() {
            return this.a;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Entry{isLeading=");
            sb.append((this.a >> 6) & 3);
            sb.append(", sampleDependsOn=");
            sb.append((this.a >> 4) & 3);
            sb.append(", sampleIsDependentOn=");
            sb.append((this.a >> 2) & 3);
            sb.append(", sampleHasRedundancy=");
            return je.A0(sb, this.a & 3, '}');
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleDependencyTypeBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("SampleDependencyTypeBox.java", SampleDependencyTypeBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.util.List"), 139);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "java.util.List", "entries", "", "void"), 143);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.lang.String"), 148);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            List<a> list = this.entries;
            int i = byteBuffer.get();
            if (i < 0) {
                i += 256;
            }
            list.add(new a(i));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        for (a aVar : this.entries) {
            byteBuffer.put((byte) (aVar.a & BitmapRenderer.ALPHA_VISIBLE));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) (this.entries.size() + 4);
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
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return "SampleDependencyTypeBox{entries=" + this.entries + '}';
    }
}
