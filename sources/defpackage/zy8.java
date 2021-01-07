package defpackage;

import com.spotify.wrapped2020.v1.proto.ConsumerResponse;
import com.spotify.wrapped2020.v1.proto.ConsumerShareRequest;
import com.spotify.wrapped2020.v1.proto.ConsumerShareResponse;
import io.reactivex.z;

/* renamed from: zy8  reason: default package */
public interface zy8 {
    @zqf("/consumer-wrapped/v1/consumer/sample")
    z<ConsumerResponse> a();

    @zqf("/consumer-wrapped/v1/consumer")
    z<ConsumerResponse> b();

    @erf({"Accept: application/protobuf"})
    @irf("/consumer-wrapped/v1/consumer/share")
    z<ConsumerShareResponse> c(@uqf ConsumerShareRequest consumerShareRequest, @nrf("override-image") boolean z);
}
