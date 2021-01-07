package com.googlecode.mp4parser.boxes.threegpp26245;

import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.mp4parser.aspectj.lang.a;

public class FontTableBox extends AbstractBox {
    public static final String TYPE = "ftab";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    List<a> entries = new LinkedList();

    public static class a {
        int a;
        String b;

        public String toString() {
            return "FontRecord{fontId=" + this.a + ", fontname='" + this.b + "'}";
        }
    }

    static {
        ajc$preClinit();
    }

    public FontTableBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("FontTableBox.java", FontTableBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "", "", "", "java.util.List"), 52);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "java.util.List", "entries", "", "void"), 56);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        int l = h7.l(byteBuffer);
        for (int i = 0; i < l; i++) {
            a aVar = new a();
            aVar.a = h7.l(byteBuffer);
            int i2 = byteBuffer.get();
            if (i2 < 0) {
                i2 += 256;
            }
            aVar.b = h7.k(byteBuffer, i2);
            this.entries.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        pe.e(byteBuffer, this.entries.size());
        for (a aVar : this.entries) {
            pe.e(byteBuffer, aVar.a);
            byteBuffer.put((byte) (aVar.b.length() & BitmapRenderer.ALPHA_VISIBLE));
            byteBuffer.put(h7.b(aVar.b));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int i = 2;
        for (a aVar : this.entries) {
            i += h7.q(aVar.b) + 3;
        }
        return (long) i;
    }

    public List<a> getEntries() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<a> list) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, list));
        this.entries = list;
    }
}
