package defpackage;

import android.app.Activity;
import com.spotify.inappmessaging.ActionType;
import com.spotify.inappmessaging.j;
import com.spotify.mobile.android.util.t;
import com.spotify.music.features.addtoplaylist.d;
import com.spotify.music.follow.m;
import com.spotify.music.playlist.service.b;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: w18  reason: default package */
public final class w18 implements fjf<Map<ActionType, j>> {
    private final wlf<Activity> a;
    private final wlf<zk4> b;
    private final wlf<a02> c;
    private final wlf<d> d;
    private final wlf<com.spotify.music.features.createplaylist.d> e;
    private final wlf<m> f;
    private final wlf<t8a> g;
    private final wlf<t> h;
    private final wlf<d28> i;
    private final wlf<b.a> j;

    public w18(wlf<Activity> wlf, wlf<zk4> wlf2, wlf<a02> wlf3, wlf<d> wlf4, wlf<com.spotify.music.features.createplaylist.d> wlf5, wlf<m> wlf6, wlf<t8a> wlf7, wlf<t> wlf8, wlf<d28> wlf9, wlf<b.a> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    public static w18 a(wlf<Activity> wlf, wlf<zk4> wlf2, wlf<a02> wlf3, wlf<d> wlf4, wlf<com.spotify.music.features.createplaylist.d> wlf5, wlf<m> wlf6, wlf<t8a> wlf7, wlf<t> wlf8, wlf<d28> wlf9, wlf<b.a> wlf10) {
        return new w18(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10);
    }

    @Override // defpackage.wlf
    public Object get() {
        Activity activity = this.a.get();
        m mVar = this.f.get();
        t8a t8a = this.g.get();
        t tVar = this.h.get();
        d28 d28 = this.i.get();
        EnumMap enumMap = new EnumMap(ActionType.class);
        b a2 = this.j.get().a(activity);
        enumMap.put((EnumMap) ActionType.URL, (ActionType) new pz7(activity, d28));
        enumMap.put((EnumMap) ActionType.INTERNAL_WEBVIEW, (ActionType) new sz7(activity, d28));
        enumMap.put((EnumMap) ActionType.EXTERNAL_URL, (ActionType) new a08(activity, d28));
        enumMap.put((EnumMap) ActionType.TRIAL, (ActionType) new rz7(this.c.get(), activity));
        enumMap.put((EnumMap) ActionType.CREATE_PLAYLIST, (ActionType) new b08(this.e.get(), d28));
        enumMap.put((EnumMap) ActionType.START_PLAYBACK, (ActionType) new tz7(activity, d28));
        enumMap.put((EnumMap) ActionType.ADD_TO_PLAYLIST, (ActionType) new wz7(this.d.get()));
        enumMap.put((EnumMap) ActionType.IAP, (ActionType) new c08(tVar, this.b.get(), activity));
        enumMap.put((EnumMap) ActionType.SAVE_ENTITY, (ActionType) new qz7(t8a, d28, mVar, a2));
        enumMap.put((EnumMap) ActionType.BAN_ENTITY, (ActionType) new vz7(t8a, d28, mVar));
        enumMap.put((EnumMap) ActionType.EMAIL_VERIFICATION, (ActionType) new uz7(d28, activity));
        enumMap.put((EnumMap) ActionType.SELECT_OPTION, (ActionType) zz7.a);
        enumMap.put((EnumMap) ActionType.SAVE_AND_NAVIGATE, (ActionType) new yz7(t8a, mVar, a2, activity));
        enumMap.put((EnumMap) ActionType.SET_NOTIFICATION_PREFERENCE, (ActionType) new xz7(activity, d28));
        return enumMap;
    }
}
