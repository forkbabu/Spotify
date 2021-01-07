package com.spotify.music.libs.search.product.main.util;

import android.os.Parcelable;
import com.google.common.base.Optional;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.libs.search.history.SearchHistory;
import com.spotify.libs.search.offline.model.OfflineResults;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.searchview.proto.MainViewResponse;
import defpackage.bza;
import org.apache.commons.lang3.tuple.Pair;

public abstract class SearchModelParcelable implements Parcelable {

    /* access modifiers changed from: protected */
    public enum SearchErrorType {
        ONLINE,
        OFFLINE,
        HISTORY
    }

    /* access modifiers changed from: protected */
    public enum SearchResultType {
        ONLINE,
        OFFLINE,
        HISTORY
    }

    public static SearchModelParcelable a(bza bza) {
        Optional optional;
        Optional optional2 = (Optional) bza.e().b(g.a, f.a, h.a, b.a);
        Optional<yya> c = bza.c();
        if (c.isPresent()) {
            optional = Optional.of(c.get().b(e.a, d.a, c.a));
        } else {
            optional = Optional.absent();
        }
        return new i(bza.d(), optional2, optional);
    }

    public abstract Optional<SearchErrorType> b();

    public abstract String c();

    public abstract Optional<Pair<SearchResultType, Object>> e();

    public bza f() {
        yya yya;
        dza dza;
        MainViewResponse mainViewResponse;
        bza bza = bza.a;
        String c = c();
        bza.a f = bza.f();
        f.e(c);
        bza a = f.a();
        if (e().isPresent()) {
            Pair<SearchResultType, Object> pair = e().get();
            int ordinal = pair.d().ordinal();
            if (ordinal == 0) {
                SearchResponseSerializable searchResponseSerializable = (SearchResponseSerializable) pair.g();
                searchResponseSerializable.getClass();
                try {
                    mainViewResponse = MainViewResponse.p(searchResponseSerializable.a());
                } catch (InvalidProtocolBufferException unused) {
                    StringBuilder V0 = je.V0("Couldn't parse serialized MainViewResponse from: ");
                    V0.append(searchResponseSerializable.a());
                    Assertion.g(V0.toString());
                    mainViewResponse = MainViewResponse.h();
                }
                dza = dza.e(cza.a(searchResponseSerializable.b(), mainViewResponse));
            } else if (ordinal == 1) {
                dza = dza.d((OfflineResults) pair.g());
            } else if (ordinal != 2) {
                dza = dza.c();
            } else {
                dza = dza.a((SearchHistory) pair.g());
            }
            bza.a f2 = a.f();
            f2.f(dza);
            a = f2.a();
        }
        if (!b().isPresent()) {
            return a;
        }
        int ordinal2 = b().get().ordinal();
        if (ordinal2 == 1) {
            yya = yya.c();
        } else if (ordinal2 != 2) {
            yya = yya.d("");
        } else {
            yya = yya.a();
        }
        bza.a f3 = a.f();
        f3.d(Optional.of(yya));
        return f3.a();
    }
}
