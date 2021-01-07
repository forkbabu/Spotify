package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.exoplayer2.util.g;

/* access modifiers changed from: package-private */
public final class k {
    private final String a;
    private final Intent b;

    static class a implements com.google.firebase.encoders.b<k> {
        a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0080, code lost:
            if ("normal".equals(r6) != false) goto L_0x0082;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x013a, code lost:
            if (r0.isEmpty() != false) goto L_0x013c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00ef  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x0100  */
        /* JADX WARNING: Removed duplicated region for block: B:47:0x0118  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x013f  */
        /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
        @Override // com.google.firebase.encoders.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(java.lang.Object r6, java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 325
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.k.a.a(java.lang.Object, java.lang.Object):void");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        private final k a;

        b(k kVar) {
            this.a = kVar;
        }

        /* access modifiers changed from: package-private */
        public final k a() {
            return this.a;
        }
    }

    static final class c implements com.google.firebase.encoders.b<b> {
        c() {
        }

        @Override // com.google.firebase.encoders.b
        public final void a(Object obj, Object obj2) {
            ((com.google.firebase.encoders.c) obj2).f("messaging_client_event", ((b) obj).a());
        }
    }

    k(String str, Intent intent) {
        g.h(str, "evenType must be non-null");
        this.a = str;
        g.k(intent, "intent must be non-null");
        this.b = intent;
    }

    /* access modifiers changed from: package-private */
    public final String a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final Intent b() {
        return this.b;
    }
}
