package com.spotify.music.libs.collection.service;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import com.spotify.music.libs.collection.model.ModificationModel;
import com.spotify.music.libs.collection.service.v;
import dagger.android.f;
import io.reactivex.internal.operators.completable.CompletableConcatIterable;
import java.util.HashMap;
import java.util.concurrent.Semaphore;

public class CollectionService extends f {
    public static final /* synthetic */ int p = 0;
    v.a a;
    g b;
    FireAndForgetResolver c;
    v f;
    private ObjectMapper n;
    private io.reactivex.disposables.a o;

    /* access modifiers changed from: package-private */
    public static class Items implements JacksonModel {
        public String contextSource;
        public String[] items;
        public String source;

        Items() {
        }
    }

    public enum Messaging {
        NONE,
        ONLY_ERROR_DIALOG,
        ALL;
        
        public static final Messaging[] f = values();
    }

    /* access modifiers changed from: package-private */
    public enum Result {
        SUCCESS_ADDED,
        SUCCESS_REMOVED,
        SUCCESS_BANNED,
        SUCCESS_UNBANNED,
        ERROR_INSUFFICIENT_STORAGE,
        UNKNOWN;

        static {
            values();
        }
    }

    class a extends JsonCallbackReceiver<ModificationModel> {
        final /* synthetic */ Messaging a;
        final /* synthetic */ String b;
        final /* synthetic */ LinkType c;
        final /* synthetic */ Items d;
        final /* synthetic */ Semaphore e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Handler handler, Class cls, ObjectMapper objectMapper, Messaging messaging, String str, LinkType linkType, Items items, Semaphore semaphore) {
            super(handler, cls, objectMapper);
            this.a = messaging;
            this.b = str;
            this.c = linkType;
            this.d = items;
            this.e = semaphore;
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.cosmos.ParsingCallbackReceiver
        public void onError(Throwable th, ParsingCallbackReceiver.ErrorCause errorCause) {
            io.reactivex.a d2 = CollectionService.this.d(this.a, Result.UNKNOWN, this.c, this.d);
            io.reactivex.disposables.a aVar = CollectionService.this.o;
            Semaphore semaphore = this.e;
            semaphore.getClass();
            aVar.b(d2.subscribe(new a(semaphore), new k(this.e)));
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.cosmos.ParsingCallbackReceiver
        public void onResolved(Response response, Object obj) {
            Result result;
            ModificationModel modificationModel = (ModificationModel) obj;
            int status = response.getStatus();
            if (status < 200 || status > 299) {
                io.reactivex.a d2 = CollectionService.this.d(this.a, status == 507 ? Result.ERROR_INSUFFICIENT_STORAGE : Result.UNKNOWN, this.c, this.d);
                io.reactivex.disposables.a aVar = CollectionService.this.o;
                Semaphore semaphore = this.e;
                semaphore.getClass();
                aVar.b(d2.subscribe(new a(semaphore), new l(this.e)));
                return;
            }
            CollectionService collectionService = CollectionService.this;
            Messaging messaging = this.a;
            String str = this.b;
            int i = CollectionService.p;
            if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD".equals(str)) {
                result = Result.SUCCESS_ADDED;
            } else if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.REMOVE".equals(str)) {
                result = Result.SUCCESS_REMOVED;
            } else if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.BAN".equals(str)) {
                result = Result.SUCCESS_BANNED;
            } else if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.UNBAN".equals(str)) {
                result = Result.SUCCESS_UNBANNED;
            } else {
                result = Result.UNKNOWN;
            }
            io.reactivex.a d3 = collectionService.d(messaging, result, this.c, this.d);
            io.reactivex.disposables.a aVar2 = CollectionService.this.o;
            Semaphore semaphore2 = this.e;
            semaphore2.getClass();
            aVar2.b(d3.subscribe(new a(semaphore2), new m(this.e)));
        }
    }

    public static final class b {
        public boolean a;
        public String b;
    }

    public CollectionService() {
        super("CollectionService");
    }

    public static void b(Context context, String[] strArr, String str, String str2, Messaging messaging) {
        b e = e(strArr);
        if (e.a) {
            h(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD", strArr, str, str2, messaging);
            return;
        }
        throw new Assertion.RecoverableAssertionError(e.b + "  sourceUri: " + str + ", contextSourceUri: " + str2);
    }

    public static void c(Context context, String str, String str2, String str3, Messaging messaging) {
        String[] strArr = {str};
        b f2 = f(strArr, LinkType.TRACK);
        if (f2.a) {
            h(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.BAN", strArr, str2, str3, messaging);
            return;
        }
        throw new Assertion.RecoverableAssertionError(je.J0(new StringBuilder(), f2.b, " sourceUri: ", str2));
    }

    public static b e(String[] strArr) {
        return f(strArr, LinkType.TRACK, LinkType.ALBUM, LinkType.SHOW_SHOW, LinkType.SHOW_EPISODE);
    }

    public static b f(String[] strArr, LinkType... linkTypeArr) {
        b bVar = new b();
        bVar.a = false;
        for (String str : strArr) {
            if (!l0.c(str, linkTypeArr)) {
                StringBuilder V0 = je.V0("Invalid linktype for collection: ");
                V0.append(l0.z(str).q());
                bVar.b = V0.toString();
                return bVar;
            }
        }
        if (strArr.length > 0) {
            bVar.a = true;
        } else {
            bVar.b = "Cannot validate empty uri";
        }
        return bVar;
    }

    public static void g(Context context, String[] strArr, String str, Messaging messaging) {
        b e = e(strArr);
        if (!e.a) {
            Assertion.g(e.b + " sourceUri: " + str);
            return;
        }
        h(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.REMOVE", strArr, str, "", messaging);
    }

    private static void h(Context context, String str, String[] strArr, String str2, String str3, Messaging messaging) {
        Intent intent = new Intent(context, CollectionService.class);
        intent.putExtra("uris", strArr);
        intent.putExtra("source", str2);
        intent.putExtra("contextSource", str3);
        intent.putExtra("messaging", messaging.ordinal());
        intent.setAction(str);
        context.startService(intent);
    }

    public static void i(Context context, String[] strArr, String str, String str2, Messaging messaging) {
        b f2 = f(strArr, LinkType.TRACK);
        if (f2.a) {
            h(context, "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.UNBAN", strArr, str, str2, messaging);
            return;
        }
        throw new Assertion.RecoverableAssertionError(je.J0(new StringBuilder(), f2.b, " sourceUri: ", str));
    }

    /* access modifiers changed from: package-private */
    public io.reactivex.a d(Messaging messaging, Result result, LinkType linkType, Items items) {
        io.reactivex.a aVar;
        io.reactivex.a aVar2;
        io.reactivex.a aVar3;
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (result == Result.SUCCESS_ADDED && messaging == Messaging.ALL) {
            if (linkType == LinkType.TRACK) {
                aVar3 = io.reactivex.a.u(new t(this));
            } else if (linkType == LinkType.SHOW_SHOW) {
                aVar3 = io.reactivex.a.u(new p(this, items.items[0]));
            } else {
                aVar3 = io.reactivex.a.u(new r(this));
            }
            builder.mo53add((ImmutableList.Builder) aVar3);
        }
        if (result == Result.SUCCESS_REMOVED && messaging == Messaging.ALL) {
            if (linkType == LinkType.TRACK) {
                aVar2 = io.reactivex.a.u(new s(this));
            } else if (linkType == LinkType.SHOW_SHOW) {
                aVar2 = this.f.u(items.items[0]);
            } else {
                aVar2 = io.reactivex.a.u(new o(this));
            }
            builder.mo53add((ImmutableList.Builder) aVar2);
        }
        if (result == Result.SUCCESS_BANNED && messaging == Messaging.ALL) {
            String str = items.items[0];
            String str2 = items.contextSource;
            if (linkType != LinkType.TRACK) {
                StringBuilder V0 = je.V0("Messaging for ban is only supported for tracks. sourceUri: ");
                V0.append(items.source);
                V0.append(", contextSourceUri: ");
                V0.append(items.contextSource);
                aVar = io.reactivex.a.t(new Assertion.RecoverableAssertionError(V0.toString()));
            } else if (!str.equals(str2)) {
                aVar = this.f.o(str2, new q(this, str, items));
            } else {
                aVar = io.reactivex.a.u(new u(this));
            }
            builder.mo53add((ImmutableList.Builder) aVar);
        }
        if (result == Result.SUCCESS_UNBANNED && messaging == Messaging.ALL) {
            builder.mo53add((ImmutableList.Builder) io.reactivex.a.u(new n(linkType, items)));
        }
        ImmutableList build = builder.build();
        if (build != null) {
            return new CompletableConcatIterable(build);
        }
        throw new NullPointerException("sources is null");
    }

    @Override // dagger.android.f, android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        e b2 = this.b.b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.n = b2.build();
        this.o = new io.reactivex.disposables.a();
        this.f = this.a.a(getResources());
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.o.f();
    }

    /* access modifiers changed from: protected */
    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        String str;
        setTheme(C0707R.style.res_2132083497_theme_glue);
        Assertion.e(intent);
        String action = intent.getAction();
        Items items = new Items();
        String[] stringArrayExtra = intent.getStringArrayExtra("uris");
        items.items = stringArrayExtra;
        Assertion.e(stringArrayExtra);
        Assertion.k(items.items.length > 0, "You must add/remove at least one item.", new Object[0]);
        items.source = intent.getStringExtra("source");
        items.contextSource = intent.getStringExtra("contextSource");
        if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD".equals(action) || "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.BAN".equals(action)) {
            str = Request.POST;
        } else if ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.REMOVE".equals(action) || "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.UNBAN".equals(action)) {
            str = Request.DELETE;
        } else {
            Assertion.p("Unsupported action " + action + " in CollectionService.");
            return;
        }
        String str2 = ("com.spotify.mobile.android.spotlets.collection.cosmos.service.action.ADD".equals(action) || "com.spotify.mobile.android.spotlets.collection.cosmos.service.action.REMOVE".equals(action)) ? "sp://core-collection/v1/items" : "sp://core-collection/unstable/bans";
        try {
            Semaphore semaphore = new Semaphore(0);
            Handler handler = new Handler(getMainLooper());
            LinkType q = l0.z(items.items[0]).q();
            Messaging[] messagingArr = Messaging.f;
            Messaging messaging = Messaging.NONE;
            this.c.resolve(new Request(str, str2, new HashMap(0), this.n.writeValueAsString(items).getBytes(Charsets.UTF_8)), new a(handler, ModificationModel.class, this.n, messagingArr[intent.getIntExtra("messaging", 0)], action, q, items, semaphore));
            semaphore.acquire();
        } catch (JsonProcessingException unused) {
            Assertion.p("Failed to serialize item request.");
        } catch (InterruptedException unused2) {
            Assertion.p("Wait was interrupted.");
        }
    }
}
