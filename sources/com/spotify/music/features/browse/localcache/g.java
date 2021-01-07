package com.spotify.music.features.browse.localcache;

import android.content.Context;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.hubframework.model.json.HubsJsonViewModel;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.json.e;
import io.reactivex.internal.functions.Functions;
import io.reactivex.l;
import io.reactivex.m;
import io.reactivex.y;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedByInterruptException;
import java.nio.channels.FileChannel;
import java.util.Locale;

class g implements f {
    private final ObjectMapper a;
    private final File b;
    private final HubsCachedFeature c;
    private final y d;

    public g(Context context, String str, com.spotify.music.json.g gVar, HubsCachedFeature hubsCachedFeature, y yVar) {
        this.c = hubsCachedFeature;
        this.d = yVar;
        context.getClass();
        this.b = new File(context.getFilesDir(), String.format(Locale.US, "%s/%s", "local_cache", Integer.valueOf(str.hashCode())));
        e b2 = gVar.b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        b2.d(JsonInclude.Include.ALWAYS);
        this.a = b2.build();
    }

    public /* synthetic */ void a(m mVar) {
        try {
            FileChannel channel = new FileInputStream(b()).getChannel();
            if (channel.size() > 0) {
                ByteBuffer allocate = ByteBuffer.allocate((int) channel.size());
                channel.read(allocate);
                channel.close();
                HubsJsonViewModel hubsJsonViewModel = (HubsJsonViewModel) this.a.readValue(allocate.array(), HubsJsonViewModel.class);
                if (hubsJsonViewModel != null) {
                    mVar.onSuccess(hubsJsonViewModel);
                    return;
                }
                Assertion.v("View model could not be parsed");
                mVar.onComplete();
                return;
            }
            mVar.onComplete();
        } catch (ClosedByInterruptException unused) {
            mVar.onComplete();
        } catch (IOException e) {
            StringBuilder V0 = je.V0("Failed to read from cache file for ");
            V0.append(this.c);
            Assertion.i(V0.toString(), e);
            mVar.onComplete();
        }
    }

    /* access modifiers changed from: protected */
    public File b() {
        if (this.b.exists()) {
            if (!this.b.isDirectory() && !new File(this.b.getCanonicalPath()).isDirectory()) {
                StringBuilder V0 = je.V0("Existing cache folder is not a directory: ");
                V0.append(this.b.getCanonicalPath());
                throw new IOException(V0.toString());
            }
        } else if (!this.b.mkdirs()) {
            StringBuilder V02 = je.V0("Failed to create cache folder ");
            V02.append(this.b.getCanonicalPath());
            throw new IOException(V02.toString());
        }
        File file = new File(this.b, this.c.d());
        if (file.exists() || file.createNewFile()) {
            return file;
        }
        StringBuilder V03 = je.V0("Failed to create cache file: ");
        V03.append(file.getCanonicalPath());
        throw new IOException(V03.toString());
    }

    @Override // com.spotify.music.features.browse.localcache.f
    public l<b91> read() {
        return l.d(new b(this)).q(this.d).l(Functions.c(b91.class));
    }

    @Override // com.spotify.music.features.browse.localcache.f
    public void write(byte[] bArr) {
        try {
            FileChannel channel = new FileOutputStream(b()).getChannel();
            channel.lock();
            channel.write(ByteBuffer.wrap(bArr));
            channel.close();
        } catch (IOException e) {
            StringBuilder V0 = je.V0("Failed to cache response for ");
            V0.append(this.c);
            Assertion.i(V0.toString(), e);
        }
    }
}
