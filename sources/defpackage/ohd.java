package defpackage;

import android.app.Application;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.spotlets.tracker.identifier.ClickIdentifier;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ErrorTypeIdentifier;
import com.spotify.music.spotlets.tracker.identifier.EventIdentifier;
import com.spotify.music.spotlets.tracker.identifier.InputFieldIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: ohd  reason: default package */
public class ohd implements xhd {
    private final List<xhd> a;

    public ohd(xhd... xhdArr) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(Arrays.asList(xhdArr));
    }

    @Override // defpackage.xhd
    public void a(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        for (xhd xhd : this.a) {
            xhd.a(screenIdentifier, errorTypeIdentifier, inputFieldIdentifier);
        }
    }

    @Override // defpackage.xhd
    public void b() {
        for (xhd xhd : this.a) {
            xhd.b();
        }
    }

    @Override // defpackage.xhd
    public void c() {
        for (xhd xhd : this.a) {
            xhd.c();
        }
    }

    @Override // defpackage.xhd
    public void d(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier) {
        for (xhd xhd : this.a) {
            xhd.d(screenIdentifier, eventIdentifier);
        }
    }

    @Override // defpackage.xhd
    public void e() {
        for (xhd xhd : this.a) {
            xhd.e();
        }
    }

    @Override // defpackage.xhd
    public void f(ScreenIdentifier screenIdentifier, DialogIdentifier dialogIdentifier) {
        for (xhd xhd : this.a) {
            xhd.f(screenIdentifier, dialogIdentifier);
        }
    }

    @Override // defpackage.xhd
    public void g(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier) {
        for (xhd xhd : this.a) {
            xhd.g(screenIdentifier, clickIdentifier);
        }
    }

    @Override // defpackage.xhd
    public void h(khd khd) {
        for (xhd xhd : this.a) {
            xhd.h(khd);
        }
    }

    @Override // defpackage.xhd
    public void i(EventIdentifier eventIdentifier, ImmutableMap<String, String> immutableMap) {
        for (xhd xhd : this.a) {
            xhd.i(eventIdentifier, immutableMap);
        }
    }

    @Override // defpackage.xhd
    public void j(ScreenIdentifier screenIdentifier, InputFieldIdentifier inputFieldIdentifier) {
        for (xhd xhd : this.a) {
            xhd.j(screenIdentifier, inputFieldIdentifier);
        }
    }

    @Override // defpackage.xhd
    public void k(ScreenIdentifier screenIdentifier, EventIdentifier eventIdentifier, int i) {
        for (xhd xhd : this.a) {
            xhd.k(screenIdentifier, eventIdentifier, i);
        }
    }

    @Override // defpackage.xhd
    public void l(ScreenIdentifier screenIdentifier) {
        for (xhd xhd : this.a) {
            xhd.l(screenIdentifier);
        }
    }

    @Override // defpackage.xhd
    public void m(ScreenIdentifier screenIdentifier, ClickIdentifier clickIdentifier, DialogIdentifier dialogIdentifier) {
        for (xhd xhd : this.a) {
            xhd.m(screenIdentifier, clickIdentifier, dialogIdentifier);
        }
    }

    @Override // defpackage.xhd
    public void n(ScreenIdentifier screenIdentifier, ErrorTypeIdentifier errorTypeIdentifier, InputFieldIdentifier inputFieldIdentifier, String str) {
        for (xhd xhd : this.a) {
            xhd.n(screenIdentifier, errorTypeIdentifier, inputFieldIdentifier, str);
        }
    }

    @Override // defpackage.xhd
    public void o(Application application) {
        for (xhd xhd : this.a) {
            xhd.o(application);
        }
    }

    @Override // defpackage.xhd
    @Deprecated
    public void p(ScreenIdentifier screenIdentifier) {
        for (xhd xhd : this.a) {
            xhd.p(screenIdentifier);
        }
    }

    @Override // defpackage.xhd
    public void q(ScreenIdentifier screenIdentifier, String str, String str2) {
        for (xhd xhd : this.a) {
            xhd.q(screenIdentifier, str, str2);
        }
    }
}
