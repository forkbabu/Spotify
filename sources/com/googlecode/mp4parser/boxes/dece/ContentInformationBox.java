package com.googlecode.mp4parser.boxes.dece;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import org.mp4parser.aspectj.lang.a;

public class ContentInformationBox extends AbstractFullBox {
    public static final String TYPE = "cinf";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_11 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_12 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_13 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    Map<String, String> brandEntries = new LinkedHashMap();
    String codecs;
    Map<String, String> idEntries = new LinkedHashMap();
    String languages;
    String mimeSubtypeName;
    String profileLevelIdc;
    String protection;

    static {
        ajc$preClinit();
    }

    public ContentInformationBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("ContentInformationBox.java", ContentInformationBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 144);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "mimeSubtypeName", "", "void"), 148);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "getBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 184);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "brandEntries", "", "void"), 188);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "getIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 192);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "setIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "idEntries", "", "void"), 196);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 152);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "profileLevelIdc", "", "void"), 156);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 160);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "codecs", "", "void"), 164);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 168);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "protection", "", "void"), 172);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "getLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 176);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "languages", "", "void"), 180);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.mimeSubtypeName = h7.j(byteBuffer);
        this.profileLevelIdc = h7.j(byteBuffer);
        this.codecs = h7.j(byteBuffer);
        this.protection = h7.j(byteBuffer);
        this.languages = h7.j(byteBuffer);
        int i = byteBuffer.get();
        if (i < 0) {
            i += 256;
        }
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            this.brandEntries.put(h7.j(byteBuffer), h7.j(byteBuffer));
            i = i2;
        }
        int i3 = byteBuffer.get();
        if (i3 < 0) {
            i3 += 256;
        }
        while (true) {
            int i4 = i3 - 1;
            if (i3 > 0) {
                this.idEntries.put(h7.j(byteBuffer), h7.j(byteBuffer));
                i3 = i4;
            } else {
                return;
            }
        }
    }

    public Map<String, String> getBrandEntries() {
        d.a().b(bpf.b(ajc$tjp_10, this, this));
        return this.brandEntries;
    }

    public String getCodecs() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.codecs;
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        pe.j(byteBuffer, this.mimeSubtypeName);
        pe.j(byteBuffer, this.profileLevelIdc);
        pe.j(byteBuffer, this.codecs);
        pe.j(byteBuffer, this.protection);
        pe.j(byteBuffer, this.languages);
        byteBuffer.put((byte) (this.brandEntries.size() & BitmapRenderer.ALPHA_VISIBLE));
        for (Map.Entry<String, String> entry : this.brandEntries.entrySet()) {
            pe.j(byteBuffer, entry.getKey());
            pe.j(byteBuffer, entry.getValue());
        }
        byteBuffer.put((byte) (this.idEntries.size() & BitmapRenderer.ALPHA_VISIBLE));
        for (Map.Entry<String, String> entry2 : this.idEntries.entrySet()) {
            pe.j(byteBuffer, entry2.getKey());
            pe.j(byteBuffer, entry2.getValue());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long q = ((long) (h7.q(this.mimeSubtypeName) + 1)) + 4 + ((long) (h7.q(this.profileLevelIdc) + 1)) + ((long) (h7.q(this.codecs) + 1)) + ((long) (h7.q(this.protection) + 1)) + ((long) (h7.q(this.languages) + 1)) + 1;
        for (Map.Entry<String, String> entry : this.brandEntries.entrySet()) {
            q = q + ((long) (h7.q(entry.getKey()) + 1)) + ((long) (h7.q(entry.getValue()) + 1));
        }
        long j = q + 1;
        for (Map.Entry<String, String> entry2 : this.idEntries.entrySet()) {
            j = j + ((long) (h7.q(entry2.getKey()) + 1)) + ((long) (h7.q(entry2.getValue()) + 1));
        }
        return j;
    }

    public Map<String, String> getIdEntries() {
        d.a().b(bpf.b(ajc$tjp_12, this, this));
        return this.idEntries;
    }

    public String getLanguages() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return this.languages;
    }

    public String getMimeSubtypeName() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.mimeSubtypeName;
    }

    public String getProfileLevelIdc() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.profileLevelIdc;
    }

    public String getProtection() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.protection;
    }

    public void setBrandEntries(Map<String, String> map) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, map));
        this.brandEntries = map;
    }

    public void setCodecs(String str) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, str));
        this.codecs = str;
    }

    public void setIdEntries(Map<String, String> map) {
        d.a().b(bpf.c(ajc$tjp_13, this, this, map));
        this.idEntries = map;
    }

    public void setLanguages(String str) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, str));
        this.languages = str;
    }

    public void setMimeSubtypeName(String str) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, str));
        this.mimeSubtypeName = str;
    }

    public void setProfileLevelIdc(String str) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, str));
        this.profileLevelIdc = str;
    }

    public void setProtection(String str) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, str));
        this.protection = str;
    }
}
