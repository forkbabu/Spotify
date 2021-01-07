package defpackage;

import android.app.Application;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;

@Deprecated
/* renamed from: xhd  reason: default package */
public interface xhd {
    void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier);

    void b();

    void c();

    void d(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier);

    void e();

    void f(ScreenIdentifier screenIdentifier, DialogIdentifier dialogIdentifier);

    void g(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier);

    void h(khd khd);

    void i(EventIdentifier eventIdentifier, ImmutableMap<String, String> immutableMap);

    void j(ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier);

    void k(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier, int i);

    void l(ScreenIdentifier screenIdentifier);

    void m(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier, DialogIdentifier dialogIdentifier);

    void n(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier, String str);

    void o(Application application);

    @Deprecated
    void p(ScreenIdentifier screenIdentifier);

    void q(ScreenIdentifier screenIdentifier, String str, String str2);
}
