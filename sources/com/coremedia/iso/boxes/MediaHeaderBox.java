package com.coremedia.iso.boxes;

import com.adjust.sdk.Constants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import java.nio.ByteBuffer;
import java.util.Date;
import org.mp4parser.aspectj.lang.a;

public class MediaHeaderBox extends AbstractFullBox {
    private static j50 LOG = j50.a(MediaHeaderBox.class);
    public static final String TYPE = "mdhd";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    private Date creationTime = new Date();
    private long duration;
    private String language = "eng";
    private Date modificationTime = new Date();
    private long timescale;

    static {
        ajc$preClinit();
    }

    public MediaHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("MediaHeaderBox.java", MediaHeaderBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 48);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.util.Date"), 52);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 125);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", Constants.LONG), 56);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getDuration", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", Constants.LONG), 60);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "", "", "", "java.lang.String"), 64);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "setCreationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "creationTime", "", "void"), 81);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "setModificationTime", "com.coremedia.iso.boxes.MediaHeaderBox", "java.util.Date", "modificationTime", "", "void"), 85);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "setTimescale", "com.coremedia.iso.boxes.MediaHeaderBox", Constants.LONG, "timescale", "", "void"), 89);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "setDuration", "com.coremedia.iso.boxes.MediaHeaderBox", Constants.LONG, "duration", "", "void"), 93);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setLanguage", "com.coremedia.iso.boxes.MediaHeaderBox", "java.lang.String", "language", "", "void"), 97);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.creationTime = rw.h(h7.p(byteBuffer));
            this.modificationTime = rw.h(h7.p(byteBuffer));
            this.timescale = h7.n(byteBuffer);
            this.duration = byteBuffer.getLong();
        } else {
            this.creationTime = rw.h(h7.n(byteBuffer));
            this.modificationTime = rw.h(h7.n(byteBuffer));
            this.timescale = h7.n(byteBuffer);
            this.duration = (long) byteBuffer.getInt();
        }
        if (this.duration < -1) {
            LOG.d("mdhd duration is not in expected range");
        }
        this.language = h7.i(byteBuffer);
        h7.l(byteBuffer);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            byteBuffer.putLong(rw.g(this.creationTime));
            byteBuffer.putLong(rw.g(this.modificationTime));
            byteBuffer.putInt((int) this.timescale);
            byteBuffer.putLong(this.duration);
        } else {
            byteBuffer.putInt((int) rw.g(this.creationTime));
            byteBuffer.putInt((int) rw.g(this.modificationTime));
            byteBuffer.putInt((int) this.timescale);
            byteBuffer.putInt((int) this.duration);
        }
        pe.d(byteBuffer, this.language);
        pe.e(byteBuffer, 0);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (getVersion() == 1 ? 32 : 20) + 2 + 2;
    }

    public Date getCreationTime() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.creationTime;
    }

    public long getDuration() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        return this.duration;
    }

    public String getLanguage() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.language;
    }

    public Date getModificationTime() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.modificationTime;
    }

    public long getTimescale() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.timescale;
    }

    public void setCreationTime(Date date) {
        d.a().b(bpf.c(ajc$tjp_5, this, this, date));
        this.creationTime = date;
    }

    public void setDuration(long j) {
        d.a().b(bpf.c(ajc$tjp_8, this, this, new Long(j)));
        this.duration = j;
    }

    public void setLanguage(String str) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, str));
        this.language = str;
    }

    public void setModificationTime(Date date) {
        d.a().b(bpf.c(ajc$tjp_6, this, this, date));
        this.modificationTime = date;
    }

    public void setTimescale(long j) {
        d.a().b(bpf.c(ajc$tjp_7, this, this, new Long(j)));
        this.timescale = j;
    }

    public String toString() {
        d.a().b(bpf.b(ajc$tjp_10, this, this));
        return "MediaHeaderBox[creationTime=" + getCreationTime() + ";modificationTime=" + getModificationTime() + ";timescale=" + getTimescale() + ";duration=" + getDuration() + ";language=" + getLanguage() + "]";
    }
}
