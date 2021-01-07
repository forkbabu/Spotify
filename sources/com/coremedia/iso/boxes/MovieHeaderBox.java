package com.coremedia.iso.boxes;

import com.adjust.sdk.Constants;
import com.comscore.streaming.AdvertisementType;
import com.googlecode.mp4parser.AbstractFullBox;
import com.googlecode.mp4parser.d;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.nio.ByteBuffer;
import java.util.Date;
import org.mp4parser.aspectj.lang.a;

public class MovieHeaderBox extends AbstractFullBox {
    private static j50 LOG = j50.a(MovieHeaderBox.class);
    public static final String TYPE = "mvhd";
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_0 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_1 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_10 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_11 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_12 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_13 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_14 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_15 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_16 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_17 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_18 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_19 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_2 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_20 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_21 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_22 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_23 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_24 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_25 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_26 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_27 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_28 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_3 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_4 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_5 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_6 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_7 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_8 = null;
    private static final /* synthetic */ a.AbstractC0662a ajc$tjp_9 = null;
    private Date creationTime;
    private int currentTime;
    private long duration;
    private k50 matrix = k50.j;
    private Date modificationTime;
    private long nextTrackId;
    private int posterTime;
    private int previewDuration;
    private int previewTime;
    private double rate = 1.0d;
    private int selectionDuration;
    private int selectionTime;
    private long timescale;
    private float volume = 1.0f;

    static {
        ajc$preClinit();
    }

