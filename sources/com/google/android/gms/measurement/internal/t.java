package com.google.android.gms.measurement.internal;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class t {
    public static q3<Long> A = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, l0.a);
    public static q3<Boolean> A0;
    public static q3<Long> B = a("measurement.upload.retry_time", 1800000L, 1800000L, o0.a);
    public static q3<Boolean> B0;
    public static q3<Integer> C = a("measurement.upload.retry_count", 6, 6, n0.a);
    public static q3<Boolean> C0;
    public static q3<Long> D = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, q0.a);
    public static q3<Boolean> D0;
    public static q3<Integer> E = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, p0.a);
    public static q3<Boolean> E0;
    public static q3<Integer> F = a("measurement.audience.filter_result_max_count", 200, 200, r0.a);
    public static q3<Boolean> F0;
    public static q3<Integer> G = a("measurement.upload.max_public_user_properties", 25, 25, null);
    public static q3<Boolean> G0;
    public static q3<Integer> H = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
    public static q3<Boolean> H0;
    public static q3<Integer> I = a("measurement.upload.max_public_event_params", 25, 25, null);
    public static q3<Boolean> I0;
    public static q3<Long> J = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, u0.a);
    public static q3<Boolean> J0;
    public static q3<Boolean> K;
    public static q3<Boolean> K0;
    public static q3<String> L = a("measurement.test.string_flag", "---", "---", w0.a);
    public static q3<Boolean> L0;
    public static q3<Long> M = a("measurement.test.long_flag", -1L, -1L, v0.a);
    public static q3<Long> M0 = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, f3.a);
    public static q3<Integer> N = a("measurement.test.int_flag", -2, -2, y0.a);
    public static q3<Boolean> N0;
    public static q3<Double> O;
    public static q3<Boolean> O0;
    public static q3<Integer> P = a("measurement.experiment.max_ids", 50, 50, a1.a);
    public static q3<Boolean> P0;
    public static q3<Integer> Q = a("measurement.max_bundles_per_iteration", 100, 100, z0.a);
    public static q3<Boolean> Q0;
    public static q3<Boolean> R;
    public static q3<Integer> R0 = a("measurement.service.storage_consent_support_version", 203290, 203290, l3.a);
    public static q3<Boolean> S;
    public static q3<Boolean> S0;
    public static q3<Boolean> T;
    public static q3<Boolean> T0;
    public static q3<Boolean> U;
    public static q3<Boolean> U0;
    public static q3<Boolean> V;
    public static q3<Boolean> W;
    public static q3<Boolean> X;
    public static q3<Boolean> Y;
    public static q3<Boolean> Z;
    private static List<q3<?>> a = Collections.synchronizedList(new ArrayList());
    public static q3<Boolean> a0;
    public static q3<Long> b = a("measurement.ad_id_cache_time", 10000L, 10000L, s.a);
    public static q3<Boolean> b0;
    public static q3<Long> c = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, v.a);
    public static q3<Boolean> c0;
    public static q3<Long> d = a("measurement.config.cache_time", 86400000L, 3600000L, f0.a);
    public static q3<Boolean> d0;
    public static q3<String> e = a("measurement.config.url_scheme", Constants.SCHEME, Constants.SCHEME, s0.a);
    public static q3<Boolean> e0;
    public static q3<String> f = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", c1.a);
    public static q3<Boolean> f0;
    public static q3<Integer> g = a("measurement.upload.max_bundles", 100, 100, p1.a);
    public static q3<Boolean> g0;
    public static q3<Integer> h = a("measurement.upload.max_batch_size", 65536, 65536, y1.a);
    public static q3<Boolean> h0;
    public static q3<Integer> i = a("measurement.upload.max_bundle_size", 65536, 65536, m2.a);
    public static q3<Boolean> i0;
    public static q3<Integer> j;
    public static q3<Boolean> j0;
    public static q3<Integer> k = a("measurement.upload.max_events_per_day", 100000, 100000, j3.a);
    public static q3<Boolean> k0;
    public static q3<Integer> l;
    public static q3<Boolean> l0;
    public static q3<Integer> m = a("measurement.upload.max_public_events_per_day", 50000, 50000, x.a);
    public static q3<Boolean> m0;
    public static q3<Integer> n = a("measurement.upload.max_conversions_per_day", 10000, 10000, w.a);
    public static q3<Boolean> n0;
    public static q3<Integer> o = a("measurement.upload.max_realtime_events_per_day", 10, 10, z.a);
    public static q3<Boolean> o0;
    public static q3<Integer> p = a("measurement.store.max_stored_events_per_app", 100000, 100000, y.a);
    public static q3<Boolean> p0;
    public static q3<String> q = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", c0.a);
    public static q3<Boolean> q0;
    public static q3<Long> r = a("measurement.upload.backoff_period", 43200000L, 43200000L, b0.a);
    public static q3<Boolean> r0;
    public static q3<Long> s = a("measurement.upload.window_interval", 3600000L, 3600000L, e0.a);
    public static q3<Boolean> s0;
    public static q3<Long> t = a("measurement.upload.interval", 3600000L, 3600000L, d0.a);
    public static q3<Boolean> t0;
    public static q3<Long> u = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, g0.a);
    public static q3<Boolean> u0;
    public static q3<Long> v = a("measurement.upload.debug_upload_interval", 1000L, 1000L, i0.a);
    public static q3<Boolean> v0;
    public static q3<Long> w = a("measurement.upload.minimum_delay", 500L, 500L, h0.a);
    public static q3<Boolean> w0;
    public static q3<Long> x = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, k0.a);
    public static q3<Boolean> x0;
    public static q3<Long> y = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, j0.a);
    public static q3<Boolean> y0;
    public static q3<Long> z = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, m0.a);
    public static q3<Boolean> z0;

    static {
        Boolean bool = Boolean.FALSE;
        Collections.synchronizedSet(new HashSet());
        Integer valueOf = Integer.valueOf((int) Constants.ONE_SECOND);
        j = a("measurement.upload.max_events_per_bundle", valueOf, valueOf, v2.a);
        l = a("measurement.upload.max_error_events_per_day", valueOf, valueOf, u.a);
        K = a("measurement.test.boolean_flag", bool, bool, t0.a);
        Double valueOf2 = Double.valueOf(-3.0d);
        O = a("measurement.test.double_flag", valueOf2, valueOf2, x0.a);
        R = a("measurement.validation.internal_limits_internal_event_params", bool, bool, d1.a);
        Boolean bool2 = Boolean.TRUE;
        S = a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", bool2, bool2, f1.a);
        T = a("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, e1.a);
        U = a("measurement.collection.efficient_engagement_reporting_enabled_2", bool2, bool2, h1.a);
        V = a("measurement.collection.redundant_engagement_removal_enabled", bool, bool, g1.a);
        W = a("measurement.client.freeride_engagement_fix", bool2, bool2, j1.a);
        X = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, i1.a);
        Y = a("measurement.quality.checksum", bool, bool, null);
        Z = a("measurement.sdk.dynamite.allow_remote_dynamite2", bool, bool, l1.a);
        a0 = a("measurement.sdk.collection.validate_param_names_alphabetical", bool2, bool2, k1.a);
        b0 = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, n1.a);
        c0 = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, m1.a);
        d0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, o1.a);
        e0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, r1.a);
        f0 = a("measurement.sdk.collection.last_deep_link_referrer2", bool2, bool2, q1.a);
        g0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, t1.a);
        h0 = a("measurement.sdk.collection.last_gclid_from_referrer2", bool, bool, s1.a);
        i0 = a("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, v1.a);
        j0 = a("measurement.upload.file_lock_state_check", bool, bool, u1.a);
        k0 = a("measurement.ga.ga_app_id", bool, bool, x1.a);
        l0 = a("measurement.lifecycle.app_backgrounded_tracking", bool2, bool2, w1.a);
        m0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, z1.a);
        n0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, b2.a);
        o0 = a("measurement.lifecycle.app_backgrounded_engagement", bool, bool, a2.a);
        p0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, e2.a);
        q0 = a("measurement.service.use_appinfo_modified", bool, bool, d2.a);
        r0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, g2.a);
        s0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, f2.a);
        t0 = a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, i2.a);
        u0 = a("measurement.upload.file_truncate_fix", bool, bool, h2.a);
        v0 = a("measurement.sdk.referrer.delayed_install_referrer_api", bool, bool, k2.a);
        w0 = a("measurement.sdk.screen.disabling_automatic_reporting", bool2, bool2, j2.a);
        x0 = a("measurement.sdk.screen.manual_screen_view_logging", bool2, bool2, l2.a);
        y0 = a("measurement.gold.enhanced_ecommerce.format_logs", bool2, bool2, o2.a);
        z0 = a("measurement.gold.enhanced_ecommerce.nested_param_daily_event_count", bool2, bool2, n2.a);
        A0 = a("measurement.gold.enhanced_ecommerce.upload_nested_complex_events", bool2, bool2, q2.a);
        B0 = a("measurement.gold.enhanced_ecommerce.log_nested_complex_events", bool2, bool2, p2.a);
        C0 = a("measurement.gold.enhanced_ecommerce.updated_schema.client", bool2, bool2, s2.a);
        D0 = a("measurement.gold.enhanced_ecommerce.updated_schema.service", bool2, bool2, r2.a);
        a("measurement.collection.synthetic_data_mitigation", bool, bool, u2.a);
        E0 = a("measurement.service.configurable_service_limits", bool2, bool2, t2.a);
        F0 = a("measurement.client.configurable_service_limits", bool2, bool2, w2.a);
        G0 = a("measurement.androidId.delete_feature", bool2, bool2, y2.a);
        H0 = a("measurement.client.global_params", bool2, bool2, x2.a);
        I0 = a("measurement.service.global_params", bool2, bool2, a3.a);
        J0 = a("measurement.service.global_params_in_payload", bool2, bool2, z2.a);
        K0 = a("measurement.client.string_reader", bool2, bool2, c3.a);
        L0 = a("measurement.sdk.attribution.cache", bool2, bool2, b3.a);
        N0 = a("measurement.service.database_return_empty_collection", bool2, bool2, e3.a);
        O0 = a("measurement.service.ssaid_removal", bool2, bool2, h3.a);
        P0 = a("measurement.client.consent_state_v1", bool, bool, g3.a);
        Q0 = a("measurement.service.consent_state_v1_W33", bool, bool, i3.a);
        S0 = a("measurement.client.ad_impression.dev", bool, bool, k3.a);
        T0 = a("measurement.service.ad_impression", bool, bool, n3.a);
        U0 = a("measurement.service.separate_public_internal_event_blacklisting", bool, bool, m3.a);
    }

    private static <V> q3<V> a(String str, V v2, V v3, o3<V> o3Var) {
        q3<V> q3Var = new q3<>(str, v2, v3, o3Var, null);
        a.add(q3Var);
        return q3Var;
    }
}