package com.spotify.mobile.android.video.events;

import com.google.common.base.Optional;
import com.spotify.mobile.android.video.StreamingType;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.d0;
import com.spotify.mobile.android.video.drm.EncryptionType;
import com.spotify.mobile.android.video.exception.BetamaxException;
import com.spotify.mobile.android.video.i0;
import com.spotify.mobile.android.video.v;
import java.util.List;

public interface e0 {
    void a(long j);

    void b(j0 j0Var, long j, long j2);

    void c(long j);

    void d(boolean z, long j, long j2);

    void e(long j, long j2);

    void f(long j, long j2, long j3);

    void h(i0 i0Var, long j);

    void i(EncryptionType encryptionType, long j);

    void j(long j, long j2, long j3, long j4);

    void k(List<i0> list, long j);

    void l(BetamaxException betamaxException, long j, long j2);

    void m(boolean z, long j);

    void n(d0 d0Var, long j);

    void o(BetamaxException betamaxException, long j, long j2);

    void p(v vVar, ReasonEnd reasonEnd, long j, long j2);

    void q(StreamingType streamingType, long j, long j2);

    void r(long j);

    void s(float f, long j, long j2);

    void t(Optional<i0> optional, long j, long j2);

    void u(Optional<VideoSurfaceView> optional, long j, long j2);

    void v(y yVar, long j, long j2);

    void w(long j, long j2);

    void x(long j, long j2);

    void y(int i, long j);
}
