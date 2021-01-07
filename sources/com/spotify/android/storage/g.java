package com.spotify.android.storage;

import com.google.common.base.Charsets;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.io.b;
import org.apache.commons.io.d;

public class g {
    private final File a;
    private final Map<String, String> b;

    public g(File file) {
        this.b = new HashMap();
        this.a = file;
        File file2 = new File(file, ".tag");
        if (file2.exists() && file2.isFile() && file2.canRead()) {
            try {
                Charset charset = Charsets.UTF_8;
                charset.getClass();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), charset));
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedReader);
                    for (Map.Entry entry : properties.entrySet()) {
                        this.b.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                    }
                } finally {
                    int i = d.a;
                    try {
                        bufferedReader.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException e) {
                throw new SyncError(e.getMessage());
            }
        }
    }

    public void a() {
        this.b.clear();
        File file = new File(this.a, ".tag");
        if (file.exists() && !b.g(file)) {
            try {
                new PrintWriter(file, Charsets.UTF_8.name()).close();
            } catch (FileNotFoundException unused) {
            } catch (UnsupportedEncodingException unused2) {
                throw new AssertionError();
            }
        }
    }

    public void b() {
        File file = new File(this.a, ".tag");
        if (this.a.exists() && this.a.isDirectory() && this.a.canWrite()) {
            try {
                Charset charset = Charsets.UTF_8;
                charset.getClass();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset));
                try {
                    Properties properties = new Properties();
                    properties.putAll(this.b);
                    properties.store(bufferedWriter, String.valueOf(System.currentTimeMillis()));
                } finally {
                    int i = d.a;
                    try {
                        bufferedWriter.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException e) {
                throw new SyncError(e.getMessage());
            }
        }
    }

    public File c() {
        return this.a;
    }

    public String d(String str) {
        return this.b.get(str);
    }

    public g e(String str, String str2) {
        this.b.put(str, str2);
        return this;
    }

    public g(String str) {
        this(new File(str));
    }
}
