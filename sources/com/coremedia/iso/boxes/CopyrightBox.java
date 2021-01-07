package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class CopyrightBox extends AbstractFullBox {
    public static final String TYPE = "cprt";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private String copyright;
    private String language;

    static {
        ajc$preClinit();
    }

    public CopyrightBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("CopyrightBox.java", CopyrightBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getLanguage", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 46);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getCopyright", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 50);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "setLanguage", "com.coremedia.iso.boxes.CopyrightBox", "java.lang.String", "language", "", "void"), 54);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setCopyright", "com.coremedia.iso.boxes.CopyrightBox", "java.lang.String", "copyright", "", "void"), 58);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.CopyrightBox", "", "", "", "java.lang.String"), 81);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = h7.i(byteBuffer);
        this.copyright = h7.j(byteBuffer);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        pe.d(byteBuffer, this.language);
        byteBuffer.put(h7.b(this.copyright));
        byteBuffer.put((byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) (h7.q(this.copyright) + 7);
    }

    public String getCopyright() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.copyright;
    }

    public String getLanguage() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.language;
    }

    public void setCopyright(String str) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, str));
        this.copyright = str;
    }

    public void setLanguage(String str) {
        d.a().b(bpf.c(ajc$tjp_2, this, this, str));
        this.language = str;
    }

    public String toString() {
        StringBuilder c1 = je.c1(bpf.b(ajc$tjp_4, this, this), "CopyrightBox[language=");
        c1.append(getLanguage());
        c1.append(";copyright=");
        c1.append(getCopyright());
        c1.append("]");
        return c1.toString();
    }
}
