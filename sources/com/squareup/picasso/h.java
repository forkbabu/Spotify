package com.squareup.picasso;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;

/* access modifiers changed from: package-private */
public class h extends a0 {
    private static final UriMatcher b;
    private final Context a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    h(Context context) {
        this.a = context;
    }

    @Override // com.squareup.picasso.a0
    public boolean c(y yVar) {
        Uri uri = yVar.c;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && b.match(yVar.c) != -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    @Override // com.squareup.picasso.a0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.squareup.picasso.a0.a f(com.squareup.picasso.y r5, int r6) {
        /*
            r4 = this;
            android.content.Context r6 = r4.a
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r5 = r5.c
            android.content.UriMatcher r0 = com.squareup.picasso.h.b
            int r0 = r0.match(r5)
            r1 = 1
            r2 = 0
            if (r0 == r1) goto L_0x0038
            r3 = 2
            if (r0 == r3) goto L_0x0033
            r3 = 3
            if (r0 == r3) goto L_0x0040
            r1 = 4
            if (r0 != r1) goto L_0x001c
            goto L_0x0033
        L_0x001c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid uri: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L_0x0033:
            java.io.InputStream r5 = r6.openInputStream(r5)
            goto L_0x0044
        L_0x0038:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r6, r5)
            if (r5 != 0) goto L_0x0040
            r5 = r2
            goto L_0x0044
        L_0x0040:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r6, r5, r1)
        L_0x0044:
            if (r5 != 0) goto L_0x0047
            return r2
        L_0x0047:
            com.squareup.picasso.a0$a r6 = new com.squareup.picasso.a0$a
            okio.w r5 = okio.o.i(r5)
            com.squareup.picasso.Picasso$LoadedFrom r0 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r6.<init>(r5, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.h.f(com.squareup.picasso.y, int):com.squareup.picasso.a0$a");
    }
}
