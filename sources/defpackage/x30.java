package defpackage;

import com.coremedia.iso.boxes.CompositionTimeToSample;
import com.coremedia.iso.boxes.SampleDependencyTypeBox;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.googlecode.mp4parser.boxes.mp4.samplegrouping.b;
import java.io.Closeable;
import java.util.List;
import java.util.Map;

/* renamed from: x30  reason: default package */
public interface x30 extends Closeable {
    long[] B1();

    long[] T();

    List<t30> W0();

    SubSampleInformationBox X();

    long e();

    Map<b, long[]> g1();

    String getHandler();

    String getName();

    SampleDescriptionBox getSampleDescriptionBox();

    List<SampleDependencyTypeBox.a> l2();

    y30 n1();

    List<w30> p0();

    List<CompositionTimeToSample.a> y();
}
