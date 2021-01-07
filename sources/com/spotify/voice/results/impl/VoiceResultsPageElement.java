package com.spotify.voice.results.impl;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.pageloader.z0;
import com.spotify.voice.results.impl.h;
import com.spotify.voice.results.impl.view.c;
import com.spotify.voice.results.impl.view.d;
import com.spotify.voice.results.model.e;
import java.util.List;

public final class VoiceResultsPageElement implements z0, h {
    private final d a;
    private h.a b;
    private Context c;
    private ogf f;
    private int n;
    private final io.reactivex.functions.h<ImageView, String, String, ng0> o;

    public static final class a extends ViewPager2.g {
        final /* synthetic */ VoiceResultsPageElement a;

        a(VoiceResultsPageElement voiceResultsPageElement, Context context) {
            this.a = voiceResultsPageElement;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void c(int i) {
            this.a.n = i;
        }
    }

    public VoiceResultsPageElement(io.reactivex.functions.h<ImageView, String, String, ng0> hVar, f fVar, e eVar) {
        kotlin.jvm.internal.h.e(hVar, "picassoFn");
        kotlin.jvm.internal.h.e(fVar, "presenterFactory");
        kotlin.jvm.internal.h.e(eVar, "results");
        this.o = hVar;
        d b2 = fVar.b(eVar, this);
        kotlin.jvm.internal.h.d(b2, "presenterFactory.create(results, this)");
        this.a = b2;
    }

    @Override // com.spotify.voice.results.impl.h
    public void a(i iVar) {
        kotlin.jvm.internal.h.e(iVar, "viewModel");
        ogf ogf = this.f;
        if (ogf != null) {
            TextView textView = ogf.c;
            kotlin.jvm.internal.h.d(textView, "binding.text1");
            textView.setText(iVar.b());
            ViewPager2 viewPager2 = ogf.b;
            kotlin.jvm.internal.h.d(viewPager2, "binding.list");
            if (viewPager2.getAdapter() == null) {
                h.a aVar = this.b;
                if (aVar != null) {
                    aVar.b();
                    ViewPager2 viewPager22 = ogf.b;
                    kotlin.jvm.internal.h.d(viewPager22, "binding.list");
                    Context context = this.c;
                    if (context != null) {
                        List<e.a> a2 = iVar.a();
                        io.reactivex.functions.h<ImageView, String, String, ng0> hVar = this.o;
                        h.a aVar2 = this.b;
                        if (aVar2 != null) {
                            viewPager22.setAdapter(new c(context, a2, hVar, new b(new VoiceResultsPageElement$renderViewModel$1(aVar2)), this.n));
                        } else {
                            kotlin.jvm.internal.h.k("listener");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.h.k("context");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.h.k("listener");
                    throw null;
                }
            } else {
                ViewPager2 viewPager23 = ogf.b;
                kotlin.jvm.internal.h.d(viewPager23, "binding.list");
                RecyclerView.e adapter = viewPager23.getAdapter();
                if (adapter != null) {
                    ((c) adapter).f0(iVar.a());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.spotify.voice.results.impl.view.VoiceResultsAdapter");
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    @Override // com.spotify.voice.results.impl.h
    public void b(h.a aVar) {
        kotlin.jvm.internal.h.e(aVar, "listener");
        this.b = aVar;
    }

    @Override // com.spotify.pageloader.z0
    public void d(Bundle bundle) {
        kotlin.jvm.internal.h.e(bundle, "bundle");
        this.n = bundle.getInt("com.spotify.voice.results.impl.KEY_BUNDLE_PAGE_POSITION");
    }

    @Override // com.spotify.pageloader.z0
    public Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putInt("com.spotify.voice.results.impl.KEY_BUNDLE_PAGE_POSITION", this.n);
        return bundle;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        ogf ogf = this.f;
        if (ogf != null) {
            return ogf.a();
        }
        return null;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(viewGroup, "parent");
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        this.c = context;
        ogf b2 = ogf.b(layoutInflater, viewGroup, false);
        b2.b.e(new a(this, context));
        ViewPager2 viewPager2 = b2.b;
        kotlin.jvm.internal.h.d(viewPager2, "it.list");
        viewPager2.setOffscreenPageLimit(2);
        b2.b.setPageTransformer(new d(context.getResources()));
        this.f = b2;
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.a.e();
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        this.a.f();
    }
}
