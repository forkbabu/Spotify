package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.c;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.p;
import java.util.Arrays;
import java.util.List;

@Keep
public class AnalyticsConnectorRegistrar implements h {
    @Override // com.google.firebase.components.h
    @Keep
    public List<d<?>> getComponents() {
        d.b a = d.a(oy.class);
        a.b(p.f(c.class));
        a.b(p.f(Context.class));
        a.b(p.f(r10.class));
        a.f(a.a);
        a.e();
        return Arrays.asList(a.d(), a20.a("fire-analytics", "17.5.0"));
    }
}
