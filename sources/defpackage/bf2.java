package defpackage;

import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.s;

/* renamed from: bf2  reason: default package */
public interface bf2<TArg extends JacksonModel, TResult extends JacksonModel> {
    s<TResult> a(TArg targ);

    int b();

    Class<TArg> c();

    String getUri();
}
