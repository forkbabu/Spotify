package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.b3;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.c2;
import com.google.android.gms.internal.measurement.d1;
import com.google.android.gms.internal.measurement.e1;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.k5;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.o1;
import com.google.android.gms.internal.measurement.u3;
import com.google.android.gms.internal.measurement.w0;
import com.google.android.gms.internal.measurement.w7;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.zzbv$zzd;
import com.google.android.gms.internal.measurement.zzbv$zzf;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class v9 extends p9 {
    v9(r9 r9Var) {
        super(r9Var);
    }

    private static String D(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    static List<Long> E(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    private static List<a1> G(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                a1.a Q = a1.Q();
                for (String str : bundle.keySet()) {
                    a1.a Q2 = a1.Q();
                    Q2.y(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        Q2.v(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        Q2.A((String) obj);
                    } else if (obj instanceof Double) {
                        Q2.u(((Double) obj).doubleValue());
                    }
                    Q.w(Q2);
                }
                if (Q.C() > 0) {
                    arrayList.add((a1) ((f4) Q.s()));
                }
            }
        }
        return arrayList;
    }

    private static void K(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    private final void L(StringBuilder sb, int i, m0 m0Var) {
        if (m0Var != null) {
            K(sb, i);
            sb.append("filter {\n");
            if (m0Var.z()) {
                O(sb, i, "complement", Boolean.valueOf(m0Var.A()));
            }
            if (m0Var.B()) {
                O(sb, i, "param_name", super.e().y(m0Var.C()));
            }
            if (m0Var.v()) {
                int i2 = i + 1;
                zzbv$zzf w = m0Var.w();
                if (w != null) {
                    K(sb, i2);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if (w.u()) {
                        O(sb, i2, "match_type", w.v().name());
                    }
                    if (w.w()) {
                        O(sb, i2, "expression", w.x());
                    }
                    if (w.y()) {
                        O(sb, i2, "case_sensitive", Boolean.valueOf(w.z()));
                    }
                    if (w.B() > 0) {
                        K(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String str : w.A()) {
                            K(sb, i2 + 2);
                            sb.append(str);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    K(sb, i2);
                    sb.append("}\n");
                }
            }
            if (m0Var.x()) {
                M(sb, i + 1, "number_filter", m0Var.y());
            }
            K(sb, i);
            sb.append("}\n");
        }
    }

    private static void M(StringBuilder sb, int i, String str, zzbv$zzd zzbv_zzd) {
        if (zzbv_zzd != null) {
            K(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (zzbv_zzd.u()) {
                O(sb, i, "comparison_type", zzbv_zzd.v().name());
            }
            if (zzbv_zzd.w()) {
                O(sb, i, "match_as_float", Boolean.valueOf(zzbv_zzd.x()));
            }
            if (zzbv_zzd.y()) {
                O(sb, i, "comparison_value", zzbv_zzd.z());
            }
            if (zzbv_zzd.A()) {
                O(sb, i, "min_comparison_value", zzbv_zzd.B());
            }
            if (zzbv_zzd.C()) {
                O(sb, i, "max_comparison_value", zzbv_zzd.D());
            }
            K(sb, i);
            sb.append("}\n");
        }
    }

    private static void N(StringBuilder sb, int i, String str, d1 d1Var) {
        if (d1Var != null) {
            K(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (d1Var.G() != 0) {
                K(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : d1Var.E()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append('\n');
            }
            if (d1Var.z() != 0) {
                K(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : d1Var.v()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append('\n');
            }
            if (d1Var.J() != 0) {
                K(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (x0 x0Var : d1Var.I()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    sb.append(x0Var.w() ? Integer.valueOf(x0Var.x()) : null);
                    sb.append(":");
                    sb.append(x0Var.y() ? Long.valueOf(x0Var.z()) : null);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (d1Var.L() != 0) {
                K(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (e1 e1Var : d1Var.K()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    sb.append(e1Var.x() ? Integer.valueOf(e1Var.y()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long l3 : e1Var.z()) {
                        long longValue = l3.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            K(sb, 3);
            sb.append("}\n");
        }
    }

    private static void O(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            K(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append('\n');
        }
    }

    private final void P(StringBuilder sb, int i, List<a1> list) {
        if (list != null) {
            int i2 = i + 1;
            for (a1 a1Var : list) {
                if (a1Var != null) {
                    K(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (!w7.b() || !super.j().r(t.y0)) {
                        O(sb, i2, "name", super.e().y(a1Var.B()));
                        O(sb, i2, "string_value", a1Var.G());
                        O(sb, i2, "int_value", a1Var.I() ? Long.valueOf(a1Var.J()) : null);
                        if (a1Var.M()) {
                            d = Double.valueOf(a1Var.N());
                        }
                        O(sb, i2, "double_value", d);
                    } else {
                        O(sb, i2, "name", a1Var.A() ? super.e().y(a1Var.B()) : null);
                        O(sb, i2, "string_value", a1Var.F() ? a1Var.G() : null);
                        O(sb, i2, "int_value", a1Var.I() ? Long.valueOf(a1Var.J()) : null);
                        if (a1Var.M()) {
                            d = Double.valueOf(a1Var.N());
                        }
                        O(sb, i2, "double_value", d);
                        if (a1Var.P() > 0) {
                            P(sb, i2, a1Var.O());
                        }
                    }
                    K(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    static boolean R(r rVar, fa faVar) {
        if (rVar != null) {
            return !TextUtils.isEmpty(faVar.b) || !TextUtils.isEmpty(faVar.A);
        }
        throw new NullPointerException("null reference");
    }

    static boolean S(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static boolean T(List<Long> list, int i) {
        if (i >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
    }

    static int u(c1.a aVar, String str) {
        for (int i = 0; i < aVar.T(); i++) {
            if (str.equals(aVar.R(i).D())) {
                return i;
            }
        }
        return -1;
    }

    static a1 y(y0 y0Var, String str) {
        for (a1 a1Var : y0Var.v()) {
            if (a1Var.B().equals(str)) {
                return a1Var;
            }
        }
        return null;
    }

    static <Builder extends k5> Builder z(Builder builder, byte[] bArr) {
        u3 c = u3.c();
        if (c != null) {
            b3 b3Var = (b3) builder;
            b3Var.getClass();
            b3Var.m(bArr, 0, bArr.length, c);
            return b3Var;
        }
        b3 b3Var2 = (b3) builder;
        b3Var2.getClass();
        b3Var2.k(bArr, 0, bArr.length);
        return b3Var2;
    }

    /* access modifiers changed from: package-private */
    public final String A(l0 l0Var) {
        if (l0Var == null) {
            return "null";
        }
        StringBuilder V0 = je.V0("\nevent_filter {\n");
        if (l0Var.x()) {
            O(V0, 0, "filter_id", Integer.valueOf(l0Var.y()));
        }
        O(V0, 0, "event_name", super.e().v(l0Var.z()));
        String D = D(l0Var.E(), l0Var.F(), l0Var.H());
        if (!D.isEmpty()) {
            O(V0, 0, "filter_type", D);
        }
        if (l0Var.C()) {
            M(V0, 1, "event_count_filter", l0Var.D());
        }
        if (l0Var.B() > 0) {
            V0.append("  filters {\n");
            for (m0 m0Var : l0Var.A()) {
                L(V0, 2, m0Var);
            }
        }
        K(V0, 1);
        V0.append("}\n}\n");
        return V0.toString();
    }

    /* access modifiers changed from: package-private */
    public final String B(n0 n0Var) {
        StringBuilder V0 = je.V0("\nproperty_filter {\n");
        if (n0Var.v()) {
            O(V0, 0, "filter_id", Integer.valueOf(n0Var.w()));
        }
        O(V0, 0, "property_name", super.e().z(n0Var.x()));
        String D = D(n0Var.z(), n0Var.A(), n0Var.C());
        if (!D.isEmpty()) {
            O(V0, 0, "filter_type", D);
        }
        L(V0, 1, n0Var.y());
        V0.append("}\n");
        return V0.toString();
    }

    /* access modifiers changed from: package-private */
    public final String C(b1 b1Var) {
        StringBuilder V0 = je.V0("\nbatch {\n");
        for (c1 c1Var : b1Var.v()) {
            if (c1Var != null) {
                K(V0, 1);
                V0.append("bundle {\n");
                if (c1Var.E()) {
                    O(V0, 1, "protocol_version", Integer.valueOf(c1Var.g0()));
                }
                O(V0, 1, "platform", c1Var.y1());
                if (c1Var.I1()) {
                    O(V0, 1, "gmp_version", Long.valueOf(c1Var.F()));
                }
                if (c1Var.H()) {
                    O(V0, 1, "uploading_gmp_version", Long.valueOf(c1Var.I()));
                }
                if (c1Var.p0()) {
                    O(V0, 1, "dynamite_version", Long.valueOf(c1Var.q0()));
                }
                if (c1Var.a0()) {
                    O(V0, 1, "config_version", Long.valueOf(c1Var.b0()));
                }
                O(V0, 1, "gmp_app_id", c1Var.S());
                O(V0, 1, "admob_app_id", c1Var.o0());
                O(V0, 1, "app_id", c1Var.G1());
                O(V0, 1, "app_version", c1Var.H1());
                if (c1Var.X()) {
                    O(V0, 1, "app_version_major", Integer.valueOf(c1Var.Y()));
                }
                O(V0, 1, "firebase_instance_id", c1Var.W());
                if (c1Var.N()) {
                    O(V0, 1, "dev_cert_hash", Long.valueOf(c1Var.O()));
                }
                O(V0, 1, "app_store", c1Var.F1());
                if (c1Var.Y0()) {
                    O(V0, 1, "upload_timestamp_millis", Long.valueOf(c1Var.Z0()));
                }
                if (c1Var.g1()) {
                    O(V0, 1, "start_timestamp_millis", Long.valueOf(c1Var.h1()));
                }
                if (c1Var.n1()) {
                    O(V0, 1, "end_timestamp_millis", Long.valueOf(c1Var.o1()));
                }
                if (c1Var.s1()) {
                    O(V0, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c1Var.t1()));
                }
                if (c1Var.v1()) {
                    O(V0, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c1Var.w1()));
                }
                O(V0, 1, "app_instance_id", c1Var.M());
                O(V0, 1, "resettable_device_id", c1Var.J());
                O(V0, 1, "device_id", c1Var.Z());
                O(V0, 1, "ds_id", c1Var.e0());
                if (c1Var.K()) {
                    O(V0, 1, "limited_ad_tracking", Boolean.valueOf(c1Var.L()));
                }
                O(V0, 1, "os_version", c1Var.A1());
                O(V0, 1, "device_model", c1Var.B1());
                O(V0, 1, "user_default_language", c1Var.C1());
                if (c1Var.D1()) {
                    O(V0, 1, "time_zone_offset_minutes", Integer.valueOf(c1Var.E1()));
                }
                if (c1Var.P()) {
                    O(V0, 1, "bundle_sequential_index", Integer.valueOf(c1Var.Q()));
                }
                if (c1Var.T()) {
                    O(V0, 1, "service_upload", Boolean.valueOf(c1Var.U()));
                }
                O(V0, 1, "health_monitor", c1Var.R());
                if (!super.j().r(t.G0) && c1Var.c0() && c1Var.d0() != 0) {
                    O(V0, 1, "android_id", Long.valueOf(c1Var.d0()));
                }
                if (c1Var.f0()) {
                    O(V0, 1, "retry_counter", Integer.valueOf(c1Var.n0()));
                }
                if (c1Var.s0()) {
                    O(V0, 1, "consent_signals", c1Var.t0());
                }
                List<f1> K0 = c1Var.K0();
                if (K0 != null) {
                    for (f1 f1Var : K0) {
                        if (f1Var != null) {
                            K(V0, 2);
                            V0.append("user_property {\n");
                            Double d = null;
                            O(V0, 2, "set_timestamp_millis", f1Var.y() ? Long.valueOf(f1Var.z()) : null);
                            O(V0, 2, "name", super.e().z(f1Var.D()));
                            O(V0, 2, "string_value", f1Var.G());
                            O(V0, 2, "int_value", f1Var.H() ? Long.valueOf(f1Var.I()) : null);
                            if (f1Var.J()) {
                                d = Double.valueOf(f1Var.K());
                            }
                            O(V0, 2, "double_value", d);
                            K(V0, 2);
                            V0.append("}\n");
                        }
                    }
                }
                List<w0> V = c1Var.V();
                if (V != null) {
                    for (w0 w0Var : V) {
                        if (w0Var != null) {
                            K(V0, 2);
                            V0.append("audience_membership {\n");
                            if (w0Var.x()) {
                                O(V0, 2, "audience_id", Integer.valueOf(w0Var.y()));
                            }
                            if (w0Var.D()) {
                                O(V0, 2, "new_audience", Boolean.valueOf(w0Var.E()));
                            }
                            N(V0, 2, "current_data", w0Var.A());
                            if (w0Var.B()) {
                                N(V0, 2, "previous_data", w0Var.C());
                            }
                            K(V0, 2);
                            V0.append("}\n");
                        }
                    }
                }
                List<y0> y0 = c1Var.y0();
                if (y0 != null) {
                    for (y0 y0Var : y0) {
                        if (y0Var != null) {
                            K(V0, 2);
                            V0.append("event {\n");
                            O(V0, 2, "name", super.e().v(y0Var.F()));
                            if (y0Var.G()) {
                                O(V0, 2, "timestamp_millis", Long.valueOf(y0Var.H()));
                            }
                            if (y0Var.I()) {
                                O(V0, 2, "previous_timestamp_millis", Long.valueOf(y0Var.J()));
                            }
                            if (y0Var.K()) {
                                O(V0, 2, "count", Integer.valueOf(y0Var.L()));
                            }
                            if (y0Var.D() != 0) {
                                P(V0, 2, y0Var.v());
                            }
                            K(V0, 2);
                            V0.append("}\n");
                        }
                    }
                }
                K(V0, 1);
                V0.append("}\n");
            }
        }
        V0.append("}\n");
        return V0.toString();
    }

    /* access modifiers changed from: package-private */
    public final List<Long> F(List<Long> list, List<Integer> list2) {
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                super.l().H().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    super.l().H().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            size = size2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, size);
    }

    /* access modifiers changed from: package-private */
    public final void H(y0.a aVar, String str, Object obj) {
        List<a1> B = aVar.B();
        int i = 0;
        while (true) {
            if (i >= B.size()) {
                i = -1;
                break;
            } else if (str.equals(B.get(i).B())) {
                break;
            } else {
                i++;
            }
        }
        a1.a Q = a1.Q();
        Q.y(str);
        if (obj instanceof Long) {
            Q.v(((Long) obj).longValue());
        } else if (obj instanceof String) {
            Q.A((String) obj);
        } else if (obj instanceof Double) {
            Q.u(((Double) obj).doubleValue());
        } else if (w7.b() && super.j().r(t.A0) && (obj instanceof Bundle[])) {
            Q.x(G((Bundle[]) obj));
        }
        if (i >= 0) {
            aVar.t(i, Q);
        } else {
            aVar.w(Q);
        }
    }

    /* access modifiers changed from: package-private */
    public final void I(a1.a aVar, Object obj) {
        if (obj != null) {
            aVar.t();
            aVar.z();
            aVar.B();
            aVar.D();
            if (obj instanceof String) {
                aVar.A((String) obj);
            } else if (obj instanceof Long) {
                aVar.v(((Long) obj).longValue());
            } else if (obj instanceof Double) {
                aVar.u(((Double) obj).doubleValue());
            } else if (!w7.b() || !super.j().r(t.A0) || !(obj instanceof Bundle[])) {
                super.l().E().b("Ignoring invalid (type) event param value", obj);
            } else {
                aVar.x(G((Bundle[]) obj));
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* access modifiers changed from: package-private */
    public final void J(f1.a aVar, Object obj) {
        if (obj != null) {
            aVar.t();
            aVar.x();
            aVar.A();
            if (obj instanceof String) {
                aVar.z((String) obj);
            } else if (obj instanceof Long) {
                aVar.y(((Long) obj).longValue());
            } else if (obj instanceof Double) {
                aVar.u(((Double) obj).doubleValue());
            } else {
                super.l().E().b("Ignoring invalid (type) user attribute value", obj);
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean Q(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((d) super.d()).getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    public final Object U(y0 y0Var, String str) {
        a1 y = y(y0Var, str);
        if (y == null) {
            return null;
        }
        if (y.F()) {
            return y.G();
        }
        if (y.I()) {
            return Long.valueOf(y.J());
        }
        if (y.M()) {
            return Double.valueOf(y.N());
        }
        if (!w7.b() || !super.j().r(t.A0) || y.P() <= 0) {
            return null;
        }
        List<a1> O = y.O();
        ArrayList arrayList = new ArrayList();
        for (a1 a1Var : O) {
            if (a1Var != null) {
                Bundle bundle = new Bundle();
                for (a1 a1Var2 : a1Var.O()) {
                    if (a1Var2.F()) {
                        bundle.putString(a1Var2.B(), a1Var2.G());
                    } else if (a1Var2.I()) {
                        bundle.putLong(a1Var2.B(), a1Var2.J());
                    } else if (a1Var2.M()) {
                        bundle.putDouble(a1Var2.B(), a1Var2.N());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* access modifiers changed from: package-private */
    public final byte[] V(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            super.l().E().b("Failed to ungzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public final byte[] W(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            super.l().E().b("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    public final List<Integer> X() {
        Context i = this.b.i();
        q3<Long> q3Var = t.b;
        o1 a = o1.a(i.getContentResolver(), c2.a("com.google.android.gms.measurement"));
        Map<String, String> emptyMap = a == null ? Collections.emptyMap() : a.b();
        if (emptyMap == null || emptyMap.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = t.P.a(null).intValue();
        Iterator<Map.Entry<String, String>> it = emptyMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            if (next.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            super.l().H().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    super.l().H().b("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.p9
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long v(byte[] bArr) {
        super.f().b();
        MessageDigest D0 = z9.D0();
        if (D0 != null) {
            return z9.z(D0.digest(bArr));
        }
        super.l().E().a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final <T extends Parcelable> T w(byte[] bArr, Parcelable.Creator<T> creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return creator.createFromParcel(obtain);
        } catch (SafeParcelReader.ParseException unused) {
            super.l().E().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* access modifiers changed from: package-private */
    public final y0 x(k kVar) {
        y0.a M = y0.M();
        M.E(kVar.e);
        m mVar = kVar.f;
        mVar.getClass();
        p pVar = new p(mVar);
        while (pVar.hasNext()) {
            String str = (String) pVar.next();
            a1.a Q = a1.Q();
            Q.y(str);
            I(Q, kVar.f.o2(str));
            M.w(Q);
        }
        return (y0) ((f4) M.s());
    }
}
