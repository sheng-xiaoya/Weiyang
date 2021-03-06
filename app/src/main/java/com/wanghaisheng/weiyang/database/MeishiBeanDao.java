package com.wanghaisheng.weiyang.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MEISHI_BEAN".
*/
public class MeishiBeanDao extends AbstractDao<MeishiBean, Long> {

    public static final String TABLENAME = "MEISHI_BEAN";

    /**
     * Properties of entity MeishiBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ArticleId = new Property(1, String.class, "articleId", false, "ARTICLE_ID");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property Desc = new Property(3, String.class, "desc", false, "DESC");
        public final static Property Author = new Property(4, String.class, "author", false, "AUTHOR");
        public final static Property AuthorImg = new Property(5, String.class, "authorImg", false, "AUTHOR_IMG");
        public final static Property AuthorId = new Property(6, String.class, "authorId", false, "AUTHOR_ID");
        public final static Property ArticleUrl = new Property(7, String.class, "articleUrl", false, "ARTICLE_URL");
        public final static Property SourceUrl = new Property(8, String.class, "sourceUrl", false, "SOURCE_URL");
        public final static Property PublishDate = new Property(9, String.class, "publishDate", false, "PUBLISH_DATE");
        public final static Property ImageUrls = new Property(10, String.class, "imageUrls", false, "IMAGE_URLS");
        public final static Property ReadCount = new Property(11, String.class, "readCount", false, "READ_COUNT");
        public final static Property LikeCount = new Property(12, Long.class, "likeCount", false, "LIKE_COUNT");
        public final static Property ShareCount = new Property(13, Long.class, "shareCount", false, "SHARE_COUNT");
        public final static Property ForwardCount = new Property(14, Long.class, "forwardCount", false, "FORWARD_COUNT");
        public final static Property IsVideo = new Property(15, Boolean.class, "isVideo", false, "IS_VIDEO");
        public final static Property ModuleName = new Property(16, String.class, "moduleName", false, "MODULE_NAME");
        public final static Property ModuleTitle = new Property(17, String.class, "moduleTitle", false, "MODULE_TITLE");
        public final static Property Zhuanti = new Property(18, String.class, "zhuanti", false, "ZHUANTI");
        public final static Property CZhuanti = new Property(19, String.class, "cZhuanti", false, "C_ZHUANTI");
        public final static Property Tag = new Property(20, String.class, "tag", false, "TAG");
        public final static Property CTag = new Property(21, String.class, "cTag", false, "C_TAG");
        public final static Property IsCollected = new Property(22, Boolean.class, "isCollected", false, "IS_COLLECTED");
    };


    public MeishiBeanDao(DaoConfig config) {
        super(config);
    }
    
    public MeishiBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MEISHI_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"ARTICLE_ID\" TEXT," + // 1: articleId
                "\"TITLE\" TEXT," + // 2: title
                "\"DESC\" TEXT," + // 3: desc
                "\"AUTHOR\" TEXT," + // 4: author
                "\"AUTHOR_IMG\" TEXT," + // 5: authorImg
                "\"AUTHOR_ID\" TEXT," + // 6: authorId
                "\"ARTICLE_URL\" TEXT," + // 7: articleUrl
                "\"SOURCE_URL\" TEXT," + // 8: sourceUrl
                "\"PUBLISH_DATE\" TEXT," + // 9: publishDate
                "\"IMAGE_URLS\" TEXT," + // 10: imageUrls
                "\"READ_COUNT\" TEXT," + // 11: readCount
                "\"LIKE_COUNT\" INTEGER," + // 12: likeCount
                "\"SHARE_COUNT\" INTEGER," + // 13: shareCount
                "\"FORWARD_COUNT\" INTEGER," + // 14: forwardCount
                "\"IS_VIDEO\" INTEGER," + // 15: isVideo
                "\"MODULE_NAME\" TEXT," + // 16: moduleName
                "\"MODULE_TITLE\" TEXT," + // 17: moduleTitle
                "\"ZHUANTI\" TEXT," + // 18: zhuanti
                "\"C_ZHUANTI\" TEXT," + // 19: cZhuanti
                "\"TAG\" TEXT," + // 20: tag
                "\"C_TAG\" TEXT," + // 21: cTag
                "\"IS_COLLECTED\" INTEGER);"); // 22: isCollected
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MEISHI_BEAN\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, MeishiBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String articleId = entity.getArticleId();
        if (articleId != null) {
            stmt.bindString(2, articleId);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(4, desc);
        }
 
        String author = entity.getAuthor();
        if (author != null) {
            stmt.bindString(5, author);
        }
 
        String authorImg = entity.getAuthorImg();
        if (authorImg != null) {
            stmt.bindString(6, authorImg);
        }
 
        String authorId = entity.getAuthorId();
        if (authorId != null) {
            stmt.bindString(7, authorId);
        }
 
        String articleUrl = entity.getArticleUrl();
        if (articleUrl != null) {
            stmt.bindString(8, articleUrl);
        }
 
        String sourceUrl = entity.getSourceUrl();
        if (sourceUrl != null) {
            stmt.bindString(9, sourceUrl);
        }
 
        String publishDate = entity.getPublishDate();
        if (publishDate != null) {
            stmt.bindString(10, publishDate);
        }
 
        String imageUrls = entity.getImageUrls();
        if (imageUrls != null) {
            stmt.bindString(11, imageUrls);
        }
 
        String readCount = entity.getReadCount();
        if (readCount != null) {
            stmt.bindString(12, readCount);
        }
 
        Long likeCount = entity.getLikeCount();
        if (likeCount != null) {
            stmt.bindLong(13, likeCount);
        }
 
        Long shareCount = entity.getShareCount();
        if (shareCount != null) {
            stmt.bindLong(14, shareCount);
        }
 
        Long forwardCount = entity.getForwardCount();
        if (forwardCount != null) {
            stmt.bindLong(15, forwardCount);
        }
 
        Boolean isVideo = entity.getIsVideo();
        if (isVideo != null) {
            stmt.bindLong(16, isVideo ? 1L: 0L);
        }
 
        String moduleName = entity.getModuleName();
        if (moduleName != null) {
            stmt.bindString(17, moduleName);
        }
 
        String moduleTitle = entity.getModuleTitle();
        if (moduleTitle != null) {
            stmt.bindString(18, moduleTitle);
        }
 
        String zhuanti = entity.getZhuanti();
        if (zhuanti != null) {
            stmt.bindString(19, zhuanti);
        }
 
        String cZhuanti = entity.getCZhuanti();
        if (cZhuanti != null) {
            stmt.bindString(20, cZhuanti);
        }
 
        String tag = entity.getTag();
        if (tag != null) {
            stmt.bindString(21, tag);
        }
 
        String cTag = entity.getCTag();
        if (cTag != null) {
            stmt.bindString(22, cTag);
        }
 
        Boolean isCollected = entity.getIsCollected();
        if (isCollected != null) {
            stmt.bindLong(23, isCollected ? 1L: 0L);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public MeishiBean readEntity(Cursor cursor, int offset) {
        MeishiBean entity = new MeishiBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // articleId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // desc
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // author
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // authorImg
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // authorId
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // articleUrl
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // sourceUrl
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // publishDate
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // imageUrls
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // readCount
            cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12), // likeCount
            cursor.isNull(offset + 13) ? null : cursor.getLong(offset + 13), // shareCount
            cursor.isNull(offset + 14) ? null : cursor.getLong(offset + 14), // forwardCount
            cursor.isNull(offset + 15) ? null : cursor.getShort(offset + 15) != 0, // isVideo
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // moduleName
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // moduleTitle
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // zhuanti
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // cZhuanti
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // tag
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // cTag
            cursor.isNull(offset + 22) ? null : cursor.getShort(offset + 22) != 0 // isCollected
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, MeishiBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setArticleId(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setDesc(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setAuthor(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setAuthorImg(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAuthorId(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setArticleUrl(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setSourceUrl(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setPublishDate(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setImageUrls(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setReadCount(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setLikeCount(cursor.isNull(offset + 12) ? null : cursor.getLong(offset + 12));
        entity.setShareCount(cursor.isNull(offset + 13) ? null : cursor.getLong(offset + 13));
        entity.setForwardCount(cursor.isNull(offset + 14) ? null : cursor.getLong(offset + 14));
        entity.setIsVideo(cursor.isNull(offset + 15) ? null : cursor.getShort(offset + 15) != 0);
        entity.setModuleName(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setModuleTitle(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setZhuanti(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setCZhuanti(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setTag(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setCTag(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setIsCollected(cursor.isNull(offset + 22) ? null : cursor.getShort(offset + 22) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(MeishiBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(MeishiBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
