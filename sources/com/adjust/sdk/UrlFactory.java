package com.adjust.sdk;

import java.util.ArrayList;
import java.util.List;

public class UrlFactory {
    private static List<String> baseUrls;
    private static List<String> gdprUrls;
    private static List<String> subscriptionUrls;

    public static List<String> getBaseUrls() {
        if (baseUrls == null) {
            ArrayList arrayList = new ArrayList();
            baseUrls = arrayList;
            arrayList.add(AdjustFactory.getBaseUrl());
            baseUrls.addAll(AdjustFactory.getFallbackBaseUrls());
        }
        return baseUrls;
    }

    public static List<String> getGdprUrls() {
        if (gdprUrls == null) {
            ArrayList arrayList = new ArrayList();
            gdprUrls = arrayList;
            arrayList.add(AdjustFactory.getGdprUrl());
            gdprUrls.addAll(AdjustFactory.getFallbackGdprUrls());
        }
        return gdprUrls;
    }

    public static List<String> getSubscriptionUrls() {
        if (subscriptionUrls == null) {
            ArrayList arrayList = new ArrayList();
            subscriptionUrls = arrayList;
            arrayList.add(AdjustFactory.getSubscriptionUrl());
            subscriptionUrls.addAll(AdjustFactory.getFallbackSubscriptionUrls());
        }
        return subscriptionUrls;
    }

    public static synchronized void prioritiseBaseUrl(String str) {
        synchronized (UrlFactory.class) {
            if (baseUrls.indexOf(str) != 0) {
                baseUrls.remove(str);
                baseUrls.add(0, str);
            }
        }
    }

    public static synchronized void prioritiseGdprUrl(String str) {
        synchronized (UrlFactory.class) {
            if (gdprUrls.indexOf(str) != 0) {
                gdprUrls.remove(str);
                gdprUrls.add(0, str);
            }
        }
    }

    public static synchronized void prioritiseSubscriptionUrl(String str) {
        synchronized (UrlFactory.class) {
            if (subscriptionUrls.indexOf(str) != 0) {
                subscriptionUrls.remove(str);
                subscriptionUrls.add(0, str);
            }
        }
    }
}
