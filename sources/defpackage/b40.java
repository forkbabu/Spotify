package defpackage;

import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.a;
import com.coremedia.iso.boxes.b;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: b40  reason: default package */
public class b40 extends AbstractList<w30> {
    b a;
    ne[] b;
    TrackBox c = null;
    TrackExtendsBox f = null;
    private SoftReference<w30>[] n;
    private List<TrackFragmentBox> o;
    private Map<TrackRunBox, SoftReference<ByteBuffer>> p = new HashMap();
    private int[] q;
    private int r = -1;

    public b40(long j, b bVar, ne... neVarArr) {
        this.a = bVar;
        this.b = neVarArr;
        for (TrackBox trackBox : l50.e(bVar, "moov[0]/trak")) {
            if (trackBox.getTrackHeaderBox().getTrackId() == j) {
                this.c = trackBox;
            }
        }
        if (this.c != null) {
            for (TrackExtendsBox trackExtendsBox : l50.e(bVar, "moov[0]/mvex[0]/trex")) {
                if (trackExtendsBox.getTrackId() == this.c.getTrackHeaderBox().getTrackId()) {
                    this.f = trackExtendsBox;
                }
            }
            this.n = (SoftReference[]) Array.newInstance(SoftReference.class, size());
            if (this.o == null) {
                ArrayList arrayList = new ArrayList();
                for (MovieFragmentBox movieFragmentBox : this.a.getBoxes(MovieFragmentBox.class)) {
                    for (TrackFragmentBox trackFragmentBox : movieFragmentBox.getBoxes(TrackFragmentBox.class)) {
                        if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.c.getTrackHeaderBox().getTrackId()) {
                            arrayList.add(trackFragmentBox);
                        }
                    }
                }
                ne[] neVarArr2 = this.b;
                if (neVarArr2 != null) {
                    for (ne neVar : neVarArr2) {
                        for (MovieFragmentBox movieFragmentBox2 : neVar.getBoxes(MovieFragmentBox.class)) {
                            for (TrackFragmentBox trackFragmentBox2 : movieFragmentBox2.getBoxes(TrackFragmentBox.class)) {
                                if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.c.getTrackHeaderBox().getTrackId()) {
                                    arrayList.add(trackFragmentBox2);
                                }
                            }
                        }
                    }
                }
                this.o = arrayList;
                this.q = new int[arrayList.size()];
                int i = 1;
                for (int i2 = 0; i2 < this.o.size(); i2++) {
                    this.q[i2] = i;
                    List<a> boxes = this.o.get(i2).getBoxes();
                    int i3 = 0;
                    for (int i4 = 0; i4 < boxes.size(); i4++) {
                        a aVar = boxes.get(i4);
                        if (aVar instanceof TrackRunBox) {
                            i3 += rw.n(((TrackRunBox) aVar).getSampleCount());
                        }
                    }
                    i += i3;
                }
                return;
            }
            return;
        }
        throw new RuntimeException("This MP4 does not contain track " + j);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        long j;
        ByteBuffer byteBuffer;
        long j2;
        w30 w30;
        SoftReference<w30>[] softReferenceArr = this.n;
        if (!(softReferenceArr[i] == null || (w30 = softReferenceArr[i].get()) == null)) {
            return w30;
        }
        int i2 = i + 1;
        int length = this.q.length;
        do {
            length--;
        } while (i2 - this.q[length] < 0);
        TrackFragmentBox trackFragmentBox = this.o.get(length);
        int i3 = i2 - this.q[length];
        MovieFragmentBox movieFragmentBox = (MovieFragmentBox) trackFragmentBox.getParent();
        int i4 = 0;
        for (a aVar : trackFragmentBox.getBoxes()) {
            if (aVar instanceof TrackRunBox) {
                TrackRunBox trackRunBox = (TrackRunBox) aVar;
                int i5 = i3 - i4;
                if (trackRunBox.getEntries().size() <= i5) {
                    i4 += trackRunBox.getEntries().size();
                } else {
                    List<TrackRunBox.a> entries = trackRunBox.getEntries();
                    TrackFragmentHeaderBox trackFragmentHeaderBox = trackFragmentBox.getTrackFragmentHeaderBox();
                    boolean isSampleSizePresent = trackRunBox.isSampleSizePresent();
                    boolean hasDefaultSampleSize = trackFragmentHeaderBox.hasDefaultSampleSize();
                    long j3 = 0;
                    if (!isSampleSizePresent) {
                        if (hasDefaultSampleSize) {
                            j2 = trackFragmentHeaderBox.getDefaultSampleSize();
                        } else {
                            TrackExtendsBox trackExtendsBox = this.f;
                            if (trackExtendsBox != null) {
                                j2 = trackExtendsBox.getDefaultSampleSize();
                            } else {
                                throw new RuntimeException("File doesn't contain trex box but track fragments aren't fully self contained. Cannot determine sample size.");
                            }
                        }
                        j = j2;
                    } else {
                        j = 0;
                    }
                    SoftReference<ByteBuffer> softReference = this.p.get(trackRunBox);
                    ByteBuffer byteBuffer2 = softReference != null ? softReference.get() : null;
                    if (byteBuffer2 == null) {
                        b bVar = movieFragmentBox;
                        if (trackFragmentHeaderBox.hasBaseDataOffset()) {
                            j3 = 0 + trackFragmentHeaderBox.getBaseDataOffset();
                            bVar = movieFragmentBox.getParent();
                        }
                        if (trackRunBox.isDataOffsetPresent()) {
                            j3 += (long) trackRunBox.getDataOffset();
                        }
                        int i6 = 0;
                        for (TrackRunBox.a aVar2 : entries) {
                            i6 = (int) (isSampleSizePresent ? aVar2.l() + ((long) i6) : ((long) i6) + j);
                        }
                        try {
                            ByteBuffer byteBuffer3 = bVar.getByteBuffer(j3, (long) i6);
                            this.p.put(trackRunBox, new SoftReference<>(byteBuffer3));
                            byteBuffer = byteBuffer3;
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } else {
                        byteBuffer = byteBuffer2;
                    }
                    int i7 = 0;
                    for (int i8 = 0; i8 < i5; i8++) {
                        i7 = isSampleSizePresent ? (int) (entries.get(i8).l() + ((long) i7)) : (int) (((long) i7) + j);
                    }
                    a40 a40 = new a40(this, isSampleSizePresent ? entries.get(i5).l() : j, byteBuffer, i7);
                    this.n[i] = new SoftReference<>(a40);
                    return a40;
                }
            }
        }
        throw new RuntimeException("Couldn't find sample in the traf I was looking");
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public int size() {
        int i = this.r;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (MovieFragmentBox movieFragmentBox : this.a.getBoxes(MovieFragmentBox.class)) {
            for (TrackFragmentBox trackFragmentBox : movieFragmentBox.getBoxes(TrackFragmentBox.class)) {
                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == this.c.getTrackHeaderBox().getTrackId()) {
                    for (TrackRunBox trackRunBox : trackFragmentBox.getBoxes(TrackRunBox.class)) {
                        i2 = (int) (trackRunBox.getSampleCount() + ((long) i2));
                    }
                }
            }
        }
        for (ne neVar : this.b) {
            for (MovieFragmentBox movieFragmentBox2 : neVar.getBoxes(MovieFragmentBox.class)) {
                for (TrackFragmentBox trackFragmentBox2 : movieFragmentBox2.getBoxes(TrackFragmentBox.class)) {
                    if (trackFragmentBox2.getTrackFragmentHeaderBox().getTrackId() == this.c.getTrackHeaderBox().getTrackId()) {
                        for (TrackRunBox trackRunBox2 : trackFragmentBox2.getBoxes(TrackRunBox.class)) {
                            i2 = (int) (trackRunBox2.getSampleCount() + ((long) i2));
                        }
                    }
                }
            }
        }
        this.r = i2;
        return i2;
    }
}
