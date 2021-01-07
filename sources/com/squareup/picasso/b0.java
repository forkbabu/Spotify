package com.squareup.picasso;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.a0;
import java.io.FileNotFoundException;
import java.util.List;

/* access modifiers changed from: package-private */
public class b0 extends a0 {
    private final Context a;

    b0(Context context) {
        this.a = context;
    }

    @Override // com.squareup.picasso.a0
    public boolean c(y yVar) {
        if (yVar.d != 0) {
            return true;
        }
        return "android.resource".equals(yVar.c.getScheme());
    }

    @Override // com.squareup.picasso.a0
    public a0.a f(y yVar, int i) {
        Resources resources;
        Uri uri;
        Uri uri2;
        Context context = this.a;
        StringBuilder sb = j0.a;
        if (yVar.d != 0 || (uri2 = yVar.c) == null) {
            resources = context.getResources();
        } else {
            String authority = uri2.getAuthority();
            if (authority != null) {
                try {
                    resources = context.getPackageManager().getResourcesForApplication(authority);
                } catch (PackageManager.NameNotFoundException unused) {
                    StringBuilder V0 = je.V0("Unable to obtain resources for package: ");
                    V0.append(yVar.c);
                    throw new FileNotFoundException(V0.toString());
                }
            } else {
                StringBuilder V02 = je.V0("No package provided: ");
                V02.append(yVar.c);
                throw new FileNotFoundException(V02.toString());
            }
        }
        int i2 = yVar.d;
        boolean z = true;
        if (i2 == 0 && (uri = yVar.c) != null) {
            String authority2 = uri.getAuthority();
            if (authority2 != null) {
                List<String> pathSegments = yVar.c.getPathSegments();
                if (pathSegments == null || pathSegments.isEmpty()) {
                    StringBuilder V03 = je.V0("No path segments: ");
                    V03.append(yVar.c);
                    throw new FileNotFoundException(V03.toString());
                } else if (pathSegments.size() == 1) {
                    try {
                        i2 = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused2) {
                        StringBuilder V04 = je.V0("Last path segment is not a resource ID: ");
                        V04.append(yVar.c);
                        throw new FileNotFoundException(V04.toString());
                    }
                } else if (pathSegments.size() == 2) {
                    i2 = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                } else {
                    StringBuilder V05 = je.V0("More than two path segments: ");
                    V05.append(yVar.c);
                    throw new FileNotFoundException(V05.toString());
                }
            } else {
                StringBuilder V06 = je.V0("No package provided: ");
                V06.append(yVar.c);
                throw new FileNotFoundException(V06.toString());
            }
        }
        BitmapFactory.Options d = a0.d(yVar);
        if (d == null || !d.inJustDecodeBounds) {
            z = false;
        }
        if (z) {
            BitmapFactory.decodeResource(resources, i2, d);
            a0.b(yVar.f, yVar.g, d, yVar);
        }
        Bitmap decodeResource = BitmapFactory.decodeResource(resources, i2, d);
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        if (decodeResource != null) {
            return new a0.a(decodeResource, null, loadedFrom, 0);
        }
        throw new NullPointerException("bitmap == null");
    }
}
