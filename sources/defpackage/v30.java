package defpackage;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.EditListBox;
import com.coremedia.iso.boxes.MediaHeaderBox;
import com.coremedia.iso.boxes.MovieHeaderBox;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SampleTableBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.TimeToSampleBox;
import com.coremedia.iso.boxes.TrackBox;
import com.coremedia.iso.boxes.TrackHeaderBox;
import com.coremedia.iso.boxes.fragment.MovieExtendsBox;
import com.coremedia.iso.boxes.fragment.MovieFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackExtendsBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentBox;
import com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox;
import com.coremedia.iso.boxes.fragment.TrackRunBox;
import com.coremedia.iso.boxes.fragment.a;
import com.googlecode.mp4parser.BasicContainer;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleGroupDescriptionBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.b;
import com.spotify.mobile.android.core.internal.AudioDriver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: v30  reason: default package */
public class v30 extends r30 {
    TrackBox f;
    private List<w30> n;
    private SampleDescriptionBox o;
    private long[] p;
    private List<CompositionTimeToSample.a> q;
    private long[] r = null;
    private List<SampleDependencyTypeBox.a> s;
    private y30 t;
    private String u;
    private SubSampleInformationBox v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v30(String str, TrackBox trackBox, ne... neVarArr) {
        super(str);
        SampleTableBox sampleTableBox;
        ArrayList arrayList;
        String str2;
        a aVar;
        int i;
        v30 v30 = this;
        v30.t = new y30();
        v30.v = null;
        v30.f = trackBox;
        long trackId = trackBox.getTrackHeaderBox().getTrackId();
        v30.n = new com.coremedia.iso.boxes.mdat.a(trackBox, neVarArr);
        SampleTableBox sampleTableBox2 = trackBox.getMediaBox().getMediaInformationBox().getSampleTableBox();
        v30.u = trackBox.getMediaBox().getHandlerBox().getHandlerType();
        ArrayList arrayList2 = new ArrayList();
        v30.q = new ArrayList();
        v30.s = new ArrayList();
        arrayList2.addAll(sampleTableBox2.getTimeToSampleBox().getEntries());
        if (sampleTableBox2.getCompositionTimeToSample() != null) {
            v30.q.addAll(sampleTableBox2.getCompositionTimeToSample().getEntries());
        }
        if (sampleTableBox2.getSampleDependencyTypeBox() != null) {
            v30.s.addAll(sampleTableBox2.getSampleDependencyTypeBox().getEntries());
        }
        if (sampleTableBox2.getSyncSampleBox() != null) {
            v30.r = sampleTableBox2.getSyncSampleBox().getSampleNumber();
        }
        String str3 = SubSampleInformationBox.TYPE;
        v30.v = (SubSampleInformationBox) l50.c(sampleTableBox2, str3);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(((com.coremedia.iso.boxes.a) trackBox.getParent()).getParent().getBoxes(MovieFragmentBox.class));
        int length = neVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            arrayList3.addAll(neVarArr[i2].getBoxes(MovieFragmentBox.class));
            i2++;
            v30 = this;
            arrayList3 = arrayList3;
        }
        v30.o = sampleTableBox2.getSampleDescriptionBox();
        List<MovieExtendsBox> boxes = trackBox.getParent().getBoxes(MovieExtendsBox.class);
        if (boxes.size() > 0) {
            for (MovieExtendsBox movieExtendsBox : boxes) {
                for (TrackExtendsBox trackExtendsBox : movieExtendsBox.getBoxes(TrackExtendsBox.class)) {
                    if (trackExtendsBox.getTrackId() == trackId) {
                        if (l50.e(((com.coremedia.iso.boxes.a) trackBox.getParent()).getParent(), "/moof/traf/subs").size() > 0) {
                            v30.v = new SubSampleInformationBox();
                        }
                        Iterator it = arrayList3.iterator();
                        long j = 1;
                        long j2 = 1;
                        while (it.hasNext()) {
                            long j3 = j;
                            for (TrackFragmentBox trackFragmentBox : ((MovieFragmentBox) it.next()).getBoxes(TrackFragmentBox.class)) {
                                if (trackFragmentBox.getTrackFragmentHeaderBox().getTrackId() == trackId) {
                                    List<SampleGroupDescriptionBox> boxes2 = sampleTableBox2.getBoxes(SampleGroupDescriptionBox.class);
                                    List<SampleGroupDescriptionBox> e = l50.e(trackFragmentBox, SampleGroupDescriptionBox.TYPE);
                                    List<SampleToGroupBox> e2 = l50.e(trackFragmentBox, SampleToGroupBox.TYPE);
                                    Map<b, long[]> map = v30.c;
                                    a(boxes2, e, e2, map, j3 - j2);
                                    v30.c = map;
                                    SubSampleInformationBox subSampleInformationBox = (SubSampleInformationBox) l50.c(trackFragmentBox, str3);
                                    if (subSampleInformationBox != null) {
                                        long j4 = (j3 - ((long) 0)) - 1;
                                        for (SubSampleInformationBox.a aVar2 : subSampleInformationBox.getEntries()) {
                                            SubSampleInformationBox.a aVar3 = new SubSampleInformationBox.a();
                                            aVar3.c().addAll(aVar2.c());
                                            if (j4 != 0) {
                                                aVar3.d(aVar2.a() + j4);
                                                j4 = 0;
                                            } else {
                                                aVar3.d(aVar2.a());
                                            }
                                            v30.v.getEntries().add(aVar3);
                                        }
                                    }
                                    for (TrackRunBox trackRunBox : trackFragmentBox.getBoxes(TrackRunBox.class)) {
                                        TrackFragmentHeaderBox trackFragmentHeaderBox = ((TrackFragmentBox) trackRunBox.getParent()).getTrackFragmentHeaderBox();
                                        int i3 = 1;
                                        boolean z = true;
                                        for (TrackRunBox.a aVar4 : trackRunBox.getEntries()) {
                                            if (!trackRunBox.isSampleDurationPresent()) {
                                                sampleTableBox = sampleTableBox2;
                                                str2 = str3;
                                                arrayList = arrayList3;
                                                if (trackFragmentHeaderBox.hasDefaultSampleDuration()) {
                                                    arrayList2.add(new TimeToSampleBox.a(1, trackFragmentHeaderBox.getDefaultSampleDuration()));
                                                } else {
                                                    arrayList2.add(new TimeToSampleBox.a(1, trackExtendsBox.getDefaultSampleDuration()));
                                                }
                                            } else if (arrayList2.size() == 0 || ((TimeToSampleBox.a) arrayList2.get(arrayList2.size() - i3)).b() != aVar4.j()) {
                                                sampleTableBox = sampleTableBox2;
                                                str2 = str3;
                                                arrayList = arrayList3;
                                                arrayList2.add(new TimeToSampleBox.a(1, aVar4.j()));
                                            } else {
                                                TimeToSampleBox.a aVar5 = (TimeToSampleBox.a) arrayList2.get(arrayList2.size() - i3);
                                                sampleTableBox = sampleTableBox2;
                                                aVar5.c(aVar5.a() + 1);
                                                str2 = str3;
                                                arrayList = arrayList3;
                                            }
                                            if (trackRunBox.isSampleCompositionTimeOffsetPresent()) {
                                                if (v30.q.size() != 0) {
                                                    List<CompositionTimeToSample.a> list = v30.q;
                                                    i = 1;
                                                    if (((long) list.get(list.size() - 1).b()) == aVar4.i()) {
                                                        List<CompositionTimeToSample.a> list2 = v30.q;
                                                        CompositionTimeToSample.a aVar6 = list2.get(list2.size() - 1);
                                                        aVar6.c(aVar6.a() + 1);
                                                    }
                                                } else {
                                                    i = 1;
                                                }
                                                v30.q.add(new CompositionTimeToSample.a(i, rw.n(aVar4.i())));
                                            }
                                            if (trackRunBox.isSampleFlagsPresent()) {
                                                aVar = aVar4.k();
                                            } else if (z && trackRunBox.isFirstSampleFlagsPresent()) {
                                                aVar = trackRunBox.getFirstSampleFlags();
                                            } else if (trackFragmentHeaderBox.hasDefaultSampleFlags()) {
                                                aVar = trackFragmentHeaderBox.getDefaultSampleFlags();
                                            } else {
                                                aVar = trackExtendsBox.getDefaultSampleFlags();
                                            }
                                            if (aVar != null && !aVar.b()) {
                                                v30.r = rw.k(v30.r, j3);
                                            }
                                            i3 = 1;
                                            j3++;
                                            z = false;
                                            sampleTableBox2 = sampleTableBox;
                                            str3 = str2;
                                            arrayList3 = arrayList;
                                        }
                                    }
                                    j2 = 1;
                                    trackId = trackId;
                                }
                            }
                            j = j3;
                        }
                    }
                }
            }
        } else {
            List<SampleGroupDescriptionBox> boxes3 = sampleTableBox2.getBoxes(SampleGroupDescriptionBox.class);
            List<SampleToGroupBox> boxes4 = sampleTableBox2.getBoxes(SampleToGroupBox.class);
            Map<b, long[]> map2 = v30.c;
            a(boxes3, null, boxes4, map2, 0);
            v30.c = map2;
        }
        v30.p = TimeToSampleBox.blowupTimeToSamples(arrayList2);
        MediaHeaderBox mediaHeaderBox = trackBox.getMediaBox().getMediaHeaderBox();
        TrackHeaderBox trackHeaderBox = trackBox.getTrackHeaderBox();
        v30.t.s(trackHeaderBox.getTrackId());
        v30.t.n(mediaHeaderBox.getCreationTime());
        v30.t.p(mediaHeaderBox.getLanguage());
        y30 y30 = v30.t;
        mediaHeaderBox.getModificationTime();
        y30.getClass();
        v30.t.r(mediaHeaderBox.getTimescale());
        v30.t.o(trackHeaderBox.getHeight());
        v30.t.u(trackHeaderBox.getWidth());
        v30.t.r = trackHeaderBox.getLayer();
        v30.t.q(trackHeaderBox.getMatrix());
        v30.t.t(trackHeaderBox.getVolume());
        EditListBox editListBox = (EditListBox) l50.c(trackBox, "edts/elst");
        MovieHeaderBox movieHeaderBox = (MovieHeaderBox) l50.c(trackBox, "../mvhd");
        if (editListBox != null) {
            for (Iterator<EditListBox.a> it2 = editListBox.getEntries().iterator(); it2.hasNext(); it2 = it2) {
                EditListBox.a next = it2.next();
                List<t30> list3 = v30.b;
                long c = next.c();
                long timescale = mediaHeaderBox.getTimescale();
                double b = next.b();
                double d = (double) next.d();
                double timescale2 = (double) movieHeaderBox.getTimescale();
                Double.isNaN(d);
                Double.isNaN(timescale2);
                list3.add(new t30(c, timescale, b, d / timescale2));
                v30 = this;
                mediaHeaderBox = mediaHeaderBox;
            }
        }
    }

    private Map<b, long[]> a(List<SampleGroupDescriptionBox> list, List<SampleGroupDescriptionBox> list2, List<SampleToGroupBox> list3, Map<b, long[]> map, long j) {
        for (SampleToGroupBox sampleToGroupBox : list3) {
            int i = 0;
            for (SampleToGroupBox.a aVar : sampleToGroupBox.getEntries()) {
                if (aVar.a() > 0) {
                    b bVar = null;
                    if (aVar.a() > 65535) {
                        for (SampleGroupDescriptionBox sampleGroupDescriptionBox : list2) {
                            if (sampleGroupDescriptionBox.getGroupingType().equals(sampleToGroupBox.getGroupingType())) {
                                bVar = sampleGroupDescriptionBox.getGroupEntries().get((aVar.a() - 1) & AudioDriver.SPOTIFY_MAX_VOLUME);
                            }
                        }
                    } else {
                        for (SampleGroupDescriptionBox sampleGroupDescriptionBox2 : list) {
                            if (sampleGroupDescriptionBox2.getGroupingType().equals(sampleToGroupBox.getGroupingType())) {
                                bVar = sampleGroupDescriptionBox2.getGroupEntries().get(aVar.a() - 1);
                            }
                        }
                    }
                    long[] jArr = map.get(bVar);
                    if (jArr == null) {
                        jArr = new long[0];
                    }
                    long[] jArr2 = new long[(rw.n(aVar.b()) + jArr.length)];
                    System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
                    int i2 = 0;
                    while (true) {
                        long j2 = (long) i2;
                        if (j2 >= aVar.b()) {
                            break;
                        }
                        jArr2[jArr.length + i2] = j + ((long) i) + j2;
                        i2++;
                    }
                    map.put(bVar, jArr2);
                }
                i = (int) (aVar.b() + ((long) i));
            }
        }
        return map;
    }

    @Override // defpackage.x30
    public synchronized long[] B1() {
        return this.p;
    }

    @Override // defpackage.x30
    public long[] T() {
        long[] jArr = this.r;
        if (jArr == null || jArr.length == this.n.size()) {
            return null;
        }
        return this.r;
    }

    @Override // defpackage.x30
    public SubSampleInformationBox X() {
        return this.v;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.coremedia.iso.boxes.b parent = this.f.getParent();
        if (parent instanceof BasicContainer) {
            ((BasicContainer) parent).close();
        }
    }

    @Override // defpackage.x30
    public String getHandler() {
        return this.u;
    }

    @Override // defpackage.x30
    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.o;
    }

    @Override // defpackage.x30
    public List<SampleDependencyTypeBox.a> l2() {
        return this.s;
    }

    @Override // defpackage.x30
    public y30 n1() {
        return this.t;
    }

    @Override // defpackage.x30
    public List<w30> p0() {
        return this.n;
    }

    @Override // defpackage.x30
    public List<CompositionTimeToSample.a> y() {
        return this.q;
    }
}