    public MovieHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        bpf bpf = new bpf("MovieHeaderBox.java", MovieHeaderBox.class);
        ajc$tjp_0 = bpf.g("method-execution", bpf.f("1", "getCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 66);
        ajc$tjp_1 = bpf.g("method-execution", bpf.f("1", "getModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.util.Date"), 70);
        ajc$tjp_10 = bpf.g("method-execution", bpf.f("1", "setModificationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "modificationTime", "", "void"), AdvertisementType.ON_DEMAND_MID_ROLL);
        ajc$tjp_11 = bpf.g("method-execution", bpf.f("1", "setTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.LONG, "timescale", "", "void"), 220);
        ajc$tjp_12 = bpf.g("method-execution", bpf.f("1", "setDuration", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.LONG, "duration", "", "void"), 224);
        ajc$tjp_13 = bpf.g("method-execution", bpf.f("1", "setRate", "com.coremedia.iso.boxes.MovieHeaderBox", "double", "rate", "", "void"), AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL);
        ajc$tjp_14 = bpf.g("method-execution", bpf.f("1", "setVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "float", "volume", "", "void"), AdvertisementType.BRANDED_DURING_LIVE);
        ajc$tjp_15 = bpf.g("method-execution", bpf.f("1", "setMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "com.googlecode.mp4parser.util.Matrix", "matrix", "", "void"), 239);
        ajc$tjp_16 = bpf.g("method-execution", bpf.f("1", "setNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", Constants.LONG, "nextTrackId", "", "void"), 243);
        ajc$tjp_17 = bpf.g("method-execution", bpf.f("1", "getPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 247);
        ajc$tjp_18 = bpf.g("method-execution", bpf.f("1", "setPreviewTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewTime", "", "void"), 251);
        ajc$tjp_19 = bpf.g("method-execution", bpf.f("1", "getPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), BitmapRenderer.ALPHA_VISIBLE);
        ajc$tjp_2 = bpf.g("method-execution", bpf.f("1", "getTimescale", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.LONG), 74);
        ajc$tjp_20 = bpf.g("method-execution", bpf.f("1", "setPreviewDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "previewDuration", "", "void"), 259);
        ajc$tjp_21 = bpf.g("method-execution", bpf.f("1", "getPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 263);
        ajc$tjp_22 = bpf.g("method-execution", bpf.f("1", "setPosterTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "posterTime", "", "void"), 267);
        ajc$tjp_23 = bpf.g("method-execution", bpf.f("1", "getSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 271);
        ajc$tjp_24 = bpf.g("method-execution", bpf.f("1", "setSelectionTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionTime", "", "void"), 275);
        ajc$tjp_25 = bpf.g("method-execution", bpf.f("1", "getSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 279);
        ajc$tjp_26 = bpf.g("method-execution", bpf.f("1", "setSelectionDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "selectionDuration", "", "void"), 283);
        ajc$tjp_27 = bpf.g("method-execution", bpf.f("1", "getCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "int"), 287);
        ajc$tjp_28 = bpf.g("method-execution", bpf.f("1", "setCurrentTime", "com.coremedia.iso.boxes.MovieHeaderBox", "int", "currentTime", "", "void"), 291);
        ajc$tjp_3 = bpf.g("method-execution", bpf.f("1", "getDuration", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.LONG), 78);
        ajc$tjp_4 = bpf.g("method-execution", bpf.f("1", "getRate", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "double"), 82);
        ajc$tjp_5 = bpf.g("method-execution", bpf.f("1", "getVolume", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "float"), 86);
        ajc$tjp_6 = bpf.g("method-execution", bpf.f("1", "getMatrix", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "com.googlecode.mp4parser.util.Matrix"), 90);
        ajc$tjp_7 = bpf.g("method-execution", bpf.f("1", "getNextTrackId", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", Constants.LONG), 94);
        ajc$tjp_8 = bpf.g("method-execution", bpf.f("1", "toString", "com.coremedia.iso.boxes.MovieHeaderBox", "", "", "", "java.lang.String"), 148);
        ajc$tjp_9 = bpf.g("method-execution", bpf.f("1", "setCreationTime", "com.coremedia.iso.boxes.MovieHeaderBox", "java.util.Date", "creationTime", "", "void"), 204);
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
            LOG.d("mvhd duration is not in expected range");
        }
        this.rate = h7.g(byteBuffer);
        this.volume = h7.h(byteBuffer);
        h7.l(byteBuffer);
        h7.n(byteBuffer);
        h7.n(byteBuffer);
        this.matrix = k50.a(byteBuffer);
        this.previewTime = byteBuffer.getInt();
        this.previewDuration = byteBuffer.getInt();
        this.posterTime = byteBuffer.getInt();
        this.selectionTime = byteBuffer.getInt();
        this.selectionDuration = byteBuffer.getInt();
        this.currentTime = byteBuffer.getInt();
        this.nextTrackId = h7.n(byteBuffer);
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
        pe.b(byteBuffer, this.rate);
        pe.c(byteBuffer, (double) this.volume);
        pe.e(byteBuffer, 0);
        int i = (int) 0;
        byteBuffer.putInt(i);
        byteBuffer.putInt(i);
        this.matrix.b(byteBuffer);
        byteBuffer.putInt(this.previewTime);
        byteBuffer.putInt(this.previewDuration);
        byteBuffer.putInt(this.posterTime);
        byteBuffer.putInt(this.selectionTime);
        byteBuffer.putInt(this.selectionDuration);
        byteBuffer.putInt(this.currentTime);
        byteBuffer.putInt((int) this.nextTrackId);
    }

    /* access modifiers changed from: protected */
    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (getVersion() == 1 ? 32 : 20) + 80;
    }

    public Date getCreationTime() {
        d.a().b(bpf.b(ajc$tjp_0, this, this));
        return this.creationTime;
    }

    public int getCurrentTime() {
        d.a().b(bpf.b(ajc$tjp_27, this, this));
        return this.currentTime;
    }

    public long getDuration() {
        d.a().b(bpf.b(ajc$tjp_3, this, this));
        return this.duration;
    }

    public k50 getMatrix() {
        d.a().b(bpf.b(ajc$tjp_6, this, this));
        return this.matrix;
    }

    public Date getModificationTime() {
        d.a().b(bpf.b(ajc$tjp_1, this, this));
        return this.modificationTime;
    }

    public long getNextTrackId() {
        d.a().b(bpf.b(ajc$tjp_7, this, this));
        return this.nextTrackId;
    }

    public int getPosterTime() {
        d.a().b(bpf.b(ajc$tjp_21, this, this));
        return this.posterTime;
    }

    public int getPreviewDuration() {
        d.a().b(bpf.b(ajc$tjp_19, this, this));
        return this.previewDuration;
    }

    public int getPreviewTime() {
        d.a().b(bpf.b(ajc$tjp_17, this, this));
        return this.previewTime;
    }

    public double getRate() {
        d.a().b(bpf.b(ajc$tjp_4, this, this));
        return this.rate;
    }

    public int getSelectionDuration() {
        d.a().b(bpf.b(ajc$tjp_25, this, this));
        return this.selectionDuration;
    }

    public int getSelectionTime() {
        d.a().b(bpf.b(ajc$tjp_23, this, this));
        return this.selectionTime;
    }

    public long getTimescale() {
        d.a().b(bpf.b(ajc$tjp_2, this, this));
        return this.timescale;
    }

    public float getVolume() {
        d.a().b(bpf.b(ajc$tjp_5, this, this));
        return this.volume;
    }

    public void setCreationTime(Date date) {
        d.a().b(bpf.c(ajc$tjp_9, this, this, date));
        this.creationTime = date;
        if ((date.getTime() / 1000) + 2082844800 >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setCurrentTime(int i) {
        d.a().b(bpf.c(ajc$tjp_28, this, this, new Integer(i)));
        this.currentTime = i;
    }

    public void setDuration(long j) {
        d.a().b(bpf.c(ajc$tjp_12, this, this, new Long(j)));
        this.duration = j;
        if (j >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setMatrix(k50 k50) {
        d.a().b(bpf.c(ajc$tjp_15, this, this, k50));
        this.matrix = k50;
    }

    public void setModificationTime(Date date) {
        d.a().b(bpf.c(ajc$tjp_10, this, this, date));
        this.modificationTime = date;
        if ((date.getTime() / 1000) + 2082844800 >= 4294967296L) {
            setVersion(1);
        }
    }

    public void setNextTrackId(long j) {
        d.a().b(bpf.c(ajc$tjp_16, this, this, new Long(j)));
        this.nextTrackId = j;
    }

    public void setPosterTime(int i) {
        d.a().b(bpf.c(ajc$tjp_22, this, this, new Integer(i)));
        this.posterTime = i;
    }

    public void setPreviewDuration(int i) {
        d.a().b(bpf.c(ajc$tjp_20, this, this, new Integer(i)));
        this.previewDuration = i;
    }

    public void setPreviewTime(int i) {
        d.a().b(bpf.c(ajc$tjp_18, this, this, new Integer(i)));
        this.previewTime = i;
    }

    public void setRate(double d) {
        d.a().b(bpf.c(ajc$tjp_13, this, this, new Double(d)));
        this.rate = d;
    }

    public void setSelectionDuration(int i) {
        d.a().b(bpf.c(ajc$tjp_26, this, this, new Integer(i)));
        this.selectionDuration = i;
    }

    public void setSelectionTime(int i) {
        d.a().b(bpf.c(ajc$tjp_24, this, this, new Integer(i)));
        this.selectionTime = i;
    }

    public void setTimescale(long j) {
        d.a().b(bpf.c(ajc$tjp_11, this, this, new Long(j)));
        this.timescale = j;
    }

    public void setVolume(float f) {
        d.a().b(bpf.c(ajc$tjp_14, this, this, new Float(f)));
        this.volume = f;
    }

    public String toString() {
        d.a().b(bpf.b(ajc$tjp_8, this, this));
        return "MovieHeaderBox[creationTime=" + getCreationTime() + ";modificationTime=" + getModificationTime() + ";timescale=" + getTimescale() + ";duration=" + getDuration() + ";rate=" + getRate() + ";volume=" + getVolume() + ";matrix=" + this.matrix + ";nextTrackId=" + getNextTrackId() + "]";
    }
}
