package com.wanghaisheng.weiyang.database;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

import com.wanghaisheng.template_lib.datasource.beans.BaseBean;

import java.util.List;

/**
 * Entity mapped to table "MEISHI_BEAN".
 */
public class MeishiBean extends BaseBean implements java.io.Serializable {

    private Long id;
    private String articleId;
    private String title;
    private String desc;
    private String author;
    private String authorImg;
    private String authorId;
    private String articleUrl;
    private String sourceUrl;
    private String publishDate;
    private String imageUrls;
    private String readCount;
    private Long likeCount;
    private Long shareCount;
    private Long forwardCount;
    private Boolean isVideo;
    private String moduleName;
    private String moduleTitle;
    private String zhuanti;
    private String cZhuanti;
    private String tag;
    private String cTag;
    private Boolean isCollected;

    // KEEP FIELDS - put your custom fields here
    private List<String> imageUrlList;
    // KEEP FIELDS END

    public MeishiBean() {
    }

    public MeishiBean(Long id) {
        this.id = id;
    }

    public MeishiBean(Long id, String articleId, String title, String desc, String author, String authorImg, String authorId, String articleUrl, String sourceUrl, String publishDate, String imageUrls, String readCount, Long likeCount, Long shareCount, Long forwardCount, Boolean isVideo, String moduleName, String moduleTitle, String zhuanti, String cZhuanti, String tag, String cTag, Boolean isCollected) {
        this.id = id;
        this.articleId = articleId;
        this.title = title;
        this.desc = desc;
        this.author = author;
        this.authorImg = authorImg;
        this.authorId = authorId;
        this.articleUrl = articleUrl;
        this.sourceUrl = sourceUrl;
        this.publishDate = publishDate;
        this.imageUrls = imageUrls;
        this.readCount = readCount;
        this.likeCount = likeCount;
        this.shareCount = shareCount;
        this.forwardCount = forwardCount;
        this.isVideo = isVideo;
        this.moduleName = moduleName;
        this.moduleTitle = moduleTitle;
        this.zhuanti = zhuanti;
        this.cZhuanti = cZhuanti;
        this.tag = tag;
        this.cTag = cTag;
        this.isCollected = isCollected;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorImg() {
        return authorImg;
    }

    public void setAuthorImg(String authorImg) {
        this.authorImg = authorImg;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getReadCount() {
        return readCount;
    }

    public void setReadCount(String readCount) {
        this.readCount = readCount;
    }

    public Long getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Long likeCount) {
        this.likeCount = likeCount;
    }

    public Long getShareCount() {
        return shareCount;
    }

    public void setShareCount(Long shareCount) {
        this.shareCount = shareCount;
    }

    public Long getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(Long forwardCount) {
        this.forwardCount = forwardCount;
    }

    public Boolean getIsVideo() {
        return isVideo;
    }

    public void setIsVideo(Boolean isVideo) {
        this.isVideo = isVideo;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleTitle() {
        return moduleTitle;
    }

    public void setModuleTitle(String moduleTitle) {
        this.moduleTitle = moduleTitle;
    }

    public String getZhuanti() {
        return zhuanti;
    }

    public void setZhuanti(String zhuanti) {
        this.zhuanti = zhuanti;
    }

    public String getCZhuanti() {
        return cZhuanti;
    }

    public void setCZhuanti(String cZhuanti) {
        this.cZhuanti = cZhuanti;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getCTag() {
        return cTag;
    }

    public void setCTag(String cTag) {
        this.cTag = cTag;
    }

    public Boolean getIsCollected() {
        return isCollected;
    }

    public void setIsCollected(Boolean isCollected) {
        this.isCollected = isCollected;
    }

    // KEEP METHODS - put your custom methods here
    public List<String> getImageUrlList() {
        return imageUrlList;
    }

    public void setImageUrlList(List<String> imageUrlList) {
        this.imageUrlList = imageUrlList;
    }
    // KEEP METHODS END

}
