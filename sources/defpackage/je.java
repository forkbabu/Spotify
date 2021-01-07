package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.o;
import com.google.protobuf.t;
import com.googlecode.mp4parser.d;
import com.spotify.common.uri.SpotifyUri;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.http.u;
import com.spotify.mobile.android.hubframework.defaults.HubsComponentCategory;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryResponseEntity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.features.yourlibraryx.view.y;
import com.spotify.music.t0;
import com.spotify.player.model.ContextTrack;
import com.spotify.playlist.models.Covers;
import defpackage.n7;
import defpackage.nqe;
import defpackage.qqe;
import defpackage.rqe;
import defpackage.s51;
import defpackage.s52;
import defpackage.s81;
import defpackage.sqe;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import java.io.File;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.h;
import org.mp4parser.aspectj.lang.a;
import org.threeten.bp.temporal.b;
import org.threeten.bp.temporal.f;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: je  reason: default package */
/* compiled from: outline */
public class je {
    public static void A(StringBuilder sb, String str, char c, String str2) {
        sb.append(str);
        sb.append(c);
        sb.append(str2);
    }

    public static String A0(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static boolean B(s81 s81, String str) {
        return str.equals(s81.componentId().id());
    }

    public static String B0(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static boolean C(s81 s81, String str) {
        return h.a(s81.componentId().id(), str);
    }

    public static int C0(o.i iVar, int i, int i2) {
        return (iVar.size() * i) + i2;
    }

    public static Bundle D(Fragment fragment) {
        Bundle bundle = new Bundle();
        fragment.r4(bundle);
        return bundle;
    }

    public static String D0(StringBuilder sb, long j, char c) {
        sb.append(j);
        sb.append(c);
        return sb.toString();
    }

    public static Bundle E(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        return bundle;
    }

    public static String E0(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static Bundle F(String str, String str2, String str3, String str4) {
        Bundle bundle = new Bundle();
        bundle.putString(str, str2);
        bundle.putString(str3, str4);
        return bundle;
    }

    public static String F0(StringBuilder sb, Optional optional, String str) {
        sb.append(optional);
        sb.append(str);
        return sb.toString();
    }

    public static View G(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup2, z);
    }

    public static String G0(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    public static ImmutableMap H(ImmutableMap.Builder builder, String str, Boolean bool, String str2, Boolean bool2) {
        builder.mo51put(str, bool);
        builder.mo51put(str2, bool2);
        return builder.build();
    }

    public static String H0(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static s81.a I(HubsComponentCategory hubsComponentCategory, String str, s81.a aVar, String str2) {
        String d = hubsComponentCategory.d();
        h.d(d, str);
        return aVar.o(str2, d);
    }

    public static String I0(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static s81.a J(String str, int i, s81.a aVar) {
        return aVar.s(str + i);
    }

    public static String J0(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static int K(int i, int i2, int i3) {
        return (Integer.valueOf(i).hashCode() + i2) * i3;
    }

    public static String K0(StringBuilder sb, Throwable th, char c) {
        sb.append(th);
        sb.append(c);
        return sb.toString();
    }

    public static b91 L(b91 b91, ArrayList arrayList) {
        return b91.toBuilder().e(arrayList).g();
    }

    public static String L0(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static YourLibraryResponseProto$YourLibraryResponseEntity.EntityCase M(y.a aVar, String str) {
        YourLibraryResponseProto$YourLibraryResponseEntity.EntityCase l = aVar.b().l();
        h.d(l, str);
        return l;
    }

    public static String M0(StringBuilder sb, Map map, String str) {
        sb.append(map);
        sb.append(str);
        return sb.toString();
    }

    public static s52.b N(String str, String str2, String str3, LinkType linkType, boolean z) {
        s52.b bVar = new s52.b(str);
        bVar.r(str2);
        bVar.s(str3);
        bVar.p(linkType);
        bVar.o(z);
        return bVar;
    }

    public static int N0(String str, int i) {
        return String.valueOf(str).length() + i;
    }

    public static s52.b O(String str, String str2, String str3, String str4, LinkType linkType) {
        s52.b bVar = new s52.b(str);
        bVar.r(str2);
        bVar.r(str3);
        bVar.s(str4);
        bVar.p(linkType);
        return bVar;
    }

    public static String O0(StringBuilder sb, boolean z, char c) {
        sb.append(z);
        sb.append(c);
        return sb.toString();
    }

    public static s52 P(s52.b bVar, String str, String str2, String str3) {
        bVar.q(str);
        bVar.m(str2);
        bVar.n(str3);
        return bVar.k();
    }

    public static String P0(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static Covers Q(String str, String str2, String str3, String str4, int i) {
        return new Covers.a(str, str2, str3, str4, i).a();
    }

    public static String Q0(b bVar, StringBuilder sb) {
        sb.append(bVar.getClass().getName());
        return sb.toString();
    }

    public static lqe R(qqe.b bVar, String str, String str2, nqe.b bVar2) {
        bVar.d(str, str2);
        bVar2.h(bVar.a());
        return bVar2.c();
    }

    public static String R0(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }

    public static lqe S(String str, int i, String str2, nqe.b bVar) {
        qqe.b b = qqe.b();
        b.c(str);
        b.e(i);
        b.b(str2);
        bVar.h(b.a());
        return bVar.c();
    }

    public static StringBuilder S0(char c) {
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        return sb;
    }

    public static qqe.b T(nqe.b bVar, rqe rqe, String str, int i, String str2) {
        bVar.e(rqe);
        qqe.b b = qqe.b();
        b.c(str);
        b.e(i);
        b.b(str2);
        return b;
    }

    public static StringBuilder T0(int i, String str) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        return sb;
    }

    public static qqe U(String str, int i, String str2, String str3, Integer num) {
        qqe.b b = qqe.b();
        b.c(str);
        b.e(i);
        b.b(str2);
        b.d(str3, num);
        return b.a();
    }

    public static StringBuilder U0(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    public static int V(int i, int i2, int i3, int i4) {
        return (i * i2) + i3 + i4;
    }

    public static StringBuilder V0(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static qqe W(String str, int i, String str2, String str3, String str4) {
        qqe.b b = qqe.b();
        b.c(str);
        b.e(i);
        b.b(str2);
        b.d(str3, str4);
        return b.a();
    }

    public static StringBuilder W0(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static rqe X(String str, String str2, String str3) {
        rqe.b e = rqe.e();
        e.c(str);
        e.l(str2);
        e.m(str3);
        return e.d();
    }

    public static StringBuilder X0(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static rqe Y(String str, String str2, String str3, String str4, String str5) {
        rqe.b e = rqe.e();
        e.c(str);
        e.l(str2);
        e.m(str3);
        e.g(str4);
        e.j(str5);
        return e.d();
    }

    public static int Y0(String str, int i, int i2) {
        return (str.hashCode() + i) * i2;
    }

    public static v Z(g gVar, g gVar2) {
        gVar.getClass();
        return new v(gVar2);
    }

    public static StringBuilder Z0(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static float a(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static Integer a0(int i, ImmutableMap.Builder builder, Integer num, int i2) {
        builder.mo51put(num, Integer.valueOf(i));
        return Integer.valueOf(i2);
    }

    public static StringBuilder a1(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static int b(int i, int i2) {
        return Integer.valueOf(i).hashCode() + i2;
    }

    public static Object b0(int i, HashMap hashMap) {
        return hashMap.get(new Integer(i));
    }

    public static StringBuilder b1(String str, b bVar, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(bVar);
        sb.append(str2);
        return sb;
    }

    public static int c(Set set, int i, int i2) {
        return (set.hashCode() + i) * i2;
    }

    public static Object c0(Cosmonaut cosmonaut, String str, Class cls, String str2) {
        h.e(cosmonaut, str);
        Object createCosmosService = cosmonaut.createCosmosService(cls);
        h.d(createCosmosService, str2);
        return createCosmosService;
    }

    public static StringBuilder c1(a aVar, String str) {
        d.a().b(aVar);
        return new StringBuilder(str);
    }

    public static wlf d(wlf wlf, wlf wlf2, wlf wlf3, wlf wlf4) {
        return ejf.b(new zea(wlf, wlf2, wlf3, wlf4));
    }

    public static Object d0(u uVar, String str, Class cls, String str2) {
        h.e(uVar, str);
        Object c = uVar.c(cls);
        h.d(c, str2);
        return c;
    }

    public static HashSet d1(HashMap hashMap, String str, n7.a aVar, int i) {
        hashMap.put(str, aVar);
        return new HashSet(i);
    }

    public static void e(int i, SnackbarManager snackbarManager) {
        snackbarManager.show(SnackbarConfiguration.builder(i).build());
    }

    public static Object e0(ContextTrack contextTrack, String str, String str2) {
        h.e(contextTrack, str);
        return contextTrack.metadata().get(str2);
    }

    public static wlf e1(fjf fjf) {
        return ejf.b(new bt2(fjf));
    }

    public static void f(int i, HashMap hashMap, String str, int i2, String str2, int i3, String str3, int i4, String str4) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
        hashMap.put(str3, Integer.valueOf(i3));
        hashMap.put(str4, Integer.valueOf(i4));
    }

    public static String f0(int i, String str, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        return sb.toString();
    }

    public static wlf f1(fjf fjf) {
        return ejf.b(new ka3(fjf));
    }

    public static void g(View view, float f, long j) {
        view.animate().alpha(f).setDuration(j).start();
    }

    public static int g0(int i, int i2, int i3, int i4) {
        return ((i * i2) / i3) + i4;
    }

    public static wlf g1(wlf wlf) {
        return ejf.b(new t0(wlf));
    }

    public static void h(s81 s81, String str, s51.a aVar, String str2, int[] iArr, String str3) {
        h.e(s81, str);
        h.e(aVar, str2);
        h.e(iArr, str3);
    }

    public static String h0(int i, String str, int i2, String str2, int i3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        return sb.toString();
    }

    public static wlf h1(wlf wlf) {
        return ejf.b(new zs2(wlf));
    }

    public static void i(s52.b bVar, String str, String str2, String str3, String str4) {
        bVar.q(str);
        bVar.m(str2);
        bVar.n(str3);
        bVar.n(str4);
    }

    public static String i0(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static wlf i1(wlf wlf) {
        return ejf.b(new ct2(wlf));
    }

    public static void j(s52.b bVar, String str, String str2, EnumMap enumMap, LinkType linkType) {
        bVar.q(str);
        bVar.m(str2);
        enumMap.put((EnumMap) linkType, (LinkType) bVar.k());
    }

    public static String j0(int i, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static int j1(Map.Entry entry, t tVar, int i, Object obj, int i2) {
        return tVar.a(i, obj, entry.getValue()) + i2;
    }

    public static void k(s52.b bVar, String str, String str2, Map map, LinkType linkType) {
        bVar.q(str);
        bVar.m(str2);
        map.put(linkType, bVar.k());
    }

    public static String k0(y.a aVar, String str, String str2) {
        YourLibraryResponseProto$YourLibraryEntityInfo m = aVar.b().m();
        h.d(m, str);
        String m2 = m.m();
        h.d(m2, str2);
        return m2;
    }

    public static wlf k1(wlf wlf) {
        return ejf.b(new bfa(wlf));
    }

    public static void l(String str, rqe.b bVar) {
        sqe.b c = sqe.c();
        c.c(str);
        bVar.n(c.a());
    }

    public static String l0(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getName());
        sb.append(str);
        return sb.toString();
    }

    public static wlf l1(wlf wlf) {
        return ejf.b(new cfa(wlf));
    }

    public static void m(String str, Integer num, rqe.b bVar) {
        sqe.b c = sqe.c();
        c.c(str);
        c.d(num);
        bVar.n(c.a());
    }

    public static String m0(Class cls, StringBuilder sb, String str) {
        sb.append(cls.getSimpleName());
        sb.append(str);
        return sb.toString();
    }

    public static wlf m1(wlf wlf) {
        return ljf.a(new com.spotify.music.nowplaying.common.view.share.d(wlf));
    }

    public static int n(boolean z, int i) {
        return Boolean.valueOf(z).hashCode() + i;
    }

    public static String n0(Object obj, StringBuilder sb, String str) {
        sb.append(obj.getClass().getName());
        sb.append(str);
        return sb.toString();
    }

    public static wlf n1(wlf wlf) {
        return ljf.a(new wbc(wlf));
    }

    public static void o(String str, Integer num, String str2, rqe.b bVar) {
        sqe.b c = sqe.c();
        c.c(str);
        c.d(num);
        c.f(str2);
        bVar.n(c.a());
    }

    public static String o0(String str, char c) {
        return str + c;
    }

    public static wlf o1(wlf wlf, wlf wlf2) {
        return ejf.b(new s71(wlf, wlf2));
    }

    public static void p(String str, String str2) {
        Assertion.g(str + str2);
    }

    public static String p0(String str, int i) {
        return str + i;
    }

    public static wlf p1(wlf wlf, wlf wlf2) {
        return ejf.b(new et2(wlf, wlf2));
    }

    public static void q(String str, String str2, rqe.b bVar) {
        sqe.b c = sqe.c();
        c.c(str);
        c.b(str2);
        bVar.n(c.a());
    }

    public static String q0(String str, int i, String str2) {
        return str + i + str2;
    }

    public static wlf q1(wlf wlf, wlf wlf2) {
        return ljf.a(new dsb(wlf, wlf2));
    }

    public static void r(String str, String str2, rqe.b bVar) {
        sqe.b c = sqe.c();
        c.c(str);
        c.e(str2);
        bVar.n(c.a());
    }

    public static int r0(long j, int i) {
        return Long.valueOf(j).hashCode() + i;
    }

    public static wlf r1(wlf wlf, wlf wlf2) {
        return ejf.b(new axd(wlf, wlf2));
    }

    public static void s(String str, String str2, rqe.b bVar) {
        sqe.b c = sqe.c();
        c.c(str);
        c.f(str2);
        bVar.n(c.a());
    }

    public static String s0(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static wlf s1(wlf wlf, wlf wlf2, wlf wlf3) {
        return ejf.b(new k71(wlf, wlf2, wlf3));
    }

    public static void t(String str, String str2, Integer num, rqe.b bVar) {
        sqe.b c = sqe.c();
        c.c(str);
        c.b(str2);
        c.d(num);
        bVar.n(c.a());
    }

    public static String t0(String str, long j) {
        return str + j;
    }

    public static wlf t1(wlf wlf, wlf wlf2, wlf wlf3, wlf wlf4) {
        return ejf.b(new r71(wlf, wlf2, wlf3, wlf4));
    }

    public static void u(String str, String str2, Integer num, String str3, rqe.b bVar) {
        sqe.b c = sqe.c();
        c.c(str);
        c.b(str2);
        c.d(num);
        c.f(str3);
        bVar.n(c.a());
    }

    public static String u0(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static void v(String str, String str2, String str3, rqe.b bVar) {
        sqe.b c = sqe.c();
        c.c(str);
        c.b(str2);
        c.e(str3);
        bVar.n(c.a());
    }

    public static String v0(String str, n7 n7Var, String str2, n7 n7Var2) {
        return str + n7Var + str2 + n7Var2;
    }

    public static void w(String str, String str2, String str3, rqe.b bVar) {
        sqe.b c = sqe.c();
        c.c(str);
        c.b(str2);
        c.f(str3);
        bVar.n(c.a());
    }

    public static String w0(String str, File file, String str2) {
        return str + file + str2;
    }

    public static void x(String str, String str2, String str3, String str4, String str5, String str6) {
        h.e(str, str2);
        h.e(str3, str4);
        h.e(str5, str6);
    }

    public static String x0(String str, String str2) {
        return str + str2;
    }

    public static Intent y(Context context, Class cls, String str, String str2) {
        Intent intent = new Intent(context, cls);
        intent.putExtra(str, str2);
        return intent;
    }

    public static String y0(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static void z(String str, StringBuilder sb, String str2) {
        sb.append(SpotifyUri.g(str));
        sb.append(str2);
    }

    public static String z0(String str, f fVar) {
        return str + fVar;
    }
}
