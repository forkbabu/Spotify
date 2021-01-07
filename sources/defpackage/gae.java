package defpackage;

import com.coremedia.iso.boxes.SchemeTypeBox;
import com.coremedia.iso.boxes.TrackBox;
import com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder;
import com.googlecode.mp4parser.b;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.Iterator;

/* renamed from: gae  reason: default package */
public class gae {
    public void a(File file, File file2, int i) {
        int i2;
        b bVar = new b(new File(file.getAbsolutePath()));
        ne neVar = new ne(bVar);
        u30 u30 = new u30();
        Iterator it = neVar.d().getBoxes(TrackBox.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TrackBox trackBox = (TrackBox) it.next();
            SchemeTypeBox schemeTypeBox = (SchemeTypeBox) l50.c(trackBox, "mdia[0]/minf[0]/stbl[0]/stsd[0]/enc.[0]/sinf[0]/schm[0]");
            if (schemeTypeBox == null || (!schemeTypeBox.getSchemeType().equals("cenc") && !schemeTypeBox.getSchemeType().equals("cbc1"))) {
                u30.a(new v30(String.valueOf(bVar.toString()) + "[" + trackBox.getTrackHeaderBox().getTrackId() + "]", trackBox, new ne[0]));
            } else {
                u30.a(new s30(String.valueOf(bVar.toString()) + "[" + trackBox.getTrackHeaderBox().getTrackId() + "]", trackBox, new ne[0]));
            }
        }
        u30.f(neVar.d().getMovieHeaderBox().getMatrix());
        x30 x30 = null;
        Iterator<x30> it2 = u30.e().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            x30 next = it2.next();
            if (next.getHandler().equals("vide")) {
                x30 = next;
                break;
            }
        }
        if (x30 != null) {
            double e = (double) x30.e();
            double g = (double) x30.n1().g();
            Double.isNaN(e);
            Double.isNaN(g);
            Double.isNaN(e);
            Double.isNaN(g);
            double d = e / g;
            double d2 = (double) i;
            if (d <= d2) {
                Double.isNaN(d2);
                Double.isNaN(d2);
                int i3 = (int) (d2 / d);
                x30[] x30Arr = new x30[i3];
                for (i2 = 0; i2 < i3; i2++) {
                    x30Arr[i2] = x30;
                }
                u30 u302 = new u30();
                u302.a(new c40(x30Arr));
                FileChannel channel = new RandomAccessFile(file2, "rw").getChannel();
                new DefaultMp4Builder().b(u302).writeContainer(channel);
                channel.close();
                return;
            }
            throw new IllegalArgumentException("Video length can't be longer than max length");
        }
        throw new IllegalArgumentException("Track doesn't have video");
    }
}
