package com.github.javiersantos.appupdater.objects;

import java.net.URL;

public class Update {
    private String version;
    private Integer versionCode;
    private String releaseNotes;
    private URL apk;
    private static String changelogUrl;
    private static Boolean useWebviewChangelog = false;

    public Update() {}

    public Update(String latestVersion, Integer latestVersionCode) {
        this.version = latestVersion;
        this.versionCode = latestVersionCode;
    }

    public Update(String latestVersion, URL apk) {
        this.version = latestVersion;
        this.apk = apk;
    }

    public Update(String latestVersion, String releaseNotes, URL apk) {
        this.version = latestVersion;
        this.apk = apk;
        this.releaseNotes = releaseNotes;
    }

    public Update(String latestVersion, Integer latestVersionCode, String releaseNotes, URL apk) {
        this(latestVersion, releaseNotes, apk);
        this.versionCode = latestVersionCode;
    }

    public void resetStaticValues(){
        changelogUrl = null;
        useWebviewChangelog = false;
    }

    public String getLatestVersion() {
        return version;
    }

    public void setLatestVersion(String latestVersion) {
        this.version = latestVersion;
    }

    public Integer getLatestVersionCode() {
        return versionCode;
    }

    public void setLatestVersionCode(Integer versionCode) {
        this.versionCode = versionCode;
    }

    public String getReleaseNotes() {
        return releaseNotes;
    }

    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    public String getChangelogUrl() {
        return changelogUrl;
    }

    public void setwebview(Boolean useWebview){
        useWebviewChangelog = useWebview;
    }

    public boolean useWebview(){
        return useWebviewChangelog;
    }

    public void setChangelogUrl(String changelogUrl) {
        Update.changelogUrl = changelogUrl;
    }

    public URL getUrlToDownload() {
        return apk;
    }

    public void setUrlToDownload(URL apk) {
        this.apk = apk;
    }
}
