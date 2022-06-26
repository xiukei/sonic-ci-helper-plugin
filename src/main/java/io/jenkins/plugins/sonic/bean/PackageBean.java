package io.jenkins.plugins.sonic.bean;

public class PackageBean {
    private Integer projectId;
    private String pkgName;
    private String platform;
    private String url;
    private String branch;

    public PackageBean() {

    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getPkgName() {
        return pkgName;
    }

    public void setPkgName(String pkgName) {
        this.pkgName = pkgName;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

}