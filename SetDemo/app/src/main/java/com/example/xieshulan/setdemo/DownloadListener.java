package com.example.xieshulan.setdemo;

/**
 * Created by xieshulan on 17-10-14.
 */

public interface DownloadListener {
    void onProgress(int progress);
    void onSuccess();
    void onFailed();
    void onPaused();
    void onCanceled();
}
