package com.spotify.remoteconfig;

import com.adjust.sdk.Constants;
import com.spotify.remoteconfig.runtime.model.PropertyModel;
import com.spotify.remoteconfig.runtime.model.b;
import java.util.ArrayList;
import java.util.List;

public abstract class AndroidFeaturePremiumReactivationProperties implements n0e {

    public enum ContentProvider implements m0e {
        WEBSITE("website"),
        WWW_ACCOUNT_PAGES("www-account-pages");
        
        final String value;

        private ContentProvider(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum UserPolicy implements m0e {
        CONTROL("control"),
        EXPERIMENT("experiment");
        
        final String value;

        private UserPolicy(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    private List<String> b(Class<? extends m0e> cls) {
        m0e[] m0eArr = (m0e[]) cls.getEnumConstants();
        ArrayList arrayList = new ArrayList();
        for (m0e m0e : m0eArr) {
            arrayList.add(m0e.value());
        }
        return arrayList;
    }

    public abstract ContentProvider a();

    public List<PropertyModel> c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(b.a(Constants.CONTENT_PROVIDER, "android-feature-premium-reactivation", a().value, b(ContentProvider.class)));
        arrayList.add(b.a("user_policy", "android-feature-premium-reactivation", d().value, b(UserPolicy.class)));
        return arrayList;
    }

    public abstract UserPolicy d();
}
