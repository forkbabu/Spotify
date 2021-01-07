package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import org.mp4parser.aspectj.lang.a;

public class RatingBox extends AbstractFullBox {
    public static final String TYPE = "rtng";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private String language;
    private String ratingCriteria;
    private String ratingEntity;
    private String ratingInfo;

    static {
        ajc$preClinit();
    }

    public RatingBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("RatingBox.java", RatingBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "setRatingEntity", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingEntity", "", "void"), 46);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "setRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingCriteria", "", "void"), 50);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "setLanguage", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "language", "", "void"), 54);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "setRatingInfo", "com.coremedia.iso.boxes.RatingBox", "java.lang.String", "ratingInfo", "", "void"), 58);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getLanguage", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 62);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getRatingEntity", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 73);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getRatingCriteria", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 83);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "getRatingInfo", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 87);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.RatingBox", "", "", "", "java.lang.String"), 115);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.ratingEntity = h7.e(byteBuffer);
        this.ratingCriteria = h7.e(byteBuffer);
        this.language = h7.i(byteBuffer);
        this.ratingInfo = h7.j(byteBuffer);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(ne.b(this.ratingEntity));
        byteBuffer.put(ne.b(this.ratingCriteria));
        pe.d(byteBuffer, this.language);
        byteBuffer.put(h7.b(this.ratingInfo));
        byteBuffer.put((byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (long) (h7.q(this.ratingInfo) + 15);
    }

    public String getLanguage() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.language;
    }

    public String getRatingCriteria() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.ratingCriteria;
    }

    public String getRatingEntity() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        return this.ratingEntity;
    }

    public String getRatingInfo() {
        d.a().b(bpf.b(ajc$tjp_7, this, this));
        return this.ratingInfo;
    }

    public void setLanguage(String str) {
        d.a().b(bpf.c(ajc$tjp_2, this, this, str));
        this.language = str;
    }

    public void setRatingCriteria(String str) {
        d.a().b(bpf.c(ajc$tjp_1, this, this, str));
        this.ratingCriteria = str;
    }

    public void setRatingEntity(String str) {
        d.a().b(bpf.c(ajc$tjp_0, this, this, str));
        this.ratingEntity = str;
    }

    public void setRatingInfo(String str) {
        d.a().b(bpf.c(ajc$tjp_3, this, this, str));
        this.ratingInfo = str;
    }

    public String toString() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return "RatingBox[language=" + getLanguage() + "ratingEntity=" + getRatingEntity() + ";ratingCriteria=" + getRatingCriteria() + ";language=" + getLanguage() + ";ratingInfo=" + getRatingInfo() + "]";
    }
}
