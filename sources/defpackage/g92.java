package defpackage;

import com.spotify.mobile.android.waze.model.WazeTransportDrivingDirection;
import io.reactivex.subjects.PublishSubject;

/* renamed from: g92  reason: default package */
public class g92 {
    private WazeTransportDrivingDirection a = WazeTransportDrivingDirection.NONE;
    private String b;
    private String c;
    private boolean d;
    private long e;
    private String f;
    private final PublishSubject<Boolean> g = PublishSubject.h1();

    public String a() {
        return this.f;
    }

    public WazeTransportDrivingDirection b() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public void e() {
        this.e++;
    }

    public boolean f() {
        return this.d;
    }

    public boolean g() {
        return this.a != WazeTransportDrivingDirection.NONE && !"".equals(this.b);
    }

    public void h(boolean z) {
        this.d = z;
    }

    public void i(String str) {
        this.f = str;
    }

    public void j(WazeTransportDrivingDirection wazeTransportDrivingDirection) {
        this.a = wazeTransportDrivingDirection;
        this.g.onNext(Boolean.valueOf(g()));
    }

    public void k(String str) {
        this.b = str;
        this.g.onNext(Boolean.valueOf(g()));
    }

    public void l(String str) {
        this.c = str;
    }
}
