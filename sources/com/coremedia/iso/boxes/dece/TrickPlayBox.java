package com.coremedia.iso.boxes.dece;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class TrickPlayBox extends AbstractFullBox {
    public static final String TYPE = "trik";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private List<a> entries = new ArrayList();

    public static class a {
        private int a;

        public a() {
        }

        public String toString() {
            StringBuilder Z0 = je.Z0("Entry", "{picType=");
            Z0.append((this.a >> 6) & 3);
            Z0.append(",dependencyLevel=");
            return je.A0(Z0, this.a & 63, '}');
        }

        public a(int i) {
            this.a = i;
        }
    }

    static {
        ajc$preClinit();
    }

    public TrickPlayBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("TrickPlayBox.java", TrickPlayBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "setEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "java.util.List", "entries", "", "void"), 32);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getEntries", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.util.List"), 36);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.dece.TrickPlayBox", "", "", "", "java.lang.String"), 103);
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
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.entries;
    }

    public void setEntries(List<a> list) {
        d.a().b(bpf.c(ajc$tjp_0, this, this, list));
        this.entries = list;
    }

    public String toString() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return "TrickPlayBox{entries=" + this.entries + '}';
    }
}
