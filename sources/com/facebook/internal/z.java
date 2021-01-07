package com.facebook.internal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.facebook.FacebookException;
import com.facebook.j;
import com.facebook.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

public final class z {
    private static final String a = "com.facebook.internal.z";
    private static File b;

    public static final class b {
        private final UUID a;
        private final String b;
        private final String c;
        private Bitmap d;
        private Uri e;
        private boolean f;
        private boolean g;

        b(UUID uuid, Bitmap bitmap, Uri uri, a aVar) {
            String str;
            this.a = uuid;
            this.d = bitmap;
            this.e = uri;
            if (uri != null) {
                String scheme = uri.getScheme();
                if ("content".equalsIgnoreCase(scheme)) {
                    this.f = true;
                    this.g = uri.getAuthority() != null && !uri.getAuthority().startsWith("media");
                } else if ("file".equalsIgnoreCase(uri.getScheme())) {
                    this.g = true;
                } else if (!f0.E(uri)) {
                    throw new FacebookException(je.x0("Unsupported scheme for media Uri : ", scheme));
                }
            } else if (bitmap != null) {
                this.g = true;
            } else {
                throw new FacebookException("Cannot share media without a bitmap or Uri set");
            }
            String uuid2 = !this.g ? null : UUID.randomUUID().toString();
            this.c = uuid2;
            if (!this.g) {
                str = this.e.toString();
            } else {
                String e2 = k.e();
                int i = j.b;
                str = String.format("%s%s/%s/%s", "content://com.facebook.app.FacebookContentProvider", e2, uuid.toString(), uuid2);
            }
            this.b = str;
        }

        public String g() {
            return this.b;
        }

        public Uri h() {
            return this.e;
        }
    }

    private z() {
    }

    public static void a(Collection<b> collection) {
        InputStream inputStream;
        if (collection != null && collection.size() != 0) {
            if (b == null) {
                f0.i(f());
            }
            f().mkdirs();
            ArrayList arrayList = new ArrayList();
            try {
                for (b bVar : collection) {
                    if (bVar.g) {
                        File e = e(bVar.a, bVar.c, true);
                        arrayList.add(e);
                        if (bVar.d != null) {
                            Bitmap bitmap = bVar.d;
                            FileOutputStream fileOutputStream = new FileOutputStream(e);
                            try {
                                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            } finally {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                        } else if (bVar.e != null) {
                            Uri uri = bVar.e;
                            boolean z = bVar.f;
                            FileOutputStream fileOutputStream2 = new FileOutputStream(e);
                            if (!z) {
                                try {
                                    inputStream = new FileInputStream(uri.getPath());
                                } catch (Throwable th) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException unused2) {
                                    }
                                    throw th;
                                }
                            } else {
                                inputStream = k.d().getContentResolver().openInputStream(uri);
                            }
                            f0.h(inputStream, fileOutputStream2);
                            fileOutputStream2.close();
                        }
                    }
                }
            } catch (IOException e2) {
                String str = a;
                Log.e(str, "Got unexpected exception:" + e2);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((File) it.next()).delete();
                    } catch (Exception unused3) {
                    }
                }
                throw new FacebookException(e2);
            }
        }
    }

    public static void b(UUID uuid) {
        File g = g(uuid, false);
        if (g != null) {
            f0.i(g);
        }
    }

    public static b c(UUID uuid, Bitmap bitmap) {
        h0.f(uuid, "callId");
        h0.f(bitmap, "attachmentBitmap");
        return new b(uuid, bitmap, null, null);
    }

    public static b d(UUID uuid, Uri uri) {
        h0.f(uuid, "callId");
        h0.f(uri, "attachmentUri");
        return new b(uuid, null, uri, null);
    }

    static File e(UUID uuid, String str, boolean z) {
        File g = g(uuid, z);
        if (g == null) {
            return null;
        }
        try {
            return new File(g, URLEncoder.encode(str, Constants.ENCODING));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    static synchronized File f() {
        File file;
        synchronized (z.class) {
            if (b == null) {
                b = new File(k.d().getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = b;
        }
        return file;
    }

    static File g(UUID uuid, boolean z) {
        if (b == null) {
            return null;
        }
        File file = new File(b, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File h(UUID uuid, String str) {
        if (f0.C(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return e(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }
}
