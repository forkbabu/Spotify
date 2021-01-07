package com.google.android.gms.internal.measurement;

import com.adjust.sdk.Constants;

public final class m7 implements n7 {
    private static final b2<Long> A;
    private static final b2<Long> B;
    private static final b2<Long> C;
    private static final b2<Long> D;
    private static final b2<Long> E;
    private static final b2<String> F;
    private static final b2<Long> G;
    private static final b2<Long> a;
    private static final b2<Long> b;
    private static final b2<String> c;
    private static final b2<String> d;
    private static final b2<Long> e;
    private static final b2<Long> f;
    private static final b2<Long> g;
    private static final b2<Long> h;
    private static final b2<Long> i;
    private static final b2<Long> j;
    private static final b2<Long> k;
    private static final b2<Long> l;
    private static final b2<Long> m;
    private static final b2<Long> n;
    private static final b2<Long> o;
    private static final b2<Long> p;
    private static final b2<Long> q;
    private static final b2<Long> r;
    private static final b2<Long> s;
    private static final b2<Long> t;
    private static final b2<Long> u;
    private static final b2<Long> v;
    private static final b2<Long> w;
    private static final b2<Long> x;
    private static final b2<Long> y;
    private static final b2<Long> z;

    static {
        k2 k2Var = new k2(c2.a("com.google.android.gms.measurement"));
        a = k2Var.a("measurement.ad_id_cache_time", 10000);
        b = k2Var.a("measurement.config.cache_time", 86400000);
        k2Var.b("measurement.log_tag", "FA");
        c = k2Var.b("measurement.config.url_authority", "app-measurement.com");
        d = k2Var.b("measurement.config.url_scheme", Constants.SCHEME);
        e = k2Var.a("measurement.upload.debug_upload_interval", 1000);
        f = k2Var.a("measurement.lifetimevalue.max_currency_tracked", 4);
        g = k2Var.a("measurement.store.max_stored_events_per_app", 100000);
        h = k2Var.a("measurement.experiment.max_ids", 50);
        i = k2Var.a("measurement.audience.filter_result_max_count", 200);
        j = k2Var.a("measurement.alarm_manager.minimum_interval", 60000);
        k = k2Var.a("measurement.upload.minimum_delay", 500);
        l = k2Var.a("measurement.monitoring.sample_period_millis", 86400000);
        m = k2Var.a("measurement.upload.realtime_upload_interval", 10000);
        n = k2Var.a("measurement.upload.refresh_blacklisted_config_interval", 604800000);
        k2Var.a("measurement.config.cache_time.service", 3600000);
        o = k2Var.a("measurement.service_client.idle_disconnect_millis", 5000);
        k2Var.b("measurement.log_tag.service", "FA-SVC");
        p = k2Var.a("measurement.upload.stale_data_deletion_interval", 86400000);
        q = k2Var.a("measurement.upload.backoff_period", 43200000);
        r = k2Var.a("measurement.upload.initial_upload_delay_time", 15000);
        s = k2Var.a("measurement.upload.interval", 3600000);
        t = k2Var.a("measurement.upload.max_bundle_size", 65536);
        u = k2Var.a("measurement.upload.max_bundles", 100);
        v = k2Var.a("measurement.upload.max_conversions_per_day", 500);
        w = k2Var.a("measurement.upload.max_error_events_per_day", 1000);
        x = k2Var.a("measurement.upload.max_events_per_bundle", 1000);
        y = k2Var.a("measurement.upload.max_events_per_day", 100000);
        z = k2Var.a("measurement.upload.max_public_events_per_day", 50000);
        A = k2Var.a("measurement.upload.max_queue_time", 2419200000L);
        B = k2Var.a("measurement.upload.max_realtime_events_per_day", 10);
        C = k2Var.a("measurement.upload.max_batch_size", 65536);
        D = k2Var.a("measurement.upload.retry_count", 6);
        E = k2Var.a("measurement.upload.retry_time", 1800000);
        F = k2Var.b("measurement.upload.url", "https://app-measurement.com/a");
        G = k2Var.a("measurement.upload.window_interval", 3600000);
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long A() {
        return o.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long B() {
        return C.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long C() {
        return u.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long D() {
        return D.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long E() {
        return A.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long F() {
        return s.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long G() {
        return B.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long a() {
        return a.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long b() {
        return b.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final String c() {
        return c.f();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long d() {
        return l.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final String e() {
        return d.f();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long f() {
        return e.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long g() {
        return f.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long h() {
        return g.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long i() {
        return m.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long j() {
        return j.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long k() {
        return p.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long l() {
        return q.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long m() {
        return n.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long n() {
        return v.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long o() {
        return y.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long p() {
        return G.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long q() {
        return t.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long r() {
        return h.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long s() {
        return z.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long t() {
        return i.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long u() {
        return w.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long v() {
        return E.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long w() {
        return x.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final String x() {
        return F.f();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long y() {
        return k.f().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.n7
    public final long z() {
        return r.f().longValue();
    }
}
