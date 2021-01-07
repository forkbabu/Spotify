package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class PerformerBox extends AbstractFullBox {
    public static final String TYPE = "perf";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private String language;
    private String performer;

    static {
        ajc$preClinit();
    }

    public PerformerBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("PerformerBox.java", PerformerBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getLanguage", "com.coremedia.iso.boxes.PerformerBox", "", "", "", "java.lang.String"), 41);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getPerformer", "com.coremedia.iso.boxes.PerformerBox", "", "", "", "java.lang.String"), 45);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "setLanguage", "com.coremedia.iso.boxes.PerformerBox", "java.lang.String", "language", "", "void"), 49);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setPerformer", "com.coremedia.iso.boxes.PerformerBox", "java.lang.String", "performer", "", "void"), 53);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.PerformerBox", "", "", "", "java.lang.String"), 76);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = h7.i(byteBuffer);
        this.performer = h7.j(byteBuffer);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        pe.d(byteBuffer, this.language);
        byteBuffer.put(h7.b(this.performer));
        byteBuffer.put((byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) (h7.q(this.performer) + 6 + 1);
    }

    public String getLanguage() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.language;
    }

    public String getPerformer() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.performer;
    }

    public void setLanguage(String str) {
        d.a().b(bpf.c(ajc$tjp_2, this, this, str));
        this.language = str;
    }

    public void setPerformer(String str) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, str));
        this.performer = str;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_4, this, this), "PerformerBox[language=");
        c1.append(getLanguage());
        c1.append(";performer=");
        c1.append(getPerformer());
        c1.append("]");
        return c1.toString();
    }
}
