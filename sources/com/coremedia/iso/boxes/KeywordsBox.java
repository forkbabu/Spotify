package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class KeywordsBox extends AbstractFullBox {
    public static final String TYPE = "kywd";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private String[] keywords;
    private String language;

    static {
        ajc$preClinit();
    }

    public KeywordsBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("KeywordsBox.java", KeywordsBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getLanguage", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 40);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getKeywords", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "[Ljava.lang.String;"), 44);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "setLanguage", "com.coremedia.iso.boxes.KeywordsBox", "java.lang.String", "language", "", "void"), 48);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setKeywords", "com.coremedia.iso.boxes.KeywordsBox", "[Ljava.lang.String;", "keywords", "", "void"), 52);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.KeywordsBox", "", "", "", "java.lang.String"), 87);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.language = h7.i(byteBuffer);
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        this.keywords = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.get();
            this.keywords[i2] = h7.j(byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        pe.d(byteBuffer, this.language);
        byteBuffer.put((byte) (this.keywords.length & BitmapRenderer.ALPHA_VISIBLE));
        String[] strArr = this.keywords;
        for (String str : strArr) {
            byteBuffer.put((byte) ((h7.q(str) + 1) & BitmapRenderer.ALPHA_VISIBLE));
            byteBuffer.put(h7.b(str));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long j = 7;
        for (String str : this.keywords) {
            j += (long) (h7.q(str) + 1 + 1);
        }
        return j;
    }

    public String[] getKeywords() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.keywords;
    }

    public String getLanguage() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.language;
    }

    public void setKeywords(String[] strArr) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, strArr));
        this.keywords = strArr;
    }

    public void setLanguage(String str) {
        d.a().b(bpf.c(ajc$tjp_2, this, this, str));
        this.language = str;
    }

    public String toString() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("KeywordsBox[language=");
        stringBuffer.append(getLanguage());
        for (int i = 0; i < this.keywords.length; i++) {
            stringBuffer.append(";keyword");
            stringBuffer.append(i);
            stringBuffer.append("=");
            stringBuffer.append(this.keywords[i]);
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
